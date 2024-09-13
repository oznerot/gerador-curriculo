// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.curriculo.gerador;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CurriculoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, PALAVRA_CHAVE=23, CADEIA=24, 
		MESANO=25, IGNORADO=26, ERRO_CADEIA=27, ERRO_COMENTARIO=28, NAO_RECONHECIDO=29;
	public static final int
		RULE_curriculo = 0, RULE_campo = 1, RULE_tipoCampo = 2, RULE_camposLista = 3, 
		RULE_educacao = 4, RULE_listaEduc = 5, RULE_campoEduc = 6, RULE_itemEduc = 7, 
		RULE_curso = 8, RULE_instituicao = 9, RULE_periodo = 10, RULE_descricao = 11, 
		RULE_timestamp = 12, RULE_experiencia = 13, RULE_listaExp = 14, RULE_campoExp = 15, 
		RULE_itemExp = 16, RULE_empresa = 17, RULE_cargo = 18, RULE_habilidades = 19, 
		RULE_listaHab = 20, RULE_campoHab = 21, RULE_idiomas = 22, RULE_listaIdiomas = 23, 
		RULE_campoIdioma = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"curriculo", "campo", "tipoCampo", "camposLista", "educacao", "listaEduc", 
			"campoEduc", "itemEduc", "curso", "instituicao", "periodo", "descricao", 
			"timestamp", "experiencia", "listaExp", "campoExp", "itemExp", "empresa", 
			"cargo", "habilidades", "listaHab", "campoHab", "idiomas", "listaIdiomas", 
			"campoIdioma"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'NOME'", "'EMAIL'", "'CIDADE'", "'ESTADO'", "'ENDERECO'", 
			"'TELEFONE'", "'LINKEDIN'", "'GITHUB'", "'EDUCACAO'", "'-'", "'Curso'", 
			"'Instituicao'", "'Periodo'", "'Descricao'", "'('", "')'", "'EXPERIENCIA'", 
			"'Empresa'", "'Cargo'", "'HABILIDADES'", "'IDIOMAS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "PALAVRA_CHAVE", 
			"CADEIA", "MESANO", "IGNORADO", "ERRO_CADEIA", "ERRO_COMENTARIO", "NAO_RECONHECIDO"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CurriculoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CurriculoContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CurriculoParser.EOF, 0); }
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<CamposListaContext> camposLista() {
			return getRuleContexts(CamposListaContext.class);
		}
		public CamposListaContext camposLista(int i) {
			return getRuleContext(CamposListaContext.class,i);
		}
		public CurriculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curriculo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCurriculo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCurriculo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCurriculo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurriculoContext curriculo() throws RecognitionException {
		CurriculoContext _localctx = new CurriculoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_curriculo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				campo();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 1020L) != 0 );
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				camposLista();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 6554624L) != 0 );
			setState(60);
			match(EOF);
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
	public static class CampoContext extends ParserRuleContext {
		public TipoCampoContext tipoCampo() {
			return getRuleContext(TipoCampoContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			tipoCampo();
			setState(63);
			match(T__0);
			setState(64);
			match(CADEIA);
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
	public static class TipoCampoContext extends ParserRuleContext {
		public TipoCampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoCampo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterTipoCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitTipoCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitTipoCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoCampoContext tipoCampo() throws RecognitionException {
		TipoCampoContext _localctx = new TipoCampoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipoCampo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1020L) != 0) ) {
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
	public static class CamposListaContext extends ParserRuleContext {
		public EducacaoContext educacao() {
			return getRuleContext(EducacaoContext.class,0);
		}
		public ExperienciaContext experiencia() {
			return getRuleContext(ExperienciaContext.class,0);
		}
		public HabilidadesContext habilidades() {
			return getRuleContext(HabilidadesContext.class,0);
		}
		public IdiomasContext idiomas() {
			return getRuleContext(IdiomasContext.class,0);
		}
		public CamposListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_camposLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCamposLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCamposLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCamposLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CamposListaContext camposLista() throws RecognitionException {
		CamposListaContext _localctx = new CamposListaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_camposLista);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				educacao();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				experiencia();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				habilidades();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				idiomas();
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
	public static class EducacaoContext extends ParserRuleContext {
		public ListaEducContext listaEduc() {
			return getRuleContext(ListaEducContext.class,0);
		}
		public EducacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_educacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterEducacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitEducacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitEducacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EducacaoContext educacao() throws RecognitionException {
		EducacaoContext _localctx = new EducacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_educacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__9);
			setState(75);
			match(T__0);
			setState(76);
			listaEduc();
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
	public static class ListaEducContext extends ParserRuleContext {
		public List<CampoEducContext> campoEduc() {
			return getRuleContexts(CampoEducContext.class);
		}
		public CampoEducContext campoEduc(int i) {
			return getRuleContext(CampoEducContext.class,i);
		}
		public ListaEducContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaEduc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterListaEduc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitListaEduc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitListaEduc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaEducContext listaEduc() throws RecognitionException {
		ListaEducContext _localctx = new ListaEducContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaEduc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				campoEduc();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
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
	public static class CampoEducContext extends ParserRuleContext {
		public List<ItemEducContext> itemEduc() {
			return getRuleContexts(ItemEducContext.class);
		}
		public ItemEducContext itemEduc(int i) {
			return getRuleContext(ItemEducContext.class,i);
		}
		public CampoEducContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campoEduc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCampoEduc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCampoEduc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCampoEduc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoEducContext campoEduc() throws RecognitionException {
		CampoEducContext _localctx = new CampoEducContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_campoEduc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__10);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				itemEduc();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0 );
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
	public static class ItemEducContext extends ParserRuleContext {
		public CursoContext curso() {
			return getRuleContext(CursoContext.class,0);
		}
		public InstituicaoContext instituicao() {
			return getRuleContext(InstituicaoContext.class,0);
		}
		public PeriodoContext periodo() {
			return getRuleContext(PeriodoContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public ItemEducContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemEduc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterItemEduc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitItemEduc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitItemEduc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemEducContext itemEduc() throws RecognitionException {
		ItemEducContext _localctx = new ItemEducContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_itemEduc);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				curso();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				instituicao();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				periodo();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				descricao();
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
	public static class CursoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public CursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursoContext curso() throws RecognitionException {
		CursoContext _localctx = new CursoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_curso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__11);
			setState(96);
			match(T__0);
			setState(97);
			match(CADEIA);
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
	public static class InstituicaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public InstituicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instituicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterInstituicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitInstituicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitInstituicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstituicaoContext instituicao() throws RecognitionException {
		InstituicaoContext _localctx = new InstituicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instituicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__12);
			setState(100);
			match(T__0);
			setState(101);
			match(CADEIA);
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
	public static class PeriodoContext extends ParserRuleContext {
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public PeriodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterPeriodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitPeriodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitPeriodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodoContext periodo() throws RecognitionException {
		PeriodoContext _localctx = new PeriodoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_periodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__13);
			setState(104);
			match(T__0);
			setState(105);
			timestamp();
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
	public static class DescricaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitDescricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitDescricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__14);
			setState(108);
			match(T__0);
			setState(109);
			match(CADEIA);
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
	public static class TimestampContext extends ParserRuleContext {
		public List<TerminalNode> MESANO() { return getTokens(CurriculoParser.MESANO); }
		public TerminalNode MESANO(int i) {
			return getToken(CurriculoParser.MESANO, i);
		}
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__15);
			setState(112);
			match(MESANO);
			setState(113);
			match(T__10);
			setState(114);
			match(MESANO);
			setState(115);
			match(T__16);
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
	public static class ExperienciaContext extends ParserRuleContext {
		public ListaExpContext listaExp() {
			return getRuleContext(ListaExpContext.class,0);
		}
		public ExperienciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experiencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterExperiencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitExperiencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitExperiencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExperienciaContext experiencia() throws RecognitionException {
		ExperienciaContext _localctx = new ExperienciaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_experiencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__17);
			setState(118);
			match(T__0);
			setState(119);
			listaExp();
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
	public static class ListaExpContext extends ParserRuleContext {
		public List<CampoExpContext> campoExp() {
			return getRuleContexts(CampoExpContext.class);
		}
		public CampoExpContext campoExp(int i) {
			return getRuleContext(CampoExpContext.class,i);
		}
		public ListaExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterListaExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitListaExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitListaExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpContext listaExp() throws RecognitionException {
		ListaExpContext _localctx = new ListaExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listaExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				campoExp();
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
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
	public static class CampoExpContext extends ParserRuleContext {
		public List<ItemExpContext> itemExp() {
			return getRuleContexts(ItemExpContext.class);
		}
		public ItemExpContext itemExp(int i) {
			return getRuleContext(ItemExpContext.class,i);
		}
		public CampoExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campoExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCampoExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCampoExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCampoExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoExpContext campoExp() throws RecognitionException {
		CampoExpContext _localctx = new CampoExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_campoExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__10);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				itemExp();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 1622016L) != 0 );
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
	public static class ItemExpContext extends ParserRuleContext {
		public EmpresaContext empresa() {
			return getRuleContext(EmpresaContext.class,0);
		}
		public CargoContext cargo() {
			return getRuleContext(CargoContext.class,0);
		}
		public PeriodoContext periodo() {
			return getRuleContext(PeriodoContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public ItemExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterItemExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitItemExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitItemExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemExpContext itemExp() throws RecognitionException {
		ItemExpContext _localctx = new ItemExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_itemExp);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				empresa();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				cargo();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				periodo();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				descricao();
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
	public static class EmpresaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public EmpresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empresa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterEmpresa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitEmpresa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitEmpresa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmpresaContext empresa() throws RecognitionException {
		EmpresaContext _localctx = new EmpresaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_empresa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__18);
			setState(139);
			match(T__0);
			setState(140);
			match(CADEIA);
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
	public static class CargoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public CargoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cargo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCargo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCargo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCargo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CargoContext cargo() throws RecognitionException {
		CargoContext _localctx = new CargoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cargo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__19);
			setState(143);
			match(T__0);
			setState(144);
			match(CADEIA);
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
	public static class HabilidadesContext extends ParserRuleContext {
		public ListaHabContext listaHab() {
			return getRuleContext(ListaHabContext.class,0);
		}
		public HabilidadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_habilidades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterHabilidades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitHabilidades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitHabilidades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HabilidadesContext habilidades() throws RecognitionException {
		HabilidadesContext _localctx = new HabilidadesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_habilidades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__20);
			setState(147);
			match(T__0);
			setState(148);
			listaHab();
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
	public static class ListaHabContext extends ParserRuleContext {
		public List<CampoHabContext> campoHab() {
			return getRuleContexts(CampoHabContext.class);
		}
		public CampoHabContext campoHab(int i) {
			return getRuleContext(CampoHabContext.class,i);
		}
		public ListaHabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaHab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterListaHab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitListaHab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitListaHab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaHabContext listaHab() throws RecognitionException {
		ListaHabContext _localctx = new ListaHabContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listaHab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				campoHab();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
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
	public static class CampoHabContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public CampoHabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campoHab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCampoHab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCampoHab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCampoHab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoHabContext campoHab() throws RecognitionException {
		CampoHabContext _localctx = new CampoHabContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_campoHab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__10);
			setState(156);
			match(CADEIA);
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
	public static class IdiomasContext extends ParserRuleContext {
		public ListaIdiomasContext listaIdiomas() {
			return getRuleContext(ListaIdiomasContext.class,0);
		}
		public IdiomasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idiomas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterIdiomas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitIdiomas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitIdiomas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdiomasContext idiomas() throws RecognitionException {
		IdiomasContext _localctx = new IdiomasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idiomas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__21);
			setState(159);
			match(T__0);
			setState(160);
			listaIdiomas();
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
	public static class ListaIdiomasContext extends ParserRuleContext {
		public List<CampoIdiomaContext> campoIdioma() {
			return getRuleContexts(CampoIdiomaContext.class);
		}
		public CampoIdiomaContext campoIdioma(int i) {
			return getRuleContext(CampoIdiomaContext.class,i);
		}
		public ListaIdiomasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIdiomas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterListaIdiomas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitListaIdiomas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitListaIdiomas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIdiomasContext listaIdiomas() throws RecognitionException {
		ListaIdiomasContext _localctx = new ListaIdiomasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listaIdiomas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				campoIdioma();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
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
	public static class CampoIdiomaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public CampoIdiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campoIdioma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterCampoIdioma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitCampoIdioma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitCampoIdioma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoIdiomaContext campoIdioma() throws RecognitionException {
		CampoIdiomaContext _localctx = new CampoIdiomaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_campoIdioma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__10);
			setState(168);
			match(CADEIA);
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
		"\u0004\u0001\u001d\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000"+
		"\u0004\u00009\b\u0000\u000b\u0000\f\u0000:\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005P\b"+
		"\u0005\u000b\u0005\f\u0005Q\u0001\u0006\u0001\u0006\u0004\u0006V\b\u0006"+
		"\u000b\u0006\f\u0006W\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007^\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e{\b\u000e\u000b"+
		"\u000e\f\u000e|\u0001\u000f\u0001\u000f\u0004\u000f\u0081\b\u000f\u000b"+
		"\u000f\f\u000f\u0082\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0089\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u0098\b\u0014\u000b\u0014\f"+
		"\u0014\u0099\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u00a4\b\u0017\u000b\u0017"+
		"\f\u0017\u00a5\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000"+
		"\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0\u0000\u0001\u0001\u0000\u0002\t\u00a2\u0000"+
		"3\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004B\u0001"+
		"\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000"+
		"\u0000\nO\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e]\u0001"+
		"\u0000\u0000\u0000\u0010_\u0001\u0000\u0000\u0000\u0012c\u0001\u0000\u0000"+
		"\u0000\u0014g\u0001\u0000\u0000\u0000\u0016k\u0001\u0000\u0000\u0000\u0018"+
		"o\u0001\u0000\u0000\u0000\u001au\u0001\u0000\u0000\u0000\u001cz\u0001"+
		"\u0000\u0000\u0000\u001e~\u0001\u0000\u0000\u0000 \u0088\u0001\u0000\u0000"+
		"\u0000\"\u008a\u0001\u0000\u0000\u0000$\u008e\u0001\u0000\u0000\u0000"+
		"&\u0092\u0001\u0000\u0000\u0000(\u0097\u0001\u0000\u0000\u0000*\u009b"+
		"\u0001\u0000\u0000\u0000,\u009e\u0001\u0000\u0000\u0000.\u00a3\u0001\u0000"+
		"\u0000\u00000\u00a7\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u0000"+
		"32\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000079\u0003\u0006"+
		"\u0003\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0000\u0000\u0001=\u0001\u0001\u0000\u0000\u0000>?\u0003\u0004"+
		"\u0002\u0000?@\u0005\u0001\u0000\u0000@A\u0005\u0018\u0000\u0000A\u0003"+
		"\u0001\u0000\u0000\u0000BC\u0007\u0000\u0000\u0000C\u0005\u0001\u0000"+
		"\u0000\u0000DI\u0003\b\u0004\u0000EI\u0003\u001a\r\u0000FI\u0003&\u0013"+
		"\u0000GI\u0003,\u0016\u0000HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0007\u0001"+
		"\u0000\u0000\u0000JK\u0005\n\u0000\u0000KL\u0005\u0001\u0000\u0000LM\u0003"+
		"\n\u0005\u0000M\t\u0001\u0000\u0000\u0000NP\u0003\f\u0006\u0000ON\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000SU\u0005\u000b"+
		"\u0000\u0000TV\u0003\u000e\u0007\u0000UT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\r\u0001\u0000\u0000\u0000Y^\u0003\u0010\b\u0000Z^\u0003\u0012\t\u0000"+
		"[^\u0003\u0014\n\u0000\\^\u0003\u0016\u000b\u0000]Y\u0001\u0000\u0000"+
		"\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005\f\u0000\u0000`a\u0005"+
		"\u0001\u0000\u0000ab\u0005\u0018\u0000\u0000b\u0011\u0001\u0000\u0000"+
		"\u0000cd\u0005\r\u0000\u0000de\u0005\u0001\u0000\u0000ef\u0005\u0018\u0000"+
		"\u0000f\u0013\u0001\u0000\u0000\u0000gh\u0005\u000e\u0000\u0000hi\u0005"+
		"\u0001\u0000\u0000ij\u0003\u0018\f\u0000j\u0015\u0001\u0000\u0000\u0000"+
		"kl\u0005\u000f\u0000\u0000lm\u0005\u0001\u0000\u0000mn\u0005\u0018\u0000"+
		"\u0000n\u0017\u0001\u0000\u0000\u0000op\u0005\u0010\u0000\u0000pq\u0005"+
		"\u0019\u0000\u0000qr\u0005\u000b\u0000\u0000rs\u0005\u0019\u0000\u0000"+
		"st\u0005\u0011\u0000\u0000t\u0019\u0001\u0000\u0000\u0000uv\u0005\u0012"+
		"\u0000\u0000vw\u0005\u0001\u0000\u0000wx\u0003\u001c\u000e\u0000x\u001b"+
		"\u0001\u0000\u0000\u0000y{\u0003\u001e\u000f\u0000zy\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u001d\u0001\u0000\u0000\u0000~\u0080\u0005\u000b\u0000\u0000"+
		"\u007f\u0081\u0003 \u0010\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u001f\u0001\u0000\u0000\u0000\u0084"+
		"\u0089\u0003\"\u0011\u0000\u0085\u0089\u0003$\u0012\u0000\u0086\u0089"+
		"\u0003\u0014\n\u0000\u0087\u0089\u0003\u0016\u000b\u0000\u0088\u0084\u0001"+
		"\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089!\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\u0013\u0000\u0000\u008b\u008c\u0005\u0001"+
		"\u0000\u0000\u008c\u008d\u0005\u0018\u0000\u0000\u008d#\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u0014\u0000\u0000\u008f\u0090\u0005\u0001\u0000"+
		"\u0000\u0090\u0091\u0005\u0018\u0000\u0000\u0091%\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0015\u0000\u0000\u0093\u0094\u0005\u0001\u0000\u0000"+
		"\u0094\u0095\u0003(\u0014\u0000\u0095\'\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0003*\u0015\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a)\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u000b\u0000\u0000\u009c\u009d\u0005\u0018\u0000\u0000\u009d+\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00a0\u0005\u0001"+
		"\u0000\u0000\u00a0\u00a1\u0003.\u0017\u0000\u00a1-\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a4\u00030\u0018\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6/\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u000b\u0000\u0000\u00a8\u00a9\u0005\u0018\u0000\u0000\u00a91\u0001"+
		"\u0000\u0000\u0000\u000b5:HQW]|\u0082\u0088\u0099\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}