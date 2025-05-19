package ast.VISITOR;
import SymanticCheck.AlreadyDefinedVariableError;
import SymanticCheck.UndefinedMethodCall;
import SymanticCheck.WrongTypeAssignError;
import antlr.Lexergrammmar;
import antlr.Parsergrammar;
import antlr.ParsergrammarBaseVisitor;
import ast.ASTNode;
import ast.Ast;
import ast.CSS.*;
import ast.HTML.*;
import ast.SymbolTable.Row;
import ast.SymbolTable.SymbolTable;
import ast.TS.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class programvisitor  extends ParsergrammarBaseVisitor <ASTNode> {
    public SymbolTable st = new SymbolTable();
    UndefinedMethodCall undefinedMethodCall;
    @Override
    public ASTNode visitAst(Parsergrammar.AstContext ctx) {
        System.out.println("Visiting AST node...");
        TsDocument tsDecument = (TsDocument) visit(ctx.tsDocument());
        HTMLDocument htmlDocument = (HTMLDocument) visit(ctx.htmlDocument());
        CssDocument cssDocument = (CssDocument) visit(ctx.cssDocument());
        System.out.println("CSS Document: " + cssDocument);
        Row row = new Row();
        row.setName("AST");
        row.setType("AST");
        row.setValue("AST with TS, CSS, and HTML documents");
        row.setScope("global");
        this.st.addRow("AST", row);
        return new Ast(tsDecument, htmlDocument, cssDocument);
    }


    @Override
    public ASTNode visitTsDocument(Parsergrammar.TsDocumentContext ctx) {
        List<ASTNode> statements = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            var child = ctx.getChild(i);

            if (child == null) {
                continue;
            }
            if (child instanceof Parsergrammar.ImportStatementContext) {
                statements.add(visitImportStatement((Parsergrammar.ImportStatementContext) child));
            } else if (child instanceof Parsergrammar.ComponentDecoratorContext) {
                statements.add(visitComponentDecorator((Parsergrammar.ComponentDecoratorContext) child));
            } else if (child instanceof Parsergrammar.InjectableDecoratorContext) {
                statements.add(visitInjectableDecorator((Parsergrammar.InjectableDecoratorContext) child));
            } else if (child instanceof Parsergrammar.ClassDeclarationContext) {
                statements.add(visitClassDeclaration((Parsergrammar.ClassDeclarationContext) child));
            } else if (child instanceof Parsergrammar.VariableAssignContext) {
                statements.add(visitVariableAssign((Parsergrammar.VariableAssignContext) child));
            } else if (child instanceof Parsergrammar.MethodvoidContext) {
                statements.add(visitMethodvoid((Parsergrammar.MethodvoidContext) child));
            } else if (child instanceof Parsergrammar.VariableDeclarationContext) {
                statements.add(visitVariableDeclaration((Parsergrammar.VariableDeclarationContext) child));
            } else if (child instanceof Parsergrammar.MethodDeclarationContext) {
                statements.add(visitMethodDeclaration((Parsergrammar.MethodDeclarationContext) child));
            } else if (child instanceof Parsergrammar.ArrayExpression1Context) {
                statements.add(visitArrayExpression1((Parsergrammar.ArrayExpression1Context) child));
            } else if (child instanceof Parsergrammar.ArrayExpression2Context) {
                statements.add(visitArrayExpression2((Parsergrammar.ArrayExpression2Context) child));
            } else if (child instanceof Parsergrammar.SignalDeclarationContext) {
                statements.add(visitSignalDeclaration((Parsergrammar.SignalDeclarationContext) child));
            } else if (child instanceof Parsergrammar.MethodcallContext) {
                statements.add(visitMethodcall((Parsergrammar.MethodcallContext) child));
            } else if (child instanceof Parsergrammar.ConstructorDeclarationContext) {
                statements.add(visitConstructorDeclaration((Parsergrammar.ConstructorDeclarationContext) child));
            } else if (child instanceof Parsergrammar.NgOnInitMETHODContext) {
                statements.add(visitNgOnInitMETHOD((Parsergrammar.NgOnInitMETHODContext) child));
            } else if (child instanceof Parsergrammar.ObjectExpressionContext) {
                statements.add(visitObjectExpression((Parsergrammar.ObjectExpressionContext) child));
            } else {
                System.err.println("Warning: Unknown child type in TSDocument: " + child.getClass().getSimpleName());
            }
        }
        Row row = new Row();
        row.setName("TSDocument");
        row.setType("TSDocument");
        row.setValue("TS Document with " + statements.size() + " statements");
        row.setScope("global");
        this.st.addRow("TSDocument", row);
        return new TsDocument(statements);
    }


    @Override
    public ASTNode visitClassDeclaration(Parsergrammar.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        String implementsClause = null;
        if (ctx.implementsClause() != null) {
            implementsClause = ctx.implementsClause().getText();
        }

        this.st.enterScope("class");
        List<ASTNode> classBody = new ArrayList<>();

        if (ctx.classBody() != null && ctx.classBody().children != null) {
            for (var child : ctx.classBody().children) {
                ASTNode node = visit(child);
                if (node != null) {
                    classBody.add(node);
                }
            }
        }

        this.st.exitScope();

        Row row = new Row();
        row.setName(className);
        row.setType("ClassDeclaration");
        row.setValue("Class: " + className + (implementsClause != null ? " implements " + implementsClause : ""));
        row.setScope("global");
        this.st.addRow(className, row);

        return new ClassDeclaration(className, implementsClause, classBody);
    }

    @Override
    public ASTNode visitClassBody(Parsergrammar.ClassBodyContext ctx) {
        ClassBody body = new ClassBody();

        for (ParseTree child : ctx.children) {
            ASTNode node = (ASTNode) visit(child);
            if (node != null) {
                body.addMember(node);
            }
        }

        Row row = new Row();
        row.setName("classBody");
        row.setType("ClassBody");
        row.setValue("Class Body with " + body.getMembers().size() + " members");
        row.setScope("class");
        row.setScope(this.st.getCurrentScope());
        this.st.addRow("classBody", row);

        return body;
    }

    @Override
    public ASTNode visitSelector(Parsergrammar.SelectorContext ctx) {
        String value = ctx.STRING_LITERAL().getText().replace("'", "");
        Selector selector = new Selector(value);

        Row row = new Row();
        row.setName("Selector");
        row.setType("Selector");
        row.setValue("Selector: " + value);
        row.setScope("global");
        this.st.addRow("Selector", row);

        return selector;
    }

    @Override
    public ASTNode visitImports(Parsergrammar.ImportsContext ctx) {
        List<String> importsList = new ArrayList<>();

        if (ctx.IDENTIFIER() != null) {
            for (var id : ctx.IDENTIFIER()) {
                importsList.add(id.getText());
            }
        }
        if (ctx.CROISNN() != null) {
            for (var croisnn : ctx.CROISNN()) {
                importsList.add(croisnn.getText());
            }
        }
        Imports imports = new Imports(importsList);

        Row row = new Row();
        row.setName("Imports");
        row.setType("Imports");
        row.setValue("Imports: " + String.join(", ", importsList));
        row.setScope("global");
        this.st.addRow("Imports", row);

        return imports;
    }

    @Override
    public ASTNode visitTemplateurl(Parsergrammar.TemplateurlContext ctx) {
        String url = ctx.STRING_LITERAL().getText().replace("'", "");
        TemplateUrl templateUrl = new TemplateUrl(url);

        Row row = new Row();
        row.setName("TemplateUrl");
        row.setType("TemplateUrl");
        row.setValue("Template URL: " + url);
        row.setScope("global");
        this.st.addRow("TemplateUrl", row);

        return templateUrl;
    }

    @Override
    public ASTNode visitStyleurl(Parsergrammar.StyleurlContext ctx) {
        String url = ctx.STRING_LITERAL().getText().replace("'", "");
        StyleUrl styleUrl = new StyleUrl(url);

        Row row = new Row();
        row.setName("StyleUrl");
        row.setType("StyleUrl");
        row.setValue("Style URL: " + url);
        row.setScope("global");
        this.st.addRow("StyleUrl", row);

        return styleUrl;
    }

    @Override
    public ASTNode visitSignature(Parsergrammar.SignatureContext ctx) {
        String accessModifier = ctx.ACCESS() != null ? ctx.ACCESS().getText() : null;
        String staticModifier = ctx.STATIC() != null ? ctx.STATIC().getText() : null;
        String name = ctx.IDENTIFIER().getText();

        Signature signature = new Signature(accessModifier, staticModifier, name);

        Row row = new Row();
        row.setName(name);
        row.setType("Signature");
        row.setValue("Signature: " + signature.toString());
        row.setScope(this.st.getCurrentScope());
        this.st.addRow(name, row);

        return signature;
    }

    @Override
    public ASTNode visitParameters(Parsergrammar.ParametersContext ctx) {
        Parameters parameters = new Parameters();

        int count = ctx.IDENTIFIER().size();
        for (int i = 0; i < count; i++) {
            String name = ctx.IDENTIFIER(i).getText();
            String type = ctx.TYPE(i).getText();
            parameters.addParameter(name, type);
        }

        Row row = new Row();
        row.setName("Parameters");
        row.setType("Parameters");
        row.setValue("Parameters: " + parameters.toString());
        row.setScope(this.st.getCurrentScope());
        this.st.addRow("Parameters", row);

        return parameters;
    }

    @Override
    public ASTNode visitMethodvoidbody(Parsergrammar.MethodvoidbodyContext ctx) {
        boolean leftThis = ctx.THIS().size() > 0 && ctx.THIS(0) != null;
        boolean rightThis = ctx.THIS().size() > 1 || (!leftThis && ctx.THIS().size() > 0);

        String leftId = ctx.IDENTIFIER(0).getText();
        String rightId = ctx.IDENTIFIER(1).getText();
        String methodCall = ctx.methodcall() != null ? ctx.methodcall().getText() : null;

        MethodVoidBody body = new MethodVoidBody(leftThis, leftId, rightThis, rightId, methodCall);

        Row row = new Row();
        row.setName(leftId);
        row.setType("VoidAssignment");
        row.setValue("Assigned " + (rightThis ? "this." : "") + rightId +
                (methodCall != null ? "." + methodCall + "()" : ""));
        row.setScope("local");
        this.st.addRow(leftId, row);

        return body;
    }

    @Override
    public ASTNode visitNgOnInitBody(Parsergrammar.NgOnInitBodyContext ctx) {
        return null;
    }


    @Override
    public ASTNode visitMethodCall(Parsergrammar.MethodcallContext ctx) {
        System.out.println("Visiting methodcall: " + ctx.getText());
        String methodName = ctx.IDENTIFIER(0).getText();
        String argument = null;

        if (ctx.IDENTIFIER().size() > 1) {
            argument = ctx.IDENTIFIER(1).getText();
        }

        MethodCall methodCall = new MethodCall(methodName, argument);

        Row row = new Row();
        row.setName("MethodCall");
        row.setType("MethodCall");
        row.setValue("Method: " + methodName + (argument != null ? ", Arg: " + argument : ""));
        row.setScope("local");
        this.st.addRow("MethodCall", row);

        return methodCall;
    }

    @Override
    public ASTNode visitMethodvoid(Parsergrammar.MethodvoidContext ctx) {
        Signature signature = (Signature) visit(ctx.signature());
        Parameters parameters = ctx.parameters() != null ? (Parameters) visit(ctx.parameters()) : null;
        MethodVoidBody body = (MethodVoidBody) visit(ctx.methodvoidbody());
        int line = ctx.signature().IDENTIFIER().getSymbol().getLine();
        MethodVoid method = new MethodVoid(signature, parameters, body);
        undefinedMethodCall = new UndefinedMethodCall(signature.getName(),line);
        Row row = new Row();
        row.setName(signature.getName());
        row.setType("MethodVoid");
        row.setValue(method.toString());
        row.setScope(this.st.getCurrentScope());
        //this.st.addRow(signature.getName(), row);

        undefinedMethodCall.UndefinedMethodCallSymboltable.addRow(signature.getName(),row);
        return method;
    }


    @Override
    public ASTNode visitNgOnInitMETHOD(Parsergrammar.NgOnInitMETHODContext ctx) {
        String accessModifier = ctx.ACCESS() != null ? ctx.ACCESS().getText() : null;
        MethodVoidBody body = (MethodVoidBody) visit(ctx.methodvoidbody());

        NgOnInitMethod method = new NgOnInitMethod(accessModifier, body);

        Row row = new Row();
        row.setName("ngOnInit");
        row.setType("NgOnInitMethod");
        row.setValue(method.toString());
        row.setScope(this.st.getCurrentScope());
        this.st.addRow("ngOnInit", row);

        return method;
    }

    @Override
    public ASTNode visitValues(Parsergrammar.ValuesContext ctx) {
        String value;

        if (ctx.NULL() != null) {
            value = "null";
        } else if (ctx.NUMBER() != null) {
            value = ctx.NUMBER().getText();
        } else if (ctx.STRING_LITERAL() != null) {
            value = ctx.STRING_LITERAL().getText().replace("'", "");
        } else if (ctx.BOOLEAN() != null) {
            value = ctx.BOOLEAN().getText();
        } else {
            value = "undefined";
        }

        Values valNode = new Values(value);

        Row row = new Row();
        row.setName("LiteralValue");
        row.setType("Value");
        row.setValue("Value: " + value);
        row.setScope(this.st.getCurrentScope());
        this.st.addRow("LiteralValue", row);

        return valNode;
    }

    @Override
    public ASTNode visitImportBody(Parsergrammar.ImportBodyContext ctx) {
        String name;

        if (ctx.IDENTIFIER() != null) {
            name = ctx.IDENTIFIER().getText();
        } else if (ctx.CROISNN() != null) {
            name = ctx.CROISNN().getText();
        } else if (ctx.COMPONENT() != null) {
            name = ctx.COMPONENT().getText();
        } else if (ctx.INJECTABLE() != null) {
            name = ctx.INJECTABLE().getText();
        } else {
            name = "UnknownImportItem";
        }
        ImportBody importBody = new ImportBody(name);

        Row row = new Row();
        row.setName(name);
        row.setType("ImportBody");
        row.setValue("Imported: " + name);
        row.setScope(this.st.getCurrentScope());
        this.st.addRow(name, row);

        return importBody;
    }

    @Override
    public ASTNode visitImportStatement(Parsergrammar.ImportStatementContext ctx) {
        List<ImportBody> items = new ArrayList<>();

        for (Parsergrammar.ImportBodyContext bodyCtx : ctx.importBody()) {
            ImportBody item = (ImportBody) visit(bodyCtx);
            items.add(item);
        }

        String source = ctx.STRING_LITERAL().getText();
        source = source.substring(1, source.length() - 1);

        ImportStatement stmt = new ImportStatement(items, source);

        Row row = new Row();
        row.setName("import");
        row.setType("ImportStatement");
        row.setValue(stmt.toString());
        row.setScope(this.st.getCurrentScope());
        this.st.addRow("import_" + source, row); // unique key

        return stmt;
    }

    @Override
    public ASTNode visitComponentProperties(Parsergrammar.ComponentPropertiesContext ctx) {
        Selector selector = null;
        Imports imports = null;
        TemplateUrl templateUrl = null;
        StyleUrl styleUrl = null;

        if (ctx.selector() != null) {
            selector = (Selector) visit(ctx.selector());
        }
        if (ctx.imports() != null) {
            imports = (Imports) visit(ctx.imports());
        }
        if (ctx.templateurl() != null) {
            templateUrl = (TemplateUrl) visit(ctx.templateurl());
        }
        if (ctx.styleurl() != null) {
            styleUrl = (StyleUrl) visit(ctx.styleurl());
        }

        ComponentProperties props = new ComponentProperties(selector, imports, templateUrl, styleUrl);

        Row row = new Row();
        row.setName("ComponentProperties");
        row.setType("ComponentProperties");

        String value = "";
        if (selector != null) value += "Selector: " + selector.getValue() + ", ";
        if (templateUrl != null) value += "TemplateUrl: " + templateUrl.getUrl();
        row.setValue(value);
        row.setScope("global");
        this.st.addRow("ComponentProperties", row);

        return props;
    }

    @Override
    public ASTNode visitComponentDecorator(Parsergrammar.ComponentDecoratorContext ctx) {
        ComponentProperties componentProperties = null;

        if (ctx.componentProperties() != null) {
            componentProperties = (ComponentProperties) visit(ctx.componentProperties());
        }

        ComponentDecorator decorator = new ComponentDecorator(componentProperties);

        Row row = new Row();
        row.setName("ComponentDecorator");
        row.setType("ComponentDecorator");
        row.setValue("Component with properties: " + (componentProperties != null ? componentProperties.toString() : "none"));
        row.setScope("global");
        this.st.addRow("ComponentDecorator", row);

        return decorator;
    }



    @Override
    public ASTNode visitMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx) {
        System.out.println("second");
        System.out.println("/////////////////////////////////////////////////////////////////");
        Signature signature = (Signature) visit(ctx.signature());
        Parameters parameters = ctx.parameters() != null ? (Parameters) visit(ctx.parameters()) : null;
        MethodBody methodBody = (MethodBody) visit(ctx.methodBody());

        MethodDeclaration methodDeclaration = new MethodDeclaration(signature, parameters, methodBody);


        Row row = new Row();
        row.setName(signature.getName());
        row.setType("MethodDeclaration");
        row.setValue("Method: " + methodDeclaration.toString());
        row.setScope(this.st.getCurrentScope());
       this.st.addRow(signature.getName(), row);

        return methodDeclaration;
    }

    @Override
    public ASTNode visitMethodBody(Parsergrammar.MethodBodyContext ctx) {
        boolean isThisRef = ctx.THIS() != null;
        String returnTarget;

        if (ctx.IDENTIFIER() != null) {
            returnTarget = ctx.IDENTIFIER().getText();
        } else {
            Values valueNode = (Values) visit(ctx.values());
            returnTarget = valueNode.getValue();
        }

        MethodBody methodBody = new MethodBody(returnTarget, isThisRef);

        Row row = new Row();
        row.setName("ReturnStatement");
        row.setType("MethodBody");
        row.setValue("Returns: " + (isThisRef ? "this." : "") + returnTarget);
        row.setScope(this.st.getCurrentScope());
        this.st.addRow("ReturnStatement", row);

        return methodBody;
    }


    @Override
    public ASTNode visitProvidedIn(Parsergrammar.ProvidedinContext ctx) {
        String providedIn = ctx.STRING_LITERAL().getText();
        Row row = new Row();
        row.setName("InjectableProperties");
        row.setType("InjectableProperties");
        row.setValue("providedIn: " + providedIn);
        row.setScope("global");
        this.st.addRow("InjectableProperties", row);
        return new ProvidedIn(providedIn);

    }

    @Override
    public ASTNode visitInjectableDecorator(Parsergrammar.InjectableDecoratorContext ctx) {
        ProvidedIn providedIn = null;

        if (ctx.providedin() != null) {
            providedIn = (ProvidedIn) visit(ctx.providedin());
        }

        InjectableDecorator decorator = new InjectableDecorator(providedIn);

        Row row = new Row();
        row.setName("InjectableDecorator");
        row.setType("InjectableDecorator");
        row.setValue("Injectable with providedIn: " + (providedIn != null ? providedIn.toString() : "none"));
        row.setScope("global");
        this.st.addRow("InjectableDecorator", row);

        return decorator;
    }


    @Override
    public ASTNode visitArrayExpression1(Parsergrammar.ArrayExpression1Context ctx) {
        Signature signature = (Signature) visit(ctx.signature());
        List<ASTNode> elements = new ArrayList<>();

        for (Parsergrammar.Arraybody1Context elemCtx : ctx.arraybody1()) {
            ASTNode element = visit(elemCtx);
            if (element != null) {
                elements.add(element);
            }
        }
        ArrayExpression1 arrayExpr = new ArrayExpression1(signature, elements);

        Row row = new Row();
        row.setName(signature.getName());
        row.setType("ArrayExpression1");
        row.setValue("Array with " + elements.size() + " elements");
        row.setScope("global");
        this.st.addRow(signature.getName(), row);

        return arrayExpr;
    }


    @Override
    public ASTNode visitObjectExpression(Parsergrammar.ObjectExpressionContext ctx) {
        Map<String, ASTNode> properties = new LinkedHashMap<>();

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String key = ctx.IDENTIFIER(i).getText();
            ASTNode value = visit(ctx.values(i));
            properties.put(key, value);
        }
        ObjectExpression objExpr = new ObjectExpression(properties);

        Row row = new Row();
        row.setName("ObjectExpression");
        row.setType("ObjectExpression");
        row.setValue("Object with keys: " + properties.keySet());
        row.setScope("global");
        this.st.addRow("ObjectExpression", row);

        return objExpr;
    }

    @Override
    public ASTNode visitArraybody1(Parsergrammar.Arraybody1Context ctx) {
        ASTNode value;

        if (ctx.objectExpression() != null) {
            value = visit(ctx.objectExpression());
        } else if (ctx.NUMBER() != null) {
            value = new Values(ctx.NUMBER().getText());
        } else if (ctx.STRING_LITERAL() != null) {
            value = new Values(ctx.STRING_LITERAL().getText());
        } else {
            value = null;
        }

        ArrayBody1 arrayElement = new ArrayBody1(value);

        Row row = new Row();
        row.setName("ArrayElement");
        row.setType("ArrayBody1");
        row.setValue("Value: " + (value != null ? value.toString() : "null"));
        row.setScope("global");
        this.st.addRow("ArrayElement", row);

        return arrayElement;
    }

    @Override
    public ASTNode visitArraybody2(Parsergrammar.Arraybody2Context ctx) {
        ASTNode objExpr = visit(ctx.objectExpression());
        ASTNode num = new Values(ctx.NUMBER().getText());
        ASTNode str = new Values(ctx.STRING_LITERAL().getText());

        ArrayBody2 result = new ArrayBody2(objExpr, num, str);

        Row row = new Row();
        row.setName("ArrayBody2");
        row.setType("ArrayBody2");
        row.setValue("Composite: " + result.toString());
        row.setScope("global");
        this.st.addRow("ArrayBody2", row);

        return result;
    }


    @Override
    public ASTNode visitArrayExpression2(Parsergrammar.ArrayExpression2Context ctx) {
        Signature signature = (Signature) visit(ctx.signature());
        String type = ctx.TYPE().getText();

        List<ASTNode> elements = new ArrayList<>();
        for (Parsergrammar.Arraybody2Context ab2Ctx : ctx.arraybody2()) {
            ASTNode element = visit(ab2Ctx);
            if (element != null) {
                elements.add(element);
            }
        }
        ArrayExpression2 arrayExpr = new ArrayExpression2(signature, type, elements);

        Row row = new Row();
        row.setName(signature.getName());
        row.setType("ArrayExpression2");
        row.setValue("Typed array (" + type + ") with " + elements.size() + " composite elements");
        row.setScope("global");
        this.st.addRow(signature.getName(), row);

        return arrayExpr;
    }


    @Override
    public ASTNode visitConstructorDeclaration(Parsergrammar.ConstructorDeclarationContext ctx) {
        String access = null;
        String name = null;
        String type = null;

        if (ctx.ACCESS() != null) {
            access = ctx.ACCESS().getText();
        }
        if (ctx.IDENTIFIER().size() == 2) {
            name = ctx.IDENTIFIER(0).getText();
            type = ctx.IDENTIFIER(1).getText();
        }
        ConstructorDeclaration constructor = new ConstructorDeclaration(access, name, type);

        Row row = new Row();
        row.setName("Constructor");
        row.setType("ConstructorDeclaration");
        row.setValue("Constructor with " + (name != null ? "param " + name + ": " + type : "no parameters"));
        row.setScope("class");
        this.st.addRow("Constructor", row);

        return constructor;
    }


    @Override
    public ASTNode visitVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx) {

        String signature = ctx.signature().IDENTIFIER().getText();
        String type = ctx.TYPE().getText();
        String value = ctx.values().getText();
        int line =  ctx.signature().IDENTIFIER().getSymbol().getLine();

        VariableDeclaration variableDeclaration = new VariableDeclaration(signature, type, value);

        Row row = new Row();
        row.setName(signature);
        row.setType("VariableDeclaration");
        row.setValue("Type: " + type + ", Value: " + value);
        row.setScope("local");
        AlreadyDefinedVariableError error = new AlreadyDefinedVariableError(signature,st,line);
        if(error.check()){
            error.throwIfUndefined();
        }
        else{
            error.alreadyDefinedVariableErrorsymbolTable.addRow(signature, row);
        }
        return variableDeclaration;
    }


    @Override
    public ASTNode visitVariableAssign(Parsergrammar.VariableAssignContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String value = ctx.values().getText();




        VariableAssign assignment = new VariableAssign(identifier, value);
        WrongTypeAssignError wrongTypeAssignError = new WrongTypeAssignError();
        Row row = new Row();
        String declaredType =  st.getRow(identifier).getType();
        String valueType = wrongTypeAssignError.getValueType(ctx.values());
        int line = ctx.IDENTIFIER().getSymbol().getLine();
        // Check type compatibility
        if (!wrongTypeAssignError.check(declaredType, valueType)) {
            throw new WrongTypeAssignError("Cannot assign " + valueType + " to variable of type " + declaredType , line);
        }
        row.setName(identifier);
        row.setType("VariableAssignment");
        row.setValue("Assigned value: " + value);
        row.setScope("local");
        this.st.addRow(identifier, row);

        return assignment;
    }

    @Override
    public ASTNode visitSignalDeclaration(Parsergrammar.SignalDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String signalType = ctx.CROISNN().getText();
        String argument = ctx.STRING_LITERAL().getText();
        argument = argument.substring(1, argument.length() - 1);

        SignalDeclaration declaration = new SignalDeclaration(name, signalType, argument);

        Row row = new Row();
        row.setName(name);
        row.setType("SignalDeclaration");
        row.setValue("Signal: " + declaration.toString());
        row.setScope(this.st.getCurrentScope());
        this.st.addRow(name, row);

        return declaration;
    }

    @Override
    public ASTNode visitImplementsClause(Parsergrammar.ImplementsClauseContext ctx) {
        ImplementsClause clause = new ImplementsClause();

        for (TerminalNode id : ctx.IDENTIFIER()) {
            clause.addInterface(id.getText());
        }
        for (TerminalNode croisnn : ctx.CROISNN()) {
            clause.addInterface(croisnn.getText());
        }
        if (!clause.getInterfaces().isEmpty()) {
            Row row = new Row();
            row.setName("implements");
            row.setType("ImplementsClause");
            row.setValue("Implements: " + String.join(", ", clause.getInterfaces()));
            row.setScope(this.st.getCurrentScope());
            this.st.addRow("implements", row);
        }

        return clause;
    }

    ////////////////////// CSS VISITORS/////////////////////////////

    @Override
    public ASTNode visitCssDocument(Parsergrammar.CssDocumentContext ctx) {
        List<RuleSet> ruleSets = new ArrayList<>();
        for (Parsergrammar.RuleSetContext rctx : ctx.ruleSet()) {
            ruleSets.add((RuleSet) visit(rctx));
        }
        Row row = new Row();
        row.setName("CssDocument");
        row.setType("CssDocument");
        row.setValue(ruleSets.toString());
        row.setScope("global");
        this.st.addRow("CssDocument", row);
        return new CssDocument(ruleSets);
    }

    @Override
    public ASTNode visitDeclaration(Parsergrammar.DeclarationContext ctx) {
        String propertyName = ctx.PROPERTY_NAME().getText();
        List<Value> values = new ArrayList<>();
        values.add((Value) visit(ctx.value(0)));
        if (ctx.value().size() > 1) {
            for (int i = 1; i < ctx.value().size(); i++) {
                values.add((Value) visit(ctx.value(i)));
            }
        }
        Row row = new Row();
        row.setName(propertyName);
        row.setType("Declaration");
        row.setValue(propertyName + ": " + values.toString());
        row.setScope("global");
        this.st.addRow(propertyName, row);
        return new Declaration(propertyName, values);
    }

    @Override
    public ASTNode visitDeclarationList(Parsergrammar.DeclarationListContext ctx) {
        List<Declaration> declarations = new ArrayList<>();
        for (Parsergrammar.DeclarationContext dctx : ctx.declaration()) {
            declarations.add((Declaration) visit(dctx));
        }
        Row row = new Row();
        row.setName("DeclarationList");
        row.setType("DeclarationList");
        row.setValue(declarations.toString());
        row.setScope("global");
        this.st.addRow("DeclarationList", row);

        return new DeclarationList(declarations);
    }
    @Override
    public ASTNode visitRuleSet(Parsergrammar.RuleSetContext ctx) {
        RuleSetStart selector = (RuleSetStart) visit(ctx.ruleSetStart());
        List<Declaration> declarations = new ArrayList<>();
        if (ctx.declarationList() != null) {
            for (Parsergrammar.DeclarationContext declCtx : ctx.declarationList().declaration()) {
                declarations.add((Declaration) visit(declCtx));
            }
        }

        Row row = new Row();
        row.setName(selector.toString());
        row.setType("RuleSet");
        row.setValue(selector.toString() + " with " + declarations.size() + " declarations");
        row.setScope("global");
        this.st.addRow(row.getName(), row);
        return new RuleSet(selector, declarations);
    }

    @Override
    public ASTNode visitRuleSetStart(Parsergrammar.RuleSetStartContext ctx) {
        List<String> selectors = new ArrayList<>();

        // Handle the first labeled selector (selectorincss)
        selectors.add(ctx.first.getText());

        // Handle any additional TAGSFORCSS tokens
        for (int i = 1; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof TerminalNode terminal) {
                if (terminal.getSymbol().getType() == Lexergrammmar.TAGSFORCSS) {
                    selectors.add(terminal.getText());
                }
            }
        }

        // Optional: Add the selector list to your symbol table
        Row row = new Row();
        row.setName("List");
        row.setType("List");
        row.setValue(selectors.toString());
        row.setScope("global");
        this.st.addRow("List", row);

        return new RuleSetStart(selectors);
    }





    @Override
    public ASTNode visitValue(Parsergrammar.ValueContext ctx) {
        Value value = null;
        Value.ValueType type = null;
        String val = "";
        String unit = null;

        if (ctx.NUMBER() != null) {
            val = ctx.NUMBER().getText();
            unit = ctx.UNIT() != null ? ctx.UNIT().getText() : null;
            type = Value.ValueType.NUMBER;
        }
        else if (ctx.COLOR() != null) {
            val = ctx.COLOR().getText();
            type = Value.ValueType.COLOR;
        }
        else if (ctx.STRING() != null) {
            val = ctx.STRING().getText();
            val = val.substring(1, val.length() - 1); // Remove quotes
            type = Value.ValueType.STRING;
        }
        else if (ctx.VALUE_KEYWORD() != null) {
            val = ctx.VALUE_KEYWORD().getText();
            type = Value.ValueType.KEYWORD;
        }
        else if (ctx.IDENTIFIER() != null) {
            val = ctx.IDENTIFIER().getText();
            type = Value.ValueType.IDENTIFIER;
        }

        value = new Value(val, unit, type);

        Row row = new Row();
        row.setName(val);
        row.setType("Value");
        row.setValue(val + (unit != null ? unit : ""));
        row.setScope("global");
        this.st.addRow(val, row);

        return value;
    }

    ////////////////////// HTML VISITORS /////////////////////////////

    @Override
    public ASTNode visitScriptletOrSeaWs(Parsergrammar.ScriptletOrSeaWsContext ctx) {
        String content;
        boolean isScriptlet;

        if (ctx.SCRIPTLET() != null) {
            content = ctx.SCRIPTLET().getText();
            isScriptlet = true;
        } else {
            content = ctx.WS().getText();
            isScriptlet = false;
        }
        Row row = new Row();
        row.setName("ScriptletOrSeaWs");
        row.setType("ScriptletOrSeaWs");
        row.setValue(content);
        row.setScope("global");
        this.st.addRow("ScriptletOrSeaWs", row);
        return new ScriptletOrSeaWs(content, isScriptlet);
    }

    @Override
    public ASTNode visitHtmlComment(Parsergrammar.HtmlCommentContext ctx) {
        String commentText;
        boolean isConditional;

        if (ctx.HTML_COMMENT() != null) {
            commentText = ctx.HTML_COMMENT().getText();
            isConditional = false;
        } else {
            commentText = ctx.HTML_CONDITIONAL_COMMENT().getText();
            isConditional = true;
        }

        Row row = new Row();
        row.setName("HtmlComment");
        row.setType("HtmlComment");
        row.setValue("Comment Type: " + (isConditional ? "Conditional" : "Standard") + ", Text: " + commentText);
        row.setScope("html");
        this.st.addRow("HtmlComment", row);

        return new HtmlComment(commentText, isConditional);
    }

    @Override
    public ASTNode visitHtmlMisc(Parsergrammar.HtmlMiscContext ctx) {
        ASTNode content = null;

        if (ctx.htmlComment() != null) {
            content = visit(ctx.htmlComment());
        } else if (ctx.WS() != null) {
            String whitespace = ctx.WS().getText();

            Row row = new Row();
            row.setName("Whitespace");
            row.setType("HtmlWhitespace");
            row.setValue("Whitespace characters: " + whitespace.replace("\n", "\\n"));
            row.setScope("html");
            this.st.addRow("Whitespace", row);

            content = new ASTNode() {
                @Override
                public void prettyPrint(String indent) {
                    System.out.println(indent + "Whitespace:");
                    System.out.println(indent + "  " + whitespace.replace("\n", "\\n"));
                }
            };
        }

        Row row = new Row();
        row.setName("HtmlMisc");
        row.setType("HtmlMisc");
        row.setValue("Contains: " + (content != null ? content.getClass().getSimpleName() : "null"));
        row.setScope("html");
        this.st.addRow("HtmlMisc", row);

        return new HtmlMisc(content);
    }


    @Override
    public ASTNode visitHtmlElements(Parsergrammar.HtmlElementsContext ctx) {
        // Process leading comments
        List<ASTNode> leadingComments = new ArrayList<>();
        if (ctx.htmlComment() != null) {
            for (Parsergrammar.HtmlCommentContext commentCtx : ctx.htmlComment()) {
                if (commentCtx != null) {
                    ASTNode comment = visitHtmlComment(commentCtx);
                    if (comment != null) {
                        leadingComments.add(comment);
                    }
                }
            }
        }
        ASTNode htmlElement = null;
        if (ctx.htmlElement() != null) {
            htmlElement = visitHtmlElement(ctx.htmlElement());
        }

        List<ASTNode> trailingComments = new ArrayList<>();

        Row row = new Row();
        row.setName("HtmlElements");
        row.setType("HtmlElements");
        row.setValue("Element with " + leadingComments.size() + " leading and " +
                trailingComments.size() + " trailing comments");
        row.setScope(this.st.getCurrentScope());
        this.st.addRow("HtmlElements_" + this.st.getCurrentScope(), row);

        return new HtmlElements(leadingComments, htmlElement, trailingComments);
    }

    @Override
    public ASTNode visitHtmlElement(Parsergrammar.HtmlElementContext ctx) {
        if (ctx instanceof Parsergrammar.TsTagElementContext tsCtx) {
            return visitTsTag(tsCtx.tsTag());
        } else if (ctx instanceof Parsergrammar.NoEndTagElementContext noEndCtx) {
            return visitNoEndTag(noEndCtx.noEndTag());
        } else if (ctx instanceof Parsergrammar.NormalTagElementContext normalCtx) {
            return visitNormalTag(normalCtx.normalTag());
        } else if (ctx instanceof Parsergrammar.ScriptletElementContext scriptletCtx) {
            String raw = scriptletCtx.SCRIPTLET().getText();

            Row row = new Row();
            row.setName("Scriptlet_" + System.identityHashCode(raw));
            row.setType("ScriptletOrSeaWs");
            row.setValue("Scriptlet: " + raw);
            row.setScope(this.st.getCurrentScope());
            this.st.addRow(row.getName(), row);

            return new ScriptletOrSeaWs(raw, true);
        } else if (ctx instanceof Parsergrammar.InterpolationElementContext interpCtx) {
            String raw = interpCtx.INTERPOLATION().getText();

            Row row = new Row();
            row.setName("Interpolation_" + System.identityHashCode(raw));
            row.setType("ScriptletOrSeaWs");
            row.setValue("Interpolation: " + raw);
            row.setScope(this.st.getCurrentScope());
            this.st.addRow(row.getName(), row);

            return new ScriptletOrSeaWs(raw, false);
        }

        // Fallback
        System.err.println("Unrecognized HTML element.");
        return null;
    }



    @Override
    public ASTNode visitTsTag(Parsergrammar.TsTagContext ctx) {
        String tagName = ctx.TAG_NAME().getText();
        List<ASTNode> attributes = new ArrayList<>();

        if (ctx.htmlAttribute() != null) {
            for (var attrCtx : ctx.htmlAttribute()) {
                ASTNode attr = visit(attrCtx);
                if (attr != null) {
                    attributes.add(attr);
                }
            }
        }

        Row row = new Row();
        row.setName(tagName);
        row.setType("TSTag");
        row.setValue("TypeScript tag: " + tagName);
        row.setScope(this.st.getCurrentScope());
        this.st.addRow(tagName, row);

        return new TsTag(tagName, attributes);
    }


    @Override
    public ASTNode visitNoEndTag(Parsergrammar.NoEndTagContext ctx) {
        String tagName = ctx.TAGS_VOID().getText();
        List<ASTNode> attributes = new ArrayList<>();

        if (ctx.htmlAttribute() != null) {
            for (var attrCtx : ctx.htmlAttribute()) {
                ASTNode attr = visit(attrCtx);
                if (attr != null) {
                    attributes.add(attr);
                }
            }
        }

        Row row = new Row();
        row.setName(tagName);
        row.setType("NoEndTag");
        row.setValue("Void HTML tag: " + tagName);
        row.setScope(this.st.getCurrentScope());
        this.st.addRow(tagName, row);


        return new NoEndTag(tagName, attributes);
    }


    @Override
    public ASTNode visitNormalTag(Parsergrammar.NormalTagContext ctx) {
        String tagName = ctx.TAGS(0).getText();
        List<ASTNode> attributes = new ArrayList<>();
        List<ASTNode> content = new ArrayList<>();

        if (ctx.htmlAttribute() != null) {
            for (var attrCtx : ctx.htmlAttribute()) {
                ASTNode attr = visit(attrCtx);
                if (attr != null) {
                    attributes.add(attr);
                }
            }
        }

        if (ctx.htmlContent() != null && ctx.htmlContent().children != null) {
            for (var child : ctx.htmlContent().children) {
                ASTNode contentNode = visit(child);
                if (contentNode != null) {
                    content.add(contentNode);
                }
            }
        }

        if (ctx.TAGS().size() > 1) {
            String closing = ctx.TAGS(1).getText();
            if (!tagName.equals(closing)) {
                System.err.println("Warning: Tag mismatch - <" + tagName + "> vs </" + closing + ">");
            }
        }

        Row row = new Row();
        row.setName(tagName);
        row.setType("NormalTag");
        row.setValue("HTML Tag: " + tagName +
                (attributes.isEmpty() ? "" : " with " + attributes.size() + " attributes") +
                (content.isEmpty() ? "" : " containing " + content.size() + " elements"));
        row.setScope(this.st.getCurrentScope());
        this.st.addRow(tagName, row);

        return new NormalTag(tagName, attributes, content);
    }



    @Override
    public ASTNode visitHtmlContent(Parsergrammar.HtmlContentContext ctx) {
        List<ASTNode> contentElements = new ArrayList<>();
        StringBuilder rawContent = new StringBuilder();

        for (ParseTree child : ctx.children) {
            if (child instanceof Parsergrammar.HtmlChardataContext chardataCtx) {
                ASTNode textNode = visitHtmlChardata(chardataCtx);
                if (textNode != null) {
                    contentElements.add(textNode);
                    rawContent.append(((HtmlCharData) textNode).getContent()).append(" ");
                }
            } else if (child instanceof Parsergrammar.HtmlElementContext elementCtx) {
                ASTNode elementNode = visitHtmlElement(elementCtx);
                if (elementNode != null) {
                    contentElements.add(elementNode);
                    rawContent.append("[Element] ");
                }
            } else if (child instanceof Parsergrammar.HtmlCommentContext commentCtx) {
                ASTNode commentNode = visitHtmlComment(commentCtx);
                if (commentNode != null) {
                    contentElements.add(commentNode);
                    rawContent.append(((HtmlComment) commentNode).getCommentText()).append(" ");
                }
            } else if (child instanceof TerminalNode terminal) {
                String text = terminal.getText();
                int type = terminal.getSymbol().getType();

                switch (type) {
                    case Lexergrammmar.CDATA -> {
                        CDataContent cdata = new CDataContent(text);
                        contentElements.add(cdata);
                        rawContent.append(text).append(" ");
                    }
                    case Lexergrammmar.SCRIPTLET -> {
                        contentElements.add(new ScriptletOrSeaWs(text, true));
                        rawContent.append(text).append(" ");
                    }
                    case Lexergrammmar.IDENTIFIER, Lexergrammmar.COLON -> {
                        rawContent.append(text).append(" ");
                    }
                }
            }
        }

        Row row = new Row();
        row.setName("HTMLContent");
        row.setType("HTMLContent");
        row.setValue("Contains " + contentElements.size() + " content elements");
        row.setScope(this.st.getCurrentScope());
        this.st.addRow("HTMLContent_" + this.st.getCurrentScope(), row);

        return new HtmlContent(contentElements, rawContent.toString().trim());
    }


    @Override
    public ASTNode visitHtmlChardata(Parsergrammar.HtmlChardataContext ctx) {
        String content;
        boolean isWhitespace;

        if (ctx.HTML_TEXT() != null) {
            content = ctx.HTML_TEXT().getText();
            isWhitespace = false;
        } else if (ctx.WS() != null) {
            content = ctx.WS().getText();
            isWhitespace = true;
        } else {
            content = "";
            isWhitespace = false;
        }

        Row row = new Row();
        row.setName("HtmlCharData");
        row.setType("HtmlCharData");
        row.setValue(isWhitespace ? "Whitespace" : ("Text: " + content));
        row.setScope("html");
        this.st.addRow("HtmlCharData", row);

        return new HtmlCharData(content, isWhitespace);
    }


    @Override
    public ASTNode visitHtmlDocument(Parsergrammar.HtmlDocumentContext ctx) {
        // Process scriptlets and whitespace
        List<ASTNode> scriptletOrSeaWs = new ArrayList<>();
        if (ctx.scriptletOrSeaWs() != null) {
            for (var sctx : ctx.scriptletOrSeaWs()) {
                ASTNode node = visit(sctx);
                if (node != null) {
                    scriptletOrSeaWs.add(node);
                }
            }
        }
        String xml = ctx.XML() != null ? ctx.XML().getText() : null;
        String dtd = ctx.DTD() != null ? ctx.DTD().getText() : null;

        // Process HTML elements
        List<ASTNode> htmlElements = new ArrayList<>();
        if (ctx.htmlElements() != null) {
            for (var ectx : ctx.htmlElements()) {
                ASTNode node = visit(ectx);
                if (node != null) {
                    htmlElements.add(node);
                }
            }
        }
        Row row = new Row();
        row.setName("HTMLDocument");
        row.setType("HTMLDocument");
        row.setValue("Document with " + htmlElements.size() + " elements" +
                (xml != null ? " (has XML)" : "") +
                (dtd != null ? " (has DTD)" : ""));
        row.setScope("global");
        this.st.addRow("HTMLDocument", row);

        return new HTMLDocument(scriptletOrSeaWs, xml, dtd, htmlElements);
    }

    @Override
    public HtmlAttribute visitStructuralDirectiveAttribute(Parsergrammar.StructuralDirectiveAttributeContext ctx) {
        String name = ctx.STRUCTURAL_DIRECTIVE().getText();
        TagAttribute tagAttribute = ctx.tagAtt() != null ? (TagAttribute) visit(ctx.tagAtt()) : null;

        Row row = new Row();
        row.setName("HtmlAttribute");
        row.setType("StructuralDirective");
        row.setValue("Name: " + name + ", Value: " + (tagAttribute != null ? tagAttribute.getValue() : "none"));
        row.setScope("html");
        this.st.addRow("HtmlAttribute", row);

        return new StructuralDirectiveAttribute(name, tagAttribute);
    }

    @Override
    public HtmlAttribute visitAttributeBinding(Parsergrammar.AttributeBindingContext ctx) {
        String name = ctx.ATTRIBUTE_BINDING().getText();
        TagAttribute tagAttribute = ctx.tagAtt() != null ? (TagAttribute) visit(ctx.tagAtt()) : null;

        Row row = new Row();
        row.setName("HtmlAttribute");
        row.setType("AttributeBinding");
        row.setValue("Name: " + name + ", Value: " + (tagAttribute != null ? tagAttribute.getValue() : "none"));
        row.setScope("html");
        this.st.addRow("HtmlAttribute", row);

        return new AttributeBindingAttribute(name, tagAttribute);
    }

    @Override
    public HtmlAttribute visitEventBinding(Parsergrammar.EventBindingContext ctx) {
        String name = ctx.EVENT_BINDING().getText();
        TagAttribute tagAttribute = ctx.tagAtt() != null ? (TagAttribute) visit(ctx.tagAtt()) : null;

        Row row = new Row();
        row.setName("HtmlAttribute");
        row.setType("EventBinding");
        row.setValue("Name: " + name + ", Value: " + (tagAttribute != null ? tagAttribute.getValue() : "none"));
        row.setScope("html");
        this.st.addRow("HtmlAttribute", row);

        return new EventBindingAttribute(name, tagAttribute);
    }

    @Override
    public HtmlAttribute visitTagNameAttribute(Parsergrammar.TagNameAttributeContext ctx) {
        String name = ctx.TAG_NAME().getText();
        TagAttribute tagAttribute = ctx.tagAtt() != null ? (TagAttribute) visit(ctx.tagAtt()) : null;

        Row row = new Row();
        row.setName("HtmlAttribute");
        row.setType("TagName");
        row.setValue("Name: " + name + ", Value: " + (tagAttribute != null ? tagAttribute.getValue() : "none"));
        row.setScope("html");
        this.st.addRow("HtmlAttribute", row);

        return new TagNameAttribute(name, tagAttribute);
    }


    @Override
    public ASTNode visitTagAtt(Parsergrammar.TagAttContext ctx) {
        String value = "";
        boolean isMethodCall = false;

        if (ctx.METHOD_CALL_VALUE() != null) {
            value = ctx.METHOD_CALL_VALUE().getText();
            isMethodCall = true;
        } else if (ctx.ATTVALUE_VALUE() != null) {
            value = ctx.ATTVALUE_VALUE().getText().trim();
            isMethodCall = false;
        }

        Row row = new Row();
        row.setName("TagAttribute");
        row.setType("TagAttribute");
        row.setValue(isMethodCall ? "Method Call: " + value : "Value: " + value);
        row.setScope("html");
        this.st.addRow("TagAttribute", row);

        return new TagAttribute(value, isMethodCall);
    }
}