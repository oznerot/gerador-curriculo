package br.ufscar.dc.compiladores.curriculo.gerador.visitor;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import br.ufscar.dc.compiladores.curriculo.gerador.tabela.Escopos;
import br.ufscar.dc.compiladores.curriculo.gerador.util.Validator;

public class ValidationVisitor extends CurriculoBaseVisitor<Void>
{
    Escopos escopos = new Escopos();

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

        return null;
    }

    @Override
    public Void visitCampo(CurriculoParser.CampoContext ctx)
    {
        String tipoCampo = ctx.tipoCampo().getText();
        String valorCampo = ctx.CADEIA().getText();

        if(valorCampo.startsWith("\"") && valorCampo.endsWith("\""))
        {
            valorCampo = valorCampo.substring(1, valorCampo.length() - 1);
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar(tipoCampo);

        if(tipoCampo.equals("NOME") && !Validator.isValidNome(valorCampo))
        {
            throw new RuntimeException("Erro semântico: Nome " + valorCampo + " não é válido.");
        }
        else if(tipoCampo.equals("EMAIL") && !Validator.isValidEmail(valorCampo))
        {
            throw new RuntimeException("Erro semântico: Email " + valorCampo + " não é válido.");
        }
        else if(tipoCampo.equals("CIDADE") && !Validator.isValidCidade(valorCampo))
        {
            throw new RuntimeException("Erro semântico: Cidade " + valorCampo + " não é válida.");
        }
        else if(tipoCampo.equals("ESTADO") && !Validator.isValidEstado(valorCampo))
        {
            throw new RuntimeException("Erro semântico: Estado " + valorCampo + " não é válido.");
        }
        else if(tipoCampo.equals("ENDERECO") && !Validator.isValidEndereco(valorCampo))
        {
            throw new RuntimeException("Erro semântico: Endereço " + valorCampo + " não é válido.");
        }
        else if(tipoCampo.equals("TELEFONE") && !Validator.isValidTelefone(valorCampo))
        {
            throw new RuntimeException("Erro semântico: Telefone " + valorCampo + " não é válido.");
        }
        else if(tipoCampo.equals("LINKEDIN") && !Validator.isValidLinkedin(valorCampo))
        {
            throw new RuntimeException("Erro semântico: Linkedin " + valorCampo + " não é válido.");
        }
        else if(tipoCampo.equals("GITHUB") && !Validator.isValidGithub(valorCampo))
        {
            throw new RuntimeException("Erro semântico: Github " + valorCampo + " não é válido.");
        }

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Campo " + tipoCampo + " já foi declarado.");
        }
        else
        {
            escopoAtual.inserir(tipoCampo, valorCampo);
        }

        return null;
    }

    @Override
    public Void visitCamposLista(CurriculoParser.CamposListaContext ctx)
    {
        if(ctx.educacao() != null)
        {
            visitEducacao(ctx.educacao());
        }
        else if(ctx.experiencia() != null)
        {
            visitExperiencia(ctx.experiencia());
        }
        else if(ctx.habilidades() != null)
        {
            visitHabilidades(ctx.habilidades());
        }
        else if(ctx.idiomas() != null)
        {
            visitIdiomas(ctx.idiomas());
        }

        return null;
    }

    @Override
    public Void visitEducacao(CurriculoParser.EducacaoContext ctx)
    {
        visitListaEduc(ctx.listaEduc());

        return null;
    }

    @Override
    public Void visitListaEduc(CurriculoParser.ListaEducContext ctx)
    {
        for(CurriculoParser.ItemEducContext itemEducContext : ctx.itemEduc())
        {
            escopos.criarNovoEscopo();
            visitItemEduc(itemEducContext);
            escopos.abandonarEscopo();
        }

        return null;
    }

    @Override
    public Void visitItemEduc(CurriculoParser.ItemEducContext ctx)
    {
        String curso = ctx.curso().CADEIA().getText();
        String instituicao = ctx.instituicao().CADEIA().getText();
        String periodo = ctx.periodo().CADEIA().getText();
        String descricao = ctx.descricao().CADEIA().getText();

        visitPeriodo(ctx.periodo());

    }

    @Override
    public void visitPeriodo(CurriculoParser.PeriodoContext ctx)
    {
        String dataInicio = ctx.dataInicio.getText();
        String dataFinal = ctx.dataFinal.getText();

        if(!Validator.isValidPeriodo(dataInicio, dataFinal))
        {
            throw new RuntimeException("Erro semântico: Período de " + dataInicio + " a " + dataFinal + " não é válido.");
        }
    }
}