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
		RULE_ast = 0, RULE_tsDocument = 1, RULE_tsDocumentStatement = 2, RULE_classDeclaration = 3, 
		RULE_implementsClause = 4, RULE_classBody = 5, RULE_classBodyStatement = 6, 
		RULE_importStatement = 7, RULE_importBody = 8, RULE_componentDecorator = 9, 
		RULE_componentProperties = 10, RULE_selector = 11, RULE_imports = 12, 
		RULE_templateurl = 13, RULE_styleurl = 14, RULE_injectableDecorator = 15, 
		RULE_providedin = 16, RULE_signature = 17, RULE_values = 18, RULE_parameters = 19, 
		RULE_methodDeclaration = 20, RULE_methodBody = 21, RULE_objectExpression = 22, 
		RULE_arrayExpression1 = 23, RULE_arraybody1 = 24, RULE_arrayExpression2 = 25, 
		RULE_arraybody2 = 26, RULE_constructorDeclaration = 27, RULE_variableDeclaration = 28, 
		RULE_variableAssign = 29, RULE_methodvoid = 30, RULE_methodvoidbody = 31, 
		RULE_methodcall = 32, RULE_ngOnInitBody = 33, RULE_ngOnInitMETHOD = 34, 
		RULE_signalDeclaration = 35, RULE_cssDocument = 36, RULE_selectorincss = 37, 
		RULE_ruleSetStart = 38, RULE_ruleSet = 39, RULE_declarationList = 40, 
		RULE_declaration = 41, RULE_value = 42, RULE_htmlDocument = 43, RULE_scriptletOrSeaWs = 44, 
		RULE_htmlElements = 45, RULE_htmlElement = 46, RULE_tsTag = 47, RULE_noEndTag = 48, 
		RULE_normalTag = 49, RULE_htmlContent = 50, RULE_htmlChardata = 51, RULE_tagAtt = 52, 
		RULE_htmlAttribute = 53, RULE_htmlMisc = 54, RULE_htmlComment = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"ast", "tsDocument", "tsDocumentStatement", "classDeclaration", "implementsClause", 
			"classBody", "classBodyStatement", "importStatement", "importBody", "componentDecorator", 
			"componentProperties", "selector", "imports", "templateurl", "styleurl", 
			"injectableDecorator", "providedin", "signature", "values", "parameters", 
			"methodDeclaration", "methodBody", "objectExpression", "arrayExpression1", 
			"arraybody1", "arrayExpression2", "arraybody2", "constructorDeclaration", 
			"variableDeclaration", "variableAssign", "methodvoid", "methodvoidbody", 
			"methodcall", "ngOnInitBody", "ngOnInitMETHOD", "signalDeclaration", 
			"cssDocument", "selectorincss", "ruleSetStart", "ruleSet", "declarationList", 
			"declaration", "value", "htmlDocument", "scriptletOrSeaWs", "htmlElements", 
			"htmlElement", "tsTag", "noEndTag", "normalTag", "htmlContent", "htmlChardata", 
			"tagAtt", "htmlAttribute", "htmlMisc", "htmlComment"
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
			setState(112);
			tsDocument();
			setState(113);
			htmlDocument();
			setState(114);
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
		public List<TsDocumentStatementContext> tsDocumentStatement() {
			return getRuleContexts(TsDocumentStatementContext.class);
		}
		public TsDocumentStatementContext tsDocumentStatement(int i) {
			return getRuleContext(TsDocumentStatementContext.class,i);
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796129723472L) != 0)) {
				{
				{
				setState(116);
				tsDocumentStatement();
				}
				}
				setState(121);
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
	public static class TsDocumentStatementContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ComponentDecoratorContext componentDecorator() {
			return getRuleContext(ComponentDecoratorContext.class,0);
		}
		public InjectableDecoratorContext injectableDecorator() {
			return getRuleContext(InjectableDecoratorContext.class,0);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public ClassBodyStatementContext classBodyStatement() {
			return getRuleContext(ClassBodyStatementContext.class,0);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public TsDocumentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsDocumentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsDocumentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsDocumentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsDocumentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsDocumentStatementContext tsDocumentStatement() throws RecognitionException {
		TsDocumentStatementContext _localctx = new TsDocumentStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tsDocumentStatement);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					importStatement();
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IMPORT );
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(127);
					componentDecorator();
					}
					break;
				case 2:
					{
					setState(128);
					injectableDecorator();
					}
					break;
				}
				setState(131);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				classBodyStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				methodcall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				objectExpression();
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
		enterRule(_localctx, 6, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(EXPORT);
			setState(139);
			match(CLASS);
			setState(140);
			match(IDENTIFIER);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(141);
				implementsClause();
				}
				break;
			}
			setState(144);
			match(LBRACE);
			setState(145);
			classBody();
			setState(146);
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
		enterRule(_localctx, 8, RULE_implementsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLEMENTS) {
				{
				{
				setState(148);
				match(IMPLEMENTS);
				setState(149);
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
				setState(154);
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
		public List<ClassBodyStatementContext> classBodyStatement() {
			return getRuleContexts(ClassBodyStatementContext.class);
		}
		public ClassBodyStatementContext classBodyStatement(int i) {
			return getRuleContext(ClassBodyStatementContext.class,i);
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
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796096169024L) != 0)) {
				{
				{
				setState(155);
				classBodyStatement();
				}
				}
				setState(160);
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
	public static class ClassBodyStatementContext extends ParserRuleContext {
		public ClassBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyStatement; }
	 
		public ClassBodyStatementContext() { }
		public void copyFrom(ClassBodyStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidMethodDeclarationStatementContext extends ClassBodyStatementContext {
		public MethodvoidContext methodvoid() {
			return getRuleContext(MethodvoidContext.class,0);
		}
		public VoidMethodDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVoidMethodDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVoidMethodDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVoidMethodDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedMethodDeclarationStatementContext extends ClassBodyStatementContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypedMethodDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTypedMethodDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTypedMethodDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTypedMethodDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgOnInitMethodStatementContext extends ClassBodyStatementContext {
		public NgOnInitMETHODContext ngOnInitMETHOD() {
			return getRuleContext(NgOnInitMETHODContext.class,0);
		}
		public NgOnInitMethodStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNgOnInitMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNgOnInitMethodStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNgOnInitMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentStatementContext extends ClassBodyStatementContext {
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public VariableAssignmentStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends ClassBodyStatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprOneStatementContext extends ClassBodyStatementContext {
		public ArrayExpression1Context arrayExpression1() {
			return getRuleContext(ArrayExpression1Context.class,0);
		}
		public ArrayExprOneStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExprOneStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExprOneStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExprOneStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationStatementContext extends ClassBodyStatementContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ConstructorDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterConstructorDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitConstructorDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitConstructorDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignalDeclarationStatementContext extends ClassBodyStatementContext {
		public SignalDeclarationContext signalDeclaration() {
			return getRuleContext(SignalDeclarationContext.class,0);
		}
		public SignalDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignalDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignalDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignalDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprTwoStatementContext extends ClassBodyStatementContext {
		public ArrayExpression2Context arrayExpression2() {
			return getRuleContext(ArrayExpression2Context.class,0);
		}
		public ArrayExprTwoStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExprTwoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExprTwoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExprTwoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyStatementContext classBodyStatement() throws RecognitionException {
		ClassBodyStatementContext _localctx = new ClassBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBodyStatement);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				variableAssign();
				}
				break;
			case 2:
				_localctx = new VoidMethodDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				methodvoid();
				}
				break;
			case 3:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				variableDeclaration();
				}
				break;
			case 4:
				_localctx = new ArrayExprOneStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				arrayExpression1();
				}
				break;
			case 5:
				_localctx = new ArrayExprTwoStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				arrayExpression2();
				}
				break;
			case 6:
				_localctx = new TypedMethodDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				methodDeclaration();
				}
				break;
			case 7:
				_localctx = new ConstructorDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				constructorDeclaration();
				}
				break;
			case 8:
				_localctx = new SignalDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				signalDeclaration();
				}
				break;
			case 9:
				_localctx = new NgOnInitMethodStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				ngOnInitMETHOD();
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
		enterRule(_localctx, 14, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IMPORT);
			setState(173);
			match(LBRACE);
			setState(174);
			importBody();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				importBody();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(RBRACE);
			setState(183);
			match(FROM);
			{
			setState(184);
			match(STRING_LITERAL);
			}
			setState(185);
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
		enterRule(_localctx, 16, RULE_importBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		enterRule(_localctx, 18, RULE_componentDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(AT);
			setState(190);
			match(COMPONENT);
			setState(191);
			match(LPAREN);
			setState(192);
			match(LBRACE);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6146L) != 0)) {
				{
				setState(193);
				componentProperties();
				}
			}

			setState(196);
			match(RBRACE);
			setState(197);
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
		enterRule(_localctx, 20, RULE_componentProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(199);
				selector();
				setState(200);
				match(COMMA);
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS) {
				{
				setState(204);
				imports();
				setState(205);
				match(COMMA);
				}
			}

			{
			setState(209);
			templateurl();
			setState(210);
			match(COMMA);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLEURL) {
				{
				setState(212);
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
		enterRule(_localctx, 22, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(SELECTOR);
			setState(216);
			match(COLON);
			setState(217);
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
		enterRule(_localctx, 24, RULE_imports);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IMPORTS);
			setState(220);
			match(COLON);
			setState(221);
			match(LBRACKET);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CROISNN || _la==IDENTIFIER) {
				{
				setState(222);
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

			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(225);
					match(COMMA);
					setState(226);
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
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(232);
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
		enterRule(_localctx, 26, RULE_templateurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(TEMPLATEURL);
			setState(235);
			match(COLON);
			setState(236);
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
		enterRule(_localctx, 28, RULE_styleurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(STYLEURL);
			setState(239);
			match(COLON);
			setState(240);
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
		enterRule(_localctx, 30, RULE_injectableDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(AT);
			setState(243);
			match(INJECTABLE);
			setState(244);
			match(LPAREN);
			setState(245);
			match(LBRACE);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROVIDEDIN) {
				{
				setState(246);
				providedin();
				}
			}

			setState(249);
			match(RBRACE);
			setState(250);
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
		enterRule(_localctx, 32, RULE_providedin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(PROVIDEDIN);
			setState(253);
			match(COLON);
			setState(254);
			match(STRING_LITERAL);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(255);
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
		enterRule(_localctx, 34, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(258);
				match(ACCESS);
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(261);
				match(STATIC);
				}
			}

			setState(264);
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
		enterRule(_localctx, 36, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 38, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IDENTIFIER);
			setState(269);
			match(COLON);
			setState(270);
			match(TYPE);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(271);
				match(COMMA);
				setState(272);
				match(IDENTIFIER);
				setState(273);
				match(COLON);
				setState(274);
				match(TYPE);
				}
				}
				setState(279);
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
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			signature();
			setState(281);
			match(LPAREN);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(282);
				parameters();
				}
			}

			setState(285);
			match(RPAREN);
			setState(286);
			match(LBRACE);
			setState(287);
			methodBody();
			setState(288);
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
		enterRule(_localctx, 42, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(RETURN);
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case IDENTIFIER:
				{
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(291);
					match(THIS);
					setState(292);
					match(DOT);
					}
				}

				setState(295);
				match(IDENTIFIER);
				}
				break;
			case NULL:
			case BOOLEAN:
			case NUMBER:
			case STRING_LITERAL:
				{
				setState(296);
				values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(299);
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
		enterRule(_localctx, 44, RULE_objectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(LBRACE);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(302);
				match(IDENTIFIER);
				setState(303);
				match(COLON);
				setState(304);
				values();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(305);
					match(COMMA);
					}
				}

				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(RBRACE);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(314);
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
		enterRule(_localctx, 46, RULE_arrayExpression1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			signature();
			setState(318);
			match(ASSIGN);
			setState(319);
			match(LBRACKET);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52776591687680L) != 0)) {
				{
				{
				setState(320);
				arraybody1();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			match(RBRACKET);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(327);
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
		enterRule(_localctx, 48, RULE_arraybody1);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				objectExpression();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(NUMBER);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(332);
					match(COMMA);
					}
				}

				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(STRING_LITERAL);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(336);
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
		enterRule(_localctx, 50, RULE_arrayExpression2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			signature();
			setState(342);
			match(COLON);
			setState(343);
			match(TYPE);
			setState(344);
			match(LBRACKET);
			setState(345);
			match(RBRACKET);
			setState(346);
			match(ASSIGN);
			setState(347);
			match(LBRACKET);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE) {
				{
				{
				setState(348);
				arraybody2();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(RBRACKET);
			setState(355);
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
		enterRule(_localctx, 52, RULE_arraybody2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			objectExpression();
			setState(358);
			match(COMMA);
			setState(359);
			match(NUMBER);
			setState(360);
			match(COMMA);
			setState(361);
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
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(CONSTRUCTOR);
			setState(364);
			match(LPAREN);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==IDENTIFIER) {
				{
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCESS) {
					{
					setState(365);
					match(ACCESS);
					}
				}

				setState(368);
				match(IDENTIFIER);
				setState(369);
				match(COLON);
				setState(370);
				match(IDENTIFIER);
				}
			}

			setState(373);
			match(RPAREN);
			setState(374);
			match(LBRACE);
			setState(375);
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
		enterRule(_localctx, 56, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			signature();
			setState(378);
			match(COLON);
			setState(379);
			match(TYPE);
			setState(380);
			match(ASSIGN);
			setState(381);
			values();
			setState(382);
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
		enterRule(_localctx, 58, RULE_variableAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IDENTIFIER);
			setState(385);
			match(ASSIGN);
			setState(386);
			values();
			setState(387);
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
		enterRule(_localctx, 60, RULE_methodvoid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			signature();
			setState(390);
			match(LPAREN);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(391);
				parameters();
				}
			}

			setState(394);
			match(RPAREN);
			setState(395);
			match(COLON);
			setState(396);
			match(VOIDTYPE);
			setState(397);
			match(LBRACE);
			setState(398);
			methodvoidbody();
			setState(399);
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
		enterRule(_localctx, 62, RULE_methodvoidbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(401);
				match(THIS);
				setState(402);
				match(DOT);
				}
			}

			setState(405);
			match(IDENTIFIER);
			setState(406);
			match(ASSIGN);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(407);
				match(THIS);
				setState(408);
				match(DOT);
				}
			}

			setState(411);
			match(IDENTIFIER);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(412);
				match(DOT);
				setState(413);
				methodcall();
				}
			}

			setState(416);
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
		enterRule(_localctx, 64, RULE_methodcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(IDENTIFIER);
			setState(419);
			match(LPAREN);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(420);
				match(IDENTIFIER);
				}
			}

			setState(423);
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
		enterRule(_localctx, 66, RULE_ngOnInitBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(425);
				match(THIS);
				setState(426);
				match(DOT);
				}
			}

			setState(429);
			match(IDENTIFIER);
			setState(430);
			match(ASSIGN);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || _la==IDENTIFIER) {
				{
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(431);
					match(THIS);
					setState(432);
					match(DOT);
					}
				}

				setState(435);
				match(IDENTIFIER);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(436);
					match(DOT);
					setState(437);
					methodcall();
					}
				}

				}
			}

			setState(442);
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
		enterRule(_localctx, 68, RULE_ngOnInitMETHOD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(444);
				match(ACCESS);
				}
			}

			setState(447);
			match(NGONINIT);
			setState(448);
			match(LPAREN);
			setState(449);
			match(RPAREN);
			setState(450);
			match(COLON);
			setState(451);
			match(VOIDTYPE);
			setState(452);
			match(LBRACE);
			setState(453);
			methodvoidbody();
			setState(454);
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
		enterRule(_localctx, 70, RULE_signalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(IDENTIFIER);
			setState(457);
			match(ASSIGN);
			setState(458);
			match(CROISNN);
			setState(459);
			match(LPAREN);
			setState(460);
			match(STRING_LITERAL);
			setState(461);
			match(RPAREN);
			setState(462);
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
		enterRule(_localctx, 72, RULE_cssDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4569845202944L) != 0)) {
				{
				{
				setState(464);
				ruleSet();
				}
				}
				setState(469);
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
		enterRule(_localctx, 74, RULE_selectorincss);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				match(IDENTIFIER);
				}
				break;
			case TAGSFORCSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
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
		enterRule(_localctx, 76, RULE_ruleSetStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			((RuleSetStartContext)_localctx).first = selectorincss();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAGSFORCSS || _la==WS) {
				{
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(476);
					match(WS);
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(482);
				match(TAGSFORCSS);
				}
				}
				setState(487);
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
		enterRule(_localctx, 78, RULE_ruleSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			ruleSetStart();
			setState(489);
			match(LBRACE);
			setState(490);
			declarationList();
			setState(491);
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
		enterRule(_localctx, 80, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			declaration();
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					match(SEMICOLON);
					setState(495);
					declaration();
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(501);
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
		enterRule(_localctx, 82, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(PROPERTY_NAME);
			setState(505);
			match(COLON);
			setState(506);
			value();
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99505802313728L) != 0)) {
					{
					{
					setState(507);
					value();
					}
					}
					setState(512);
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
		enterRule(_localctx, 84, RULE_value);
		int _la;
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(NUMBER);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(516);
					match(UNIT);
					}
				}

				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(STRING);
				}
				break;
			case VALUE_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				match(VALUE_KEYWORD);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(522);
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
		enterRule(_localctx, 86, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(531);
				match(XML);
				}
			}

			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(540);
				match(DTD);
				}
			}

			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 327L) != 0)) {
				{
				{
				setState(549);
				htmlElements();
				}
				}
				setState(554);
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
		enterRule(_localctx, 88, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		enterRule(_localctx, 90, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) {
				{
				{
				setState(557);
				htmlComment();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			htmlElement();
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(564);
					htmlComment();
					}
					} 
				}
				setState(569);
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
		enterRule(_localctx, 92, RULE_htmlElement);
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new TsTagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				tsTag();
				}
				break;
			case 2:
				_localctx = new NoEndTagElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				noEndTag();
				}
				break;
			case 3:
				_localctx = new NormalTagElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				normalTag();
				}
				break;
			case 4:
				_localctx = new ScriptletElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				match(SCRIPTLET);
				}
				break;
			case 5:
				_localctx = new InterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
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
		enterRule(_localctx, 94, RULE_tsTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(TAG_OPEN);
			setState(578);
			match(TAG_NAME);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(579);
				htmlAttribute();
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
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
		enterRule(_localctx, 96, RULE_noEndTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(TAG_OPEN);
			setState(588);
			match(TAGS_VOID);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(589);
				htmlAttribute();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
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
		enterRule(_localctx, 98, RULE_normalTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(TAG_OPEN);
			setState(598);
			match(TAGS);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(599);
				htmlAttribute();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605);
			match(TAG_CLOSE);
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(606);
				htmlContent();
				}
				break;
			}
			setState(609);
			match(TAG_OPEN_SLASH);
			setState(610);
			match(TAGS);
			setState(611);
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
		enterRule(_localctx, 100, RULE_htmlContent);
		int _la;
		try {
			_localctx = new HtmlContentSequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 80232845313L) != 0)) {
				{
				setState(620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(613);
					htmlChardata();
					}
					break;
				case 2:
					{
					setState(614);
					htmlElement();
					}
					break;
				case 3:
					{
					setState(615);
					match(CDATA);
					}
					break;
				case 4:
					{
					setState(616);
					htmlComment();
					}
					break;
				case 5:
					{
					setState(617);
					match(SCRIPTLET);
					}
					break;
				case 6:
					{
					setState(618);
					match(IDENTIFIER);
					}
					break;
				case 7:
					{
					setState(619);
					match(COLON);
					}
					break;
				}
				}
				setState(624);
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
		enterRule(_localctx, 102, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
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
		enterRule(_localctx, 104, RULE_tagAtt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(TAG_EQUALS);
			setState(628);
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
		enterRule(_localctx, 106, RULE_htmlAttribute);
		int _la;
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCTURAL_DIRECTIVE:
				_localctx = new StructuralDirectiveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(STRUCTURAL_DIRECTIVE);
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(631);
					tagAtt();
					}
				}

				}
				break;
			case ATTRIBUTE_BINDING:
				_localctx = new AttributeBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(ATTRIBUTE_BINDING);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(635);
					tagAtt();
					}
				}

				}
				break;
			case EVENT_BINDING:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				match(EVENT_BINDING);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(639);
					tagAtt();
					}
				}

				}
				break;
			case TAG_NAME:
				_localctx = new TagNameAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				match(TAG_NAME);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(643);
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
		enterRule(_localctx, 108, RULE_htmlMisc);
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				htmlComment();
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
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
		enterRule(_localctx, 110, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
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
		"\u0004\u0001V\u028f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005"+
		"\u0001v\b\u0001\n\u0001\f\u0001y\t\u0001\u0001\u0002\u0004\u0002|\b\u0002"+
		"\u000b\u0002\f\u0002}\u0001\u0002\u0001\u0002\u0003\u0002\u0082\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0089\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u008f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0097\b\u0004\n\u0004\f\u0004\u009a\t\u0004\u0001"+
		"\u0005\u0005\u0005\u009d\b\u0005\n\u0005\f\u0005\u00a0\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00ab\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b2\b\u0007\n\u0007"+
		"\f\u0007\u00b5\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00c3\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00cb"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d0\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00d6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e0\b\f\u0001\f\u0001\f\u0005"+
		"\f\u00e4\b\f\n\f\f\f\u00e7\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f8\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0101\b\u0010\u0001\u0011\u0003\u0011\u0104\b\u0011"+
		"\u0001\u0011\u0003\u0011\u0107\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0114\b\u0013\n\u0013\f\u0013\u0117"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u011c\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0126\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u012a\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0133\b\u0016\u0005\u0016"+
		"\u0135\b\u0016\n\u0016\f\u0016\u0138\t\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u013c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0142\b\u0017\n\u0017\f\u0017\u0145\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0149\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u014e\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0152\b\u0018\u0003"+
		"\u0018\u0154\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u015e\b\u0019\n"+
		"\u0019\f\u0019\u0161\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u016f\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0174\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0189"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0194\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u019a\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u019f\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0003 \u01a6\b \u0001 \u0001 \u0001!\u0001"+
		"!\u0003!\u01ac\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u01b2\b!\u0001!\u0001"+
		"!\u0001!\u0003!\u01b7\b!\u0003!\u01b9\b!\u0001!\u0001!\u0001\"\u0003\""+
		"\u01be\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0005$\u01d2\b$\n$\f$\u01d5\t$\u0001%\u0001%\u0001%\u0003%\u01da\b%"+
		"\u0001&\u0001&\u0005&\u01de\b&\n&\f&\u01e1\t&\u0001&\u0005&\u01e4\b&\n"+
		"&\f&\u01e7\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0005(\u01f1\b(\n(\f(\u01f4\t(\u0001(\u0003(\u01f7\b(\u0001)\u0001)"+
		"\u0001)\u0001)\u0005)\u01fd\b)\n)\f)\u0200\t)\u0003)\u0202\b)\u0001*\u0001"+
		"*\u0003*\u0206\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u020c\b*\u0001+\u0005"+
		"+\u020f\b+\n+\f+\u0212\t+\u0001+\u0003+\u0215\b+\u0001+\u0005+\u0218\b"+
		"+\n+\f+\u021b\t+\u0001+\u0003+\u021e\b+\u0001+\u0005+\u0221\b+\n+\f+\u0224"+
		"\t+\u0001+\u0005+\u0227\b+\n+\f+\u022a\t+\u0001,\u0001,\u0001-\u0005-"+
		"\u022f\b-\n-\f-\u0232\t-\u0001-\u0001-\u0005-\u0236\b-\n-\f-\u0239\t-"+
		"\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0240\b.\u0001/\u0001/\u0001"+
		"/\u0005/\u0245\b/\n/\f/\u0248\t/\u0001/\u0001/\u00010\u00010\u00010\u0005"+
		"0\u024f\b0\n0\f0\u0252\t0\u00010\u00010\u00011\u00011\u00011\u00051\u0259"+
		"\b1\n1\f1\u025c\t1\u00011\u00011\u00031\u0260\b1\u00011\u00011\u00011"+
		"\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u026d"+
		"\b2\n2\f2\u0270\t2\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u0003"+
		"5\u0279\b5\u00015\u00015\u00035\u027d\b5\u00015\u00015\u00035\u0281\b"+
		"5\u00015\u00015\u00035\u0285\b5\u00035\u0287\b5\u00016\u00016\u00036\u028b"+
		"\b6\u00017\u00017\u00017\u0001\u00e5\u00008\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\b\u0002\u0000\u0016\u0016++\u0002"+
		"\u0000\u0016\u0018++\u0002\u0000\u0011\u0012,-\u0002\u0000##%%\u0002\u0000"+
		"55>>\u0002\u000055CC\u0001\u0000NO\u0001\u00009:\u02b8\u0000p\u0001\u0000"+
		"\u0000\u0000\u0002w\u0001\u0000\u0000\u0000\u0004\u0088\u0001\u0000\u0000"+
		"\u0000\u0006\u008a\u0001\u0000\u0000\u0000\b\u0098\u0001\u0000\u0000\u0000"+
		"\n\u009e\u0001\u0000\u0000\u0000\f\u00aa\u0001\u0000\u0000\u0000\u000e"+
		"\u00ac\u0001\u0000\u0000\u0000\u0010\u00bb\u0001\u0000\u0000\u0000\u0012"+
		"\u00bd\u0001\u0000\u0000\u0000\u0014\u00ca\u0001\u0000\u0000\u0000\u0016"+
		"\u00d7\u0001\u0000\u0000\u0000\u0018\u00db\u0001\u0000\u0000\u0000\u001a"+
		"\u00ea\u0001\u0000\u0000\u0000\u001c\u00ee\u0001\u0000\u0000\u0000\u001e"+
		"\u00f2\u0001\u0000\u0000\u0000 \u00fc\u0001\u0000\u0000\u0000\"\u0103"+
		"\u0001\u0000\u0000\u0000$\u010a\u0001\u0000\u0000\u0000&\u010c\u0001\u0000"+
		"\u0000\u0000(\u0118\u0001\u0000\u0000\u0000*\u0122\u0001\u0000\u0000\u0000"+
		",\u012d\u0001\u0000\u0000\u0000.\u013d\u0001\u0000\u0000\u00000\u0153"+
		"\u0001\u0000\u0000\u00002\u0155\u0001\u0000\u0000\u00004\u0165\u0001\u0000"+
		"\u0000\u00006\u016b\u0001\u0000\u0000\u00008\u0179\u0001\u0000\u0000\u0000"+
		":\u0180\u0001\u0000\u0000\u0000<\u0185\u0001\u0000\u0000\u0000>\u0193"+
		"\u0001\u0000\u0000\u0000@\u01a2\u0001\u0000\u0000\u0000B\u01ab\u0001\u0000"+
		"\u0000\u0000D\u01bd\u0001\u0000\u0000\u0000F\u01c8\u0001\u0000\u0000\u0000"+
		"H\u01d3\u0001\u0000\u0000\u0000J\u01d9\u0001\u0000\u0000\u0000L\u01db"+
		"\u0001\u0000\u0000\u0000N\u01e8\u0001\u0000\u0000\u0000P\u01ed\u0001\u0000"+
		"\u0000\u0000R\u01f8\u0001\u0000\u0000\u0000T\u020b\u0001\u0000\u0000\u0000"+
		"V\u0210\u0001\u0000\u0000\u0000X\u022b\u0001\u0000\u0000\u0000Z\u0230"+
		"\u0001\u0000\u0000\u0000\\\u023f\u0001\u0000\u0000\u0000^\u0241\u0001"+
		"\u0000\u0000\u0000`\u024b\u0001\u0000\u0000\u0000b\u0255\u0001\u0000\u0000"+
		"\u0000d\u026e\u0001\u0000\u0000\u0000f\u0271\u0001\u0000\u0000\u0000h"+
		"\u0273\u0001\u0000\u0000\u0000j\u0286\u0001\u0000\u0000\u0000l\u028a\u0001"+
		"\u0000\u0000\u0000n\u028c\u0001\u0000\u0000\u0000pq\u0003\u0002\u0001"+
		"\u0000qr\u0003V+\u0000rs\u0003H$\u0000s\u0001\u0001\u0000\u0000\u0000"+
		"tv\u0003\u0004\u0002\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0003\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0003\u000e\u0007\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"\u0082\u0003\u0012\t\u0000\u0080\u0082\u0003\u001e\u000f\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u0006\u0003\u0000\u0084\u0089"+
		"\u0001\u0000\u0000\u0000\u0085\u0089\u0003\f\u0006\u0000\u0086\u0089\u0003"+
		"@ \u0000\u0087\u0089\u0003,\u0016\u0000\u0088{\u0001\u0000\u0000\u0000"+
		"\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u0005\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\u0003\u0000\u0000\u008b\u008c\u0005\u0005\u0000\u0000"+
		"\u008c\u008e\u0005+\u0000\u0000\u008d\u008f\u0003\b\u0004\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0019\u0000\u0000\u0091"+
		"\u0092\u0003\n\u0005\u0000\u0092\u0093\u0005\u001a\u0000\u0000\u0093\u0007"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\t\u0000\u0000\u0095\u0097\u0007"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\t\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u009d\u0003\f\u0006\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u000b\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00ab\u0003:\u001d\u0000"+
		"\u00a2\u00ab\u0003<\u001e\u0000\u00a3\u00ab\u00038\u001c\u0000\u00a4\u00ab"+
		"\u0003.\u0017\u0000\u00a5\u00ab\u00032\u0019\u0000\u00a6\u00ab\u0003("+
		"\u0014\u0000\u00a7\u00ab\u00036\u001b\u0000\u00a8\u00ab\u0003F#\u0000"+
		"\u00a9\u00ab\u0003D\"\u0000\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a2\u0001\u0000\u0000\u0000\u00aa\u00a3\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a4\u0001\u0000\u0000\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\r\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0004\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0019\u0000\u0000\u00ae\u00b3\u0003\u0010\b\u0000\u00af\u00b0\u0005"+
		" \u0000\u0000\u00b0\u00b2\u0003\u0010\b\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u001a"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8\u00b9\u0005-\u0000"+
		"\u0000\u00b9\u00ba\u0005!\u0000\u0000\u00ba\u000f\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0007\u0001\u0000\u0000\u00bc\u0011\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\b\u0000\u0000\u00be\u00bf\u0005\u0017\u0000\u0000\u00bf"+
		"\u00c0\u0005\u001b\u0000\u0000\u00c0\u00c2\u0005\u0019\u0000\u0000\u00c1"+
		"\u00c3\u0003\u0014\n\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005\u001a\u0000\u0000\u00c5\u00c6\u0005\u001c\u0000\u0000\u00c6\u0013"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u0016\u000b\u0000\u00c8\u00c9"+
		"\u0005 \u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0003\u0018\f\u0000\u00cd\u00ce\u0005 "+
		"\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0003\u001a\r\u0000\u00d2\u00d3\u0005 \u0000"+
		"\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d6\u0003\u001c\u000e"+
		"\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u0015\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u000b\u0000"+
		"\u0000\u00d8\u00d9\u0005\u001f\u0000\u0000\u00d9\u00da\u0005-\u0000\u0000"+
		"\u00da\u0017\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0001\u0000\u0000"+
		"\u00dc\u00dd\u0005\u001f\u0000\u0000\u00dd\u00df\u0005\u001d\u0000\u0000"+
		"\u00de\u00e0\u0007\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005 \u0000\u0000\u00e2\u00e4\u0007\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\u001e\u0000\u0000\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005\f\u0000\u0000\u00eb\u00ec\u0005\u001f\u0000\u0000\u00ec\u00ed"+
		"\u0005-\u0000\u0000\u00ed\u001b\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005"+
		"\r\u0000\u0000\u00ef\u00f0\u0005\u001f\u0000\u0000\u00f0\u00f1\u0005-"+
		"\u0000\u0000\u00f1\u001d\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\b\u0000"+
		"\u0000\u00f3\u00f4\u0005\u0018\u0000\u0000\u00f4\u00f5\u0005\u001b\u0000"+
		"\u0000\u00f5\u00f7\u0005\u0019\u0000\u0000\u00f6\u00f8\u0003 \u0010\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u001a\u0000\u0000"+
		"\u00fa\u00fb\u0005\u001c\u0000\u0000\u00fb\u001f\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005\u000f\u0000\u0000\u00fd\u00fe\u0005\u001f\u0000\u0000"+
		"\u00fe\u0100\u0005-\u0000\u0000\u00ff\u0101\u0005 \u0000\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101!\u0001"+
		"\u0000\u0000\u0000\u0102\u0104\u0005\u0015\u0000\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001"+
		"\u0000\u0000\u0000\u0105\u0107\u0005\u0014\u0000\u0000\u0106\u0105\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0005+\u0000\u0000\u0109#\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0007\u0002\u0000\u0000\u010b%\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005+\u0000\u0000\u010d\u010e\u0005\u001f\u0000\u0000\u010e"+
		"\u0115\u0005\u0013\u0000\u0000\u010f\u0110\u0005 \u0000\u0000\u0110\u0111"+
		"\u0005+\u0000\u0000\u0111\u0112\u0005\u001f\u0000\u0000\u0112\u0114\u0005"+
		"\u0013\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0114\u0117\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\'\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0003\"\u0011\u0000\u0119\u011b\u0005\u001b\u0000"+
		"\u0000\u011a\u011c\u0003&\u0013\u0000\u011b\u011a\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0005\u001c\u0000\u0000\u011e\u011f\u0005\u0019\u0000\u0000"+
		"\u011f\u0120\u0003*\u0015\u0000\u0120\u0121\u0005\u001a\u0000\u0000\u0121"+
		")\u0001\u0000\u0000\u0000\u0122\u0129\u0005\u0007\u0000\u0000\u0123\u0124"+
		"\u0005$\u0000\u0000\u0124\u0126\u0005#\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u012a\u0005+\u0000\u0000\u0128\u012a\u0003$\u0012\u0000"+
		"\u0129\u0125\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005!\u0000\u0000\u012c"+
		"+\u0001\u0000\u0000\u0000\u012d\u0136\u0005\u0019\u0000\u0000\u012e\u012f"+
		"\u0005+\u0000\u0000\u012f\u0130\u0005\u001f\u0000\u0000\u0130\u0132\u0003"+
		"$\u0012\u0000\u0131\u0133\u0005 \u0000\u0000\u0132\u0131\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000"+
		"\u0000\u0134\u012e\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0139\u013b\u0005\u001a\u0000\u0000\u013a\u013c\u0005 \u0000\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000"+
		"\u013c-\u0001\u0000\u0000\u0000\u013d\u013e\u0003\"\u0011\u0000\u013e"+
		"\u013f\u0005\"\u0000\u0000\u013f\u0143\u0005\u001d\u0000\u0000\u0140\u0142"+
		"\u00030\u0018\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0145\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0146\u0148\u0005\u001e\u0000\u0000\u0147\u0149\u0005"+
		"!\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149/\u0001\u0000\u0000\u0000\u014a\u0154\u0003,\u0016\u0000"+
		"\u014b\u014d\u0005,\u0000\u0000\u014c\u014e\u0005 \u0000\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0154"+
		"\u0001\u0000\u0000\u0000\u014f\u0151\u0005-\u0000\u0000\u0150\u0152\u0005"+
		" \u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u014a\u0001\u0000"+
		"\u0000\u0000\u0153\u014b\u0001\u0000\u0000\u0000\u0153\u014f\u0001\u0000"+
		"\u0000\u0000\u01541\u0001\u0000\u0000\u0000\u0155\u0156\u0003\"\u0011"+
		"\u0000\u0156\u0157\u0005\u001f\u0000\u0000\u0157\u0158\u0005\u0013\u0000"+
		"\u0000\u0158\u0159\u0005\u001d\u0000\u0000\u0159\u015a\u0005\u001e\u0000"+
		"\u0000\u015a\u015b\u0005\"\u0000\u0000\u015b\u015f\u0005\u001d\u0000\u0000"+
		"\u015c\u015e\u00034\u001a\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e"+
		"\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u001e\u0000\u0000\u0163"+
		"\u0164\u0005!\u0000\u0000\u01643\u0001\u0000\u0000\u0000\u0165\u0166\u0003"+
		",\u0016\u0000\u0166\u0167\u0005 \u0000\u0000\u0167\u0168\u0005,\u0000"+
		"\u0000\u0168\u0169\u0005 \u0000\u0000\u0169\u016a\u0005-\u0000\u0000\u016a"+
		"5\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0006\u0000\u0000\u016c\u0173"+
		"\u0005\u001b\u0000\u0000\u016d\u016f\u0005\u0015\u0000\u0000\u016e\u016d"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0005+\u0000\u0000\u0171\u0172\u0005"+
		"\u001f\u0000\u0000\u0172\u0174\u0005+\u0000\u0000\u0173\u016e\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0005\u001c\u0000\u0000\u0176\u0177\u0005\u0019"+
		"\u0000\u0000\u0177\u0178\u0005\u001a\u0000\u0000\u01787\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0003\"\u0011\u0000\u017a\u017b\u0005\u001f\u0000\u0000"+
		"\u017b\u017c\u0005\u0013\u0000\u0000\u017c\u017d\u0005\"\u0000\u0000\u017d"+
		"\u017e\u0003$\u0012\u0000\u017e\u017f\u0005!\u0000\u0000\u017f9\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0005+\u0000\u0000\u0181\u0182\u0005\""+
		"\u0000\u0000\u0182\u0183\u0003$\u0012\u0000\u0183\u0184\u0005!\u0000\u0000"+
		"\u0184;\u0001\u0000\u0000\u0000\u0185\u0186\u0003\"\u0011\u0000\u0186"+
		"\u0188\u0005\u001b\u0000\u0000\u0187\u0189\u0003&\u0013\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u001c\u0000\u0000\u018b\u018c"+
		"\u0005\u001f\u0000\u0000\u018c\u018d\u0005\u0010\u0000\u0000\u018d\u018e"+
		"\u0005\u0019\u0000\u0000\u018e\u018f\u0003>\u001f\u0000\u018f\u0190\u0005"+
		"\u001a\u0000\u0000\u0190=\u0001\u0000\u0000\u0000\u0191\u0192\u0005$\u0000"+
		"\u0000\u0192\u0194\u0005#\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0005+\u0000\u0000\u0196\u0199\u0005\"\u0000\u0000\u0197"+
		"\u0198\u0005$\u0000\u0000\u0198\u019a\u0005#\u0000\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\u019e\u0005+\u0000\u0000\u019c\u019d\u0005#\u0000"+
		"\u0000\u019d\u019f\u0003@ \u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005!\u0000\u0000\u01a1?\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005"+
		"+\u0000\u0000\u01a3\u01a5\u0005\u001b\u0000\u0000\u01a4\u01a6\u0005+\u0000"+
		"\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u001c\u0000"+
		"\u0000\u01a8A\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005$\u0000\u0000\u01aa"+
		"\u01ac\u0005#\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0005+\u0000\u0000\u01ae\u01b8\u0005\"\u0000\u0000\u01af\u01b0\u0005"+
		"$\u0000\u0000\u01b0\u01b2\u0005#\u0000\u0000\u01b1\u01af\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b6\u0005+\u0000\u0000\u01b4\u01b5\u0005#\u0000\u0000\u01b5"+
		"\u01b7\u0003@ \u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0005!\u0000\u0000\u01bbC\u0001\u0000\u0000"+
		"\u0000\u01bc\u01be\u0005\u0015\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0005\n\u0000\u0000\u01c0\u01c1\u0005\u001b\u0000\u0000"+
		"\u01c1\u01c2\u0005\u001c\u0000\u0000\u01c2\u01c3\u0005\u001f\u0000\u0000"+
		"\u01c3\u01c4\u0005\u0010\u0000\u0000\u01c4\u01c5\u0005\u0019\u0000\u0000"+
		"\u01c5\u01c6\u0003>\u001f\u0000\u01c6\u01c7\u0005\u001a\u0000\u0000\u01c7"+
		"E\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005+\u0000\u0000\u01c9\u01ca\u0005"+
		"\"\u0000\u0000\u01ca\u01cb\u0005\u0016\u0000\u0000\u01cb\u01cc\u0005\u001b"+
		"\u0000\u0000\u01cc\u01cd\u0005-\u0000\u0000\u01cd\u01ce\u0005\u001c\u0000"+
		"\u0000\u01ce\u01cf\u0005!\u0000\u0000\u01cfG\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d2\u0003N\'\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4I\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0007\u0003\u0000\u0000\u01d7\u01da\u0005"+
		"+\u0000\u0000\u01d8\u01da\u0005*\u0000\u0000\u01d9\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01daK\u0001\u0000\u0000\u0000"+
		"\u01db\u01e5\u0003J%\u0000\u01dc\u01de\u00055\u0000\u0000\u01dd\u01dc"+
		"\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd"+
		"\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e4"+
		"\u0005*\u0000\u0000\u01e3\u01df\u0001\u0000\u0000\u0000\u01e4\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e6M\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0003L&\u0000\u01e9\u01ea\u0005\u0019\u0000\u0000"+
		"\u01ea\u01eb\u0003P(\u0000\u01eb\u01ec\u0005\u001a\u0000\u0000\u01ecO"+
		"\u0001\u0000\u0000\u0000\u01ed\u01f2\u0003R)\u0000\u01ee\u01ef\u0005!"+
		"\u0000\u0000\u01ef\u01f1\u0003R)\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f7\u0005!\u0000\u0000\u01f6"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7"+
		"Q\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005(\u0000\u0000\u01f9\u01fa\u0005"+
		"\u001f\u0000\u0000\u01fa\u0201\u0003T*\u0000\u01fb\u01fd\u0003T*\u0000"+
		"\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000"+
		"\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000"+
		"\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000"+
		"\u0201\u01fe\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u0202S\u0001\u0000\u0000\u0000\u0203\u0205\u0005,\u0000\u0000\u0204\u0206"+
		"\u0005&\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u020c\u0001\u0000\u0000\u0000\u0207\u020c\u0005"+
		"\'\u0000\u0000\u0208\u020c\u0005.\u0000\u0000\u0209\u020c\u0005)\u0000"+
		"\u0000\u020a\u020c\u0005+\u0000\u0000\u020b\u0203\u0001\u0000\u0000\u0000"+
		"\u020b\u0207\u0001\u0000\u0000\u0000\u020b\u0208\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020a\u0001\u0000\u0000\u0000"+
		"\u020cU\u0001\u0000\u0000\u0000\u020d\u020f\u0003X,\u0000\u020e\u020d"+
		"\u0001\u0000\u0000\u0000\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0214"+
		"\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0215"+
		"\u0005;\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214\u0215\u0001"+
		"\u0000\u0000\u0000\u0215\u0219\u0001\u0000\u0000\u0000\u0216\u0218\u0003"+
		"X,\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000"+
		"\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000"+
		"\u0000\u021c\u021e\u0005=\u0000\u0000\u021d\u021c\u0001\u0000\u0000\u0000"+
		"\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0222\u0001\u0000\u0000\u0000"+
		"\u021f\u0221\u0003X,\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0221\u0224"+
		"\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0001\u0000\u0000\u0000\u0223\u0228\u0001\u0000\u0000\u0000\u0224\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u0227\u0003Z-\u0000\u0226\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000"+
		"\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229W\u0001\u0000\u0000"+
		"\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022c\u0007\u0004\u0000"+
		"\u0000\u022cY\u0001\u0000\u0000\u0000\u022d\u022f\u0003n7\u0000\u022e"+
		"\u022d\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230"+
		"\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231"+
		"\u0233\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233"+
		"\u0237\u0003\\.\u0000\u0234\u0236\u0003n7\u0000\u0235\u0234\u0001\u0000"+
		"\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238[\u0001\u0000\u0000"+
		"\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u0240\u0003^/\u0000\u023b"+
		"\u0240\u0003`0\u0000\u023c\u0240\u0003b1\u0000\u023d\u0240\u0005>\u0000"+
		"\u0000\u023e\u0240\u00058\u0000\u0000\u023f\u023a\u0001\u0000\u0000\u0000"+
		"\u023f\u023b\u0001\u0000\u0000\u0000\u023f\u023c\u0001\u0000\u0000\u0000"+
		"\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000"+
		"\u0240]\u0001\u0000\u0000\u0000\u0241\u0242\u0005@\u0000\u0000\u0242\u0246"+
		"\u0005G\u0000\u0000\u0243\u0245\u0003j5\u0000\u0244\u0243\u0001\u0000"+
		"\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0249\u0001\u0000"+
		"\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024a\u0005E\u0000"+
		"\u0000\u024a_\u0001\u0000\u0000\u0000\u024b\u024c\u0005@\u0000\u0000\u024c"+
		"\u0250\u0005B\u0000\u0000\u024d\u024f\u0003j5\u0000\u024e\u024d\u0001"+
		"\u0000\u0000\u0000\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001"+
		"\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0253\u0001"+
		"\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u0254\u0005"+
		"D\u0000\u0000\u0254a\u0001\u0000\u0000\u0000\u0255\u0256\u0005@\u0000"+
		"\u0000\u0256\u025a\u0005A\u0000\u0000\u0257\u0259\u0003j5\u0000\u0258"+
		"\u0257\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000\u0000\u025a"+
		"\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b"+
		"\u025d\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025d"+
		"\u025f\u0005D\u0000\u0000\u025e\u0260\u0003d2\u0000\u025f\u025e\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0005?\u0000\u0000\u0262\u0263\u0005A\u0000"+
		"\u0000\u0263\u0264\u0005D\u0000\u0000\u0264c\u0001\u0000\u0000\u0000\u0265"+
		"\u026d\u0003f3\u0000\u0266\u026d\u0003\\.\u0000\u0267\u026d\u0005<\u0000"+
		"\u0000\u0268\u026d\u0003n7\u0000\u0269\u026d\u0005>\u0000\u0000\u026a"+
		"\u026d\u0005+\u0000\u0000\u026b\u026d\u0005\u001f\u0000\u0000\u026c\u0265"+
		"\u0001\u0000\u0000\u0000\u026c\u0266\u0001\u0000\u0000\u0000\u026c\u0267"+
		"\u0001\u0000\u0000\u0000\u026c\u0268\u0001\u0000\u0000\u0000\u026c\u0269"+
		"\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026b"+
		"\u0001\u0000\u0000\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026c"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026fe\u0001"+
		"\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0272\u0007"+
		"\u0005\u0000\u0000\u0272g\u0001\u0000\u0000\u0000\u0273\u0274\u0005F\u0000"+
		"\u0000\u0274\u0275\u0007\u0006\u0000\u0000\u0275i\u0001\u0000\u0000\u0000"+
		"\u0276\u0278\u0005H\u0000\u0000\u0277\u0279\u0003h4\u0000\u0278\u0277"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u0287"+
		"\u0001\u0000\u0000\u0000\u027a\u027c\u0005I\u0000\u0000\u027b\u027d\u0003"+
		"h4\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000"+
		"\u0000\u027d\u0287\u0001\u0000\u0000\u0000\u027e\u0280\u0005J\u0000\u0000"+
		"\u027f\u0281\u0003h4\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0280\u0281"+
		"\u0001\u0000\u0000\u0000\u0281\u0287\u0001\u0000\u0000\u0000\u0282\u0284"+
		"\u0005G\u0000\u0000\u0283\u0285\u0003h4\u0000\u0284\u0283\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0287\u0001\u0000"+
		"\u0000\u0000\u0286\u0276\u0001\u0000\u0000\u0000\u0286\u027a\u0001\u0000"+
		"\u0000\u0000\u0286\u027e\u0001\u0000\u0000\u0000\u0286\u0282\u0001\u0000"+
		"\u0000\u0000\u0287k\u0001\u0000\u0000\u0000\u0288\u028b\u0003n7\u0000"+
		"\u0289\u028b\u00055\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028a"+
		"\u0289\u0001\u0000\u0000\u0000\u028bm\u0001\u0000\u0000\u0000\u028c\u028d"+
		"\u0007\u0007\u0000\u0000\u028do\u0001\u0000\u0000\u0000Kw}\u0081\u0088"+
		"\u008e\u0098\u009e\u00aa\u00b3\u00c2\u00ca\u00cf\u00d5\u00df\u00e5\u00f7"+
		"\u0100\u0103\u0106\u0115\u011b\u0125\u0129\u0132\u0136\u013b\u0143\u0148"+
		"\u014d\u0151\u0153\u015f\u016e\u0173\u0188\u0193\u0199\u019e\u01a5\u01ab"+
		"\u01b1\u01b6\u01b8\u01bd\u01d3\u01d9\u01df\u01e5\u01f2\u01f6\u01fe\u0201"+
		"\u0205\u020b\u0210\u0214\u0219\u021d\u0222\u0228\u0230\u0237\u023f\u0246"+
		"\u0250\u025a\u025f\u026c\u026e\u0278\u027c\u0280\u0284\u0286\u028a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}