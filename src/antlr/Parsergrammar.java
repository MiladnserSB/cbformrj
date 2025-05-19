// Generated from C:/Users/USER/Desktop/compiler project/Compiler_2/src/antlr/Parsergrammar.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parsergrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORTS=1, FROM=2, EXPORT=3, IMPORT=4, CLASS=5, CONSTRUCTOR=6, RETURN=7, 
		AT=8, IMPLEMENTS=9, NGONINIT=10, SELECTOR=11, TEMPLATEURL=12, STYLEURL=13, 
		STYLEURLS=14, PROVIDEDIN=15, VOIDTYPE=16, NULL=17, BOOLEAN=18, TYPE=19, 
		STATIC=20, ACCESS=21, CROISNN=22, COMPONENT=23, INJECTABLE=24, LBRACE=25, 
		RBRACE=26, LPAREN=27, RPAREN=28, LBRACKET=29, RBRACKET=30, COLON=31, COMMA=32, 
		SEMICOLON=33, ASSIGN=34, DOT=35, THIS=36, HASH=37, UNIT=38, COLOR=39, 
		PROPERTY_NAME=40, VALUE_KEYWORD=41, TAGSFORCSS=42, IDENTIFIER=43, NUMBER=44, 
		STRING_LITERAL=45, STRING=46, PLUS=47, MINUS=48, STAR=49, DIVIDE=50, EQUALS=51, 
		NOT_EQUAL=52, WS=53, LINE_COMMENT=54, BLOCK_COMMENT=55, INTERPOLATION=56, 
		HTML_COMMENT=57, HTML_CONDITIONAL_COMMENT=58, XML=59, CDATA=60, DTD=61, 
		SCRIPTLET=62, TAG_OPEN_SLASH=63, TAG_OPEN=64, TAGS=65, TAGS_VOID=66, HTML_TEXT=67, 
		TAG_CLOSE=68, TAG_SLASH_CLOSE=69, TAG_EQUALS=70, TAG_NAME=71, STRUCTURAL_DIRECTIVE=72, 
		ATTRIBUTE_BINDING=73, EVENT_BINDING=74, TAG_WHITESPACE=75, TAG_NameChar=76, 
		TAG_NameStartChar=77, METHOD_CALL_VALUE=78, ATTVALUE_VALUE=79, ATTRIBUTE=80, 
		ATTCHARS=81, ATTCHAR=82, HEXCHARS=83, DECCHARS=84, DOUBLE_QUOTE_STRING=85, 
		SINGLE_QUOTE_STRING=86;
	public static final int
		RULE_ast = 0, RULE_tsDocument = 1, RULE_classDeclaration = 2, RULE_implementsClause = 3, 
		RULE_classBody = 4, RULE_importStatement = 5, RULE_importBody = 6, RULE_componentDecorator = 7, 
		RULE_componentProperties = 8, RULE_selector = 9, RULE_imports = 10, RULE_templateurl = 11, 
		RULE_styleurl = 12, RULE_injectableDecorator = 13, RULE_providedin = 14, 
		RULE_signature = 15, RULE_values = 16, RULE_parameters = 17, RULE_methodDeclaration = 18, 
		RULE_methodBody = 19, RULE_objectExpression = 20, RULE_arrayExpression1 = 21, 
		RULE_arraybody1 = 22, RULE_arrayExpression2 = 23, RULE_arraybody2 = 24, 
		RULE_constructorDeclaration = 25, RULE_variableDeclaration = 26, RULE_variableAssign = 27, 
		RULE_methodvoid = 28, RULE_methodvoidbody = 29, RULE_methodcall = 30, 
		RULE_ngOnInitBody = 31, RULE_ngOnInitMETHOD = 32, RULE_signalDeclaration = 33, 
		RULE_cssDocument = 34, RULE_selectorincss = 35, RULE_ruleSetStart = 36, 
		RULE_ruleSet = 37, RULE_declarationList = 38, RULE_declaration = 39, RULE_value = 40, 
		RULE_htmlDocument = 41, RULE_scriptletOrSeaWs = 42, RULE_htmlElements = 43, 
		RULE_htmlElement = 44, RULE_tsTag = 45, RULE_noEndTag = 46, RULE_normalTag = 47, 
		RULE_htmlContent = 48, RULE_htmlChardata = 49, RULE_tagAtt = 50, RULE_htmlAttribute = 51, 
		RULE_htmlMisc = 52, RULE_htmlComment = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"ast", "tsDocument", "classDeclaration", "implementsClause", "classBody", 
			"importStatement", "importBody", "componentDecorator", "componentProperties", 
			"selector", "imports", "templateurl", "styleurl", "injectableDecorator", 
			"providedin", "signature", "values", "parameters", "methodDeclaration", 
			"methodBody", "objectExpression", "arrayExpression1", "arraybody1", "arrayExpression2", 
			"arraybody2", "constructorDeclaration", "variableDeclaration", "variableAssign", 
			"methodvoid", "methodvoidbody", "methodcall", "ngOnInitBody", "ngOnInitMETHOD", 
			"signalDeclaration", "cssDocument", "selectorincss", "ruleSetStart", 
			"ruleSet", "declarationList", "declaration", "value", "htmlDocument", 
			"scriptletOrSeaWs", "htmlElements", "htmlElement", "tsTag", "noEndTag", 
			"normalTag", "htmlContent", "htmlChardata", "tagAtt", "htmlAttribute", 
			"htmlMisc", "htmlComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'imports'", "'from'", "'export'", "'import'", "'class'", "'constructor'", 
			"'return'", "'@'", "'implements'", "'ngOnInit'", "'selector'", "'templateUrl'", 
			"'styleUrl'", "'styleUrls'", "'providedIn'", "'void'", "'null'", null, 
			null, null, null, null, "'Component'", "'Injectable'", "'{'", "'}'", 
			"'('", "')'", "'['", "']'", "':'", "','", "';'", "'='", "'.'", "'this'", 
			"'#'", null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'!='", null, null, null, null, null, null, null, 
			null, null, null, "'</'", "'<'", null, null, null, "'>'", "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORTS", "FROM", "EXPORT", "IMPORT", "CLASS", "CONSTRUCTOR", 
			"RETURN", "AT", "IMPLEMENTS", "NGONINIT", "SELECTOR", "TEMPLATEURL", 
			"STYLEURL", "STYLEURLS", "PROVIDEDIN", "VOIDTYPE", "NULL", "BOOLEAN", 
			"TYPE", "STATIC", "ACCESS", "CROISNN", "COMPONENT", "INJECTABLE", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", "COMMA", 
			"SEMICOLON", "ASSIGN", "DOT", "THIS", "HASH", "UNIT", "COLOR", "PROPERTY_NAME", 
			"VALUE_KEYWORD", "TAGSFORCSS", "IDENTIFIER", "NUMBER", "STRING_LITERAL", 
			"STRING", "PLUS", "MINUS", "STAR", "DIVIDE", "EQUALS", "NOT_EQUAL", "WS", 
			"LINE_COMMENT", "BLOCK_COMMENT", "INTERPOLATION", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML", "CDATA", "DTD", "SCRIPTLET", "TAG_OPEN_SLASH", "TAG_OPEN", "TAGS", 
			"TAGS_VOID", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_EQUALS", 
			"TAG_NAME", "STRUCTURAL_DIRECTIVE", "ATTRIBUTE_BINDING", "EVENT_BINDING", 
			"TAG_WHITESPACE", "TAG_NameChar", "TAG_NameStartChar", "METHOD_CALL_VALUE", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", "ATTCHAR", "HEXCHARS", "DECCHARS", 
			"DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Parsergrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parsergrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AstContext extends ParserRuleContext {
		public TsDocumentContext tsDocument() {
			return getRuleContext(TsDocumentContext.class,0);
		}
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public CssDocumentContext cssDocument() {
			return getRuleContext(CssDocumentContext.class,0);
		}
		public AstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AstContext ast() throws RecognitionException {
		AstContext _localctx = new AstContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			tsDocument();
			setState(109);
			htmlDocument();
			setState(110);
			cssDocument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsDocumentContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<VariableAssignContext> variableAssign() {
			return getRuleContexts(VariableAssignContext.class);
		}
		public VariableAssignContext variableAssign(int i) {
			return getRuleContext(VariableAssignContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<MethodvoidContext> methodvoid() {
			return getRuleContexts(MethodvoidContext.class);
		}
		public MethodvoidContext methodvoid(int i) {
			return getRuleContext(MethodvoidContext.class,i);
		}
		public List<ArrayExpression1Context> arrayExpression1() {
			return getRuleContexts(ArrayExpression1Context.class);
		}
		public ArrayExpression1Context arrayExpression1(int i) {
			return getRuleContext(ArrayExpression1Context.class,i);
		}
		public List<ArrayExpression2Context> arrayExpression2() {
			return getRuleContexts(ArrayExpression2Context.class);
		}
		public ArrayExpression2Context arrayExpression2(int i) {
			return getRuleContext(ArrayExpression2Context.class,i);
		}
		public List<SignalDeclarationContext> signalDeclaration() {
			return getRuleContexts(SignalDeclarationContext.class);
		}
		public SignalDeclarationContext signalDeclaration(int i) {
			return getRuleContext(SignalDeclarationContext.class,i);
		}
		public List<MethodcallContext> methodcall() {
			return getRuleContexts(MethodcallContext.class);
		}
		public MethodcallContext methodcall(int i) {
			return getRuleContext(MethodcallContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<NgOnInitMETHODContext> ngOnInitMETHOD() {
			return getRuleContexts(NgOnInitMETHODContext.class);
		}
		public NgOnInitMETHODContext ngOnInitMETHOD(int i) {
			return getRuleContext(NgOnInitMETHODContext.class,i);
		}
		public List<ObjectExpressionContext> objectExpression() {
			return getRuleContexts(ObjectExpressionContext.class);
		}
		public ObjectExpressionContext objectExpression(int i) {
			return getRuleContext(ObjectExpressionContext.class,i);
		}
		public List<ComponentDecoratorContext> componentDecorator() {
			return getRuleContexts(ComponentDecoratorContext.class);
		}
		public ComponentDecoratorContext componentDecorator(int i) {
			return getRuleContext(ComponentDecoratorContext.class,i);
		}
		public List<InjectableDecoratorContext> injectableDecorator() {
			return getRuleContexts(InjectableDecoratorContext.class);
		}
		public InjectableDecoratorContext injectableDecorator(int i) {
			return getRuleContext(InjectableDecoratorContext.class,i);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public TsDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsDocumentContext tsDocument() throws RecognitionException {
		TsDocumentContext _localctx = new TsDocumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tsDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796129723472L) != 0)) {
				{
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(112);
						importStatement();
						}
						}
						setState(115); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==IMPORT );
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(117);
						componentDecorator();
						}
						break;
					case 2:
						{
						setState(118);
						injectableDecorator();
						}
						break;
					}
					setState(121);
					classDeclaration();
					}
					break;
				case 2:
					{
					setState(123);
					variableAssign();
					}
					break;
				case 3:
					{
					setState(124);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(125);
					methodDeclaration();
					}
					break;
				case 5:
					{
					setState(126);
					methodvoid();
					}
					break;
				case 6:
					{
					setState(127);
					arrayExpression1();
					}
					break;
				case 7:
					{
					setState(128);
					arrayExpression2();
					}
					break;
				case 8:
					{
					setState(129);
					signalDeclaration();
					}
					break;
				case 9:
					{
					setState(130);
					methodcall();
					}
					break;
				case 10:
					{
					setState(131);
					constructorDeclaration();
					}
					break;
				case 11:
					{
					setState(132);
					ngOnInitMETHOD();
					}
					break;
				case 12:
					{
					setState(133);
					objectExpression();
					}
					break;
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(Parsergrammar.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(Parsergrammar.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(EXPORT);
			setState(140);
			match(CLASS);
			setState(141);
			match(IDENTIFIER);
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(142);
				implementsClause();
				}
				break;
			}
			setState(145);
			match(LBRACE);
			setState(146);
			classBody();
			setState(147);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImplementsClauseContext extends ParserRuleContext {
		public List<TerminalNode> IMPLEMENTS() { return getTokens(Parsergrammar.IMPLEMENTS); }
		public TerminalNode IMPLEMENTS(int i) {
			return getToken(Parsergrammar.IMPLEMENTS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> CROISNN() { return getTokens(Parsergrammar.CROISNN); }
		public TerminalNode CROISNN(int i) {
			return getToken(Parsergrammar.CROISNN, i);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImplementsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImplementsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImplementsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implementsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLEMENTS) {
				{
				{
				setState(149);
				match(IMPLEMENTS);
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<VariableAssignContext> variableAssign() {
			return getRuleContexts(VariableAssignContext.class);
		}
		public VariableAssignContext variableAssign(int i) {
			return getRuleContext(VariableAssignContext.class,i);
		}
		public List<MethodvoidContext> methodvoid() {
			return getRuleContexts(MethodvoidContext.class);
		}
		public MethodvoidContext methodvoid(int i) {
			return getRuleContext(MethodvoidContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ArrayExpression1Context> arrayExpression1() {
			return getRuleContexts(ArrayExpression1Context.class);
		}
		public ArrayExpression1Context arrayExpression1(int i) {
			return getRuleContext(ArrayExpression1Context.class,i);
		}
		public List<ArrayExpression2Context> arrayExpression2() {
			return getRuleContexts(ArrayExpression2Context.class);
		}
		public ArrayExpression2Context arrayExpression2(int i) {
			return getRuleContext(ArrayExpression2Context.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<SignalDeclarationContext> signalDeclaration() {
			return getRuleContexts(SignalDeclarationContext.class);
		}
		public SignalDeclarationContext signalDeclaration(int i) {
			return getRuleContext(SignalDeclarationContext.class,i);
		}
		public List<NgOnInitMETHODContext> ngOnInitMETHOD() {
			return getRuleContexts(NgOnInitMETHODContext.class);
		}
		public NgOnInitMETHODContext ngOnInitMETHOD(int i) {
			return getRuleContext(NgOnInitMETHODContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796096169024L) != 0)) {
				{
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(156);
					variableAssign();
					}
					break;
				case 2:
					{
					setState(157);
					methodvoid();
					}
					break;
				case 3:
					{
					setState(158);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(159);
					arrayExpression1();
					}
					break;
				case 5:
					{
					setState(160);
					arrayExpression2();
					}
					break;
				case 6:
					{
					setState(161);
					methodDeclaration();
					}
					break;
				case 7:
					{
					setState(162);
					constructorDeclaration();
					}
					break;
				case 8:
					{
					setState(163);
					signalDeclaration();
					}
					break;
				case 9:
					{
					setState(164);
					ngOnInitMETHOD();
					}
					break;
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parsergrammar.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public List<ImportBodyContext> importBody() {
			return getRuleContexts(ImportBodyContext.class);
		}
		public ImportBodyContext importBody(int i) {
			return getRuleContext(ImportBodyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(Parsergrammar.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IMPORT);
			setState(171);
			match(LBRACE);
			setState(172);
			importBody();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				importBody();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(RBRACE);
			setState(181);
			match(FROM);
			{
			setState(182);
			match(STRING_LITERAL);
			}
			setState(183);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportBodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode CROISNN() { return getToken(Parsergrammar.CROISNN, 0); }
		public TerminalNode COMPONENT() { return getToken(Parsergrammar.COMPONENT, 0); }
		public TerminalNode INJECTABLE() { return getToken(Parsergrammar.INJECTABLE, 0); }
		public ImportBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportBodyContext importBody() throws RecognitionException {
		ImportBodyContext _localctx = new ImportBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796122382336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parsergrammar.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(Parsergrammar.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public ComponentPropertiesContext componentProperties() {
			return getRuleContext(ComponentPropertiesContext.class,0);
		}
		public ComponentDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterComponentDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitComponentDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitComponentDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDecoratorContext componentDecorator() throws RecognitionException {
		ComponentDecoratorContext _localctx = new ComponentDecoratorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_componentDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(AT);
			setState(188);
			match(COMPONENT);
			setState(189);
			match(LPAREN);
			setState(190);
			match(LBRACE);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6146L) != 0)) {
				{
				setState(191);
				componentProperties();
				}
			}

			setState(194);
			match(RBRACE);
			setState(195);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertiesContext extends ParserRuleContext {
		public TemplateurlContext templateurl() {
			return getRuleContext(TemplateurlContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public StyleurlContext styleurl() {
			return getRuleContext(StyleurlContext.class,0);
		}
		public ComponentPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterComponentProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitComponentProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitComponentProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertiesContext componentProperties() throws RecognitionException {
		ComponentPropertiesContext _localctx = new ComponentPropertiesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(197);
				selector();
				setState(198);
				match(COMMA);
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS) {
				{
				setState(202);
				imports();
				setState(203);
				match(COMMA);
				}
			}

			{
			setState(207);
			templateurl();
			setState(208);
			match(COMMA);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLEURL) {
				{
				setState(210);
				styleurl();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(Parsergrammar.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SELECTOR);
			setState(214);
			match(COLON);
			setState(215);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(Parsergrammar.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> CROISNN() { return getTokens(Parsergrammar.CROISNN); }
		public TerminalNode CROISNN(int i) {
			return getToken(Parsergrammar.CROISNN, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imports);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IMPORTS);
			setState(218);
			match(COLON);
			setState(219);
			match(LBRACKET);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CROISNN || _la==IDENTIFIER) {
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(223);
					match(COMMA);
					setState(224);
					_la = _input.LA(1);
					if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(230);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateurlContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(Parsergrammar.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TemplateurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateurlContext templateurl() throws RecognitionException {
		TemplateurlContext _localctx = new TemplateurlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_templateurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(TEMPLATEURL);
			setState(233);
			match(COLON);
			setState(234);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleurlContext extends ParserRuleContext {
		public TerminalNode STYLEURL() { return getToken(Parsergrammar.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public StyleurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStyleurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStyleurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStyleurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleurlContext styleurl() throws RecognitionException {
		StyleurlContext _localctx = new StyleurlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_styleurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(STYLEURL);
			setState(237);
			match(COLON);
			setState(238);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableDecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parsergrammar.AT, 0); }
		public TerminalNode INJECTABLE() { return getToken(Parsergrammar.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public ProvidedinContext providedin() {
			return getRuleContext(ProvidedinContext.class,0);
		}
		public InjectableDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterInjectableDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitInjectableDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitInjectableDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableDecoratorContext injectableDecorator() throws RecognitionException {
		InjectableDecoratorContext _localctx = new InjectableDecoratorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_injectableDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(AT);
			setState(241);
			match(INJECTABLE);
			setState(242);
			match(LPAREN);
			setState(243);
			match(LBRACE);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROVIDEDIN) {
				{
				setState(244);
				providedin();
				}
			}

			setState(247);
			match(RBRACE);
			setState(248);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProvidedinContext extends ParserRuleContext {
		public TerminalNode PROVIDEDIN() { return getToken(Parsergrammar.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public ProvidedinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providedin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterProvidedin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitProvidedin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitProvidedin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProvidedinContext providedin() throws RecognitionException {
		ProvidedinContext _localctx = new ProvidedinContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_providedin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(PROVIDEDIN);
			setState(251);
			match(COLON);
			setState(252);
			match(STRING_LITERAL);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(253);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ACCESS() { return getToken(Parsergrammar.ACCESS, 0); }
		public TerminalNode STATIC() { return getToken(Parsergrammar.STATIC, 0); }
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(256);
				match(ACCESS);
				}
			}

			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(259);
				match(STATIC);
				}
			}

			setState(262);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(Parsergrammar.NULL, 0); }
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(Parsergrammar.BOOLEAN, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 52776558526464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(Parsergrammar.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Parsergrammar.TYPE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IDENTIFIER);
			setState(267);
			match(COLON);
			setState(268);
			match(TYPE);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(269);
				match(COMMA);
				setState(270);
				match(IDENTIFIER);
				setState(271);
				match(COLON);
				setState(272);
				match(TYPE);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			signature();
			setState(279);
			match(LPAREN);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(280);
				parameters();
				}
			}

			setState(283);
			match(RPAREN);
			setState(284);
			match(LBRACE);
			setState(285);
			methodBody();
			setState(286);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Parsergrammar.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Parsergrammar.THIS, 0); }
		public TerminalNode DOT() { return getToken(Parsergrammar.DOT, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(RETURN);
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case IDENTIFIER:
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(289);
					match(THIS);
					setState(290);
					match(DOT);
					}
				}

				setState(293);
				match(IDENTIFIER);
				}
				break;
			case NULL:
			case BOOLEAN:
			case NUMBER:
			case STRING_LITERAL:
				{
				setState(294);
				values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(297);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ObjectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionContext objectExpression() throws RecognitionException {
		ObjectExpressionContext _localctx = new ObjectExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_objectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LBRACE);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(300);
				match(IDENTIFIER);
				setState(301);
				match(COLON);
				setState(302);
				values();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(303);
					match(COMMA);
					}
				}

				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(RBRACE);
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(312);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpression1Context extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public List<Arraybody1Context> arraybody1() {
			return getRuleContexts(Arraybody1Context.class);
		}
		public Arraybody1Context arraybody1(int i) {
			return getRuleContext(Arraybody1Context.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public ArrayExpression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpression1Context arrayExpression1() throws RecognitionException {
		ArrayExpression1Context _localctx = new ArrayExpression1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayExpression1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			signature();
			setState(316);
			match(ASSIGN);
			setState(317);
			match(LBRACKET);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52776591687680L) != 0)) {
				{
				{
				setState(318);
				arraybody1();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(RBRACKET);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(325);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arraybody1Context extends ParserRuleContext {
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public Arraybody1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybody1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArraybody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArraybody1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArraybody1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybody1Context arraybody1() throws RecognitionException {
		Arraybody1Context _localctx = new Arraybody1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_arraybody1);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				objectExpression();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(NUMBER);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(330);
					match(COMMA);
					}
				}

				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(STRING_LITERAL);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(334);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpression2Context extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parsergrammar.TYPE, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Parsergrammar.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Parsergrammar.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Parsergrammar.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Parsergrammar.RBRACKET, i);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public List<Arraybody2Context> arraybody2() {
			return getRuleContexts(Arraybody2Context.class);
		}
		public Arraybody2Context arraybody2(int i) {
			return getRuleContext(Arraybody2Context.class,i);
		}
		public ArrayExpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpression2Context arrayExpression2() throws RecognitionException {
		ArrayExpression2Context _localctx = new ArrayExpression2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayExpression2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			signature();
			setState(340);
			match(COLON);
			setState(341);
			match(TYPE);
			setState(342);
			match(LBRACKET);
			setState(343);
			match(RBRACKET);
			setState(344);
			match(ASSIGN);
			setState(345);
			match(LBRACKET);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE) {
				{
				{
				setState(346);
				arraybody2();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(RBRACKET);
			setState(353);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arraybody2Context extends ParserRuleContext {
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public Arraybody2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybody2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArraybody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArraybody2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArraybody2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybody2Context arraybody2() throws RecognitionException {
		Arraybody2Context _localctx = new Arraybody2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_arraybody2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			objectExpression();
			setState(356);
			match(COMMA);
			setState(357);
			match(NUMBER);
			setState(358);
			match(COMMA);
			setState(359);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(Parsergrammar.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode ACCESS() { return getToken(Parsergrammar.ACCESS, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(CONSTRUCTOR);
			setState(362);
			match(LPAREN);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==IDENTIFIER) {
				{
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCESS) {
					{
					setState(363);
					match(ACCESS);
					}
				}

				setState(366);
				match(IDENTIFIER);
				setState(367);
				match(COLON);
				setState(368);
				match(IDENTIFIER);
				}
			}

			setState(371);
			match(RPAREN);
			setState(372);
			match(LBRACE);
			setState(373);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parsergrammar.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			signature();
			setState(376);
			match(COLON);
			setState(377);
			match(TYPE);
			setState(378);
			match(ASSIGN);
			setState(379);
			values();
			setState(380);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public VariableAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignContext variableAssign() throws RecognitionException {
		VariableAssignContext _localctx = new VariableAssignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENTIFIER);
			setState(383);
			match(ASSIGN);
			setState(384);
			values();
			setState(385);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodvoidContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode VOIDTYPE() { return getToken(Parsergrammar.VOIDTYPE, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodvoidbodyContext methodvoidbody() {
			return getRuleContext(MethodvoidbodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodvoidContext methodvoid() throws RecognitionException {
		MethodvoidContext _localctx = new MethodvoidContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodvoid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			signature();
			setState(388);
			match(LPAREN);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(389);
				parameters();
				}
			}

			setState(392);
			match(RPAREN);
			setState(393);
			match(COLON);
			setState(394);
			match(VOIDTYPE);
			setState(395);
			match(LBRACE);
			setState(396);
			methodvoidbody();
			setState(397);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodvoidbodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public List<TerminalNode> THIS() { return getTokens(Parsergrammar.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(Parsergrammar.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parsergrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parsergrammar.DOT, i);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public MethodvoidbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodvoidbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodvoidbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodvoidbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodvoidbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodvoidbodyContext methodvoidbody() throws RecognitionException {
		MethodvoidbodyContext _localctx = new MethodvoidbodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodvoidbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(399);
				match(THIS);
				setState(400);
				match(DOT);
				}
			}

			setState(403);
			match(IDENTIFIER);
			setState(404);
			match(ASSIGN);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(405);
				match(THIS);
				setState(406);
				match(DOT);
				}
			}

			setState(409);
			match(IDENTIFIER);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(410);
				match(DOT);
				setState(411);
				methodcall();
				}
			}

			setState(414);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodcallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public MethodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallContext methodcall() throws RecognitionException {
		MethodcallContext _localctx = new MethodcallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(IDENTIFIER);
			setState(417);
			match(LPAREN);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(418);
				match(IDENTIFIER);
				}
			}

			setState(421);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgOnInitBodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public List<TerminalNode> THIS() { return getTokens(Parsergrammar.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(Parsergrammar.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parsergrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parsergrammar.DOT, i);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public NgOnInitBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOnInitBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNgOnInitBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNgOnInitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNgOnInitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnInitBodyContext ngOnInitBody() throws RecognitionException {
		NgOnInitBodyContext _localctx = new NgOnInitBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ngOnInitBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(423);
				match(THIS);
				setState(424);
				match(DOT);
				}
			}

			setState(427);
			match(IDENTIFIER);
			setState(428);
			match(ASSIGN);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || _la==IDENTIFIER) {
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(429);
					match(THIS);
					setState(430);
					match(DOT);
					}
				}

				setState(433);
				match(IDENTIFIER);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(434);
					match(DOT);
					setState(435);
					methodcall();
					}
				}

				}
			}

			setState(440);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgOnInitMETHODContext extends ParserRuleContext {
		public TerminalNode NGONINIT() { return getToken(Parsergrammar.NGONINIT, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode VOIDTYPE() { return getToken(Parsergrammar.VOIDTYPE, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodvoidbodyContext methodvoidbody() {
			return getRuleContext(MethodvoidbodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode ACCESS() { return getToken(Parsergrammar.ACCESS, 0); }
		public NgOnInitMETHODContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOnInitMETHOD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNgOnInitMETHOD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNgOnInitMETHOD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNgOnInitMETHOD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnInitMETHODContext ngOnInitMETHOD() throws RecognitionException {
		NgOnInitMETHODContext _localctx = new NgOnInitMETHODContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ngOnInitMETHOD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(442);
				match(ACCESS);
				}
			}

			setState(445);
			match(NGONINIT);
			setState(446);
			match(LPAREN);
			setState(447);
			match(RPAREN);
			setState(448);
			match(COLON);
			setState(449);
			match(VOIDTYPE);
			setState(450);
			match(LBRACE);
			setState(451);
			methodvoidbody();
			setState(452);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignalDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode CROISNN() { return getToken(Parsergrammar.CROISNN, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public SignalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalDeclarationContext signalDeclaration() throws RecognitionException {
		SignalDeclarationContext _localctx = new SignalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_signalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(IDENTIFIER);
			setState(455);
			match(ASSIGN);
			setState(456);
			match(CROISNN);
			setState(457);
			match(LPAREN);
			setState(458);
			match(STRING_LITERAL);
			setState(459);
			match(RPAREN);
			setState(460);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDocumentContext extends ParserRuleContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public CssDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCssDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCssDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCssDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDocumentContext cssDocument() throws RecognitionException {
		CssDocumentContext _localctx = new CssDocumentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cssDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4569845202944L) != 0)) {
				{
				{
				setState(462);
				ruleSet();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorincssContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(Parsergrammar.DOT, 0); }
		public TerminalNode HASH() { return getToken(Parsergrammar.HASH, 0); }
		public TerminalNode TAGSFORCSS() { return getToken(Parsergrammar.TAGSFORCSS, 0); }
		public SelectorincssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorincss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelectorincss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelectorincss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelectorincss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorincssContext selectorincss() throws RecognitionException {
		SelectorincssContext _localctx = new SelectorincssContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selectorincss);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
				match(IDENTIFIER);
				}
				break;
			case TAGSFORCSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(TAGSFORCSS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetStartContext extends ParserRuleContext {
		public SelectorincssContext first;
		public SelectorincssContext selectorincss() {
			return getRuleContext(SelectorincssContext.class,0);
		}
		public List<TerminalNode> TAGSFORCSS() { return getTokens(Parsergrammar.TAGSFORCSS); }
		public TerminalNode TAGSFORCSS(int i) {
			return getToken(Parsergrammar.TAGSFORCSS, i);
		}
		public List<TerminalNode> WS() { return getTokens(Parsergrammar.WS); }
		public TerminalNode WS(int i) {
			return getToken(Parsergrammar.WS, i);
		}
		public RuleSetStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSetStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRuleSetStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRuleSetStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRuleSetStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetStartContext ruleSetStart() throws RecognitionException {
		RuleSetStartContext _localctx = new RuleSetStartContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ruleSetStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			((RuleSetStartContext)_localctx).first = selectorincss();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAGSFORCSS || _la==WS) {
				{
				{
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(474);
					match(WS);
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
				match(TAGSFORCSS);
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetContext extends ParserRuleContext {
		public RuleSetStartContext ruleSetStart() {
			return getRuleContext(RuleSetStartContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ruleSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			ruleSetStart();
			setState(487);
			match(LBRACE);
			setState(488);
			declarationList();
			setState(489);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parsergrammar.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parsergrammar.SEMICOLON, i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			declaration();
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(492);
					match(SEMICOLON);
					setState(493);
					declaration();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(499);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode PROPERTY_NAME() { return getToken(Parsergrammar.PROPERTY_NAME, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(PROPERTY_NAME);
			setState(503);
			match(COLON);
			setState(504);
			value();
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99505802313728L) != 0)) {
					{
					{
					setState(505);
					value();
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(Parsergrammar.UNIT, 0); }
		public TerminalNode COLOR() { return getToken(Parsergrammar.COLOR, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode VALUE_KEYWORD() { return getToken(Parsergrammar.VALUE_KEYWORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_value);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(NUMBER);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(514);
					match(UNIT);
					}
				}

				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				match(STRING);
				}
				break;
			case VALUE_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				match(VALUE_KEYWORD);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(520);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(Parsergrammar.XML, 0); }
		public TerminalNode DTD() { return getToken(Parsergrammar.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(529);
				match(XML);
				}
			}

			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(532);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(538);
				match(DTD);
				}
			}

			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(541);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 327L) != 0)) {
				{
				{
				setState(547);
				htmlElements();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(Parsergrammar.SCRIPTLET, 0); }
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_la = _input.LA(1);
			if ( !(_la==WS || _la==SCRIPTLET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) {
				{
				{
				setState(555);
				htmlComment();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			htmlElement();
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(562);
					htmlComment();
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoEndTagElementContext extends HtmlElementContext {
		public NoEndTagContext noEndTag() {
			return getRuleContext(NoEndTagContext.class,0);
		}
		public NoEndTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNoEndTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNoEndTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNoEndTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTagElementContext extends HtmlElementContext {
		public NormalTagContext normalTag() {
			return getRuleContext(NormalTagContext.class,0);
		}
		public NormalTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNormalTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNormalTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNormalTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationElementContext extends HtmlElementContext {
		public TerminalNode INTERPOLATION() { return getToken(Parsergrammar.INTERPOLATION, 0); }
		public InterpolationElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsTagElementContext extends HtmlElementContext {
		public TsTagContext tsTag() {
			return getRuleContext(TsTagContext.class,0);
		}
		public TsTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptletElementContext extends HtmlElementContext {
		public TerminalNode SCRIPTLET() { return getToken(Parsergrammar.SCRIPTLET, 0); }
		public ScriptletElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterScriptletElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitScriptletElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitScriptletElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_htmlElement);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new TsTagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				tsTag();
				}
				break;
			case 2:
				_localctx = new NoEndTagElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				noEndTag();
				}
				break;
			case 3:
				_localctx = new NormalTagElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				normalTag();
				}
				break;
			case 4:
				_localctx = new ScriptletElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
				match(SCRIPTLET);
				}
				break;
			case 5:
				_localctx = new InterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(572);
				match(INTERPOLATION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(Parsergrammar.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(Parsergrammar.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TsTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsTagContext tsTag() throws RecognitionException {
		TsTagContext _localctx = new TsTagContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tsTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(TAG_OPEN);
			setState(576);
			match(TAG_NAME);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(577);
				htmlAttribute();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			match(TAG_SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoEndTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public TerminalNode TAGS_VOID() { return getToken(Parsergrammar.TAGS_VOID, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(Parsergrammar.TAG_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public NoEndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noEndTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNoEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNoEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNoEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoEndTagContext noEndTag() throws RecognitionException {
		NoEndTagContext _localctx = new NoEndTagContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_noEndTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(TAG_OPEN);
			setState(586);
			match(TAGS_VOID);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(587);
				htmlAttribute();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public List<TerminalNode> TAGS() { return getTokens(Parsergrammar.TAGS); }
		public TerminalNode TAGS(int i) {
			return getToken(Parsergrammar.TAGS, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(Parsergrammar.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(Parsergrammar.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(Parsergrammar.TAG_OPEN_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public NormalTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNormalTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNormalTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNormalTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalTagContext normalTag() throws RecognitionException {
		NormalTagContext _localctx = new NormalTagContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_normalTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(TAG_OPEN);
			setState(596);
			match(TAGS);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(597);
				htmlAttribute();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			match(TAG_CLOSE);
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(604);
				htmlContent();
				}
				break;
			}
			setState(607);
			match(TAG_OPEN_SLASH);
			setState(608);
			match(TAGS);
			setState(609);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentSequenceContext extends HtmlContentContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(Parsergrammar.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(Parsergrammar.CDATA, i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public List<TerminalNode> SCRIPTLET() { return getTokens(Parsergrammar.SCRIPTLET); }
		public TerminalNode SCRIPTLET(int i) {
			return getToken(Parsergrammar.SCRIPTLET, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public HtmlContentSequenceContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlContentSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlContentSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlContentSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_htmlContent);
		int _la;
		try {
			_localctx = new HtmlContentSequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 80232845313L) != 0)) {
				{
				setState(618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(611);
					htmlChardata();
					}
					break;
				case 2:
					{
					setState(612);
					htmlElement();
					}
					break;
				case 3:
					{
					setState(613);
					match(CDATA);
					}
					break;
				case 4:
					{
					setState(614);
					htmlComment();
					}
					break;
				case 5:
					{
					setState(615);
					match(SCRIPTLET);
					}
					break;
				case 6:
					{
					setState(616);
					match(IDENTIFIER);
					}
					break;
				case 7:
					{
					setState(617);
					match(COLON);
					}
					break;
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(Parsergrammar.HTML_TEXT, 0); }
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_la = _input.LA(1);
			if ( !(_la==WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagAttContext extends ParserRuleContext {
		public TerminalNode TAG_EQUALS() { return getToken(Parsergrammar.TAG_EQUALS, 0); }
		public TerminalNode METHOD_CALL_VALUE() { return getToken(Parsergrammar.METHOD_CALL_VALUE, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(Parsergrammar.ATTVALUE_VALUE, 0); }
		public TagAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTagAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTagAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTagAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttContext tagAtt() throws RecognitionException {
		TagAttContext _localctx = new TagAttContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tagAtt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(TAG_EQUALS);
			setState(626);
			_la = _input.LA(1);
			if ( !(_la==METHOD_CALL_VALUE || _la==ATTVALUE_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingContext extends HtmlAttributeContext {
		public TerminalNode EVENT_BINDING() { return getToken(Parsergrammar.EVENT_BINDING, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public EventBindingContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuralDirectiveAttributeContext extends HtmlAttributeContext {
		public TerminalNode STRUCTURAL_DIRECTIVE() { return getToken(Parsergrammar.STRUCTURAL_DIRECTIVE, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public StructuralDirectiveAttributeContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStructuralDirectiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStructuralDirectiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStructuralDirectiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeBindingContext extends HtmlAttributeContext {
		public TerminalNode ATTRIBUTE_BINDING() { return getToken(Parsergrammar.ATTRIBUTE_BINDING, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public AttributeBindingContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAttributeBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAttributeBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAttributeBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagNameAttributeContext extends HtmlAttributeContext {
		public TerminalNode TAG_NAME() { return getToken(Parsergrammar.TAG_NAME, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public TagNameAttributeContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTagNameAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTagNameAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTagNameAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_htmlAttribute);
		int _la;
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCTURAL_DIRECTIVE:
				_localctx = new StructuralDirectiveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(STRUCTURAL_DIRECTIVE);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(629);
					tagAtt();
					}
				}

				}
				break;
			case ATTRIBUTE_BINDING:
				_localctx = new AttributeBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(ATTRIBUTE_BINDING);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(633);
					tagAtt();
					}
				}

				}
				break;
			case EVENT_BINDING:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				match(EVENT_BINDING);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(637);
					tagAtt();
					}
				}

				}
				break;
			case TAG_NAME:
				_localctx = new TagNameAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				match(TAG_NAME);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(641);
					tagAtt();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_htmlMisc);
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				htmlComment();
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(Parsergrammar.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(Parsergrammar.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001V\u028d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001r\b\u0001\u000b\u0001"+
		"\f\u0001s\u0001\u0001\u0001\u0001\u0003\u0001x\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0087\b\u0001\n\u0001\f\u0001\u008a\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0090\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u0098\b\u0003"+
		"\n\u0003\f\u0003\u009b\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00a6\b\u0004\n\u0004\f\u0004\u00a9\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b0\b\u0005\n\u0005"+
		"\f\u0005\u00b3\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00c1\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00c9\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u00ce\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d4"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00de\b\n\u0001\n\u0001\n\u0005\n\u00e2\b\n\n\n\f\n\u00e5\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f6"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ff\b\u000e\u0001\u000f\u0003\u000f\u0102\b\u000f"+
		"\u0001\u000f\u0003\u000f\u0105\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0112\b\u0011\n\u0011\f\u0011\u0115"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011a\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0124\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0128\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0131\b\u0014\u0005\u0014"+
		"\u0133\b\u0014\n\u0014\f\u0014\u0136\t\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u013a\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0140\b\u0015\n\u0015\f\u0015\u0143\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0147\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u014c\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0150\b\u0016\u0003"+
		"\u0016\u0152\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u015c\b\u0017\n"+
		"\u0017\f\u0017\u015f\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u016d\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0172\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0187"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0192\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0198\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u019d\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a4\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u01aa\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01b0\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01b5\b\u001f\u0003\u001f\u01b7"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u01bc\b \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0005\"\u01d0\b\"\n\"\f\""+
		"\u01d3\t\"\u0001#\u0001#\u0001#\u0003#\u01d8\b#\u0001$\u0001$\u0005$\u01dc"+
		"\b$\n$\f$\u01df\t$\u0001$\u0005$\u01e2\b$\n$\f$\u01e5\t$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0005&\u01ef\b&\n&\f&\u01f2"+
		"\t&\u0001&\u0003&\u01f5\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01fb"+
		"\b\'\n\'\f\'\u01fe\t\'\u0003\'\u0200\b\'\u0001(\u0001(\u0003(\u0204\b"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u020a\b(\u0001)\u0005)\u020d\b)\n"+
		")\f)\u0210\t)\u0001)\u0003)\u0213\b)\u0001)\u0005)\u0216\b)\n)\f)\u0219"+
		"\t)\u0001)\u0003)\u021c\b)\u0001)\u0005)\u021f\b)\n)\f)\u0222\t)\u0001"+
		")\u0005)\u0225\b)\n)\f)\u0228\t)\u0001*\u0001*\u0001+\u0005+\u022d\b+"+
		"\n+\f+\u0230\t+\u0001+\u0001+\u0005+\u0234\b+\n+\f+\u0237\t+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u023e\b,\u0001-\u0001-\u0001-\u0005-\u0243"+
		"\b-\n-\f-\u0246\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u024d\b."+
		"\n.\f.\u0250\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u0257\b/\n/"+
		"\f/\u025a\t/\u0001/\u0001/\u0003/\u025e\b/\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00050\u026b\b0\n0"+
		"\f0\u026e\t0\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00033\u0277"+
		"\b3\u00013\u00013\u00033\u027b\b3\u00013\u00013\u00033\u027f\b3\u0001"+
		"3\u00013\u00033\u0283\b3\u00033\u0285\b3\u00014\u00014\u00034\u0289\b"+
		"4\u00015\u00015\u00015\u0001\u00e3\u00006\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\b\u0002\u0000\u0016\u0016++\u0002\u0000"+
		"\u0016\u0018++\u0002\u0000\u0011\u0012,-\u0002\u0000##%%\u0002\u00005"+
		"5>>\u0002\u000055CC\u0001\u0000NO\u0001\u00009:\u02c0\u0000l\u0001\u0000"+
		"\u0000\u0000\u0002\u0088\u0001\u0000\u0000\u0000\u0004\u008b\u0001\u0000"+
		"\u0000\u0000\u0006\u0099\u0001\u0000\u0000\u0000\b\u00a7\u0001\u0000\u0000"+
		"\u0000\n\u00aa\u0001\u0000\u0000\u0000\f\u00b9\u0001\u0000\u0000\u0000"+
		"\u000e\u00bb\u0001\u0000\u0000\u0000\u0010\u00c8\u0001\u0000\u0000\u0000"+
		"\u0012\u00d5\u0001\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000\u0000"+
		"\u0016\u00e8\u0001\u0000\u0000\u0000\u0018\u00ec\u0001\u0000\u0000\u0000"+
		"\u001a\u00f0\u0001\u0000\u0000\u0000\u001c\u00fa\u0001\u0000\u0000\u0000"+
		"\u001e\u0101\u0001\u0000\u0000\u0000 \u0108\u0001\u0000\u0000\u0000\""+
		"\u010a\u0001\u0000\u0000\u0000$\u0116\u0001\u0000\u0000\u0000&\u0120\u0001"+
		"\u0000\u0000\u0000(\u012b\u0001\u0000\u0000\u0000*\u013b\u0001\u0000\u0000"+
		"\u0000,\u0151\u0001\u0000\u0000\u0000.\u0153\u0001\u0000\u0000\u00000"+
		"\u0163\u0001\u0000\u0000\u00002\u0169\u0001\u0000\u0000\u00004\u0177\u0001"+
		"\u0000\u0000\u00006\u017e\u0001\u0000\u0000\u00008\u0183\u0001\u0000\u0000"+
		"\u0000:\u0191\u0001\u0000\u0000\u0000<\u01a0\u0001\u0000\u0000\u0000>"+
		"\u01a9\u0001\u0000\u0000\u0000@\u01bb\u0001\u0000\u0000\u0000B\u01c6\u0001"+
		"\u0000\u0000\u0000D\u01d1\u0001\u0000\u0000\u0000F\u01d7\u0001\u0000\u0000"+
		"\u0000H\u01d9\u0001\u0000\u0000\u0000J\u01e6\u0001\u0000\u0000\u0000L"+
		"\u01eb\u0001\u0000\u0000\u0000N\u01f6\u0001\u0000\u0000\u0000P\u0209\u0001"+
		"\u0000\u0000\u0000R\u020e\u0001\u0000\u0000\u0000T\u0229\u0001\u0000\u0000"+
		"\u0000V\u022e\u0001\u0000\u0000\u0000X\u023d\u0001\u0000\u0000\u0000Z"+
		"\u023f\u0001\u0000\u0000\u0000\\\u0249\u0001\u0000\u0000\u0000^\u0253"+
		"\u0001\u0000\u0000\u0000`\u026c\u0001\u0000\u0000\u0000b\u026f\u0001\u0000"+
		"\u0000\u0000d\u0271\u0001\u0000\u0000\u0000f\u0284\u0001\u0000\u0000\u0000"+
		"h\u0288\u0001\u0000\u0000\u0000j\u028a\u0001\u0000\u0000\u0000lm\u0003"+
		"\u0002\u0001\u0000mn\u0003R)\u0000no\u0003D\"\u0000o\u0001\u0001\u0000"+
		"\u0000\u0000pr\u0003\n\u0005\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000ux\u0003\u000e\u0007\u0000vx\u0003\u001a\r\u0000wu\u0001"+
		"\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0003\u0004\u0002\u0000z\u0087\u0001\u0000\u0000\u0000{\u0087\u0003"+
		"6\u001b\u0000|\u0087\u00034\u001a\u0000}\u0087\u0003$\u0012\u0000~\u0087"+
		"\u00038\u001c\u0000\u007f\u0087\u0003*\u0015\u0000\u0080\u0087\u0003."+
		"\u0017\u0000\u0081\u0087\u0003B!\u0000\u0082\u0087\u0003<\u001e\u0000"+
		"\u0083\u0087\u00032\u0019\u0000\u0084\u0087\u0003@ \u0000\u0085\u0087"+
		"\u0003(\u0014\u0000\u0086q\u0001\u0000\u0000\u0000\u0086{\u0001\u0000"+
		"\u0000\u0000\u0086|\u0001\u0000\u0000\u0000\u0086}\u0001\u0000\u0000\u0000"+
		"\u0086~\u0001\u0000\u0000\u0000\u0086\u007f\u0001\u0000\u0000\u0000\u0086"+
		"\u0080\u0001\u0000\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0086"+
		"\u0082\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u0003\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c"+
		"\u008d\u0005\u0005\u0000\u0000\u008d\u008f\u0005+\u0000\u0000\u008e\u0090"+
		"\u0003\u0006\u0003\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u0019\u0000\u0000\u0092\u0093\u0003\b\u0004\u0000\u0093\u0094\u0005"+
		"\u001a\u0000\u0000\u0094\u0005\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\t\u0000\u0000\u0096\u0098\u0007\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0007\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u00a6\u00036\u001b"+
		"\u0000\u009d\u00a6\u00038\u001c\u0000\u009e\u00a6\u00034\u001a\u0000\u009f"+
		"\u00a6\u0003*\u0015\u0000\u00a0\u00a6\u0003.\u0017\u0000\u00a1\u00a6\u0003"+
		"$\u0012\u0000\u00a2\u00a6\u00032\u0019\u0000\u00a3\u00a6\u0003B!\u0000"+
		"\u00a4\u00a6\u0003@ \u0000\u00a5\u009c\u0001\u0000\u0000\u0000\u00a5\u009d"+
		"\u0001\u0000\u0000\u0000\u00a5\u009e\u0001\u0000\u0000\u0000\u00a5\u009f"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\t\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\u0004\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0019\u0000\u0000\u00ac\u00b1\u0003\f\u0006\u0000\u00ad\u00ae\u0005 "+
		"\u0000\u0000\u00ae\u00b0\u0003\f\u0006\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u001a\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0002\u0000\u0000\u00b6\u00b7\u0005-\u0000\u0000"+
		"\u00b7\u00b8\u0005!\u0000\u0000\u00b8\u000b\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0007\u0001\u0000\u0000\u00ba\r\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005\b\u0000\u0000\u00bc\u00bd\u0005\u0017\u0000\u0000\u00bd\u00be\u0005"+
		"\u001b\u0000\u0000\u00be\u00c0\u0005\u0019\u0000\u0000\u00bf\u00c1\u0003"+
		"\u0010\b\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u001a"+
		"\u0000\u0000\u00c3\u00c4\u0005\u001c\u0000\u0000\u00c4\u000f\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0003\u0012\t\u0000\u00c6\u00c7\u0005 \u0000"+
		"\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cd\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0003\u0014\n\u0000\u00cb\u00cc\u0005 \u0000\u0000"+
		"\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0003\u0016\u000b\u0000\u00d0\u00d1\u0005 \u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003\u0018\f\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0011"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u000b\u0000\u0000\u00d6\u00d7"+
		"\u0005\u001f\u0000\u0000\u00d7\u00d8\u0005-\u0000\u0000\u00d8\u0013\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\u0001\u0000\u0000\u00da\u00db\u0005"+
		"\u001f\u0000\u0000\u00db\u00dd\u0005\u001d\u0000\u0000\u00dc\u00de\u0007"+
		"\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00e3\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		" \u0000\u0000\u00e0\u00e2\u0007\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u001e"+
		"\u0000\u0000\u00e7\u0015\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\f\u0000"+
		"\u0000\u00e9\u00ea\u0005\u001f\u0000\u0000\u00ea\u00eb\u0005-\u0000\u0000"+
		"\u00eb\u0017\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\r\u0000\u0000\u00ed"+
		"\u00ee\u0005\u001f\u0000\u0000\u00ee\u00ef\u0005-\u0000\u0000\u00ef\u0019"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\b\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0018\u0000\u0000\u00f2\u00f3\u0005\u001b\u0000\u0000\u00f3\u00f5\u0005"+
		"\u0019\u0000\u0000\u00f4\u00f6\u0003\u001c\u000e\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005\u001a\u0000\u0000\u00f8\u00f9\u0005"+
		"\u001c\u0000\u0000\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u000f\u0000\u0000\u00fb\u00fc\u0005\u001f\u0000\u0000\u00fc\u00fe\u0005"+
		"-\u0000\u0000\u00fd\u00ff\u0005 \u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u001d\u0001\u0000\u0000"+
		"\u0000\u0100\u0102\u0005\u0015\u0000\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u0105\u0005\u0014\u0000\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005+\u0000\u0000\u0107\u001f\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0007\u0002\u0000\u0000\u0109!\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005+\u0000\u0000\u010b\u010c\u0005\u001f\u0000\u0000\u010c\u0113"+
		"\u0005\u0013\u0000\u0000\u010d\u010e\u0005 \u0000\u0000\u010e\u010f\u0005"+
		"+\u0000\u0000\u010f\u0110\u0005\u001f\u0000\u0000\u0110\u0112\u0005\u0013"+
		"\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000"+
		"\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114#\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0003\u001e\u000f\u0000\u0117\u0119\u0005\u001b\u0000"+
		"\u0000\u0118\u011a\u0003\"\u0011\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0005\u001c\u0000\u0000\u011c\u011d\u0005\u0019\u0000\u0000"+
		"\u011d\u011e\u0003&\u0013\u0000\u011e\u011f\u0005\u001a\u0000\u0000\u011f"+
		"%\u0001\u0000\u0000\u0000\u0120\u0127\u0005\u0007\u0000\u0000\u0121\u0122"+
		"\u0005$\u0000\u0000\u0122\u0124\u0005#\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0128\u0005+\u0000\u0000\u0126\u0128\u0003 \u0010\u0000"+
		"\u0127\u0123\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0005!\u0000\u0000\u012a"+
		"\'\u0001\u0000\u0000\u0000\u012b\u0134\u0005\u0019\u0000\u0000\u012c\u012d"+
		"\u0005+\u0000\u0000\u012d\u012e\u0005\u001f\u0000\u0000\u012e\u0130\u0003"+
		" \u0010\u0000\u012f\u0131\u0005 \u0000\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000"+
		"\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0005\u001a\u0000\u0000\u0138\u013a\u0005 \u0000\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a)\u0001\u0000\u0000\u0000\u013b\u013c\u0003\u001e\u000f\u0000\u013c"+
		"\u013d\u0005\"\u0000\u0000\u013d\u0141\u0005\u001d\u0000\u0000\u013e\u0140"+
		"\u0003,\u0016\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u0146\u0005\u001e\u0000\u0000\u0145\u0147\u0005"+
		"!\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147+\u0001\u0000\u0000\u0000\u0148\u0152\u0003(\u0014\u0000"+
		"\u0149\u014b\u0005,\u0000\u0000\u014a\u014c\u0005 \u0000\u0000\u014b\u014a"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u0152"+
		"\u0001\u0000\u0000\u0000\u014d\u014f\u0005-\u0000\u0000\u014e\u0150\u0005"+
		" \u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u0148\u0001\u0000"+
		"\u0000\u0000\u0151\u0149\u0001\u0000\u0000\u0000\u0151\u014d\u0001\u0000"+
		"\u0000\u0000\u0152-\u0001\u0000\u0000\u0000\u0153\u0154\u0003\u001e\u000f"+
		"\u0000\u0154\u0155\u0005\u001f\u0000\u0000\u0155\u0156\u0005\u0013\u0000"+
		"\u0000\u0156\u0157\u0005\u001d\u0000\u0000\u0157\u0158\u0005\u001e\u0000"+
		"\u0000\u0158\u0159\u0005\"\u0000\u0000\u0159\u015d\u0005\u001d\u0000\u0000"+
		"\u015a\u015c\u00030\u0018\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u001e\u0000\u0000\u0161"+
		"\u0162\u0005!\u0000\u0000\u0162/\u0001\u0000\u0000\u0000\u0163\u0164\u0003"+
		"(\u0014\u0000\u0164\u0165\u0005 \u0000\u0000\u0165\u0166\u0005,\u0000"+
		"\u0000\u0166\u0167\u0005 \u0000\u0000\u0167\u0168\u0005-\u0000\u0000\u0168"+
		"1\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u0006\u0000\u0000\u016a\u0171"+
		"\u0005\u001b\u0000\u0000\u016b\u016d\u0005\u0015\u0000\u0000\u016c\u016b"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0005+\u0000\u0000\u016f\u0170\u0005"+
		"\u001f\u0000\u0000\u0170\u0172\u0005+\u0000\u0000\u0171\u016c\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0005\u001c\u0000\u0000\u0174\u0175\u0005\u0019"+
		"\u0000\u0000\u0175\u0176\u0005\u001a\u0000\u0000\u01763\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0003\u001e\u000f\u0000\u0178\u0179\u0005\u001f\u0000"+
		"\u0000\u0179\u017a\u0005\u0013\u0000\u0000\u017a\u017b\u0005\"\u0000\u0000"+
		"\u017b\u017c\u0003 \u0010\u0000\u017c\u017d\u0005!\u0000\u0000\u017d5"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0005+\u0000\u0000\u017f\u0180\u0005"+
		"\"\u0000\u0000\u0180\u0181\u0003 \u0010\u0000\u0181\u0182\u0005!\u0000"+
		"\u0000\u01827\u0001\u0000\u0000\u0000\u0183\u0184\u0003\u001e\u000f\u0000"+
		"\u0184\u0186\u0005\u001b\u0000\u0000\u0185\u0187\u0003\"\u0011\u0000\u0186"+
		"\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u001c\u0000\u0000\u0189"+
		"\u018a\u0005\u001f\u0000\u0000\u018a\u018b\u0005\u0010\u0000\u0000\u018b"+
		"\u018c\u0005\u0019\u0000\u0000\u018c\u018d\u0003:\u001d\u0000\u018d\u018e"+
		"\u0005\u001a\u0000\u0000\u018e9\u0001\u0000\u0000\u0000\u018f\u0190\u0005"+
		"$\u0000\u0000\u0190\u0192\u0005#\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0005+\u0000\u0000\u0194\u0197\u0005\"\u0000\u0000"+
		"\u0195\u0196\u0005$\u0000\u0000\u0196\u0198\u0005#\u0000\u0000\u0197\u0195"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u019c\u0005+\u0000\u0000\u019a\u019b\u0005"+
		"#\u0000\u0000\u019b\u019d\u0003<\u001e\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0005!\u0000\u0000\u019f;\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005+\u0000\u0000\u01a1\u01a3\u0005\u001b\u0000\u0000\u01a2\u01a4"+
		"\u0005+\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005"+
		"\u001c\u0000\u0000\u01a6=\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005$\u0000"+
		"\u0000\u01a8\u01aa\u0005#\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0005+\u0000\u0000\u01ac\u01b6\u0005\"\u0000\u0000\u01ad"+
		"\u01ae\u0005$\u0000\u0000\u01ae\u01b0\u0005#\u0000\u0000\u01af\u01ad\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b4\u0005+\u0000\u0000\u01b2\u01b3\u0005#\u0000"+
		"\u0000\u01b3\u01b5\u0003<\u001e\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b6\u01af\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005!\u0000\u0000\u01b9"+
		"?\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005\u0015\u0000\u0000\u01bb\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\n\u0000\u0000\u01be\u01bf\u0005"+
		"\u001b\u0000\u0000\u01bf\u01c0\u0005\u001c\u0000\u0000\u01c0\u01c1\u0005"+
		"\u001f\u0000\u0000\u01c1\u01c2\u0005\u0010\u0000\u0000\u01c2\u01c3\u0005"+
		"\u0019\u0000\u0000\u01c3\u01c4\u0003:\u001d\u0000\u01c4\u01c5\u0005\u001a"+
		"\u0000\u0000\u01c5A\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005+\u0000\u0000"+
		"\u01c7\u01c8\u0005\"\u0000\u0000\u01c8\u01c9\u0005\u0016\u0000\u0000\u01c9"+
		"\u01ca\u0005\u001b\u0000\u0000\u01ca\u01cb\u0005-\u0000\u0000\u01cb\u01cc"+
		"\u0005\u001c\u0000\u0000\u01cc\u01cd\u0005!\u0000\u0000\u01cdC\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d0\u0003J%\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2E\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d5\u0007\u0003\u0000\u0000\u01d5"+
		"\u01d8\u0005+\u0000\u0000\u01d6\u01d8\u0005*\u0000\u0000\u01d7\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8G\u0001\u0000"+
		"\u0000\u0000\u01d9\u01e3\u0003F#\u0000\u01da\u01dc\u00055\u0000\u0000"+
		"\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e2\u0005*\u0000\u0000\u01e1\u01dd\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4I\u0001\u0000\u0000\u0000\u01e5\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003H$\u0000\u01e7\u01e8\u0005\u0019"+
		"\u0000\u0000\u01e8\u01e9\u0003L&\u0000\u01e9\u01ea\u0005\u001a\u0000\u0000"+
		"\u01eaK\u0001\u0000\u0000\u0000\u01eb\u01f0\u0003N\'\u0000\u01ec\u01ed"+
		"\u0005!\u0000\u0000\u01ed\u01ef\u0003N\'\u0000\u01ee\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005!\u0000"+
		"\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5M\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005(\u0000\u0000\u01f7"+
		"\u01f8\u0005\u001f\u0000\u0000\u01f8\u01ff\u0003P(\u0000\u01f9\u01fb\u0003"+
		"P(\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000"+
		"\u0000\u0200O\u0001\u0000\u0000\u0000\u0201\u0203\u0005,\u0000\u0000\u0202"+
		"\u0204\u0005&\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204\u020a\u0001\u0000\u0000\u0000\u0205\u020a"+
		"\u0005\'\u0000\u0000\u0206\u020a\u0005.\u0000\u0000\u0207\u020a\u0005"+
		")\u0000\u0000\u0208\u020a\u0005+\u0000\u0000\u0209\u0201\u0001\u0000\u0000"+
		"\u0000\u0209\u0205\u0001\u0000\u0000\u0000\u0209\u0206\u0001\u0000\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000"+
		"\u0000\u020aQ\u0001\u0000\u0000\u0000\u020b\u020d\u0003T*\u0000\u020c"+
		"\u020b\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f"+
		"\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211"+
		"\u0213\u0005;\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213\u0217\u0001\u0000\u0000\u0000\u0214\u0216"+
		"\u0003T*\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000"+
		"\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000"+
		"\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u021a\u021c\u0005=\u0000\u0000\u021b\u021a\u0001\u0000\u0000"+
		"\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u0220\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0003T*\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f"+
		"\u0222\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0001\u0000\u0000\u0000\u0221\u0226\u0001\u0000\u0000\u0000\u0222"+
		"\u0220\u0001\u0000\u0000\u0000\u0223\u0225\u0003V+\u0000\u0224\u0223\u0001"+
		"\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0224\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227S\u0001\u0000"+
		"\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0229\u022a\u0007\u0004"+
		"\u0000\u0000\u022aU\u0001\u0000\u0000\u0000\u022b\u022d\u0003j5\u0000"+
		"\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000"+
		"\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000"+
		"\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000"+
		"\u0231\u0235\u0003X,\u0000\u0232\u0234\u0003j5\u0000\u0233\u0232\u0001"+
		"\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236W\u0001\u0000"+
		"\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u023e\u0003Z-\u0000"+
		"\u0239\u023e\u0003\\.\u0000\u023a\u023e\u0003^/\u0000\u023b\u023e\u0005"+
		">\u0000\u0000\u023c\u023e\u00058\u0000\u0000\u023d\u0238\u0001\u0000\u0000"+
		"\u0000\u023d\u0239\u0001\u0000\u0000\u0000\u023d\u023a\u0001\u0000\u0000"+
		"\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023c\u0001\u0000\u0000"+
		"\u0000\u023eY\u0001\u0000\u0000\u0000\u023f\u0240\u0005@\u0000\u0000\u0240"+
		"\u0244\u0005G\u0000\u0000\u0241\u0243\u0003f3\u0000\u0242\u0241\u0001"+
		"\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0242\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0247\u0001"+
		"\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247\u0248\u0005"+
		"E\u0000\u0000\u0248[\u0001\u0000\u0000\u0000\u0249\u024a\u0005@\u0000"+
		"\u0000\u024a\u024e\u0005B\u0000\u0000\u024b\u024d\u0003f3\u0000\u024c"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e"+
		"\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f"+
		"\u0251\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0005D\u0000\u0000\u0252]\u0001\u0000\u0000\u0000\u0253\u0254\u0005"+
		"@\u0000\u0000\u0254\u0258\u0005A\u0000\u0000\u0255\u0257\u0003f3\u0000"+
		"\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000"+
		"\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000"+
		"\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000"+
		"\u025b\u025d\u0005D\u0000\u0000\u025c\u025e\u0003`0\u0000\u025d\u025c"+
		"\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f"+
		"\u0001\u0000\u0000\u0000\u025f\u0260\u0005?\u0000\u0000\u0260\u0261\u0005"+
		"A\u0000\u0000\u0261\u0262\u0005D\u0000\u0000\u0262_\u0001\u0000\u0000"+
		"\u0000\u0263\u026b\u0003b1\u0000\u0264\u026b\u0003X,\u0000\u0265\u026b"+
		"\u0005<\u0000\u0000\u0266\u026b\u0003j5\u0000\u0267\u026b\u0005>\u0000"+
		"\u0000\u0268\u026b\u0005+\u0000\u0000\u0269\u026b\u0005\u001f\u0000\u0000"+
		"\u026a\u0263\u0001\u0000\u0000\u0000\u026a\u0264\u0001\u0000\u0000\u0000"+
		"\u026a\u0265\u0001\u0000\u0000\u0000\u026a\u0266\u0001\u0000\u0000\u0000"+
		"\u026a\u0267\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000"+
		"\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000"+
		"\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026da\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f"+
		"\u0270\u0007\u0005\u0000\u0000\u0270c\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0005F\u0000\u0000\u0272\u0273\u0007\u0006\u0000\u0000\u0273e\u0001\u0000"+
		"\u0000\u0000\u0274\u0276\u0005H\u0000\u0000\u0275\u0277\u0003d2\u0000"+
		"\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000"+
		"\u0277\u0285\u0001\u0000\u0000\u0000\u0278\u027a\u0005I\u0000\u0000\u0279"+
		"\u027b\u0003d2\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001"+
		"\u0000\u0000\u0000\u027b\u0285\u0001\u0000\u0000\u0000\u027c\u027e\u0005"+
		"J\u0000\u0000\u027d\u027f\u0003d2\u0000\u027e\u027d\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0285\u0001\u0000\u0000"+
		"\u0000\u0280\u0282\u0005G\u0000\u0000\u0281\u0283\u0003d2\u0000\u0282"+
		"\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283"+
		"\u0285\u0001\u0000\u0000\u0000\u0284\u0274\u0001\u0000\u0000\u0000\u0284"+
		"\u0278\u0001\u0000\u0000\u0000\u0284\u027c\u0001\u0000\u0000\u0000\u0284"+
		"\u0280\u0001\u0000\u0000\u0000\u0285g\u0001\u0000\u0000\u0000\u0286\u0289"+
		"\u0003j5\u0000\u0287\u0289\u00055\u0000\u0000\u0288\u0286\u0001\u0000"+
		"\u0000\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0289i\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0007\u0007\u0000\u0000\u028bk\u0001\u0000\u0000\u0000"+
		"Ksw\u0086\u0088\u008f\u0099\u00a5\u00a7\u00b1\u00c0\u00c8\u00cd\u00d3"+
		"\u00dd\u00e3\u00f5\u00fe\u0101\u0104\u0113\u0119\u0123\u0127\u0130\u0134"+
		"\u0139\u0141\u0146\u014b\u014f\u0151\u015d\u016c\u0171\u0186\u0191\u0197"+
		"\u019c\u01a3\u01a9\u01af\u01b4\u01b6\u01bb\u01d1\u01d7\u01dd\u01e3\u01f0"+
		"\u01f4\u01fc\u01ff\u0203\u0209\u020e\u0212\u0217\u021b\u0220\u0226\u022e"+
		"\u0235\u023d\u0244\u024e\u0258\u025d\u026a\u026c\u0276\u027a\u027e\u0282"+
		"\u0284\u0288";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}