// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.curriculo.gerador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CurriculoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CurriculoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#curriculo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurriculo(CurriculoParser.CurriculoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(CurriculoParser.CampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#tipoCampo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoCampo(CurriculoParser.TipoCampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#camposLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCamposLista(CurriculoParser.CamposListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#educacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEducacao(CurriculoParser.EducacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#listaEduc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaEduc(CurriculoParser.ListaEducContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#itemEduc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemEduc(CurriculoParser.ItemEducContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#curso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurso(CurriculoParser.CursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#instituicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstituicao(CurriculoParser.InstituicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#periodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodo(CurriculoParser.PeriodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(CurriculoParser.DescricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#experiencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExperiencia(CurriculoParser.ExperienciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#listaExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExp(CurriculoParser.ListaExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#itemExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemExp(CurriculoParser.ItemExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#empresa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpresa(CurriculoParser.EmpresaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#cargo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargo(CurriculoParser.CargoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#habilidades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHabilidades(CurriculoParser.HabilidadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#listaHab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaHab(CurriculoParser.ListaHabContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#itemHab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemHab(CurriculoParser.ItemHabContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#idiomas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdiomas(CurriculoParser.IdiomasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#listaIdiomas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIdiomas(CurriculoParser.ListaIdiomasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CurriculoParser#itemIdioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemIdioma(CurriculoParser.ItemIdiomaContext ctx);
}