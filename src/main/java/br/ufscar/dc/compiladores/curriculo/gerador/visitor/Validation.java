package br.ufscar.dc.compiladores.curriculo.gerador.visitor;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class ValidationVisitor extends CurriculoBaseVisitor<Void>
{
    @Override
    public Void visitCurriculo(CurriculoParser.CurriculoContext ctx)
    {
        for(CurriculoParser.CampoContext campoContext : ctx.campo())
        {
            visitCampo(campoContext);
        }

        for(CurriculoParser.CamposListaContext camposListaContext : ctx.camposLista())
        {
            visitCamposLista(camposListaContext);
        }
    }

    @Override
    public Void visitCampo(CurriculoParser.CampoContext ctx)
    {
        if(ctx.getText().startsWith("NOME"))

        if(ctx.getText())
    }
}