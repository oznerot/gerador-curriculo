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
		PALAVRA_CHAVE=18, CADEIA=19, IGNORADO=20, ERRO_CADEIA=21, ERRO_COMENTARIO=22, 
		NAO_RECONHECIDO=23;
	public static final int
		RULE_curriculo = 0, RULE_campo = 1, RULE_camposLista = 2, RULE_educacao = 3, 
		RULE_listaEduc = 4, RULE_itemEduc = 5, RULE_curso = 6, RULE_instituicao = 7, 
		RULE_periodo = 8, RULE_descricao = 9, RULE_experiencia = 10, RULE_listaExp = 11, 
		RULE_itemExp = 12, RULE_empresa = 13, RULE_cargo = 14, RULE_habilidades = 15, 
		RULE_listaHab = 16, RULE_itemHab = 17, RULE_idiomas = 18, RULE_listaIdiomas = 19, 
		RULE_itemIdioma = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"curriculo", "campo", "camposLista", "educacao", "listaEduc", "itemEduc", 
			"curso", "instituicao", "periodo", "descricao", "experiencia", "listaExp", 
			"itemExp", "empresa", "cargo", "habilidades", "listaHab", "itemHab", 
			"idiomas", "listaIdiomas", "itemIdioma"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOME'", "':'", "'EMAIL'", "'TELEFONE'", "'LINKEDIN'", "'GITHUB'", 
			"'EDUCACAO'", "'-'", "'Curso'", "'Instituicao'", "'Periodo'", "'Descricao'", 
			"'EXPERIENCIA'", "'Empresa'", "'Cargo'", "'HABILIDADES'", "'IDIOMAS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PALAVRA_CHAVE", "CADEIA", "IGNORADO", 
			"ERRO_CADEIA", "ERRO_COMENTARIO", "NAO_RECONHECIDO"
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				campo();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 122L) != 0 );
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				camposLista();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 204928L) != 0 );
			setState(52);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__0);
				setState(55);
				match(T__1);
				setState(56);
				match(CADEIA);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__2);
				setState(58);
				match(T__1);
				setState(59);
				match(CADEIA);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__3);
				setState(61);
				match(T__1);
				setState(62);
				match(CADEIA);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(T__4);
				setState(64);
				match(T__1);
				setState(65);
				match(CADEIA);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				match(T__5);
				setState(67);
				match(T__1);
				setState(68);
				match(CADEIA);
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
		enterRule(_localctx, 4, RULE_camposLista);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				educacao();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				experiencia();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				habilidades();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
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
		enterRule(_localctx, 6, RULE_educacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__6);
			setState(78);
			match(T__1);
			setState(79);
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
		public List<ItemEducContext> itemEduc() {
			return getRuleContexts(ItemEducContext.class);
		}
		public ItemEducContext itemEduc(int i) {
			return getRuleContext(ItemEducContext.class,i);
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
		enterRule(_localctx, 8, RULE_listaEduc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(81);
				itemEduc();
				}
				}
				setState(86);
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
		enterRule(_localctx, 10, RULE_itemEduc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__7);
			setState(88);
			curso();
			setState(89);
			instituicao();
			setState(90);
			periodo();
			setState(91);
			descricao();
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
		enterRule(_localctx, 12, RULE_curso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__8);
			setState(94);
			match(T__1);
			setState(95);
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
		enterRule(_localctx, 14, RULE_instituicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__9);
			setState(98);
			match(T__1);
			setState(99);
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
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
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
		enterRule(_localctx, 16, RULE_periodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__10);
			setState(102);
			match(T__1);
			setState(103);
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
		enterRule(_localctx, 18, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__11);
			setState(106);
			match(T__1);
			setState(107);
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
		enterRule(_localctx, 20, RULE_experiencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__12);
			setState(110);
			match(T__1);
			setState(111);
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
		public List<ItemExpContext> itemExp() {
			return getRuleContexts(ItemExpContext.class);
		}
		public ItemExpContext itemExp(int i) {
			return getRuleContext(ItemExpContext.class,i);
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
		enterRule(_localctx, 22, RULE_listaExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(113);
				itemExp();
				}
				}
				setState(118);
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
		enterRule(_localctx, 24, RULE_itemExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__7);
			setState(120);
			empresa();
			setState(121);
			cargo();
			setState(122);
			periodo();
			setState(123);
			descricao();
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
		enterRule(_localctx, 26, RULE_empresa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__13);
			setState(126);
			match(T__1);
			setState(127);
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
		enterRule(_localctx, 28, RULE_cargo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__14);
			setState(130);
			match(T__1);
			setState(131);
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
		enterRule(_localctx, 30, RULE_habilidades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__15);
			setState(134);
			match(T__1);
			setState(135);
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
		public List<ItemHabContext> itemHab() {
			return getRuleContexts(ItemHabContext.class);
		}
		public ItemHabContext itemHab(int i) {
			return getRuleContext(ItemHabContext.class,i);
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
		enterRule(_localctx, 32, RULE_listaHab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(137);
				itemHab();
				}
				}
				setState(142);
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
	public static class ItemHabContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public ItemHabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemHab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterItemHab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitItemHab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitItemHab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemHabContext itemHab() throws RecognitionException {
		ItemHabContext _localctx = new ItemHabContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_itemHab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__7);
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
		enterRule(_localctx, 36, RULE_idiomas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__16);
			setState(147);
			match(T__1);
			setState(148);
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
		public List<ItemIdiomaContext> itemIdioma() {
			return getRuleContexts(ItemIdiomaContext.class);
		}
		public ItemIdiomaContext itemIdioma(int i) {
			return getRuleContext(ItemIdiomaContext.class,i);
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
		enterRule(_localctx, 38, RULE_listaIdiomas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(150);
				itemIdioma();
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
	public static class ItemIdiomaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CurriculoParser.CADEIA, 0); }
		public ItemIdiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemIdioma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).enterItemIdioma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CurriculoListener ) ((CurriculoListener)listener).exitItemIdioma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CurriculoVisitor ) return ((CurriculoVisitor<? extends T>)visitor).visitItemIdioma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemIdiomaContext itemIdioma() throws RecognitionException {
		ItemIdiomaContext _localctx = new ItemIdiomaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_itemIdioma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__7);
			setState(157);
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
		"\u0004\u0001\u0017\u00a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004"+
		"\u0000,\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0004\u00001\b\u0000"+
		"\u000b\u0000\f\u00002\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0005\u000b"+
		"s\b\u000b\n\u000b\f\u000bv\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0005\u0010\u008b\b\u0010\n\u0010\f\u0010\u008e\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0005\u0013\u0098\b\u0013\n\u0013\f\u0013\u009b\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(\u0000\u0000\u0097\u0000+\u0001\u0000\u0000\u0000\u0002E\u0001\u0000"+
		"\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000"+
		"\bT\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\f]\u0001\u0000"+
		"\u0000\u0000\u000ea\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000"+
		"\u0012i\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016t"+
		"\u0001\u0000\u0000\u0000\u0018w\u0001\u0000\u0000\u0000\u001a}\u0001\u0000"+
		"\u0000\u0000\u001c\u0081\u0001\u0000\u0000\u0000\u001e\u0085\u0001\u0000"+
		"\u0000\u0000 \u008c\u0001\u0000\u0000\u0000\"\u008f\u0001\u0000\u0000"+
		"\u0000$\u0092\u0001\u0000\u0000\u0000&\u0099\u0001\u0000\u0000\u0000("+
		"\u009c\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/1\u0003\u0004\u0002\u0000"+
		"0/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005\u0000"+
		"\u0000\u00015\u0001\u0001\u0000\u0000\u000067\u0005\u0001\u0000\u0000"+
		"78\u0005\u0002\u0000\u00008F\u0005\u0013\u0000\u00009:\u0005\u0003\u0000"+
		"\u0000:;\u0005\u0002\u0000\u0000;F\u0005\u0013\u0000\u0000<=\u0005\u0004"+
		"\u0000\u0000=>\u0005\u0002\u0000\u0000>F\u0005\u0013\u0000\u0000?@\u0005"+
		"\u0005\u0000\u0000@A\u0005\u0002\u0000\u0000AF\u0005\u0013\u0000\u0000"+
		"BC\u0005\u0006\u0000\u0000CD\u0005\u0002\u0000\u0000DF\u0005\u0013\u0000"+
		"\u0000E6\u0001\u0000\u0000\u0000E9\u0001\u0000\u0000\u0000E<\u0001\u0000"+
		"\u0000\u0000E?\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000F\u0003"+
		"\u0001\u0000\u0000\u0000GL\u0003\u0006\u0003\u0000HL\u0003\u0014\n\u0000"+
		"IL\u0003\u001e\u000f\u0000JL\u0003$\u0012\u0000KG\u0001\u0000\u0000\u0000"+
		"KH\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000L\u0005\u0001\u0000\u0000\u0000MN\u0005\u0007\u0000\u0000NO\u0005"+
		"\u0002\u0000\u0000OP\u0003\b\u0004\u0000P\u0007\u0001\u0000\u0000\u0000"+
		"QS\u0003\n\u0005\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WX\u0005\b\u0000\u0000XY\u0003\f\u0006"+
		"\u0000YZ\u0003\u000e\u0007\u0000Z[\u0003\u0010\b\u0000[\\\u0003\u0012"+
		"\t\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005\t\u0000\u0000^_\u0005"+
		"\u0002\u0000\u0000_`\u0005\u0013\u0000\u0000`\r\u0001\u0000\u0000\u0000"+
		"ab\u0005\n\u0000\u0000bc\u0005\u0002\u0000\u0000cd\u0005\u0013\u0000\u0000"+
		"d\u000f\u0001\u0000\u0000\u0000ef\u0005\u000b\u0000\u0000fg\u0005\u0002"+
		"\u0000\u0000gh\u0005\u0013\u0000\u0000h\u0011\u0001\u0000\u0000\u0000"+
		"ij\u0005\f\u0000\u0000jk\u0005\u0002\u0000\u0000kl\u0005\u0013\u0000\u0000"+
		"l\u0013\u0001\u0000\u0000\u0000mn\u0005\r\u0000\u0000no\u0005\u0002\u0000"+
		"\u0000op\u0003\u0016\u000b\u0000p\u0015\u0001\u0000\u0000\u0000qs\u0003"+
		"\u0018\f\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0017\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000wx\u0005\b\u0000\u0000xy\u0003\u001a\r"+
		"\u0000yz\u0003\u001c\u000e\u0000z{\u0003\u0010\b\u0000{|\u0003\u0012\t"+
		"\u0000|\u0019\u0001\u0000\u0000\u0000}~\u0005\u000e\u0000\u0000~\u007f"+
		"\u0005\u0002\u0000\u0000\u007f\u0080\u0005\u0013\u0000\u0000\u0080\u001b"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u000f\u0000\u0000\u0082\u0083"+
		"\u0005\u0002\u0000\u0000\u0083\u0084\u0005\u0013\u0000\u0000\u0084\u001d"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0010\u0000\u0000\u0086\u0087"+
		"\u0005\u0002\u0000\u0000\u0087\u0088\u0003 \u0010\u0000\u0088\u001f\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0003\"\u0011\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d!\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005\b\u0000\u0000"+
		"\u0090\u0091\u0005\u0013\u0000\u0000\u0091#\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\u0011\u0000\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094"+
		"\u0095\u0003&\u0013\u0000\u0095%\u0001\u0000\u0000\u0000\u0096\u0098\u0003"+
		"(\u0014\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\'\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\b\u0000\u0000\u009d\u009e\u0005\u0013\u0000\u0000"+
		"\u009e)\u0001\u0000\u0000\u0000\b-2EKTt\u008c\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}