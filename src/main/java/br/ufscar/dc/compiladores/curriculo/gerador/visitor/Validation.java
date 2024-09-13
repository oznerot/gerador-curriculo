package br.ufscar.dc.compiladores.curriculo.gerador.visitor;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import br.ufscar.dc.compiladores.curriculo.gerador.tabela.Escopos;
import br.ufscar.dc.compiladores.curriculo.gerador.tabela.EntradaTabelaDeSimbolos;
import br.ufscar.dc.compiladores.curriculo.gerador.tabela.TabelaDeSimbolos;
import br.ufscar.dc.compiladores.curriculo.gerador.util.Validator;

import br.ufscar.dc.compiladores.curriculo.gerador.CurriculoParser;
import br.ufscar.dc.compiladores.curriculo.gerador.CurriculoBaseVisitor;

public class Validation extends CurriculoBaseVisitor<Void>
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
        for(CurriculoParser.CampoEducContext campoEducContext : ctx.campoEduc())
        {
            escopos.criarNovoEscopo();
            visitCampoEduc(campoEducContext);
            escopos.abandonarEscopo();
        }

        return null;
    }

    @Override
    public Void visitCampoEduc(CurriculoParser.CampoEducContext ctx)
    {
        for(CurriculoParser.ItemEducContext itemEducContext : ctx.itemEduc())
        {
            visitItemEduc(itemEducContext);
        }

        return null;
    }

    public Void visitItemEduc(CurriculoParser.ItemEducContext ctx)
    {
        if(ctx.curso() != null)
        {
            visitCurso(ctx.curso());
        }
        else if(ctx.instituicao() != null)
        {
            visitInstituicao(ctx.instituicao());
        }
        else if(ctx.periodo() != null)
        {
            visitPeriodo(ctx.periodo());
        }
        else if(ctx.descricao() != null)
        {
            visitDescricao(ctx.descricao());
        }

        return null;
    }

    @Override
    public Void visitCurso(CurriculoParser.CursoContext ctx)
    {
        String valorItem = ctx.CADEIA().getText();

        if(valorItem.startsWith("\"") && valorItem.endsWith("\""))
        {
            valorItem = valorItem.substring(1, valorItem.length() - 1);
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar("Curso");

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Curso já foi informado.");
        }
        else
        {
            escopoAtual.inserir("Curso", valorItem);
        }

        return null;
    }

    @Override
    public Void visitInstituicao(CurriculoParser.InstituicaoContext ctx)
    {
        String valorItem = ctx.CADEIA().getText();

        if(valorItem.startsWith("\"") && valorItem.endsWith("\""))
        {
            valorItem = valorItem.substring(1, valorItem.length() - 1);
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar("Instituicao");

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Instituicao já foi informada.");
        }
        else
        {
            escopoAtual.inserir("Instituicao", valorItem);
        }

        return null;
    }

    @Override
    public Void visitDescricao(CurriculoParser.DescricaoContext ctx)
    {
        String valorItem = ctx.CADEIA().getText();

        if(valorItem.startsWith("\"") && valorItem.endsWith("\""))
        {
            valorItem = valorItem.substring(1, valorItem.length() - 1);
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar("Descricao");

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Descricao já foi informada.");
        }
        else
        {
            escopoAtual.inserir("Descricao", valorItem);
        }

        return null;
    }

    @Override
    public Void visitPeriodo(CurriculoParser.PeriodoContext ctx)
    {
        String dataInicio = ctx.timestamp().MESANO(0).getText();
        String dataFinal = ctx.timestamp().MESANO(1).getText();

        if(!Validator.isValidPeriodo(dataInicio, dataFinal))
        {
            throw new RuntimeException("Erro semântico: Período de " + dataInicio + " a " + dataFinal + " não é válido.");
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar("Periodo");

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Período já foi informado.");
        }
        else
        {
            String valorItem = ctx.timestamp().getText();
            escopoAtual.inserir("Periodo", valorItem);
        }

        return null;
    }

    @Override
    public Void visitExperiencia(CurriculoParser.ExperienciaContext ctx)
    {
        visitListaExp(ctx.listaExp());

        return null;
    }

    @Override
    public Void visitListaExp(CurriculoParser.ListaExpContext ctx)
    {
        for(CurriculoParser.CampoExpContext campoExpContext : ctx.campoExp())
        {
            escopos.criarNovoEscopo();
            visitCampoExp(campoExpContext);
            escopos.abandonarEscopo();
        }

        return null;
    }

    @Override
    public Void visitCampoExp(CurriculoParser.CampoExpContext ctx)
    {
        for(CurriculoParser.ItemExpContext itemExpContext : ctx.itemExp())
        {
            visitItemExp(itemExpContext);
        }

        return null;
    }

    @Override
    public Void visitItemExp(CurriculoParser.ItemExpContext ctx)
    {
        if(ctx.empresa() != null)
        {
            visitEmpresa(ctx.empresa());
        }
        else if(ctx.cargo() != null)
        {
            visitCargo(ctx.cargo());
        }
        else if(ctx.periodo() != null)
        {
            visitPeriodo(ctx.periodo());
        }
        else if(ctx.descricao() != null)
        {
            visitDescricao(ctx.descricao());
        }

        return null;
    }

    @Override
    public Void visitEmpresa(CurriculoParser.EmpresaContext ctx)
    {
        String valorItem = ctx.CADEIA().getText();

        if(valorItem.startsWith("\"") && valorItem.endsWith("\""))
        {
            valorItem = valorItem.substring(1, valorItem.length() - 1);
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar("Empresa");

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Empresa já foi informada.");
        }
        else
        {
            escopoAtual.inserir("Empresa", valorItem);
        }

        return null;  
    }

    @Override
    public Void visitCargo(CurriculoParser.CargoContext ctx)
    {
        String valorItem = ctx.CADEIA().getText();

        if(valorItem.startsWith("\"") && valorItem.endsWith("\""))
        {
            valorItem = valorItem.substring(1, valorItem.length() - 1);
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar("Cargo");

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Cargo já foi informado.");
        }
        else
        {
            escopoAtual.inserir("Cargo", valorItem);
        }

        return null; 
    }

    @Override
    public Void visitHabilidades(CurriculoParser.HabilidadesContext ctx)
    {
        escopos.criarNovoEscopo();
        visitListaHab(ctx.listaHab());
        escopos.abandonarEscopo();

        return null;    
    }

    @Override
    public Void visitListaHab(CurriculoParser.ListaHabContext ctx)
    {
        for(CurriculoParser.CampoHabContext campoHabContext : ctx.campoHab())
        {
            visitCampoHab(campoHabContext);
        }

        return null;
    }

    @Override
    public Void visitCampoHab(CurriculoParser.CampoHabContext ctx)
    {
        String valorItem = ctx.CADEIA().getText();

        if(valorItem.startsWith("\"") && valorItem.endsWith("\""))
        {
            valorItem = valorItem.substring(1, valorItem.length() - 1);
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar(valorItem);

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Habilidade \"" + valorItem + "\" já foi informada.");
        }
        else
        {
            escopoAtual.inserir(valorItem, valorItem);
        }

        return null;
    }

    @Override
    public Void visitIdiomas(CurriculoParser.IdiomasContext ctx)
    {
        escopos.criarNovoEscopo();
        visitListaIdiomas(ctx.listaIdiomas());
        escopos.abandonarEscopo();

        return null;
    }

    @Override
    public Void visitListaIdiomas(CurriculoParser.ListaIdiomasContext ctx)
    {
        for(CurriculoParser.CampoIdiomaContext campoIdiomaContext : ctx.campoIdioma())
        {
            visitCampoIdioma(campoIdiomaContext);
        }

        return null;
    }

    @Override
    public Void visitCampoIdioma(CurriculoParser.CampoIdiomaContext ctx)
    {
        String valorItem = ctx.CADEIA().getText();

        if(valorItem.startsWith("\"") && valorItem.endsWith("\""))
        {
            valorItem = valorItem.substring(1, valorItem.length() - 1);
        }

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos entrada = escopoAtual.verificar(valorItem);

        if(entrada != null)
        {
            throw new RuntimeException("Erro semântico: Idioma \"" + valorItem + "\" já foi informado.");
        }
        else
        {
            escopoAtual.inserir(valorItem, valorItem);
        }

        return null; 
    }
}