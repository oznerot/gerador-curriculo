// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.curriculo.gerador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CurriculoParser}.
 */
public interface CurriculoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#curriculo}.
	 * @param ctx the parse tree
	 */
	void enterCurriculo(CurriculoParser.CurriculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#curriculo}.
	 * @param ctx the parse tree
	 */
	void exitCurriculo(CurriculoParser.CurriculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(CurriculoParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(CurriculoParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#tipoCampo}.
	 * @param ctx the parse tree
	 */
	void enterTipoCampo(CurriculoParser.TipoCampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#tipoCampo}.
	 * @param ctx the parse tree
	 */
	void exitTipoCampo(CurriculoParser.TipoCampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#camposLista}.
	 * @param ctx the parse tree
	 */
	void enterCamposLista(CurriculoParser.CamposListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#camposLista}.
	 * @param ctx the parse tree
	 */
	void exitCamposLista(CurriculoParser.CamposListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#educacao}.
	 * @param ctx the parse tree
	 */
	void enterEducacao(CurriculoParser.EducacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#educacao}.
	 * @param ctx the parse tree
	 */
	void exitEducacao(CurriculoParser.EducacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#listaEduc}.
	 * @param ctx the parse tree
	 */
	void enterListaEduc(CurriculoParser.ListaEducContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#listaEduc}.
	 * @param ctx the parse tree
	 */
	void exitListaEduc(CurriculoParser.ListaEducContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#itemEduc}.
	 * @param ctx the parse tree
	 */
	void enterItemEduc(CurriculoParser.ItemEducContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#itemEduc}.
	 * @param ctx the parse tree
	 */
	void exitItemEduc(CurriculoParser.ItemEducContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#curso}.
	 * @param ctx the parse tree
	 */
	void enterCurso(CurriculoParser.CursoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#curso}.
	 * @param ctx the parse tree
	 */
	void exitCurso(CurriculoParser.CursoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#instituicao}.
	 * @param ctx the parse tree
	 */
	void enterInstituicao(CurriculoParser.InstituicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#instituicao}.
	 * @param ctx the parse tree
	 */
	void exitInstituicao(CurriculoParser.InstituicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#periodo}.
	 * @param ctx the parse tree
	 */
	void enterPeriodo(CurriculoParser.PeriodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#periodo}.
	 * @param ctx the parse tree
	 */
	void exitPeriodo(CurriculoParser.PeriodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#descricao}.
	 * @param ctx the parse tree
	 */
	void enterDescricao(CurriculoParser.DescricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#descricao}.
	 * @param ctx the parse tree
	 */
	void exitDescricao(CurriculoParser.DescricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#experiencia}.
	 * @param ctx the parse tree
	 */
	void enterExperiencia(CurriculoParser.ExperienciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#experiencia}.
	 * @param ctx the parse tree
	 */
	void exitExperiencia(CurriculoParser.ExperienciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#listaExp}.
	 * @param ctx the parse tree
	 */
	void enterListaExp(CurriculoParser.ListaExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#listaExp}.
	 * @param ctx the parse tree
	 */
	void exitListaExp(CurriculoParser.ListaExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#itemExp}.
	 * @param ctx the parse tree
	 */
	void enterItemExp(CurriculoParser.ItemExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#itemExp}.
	 * @param ctx the parse tree
	 */
	void exitItemExp(CurriculoParser.ItemExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#empresa}.
	 * @param ctx the parse tree
	 */
	void enterEmpresa(CurriculoParser.EmpresaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#empresa}.
	 * @param ctx the parse tree
	 */
	void exitEmpresa(CurriculoParser.EmpresaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#cargo}.
	 * @param ctx the parse tree
	 */
	void enterCargo(CurriculoParser.CargoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#cargo}.
	 * @param ctx the parse tree
	 */
	void exitCargo(CurriculoParser.CargoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#habilidades}.
	 * @param ctx the parse tree
	 */
	void enterHabilidades(CurriculoParser.HabilidadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#habilidades}.
	 * @param ctx the parse tree
	 */
	void exitHabilidades(CurriculoParser.HabilidadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#listaHab}.
	 * @param ctx the parse tree
	 */
	void enterListaHab(CurriculoParser.ListaHabContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#listaHab}.
	 * @param ctx the parse tree
	 */
	void exitListaHab(CurriculoParser.ListaHabContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#itemHab}.
	 * @param ctx the parse tree
	 */
	void enterItemHab(CurriculoParser.ItemHabContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#itemHab}.
	 * @param ctx the parse tree
	 */
	void exitItemHab(CurriculoParser.ItemHabContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#idiomas}.
	 * @param ctx the parse tree
	 */
	void enterIdiomas(CurriculoParser.IdiomasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#idiomas}.
	 * @param ctx the parse tree
	 */
	void exitIdiomas(CurriculoParser.IdiomasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#listaIdiomas}.
	 * @param ctx the parse tree
	 */
	void enterListaIdiomas(CurriculoParser.ListaIdiomasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#listaIdiomas}.
	 * @param ctx the parse tree
	 */
	void exitListaIdiomas(CurriculoParser.ListaIdiomasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurriculoParser#itemIdioma}.
	 * @param ctx the parse tree
	 */
	void enterItemIdioma(CurriculoParser.ItemIdiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurriculoParser#itemIdioma}.
	 * @param ctx the parse tree
	 */
	void exitItemIdioma(CurriculoParser.ItemIdiomaContext ctx);
}