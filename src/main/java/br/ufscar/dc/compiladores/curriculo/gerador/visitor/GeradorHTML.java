package br.ufscar.dc.compiladores.curriculo.gerador.visitor;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import br.ufscar.dc.compiladores.curriculo.gerador.tabela.Escopos;
import br.ufscar.dc.compiladores.curriculo.gerador.tabela.EntradaTabelaDeSimbolos;
import br.ufscar.dc.compiladores.curriculo.gerador.tabela.TabelaDeSimbolos;
import br.ufscar.dc.compiladores.curriculo.gerador.util.Validator;

import br.ufscar.dc.compiladores.curriculo.gerador.CurriculoParser;
import br.ufscar.dc.compiladores.curriculo.gerador.CurriculoBaseVisitor;

public class GeradorHTML extends CurriculoBaseVisitor<Void>
{
    public StringBuilder saida;
    TabelaDeSimbolos tabela;
    Escopos escopos = new Escopos();

    public GeradorHTML()
    {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
    }

    @Override
    public Void visitCurriculo(CurriculoParser.CurriculoContext ctx)
    {
        saida.append("<!DOCTYPE html>\n");
        saida.append("<html lang=\"pt-br\">\n");
        saida.append("<head>\n");
        saida.append("<meta charset=\"UTF-8\">\n");
        saida.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        saida.append("<title>Currículo</title>\n");
        saida.append("<style>\n");
        saida.append("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f4; }\n");
        saida.append(".container { width: 80%; max-width: 1000px; margin: 0 auto; padding: 20px; background-color: #ffffff; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); border-left: 2px solid #cccccc; border-right: 2px solid #cccccc; }\n");
        saida.append("header { display: flex; justify-content: space-between; align-items: center; }\n");
        saida.append("header h1 { margin: 0; font-size: 24px; color: #333333; }\n");
        saida.append(".info { font-size: 14px; color: #666666; text-align: right; }\n");
        saida.append(".info a { color: #0066cc; text-decoration: none; margin-left: 10px; }\n");
        saida.append(".info a:hover { text-decoration: underline; }\n");
        saida.append(".address { font-size: 14px; color: #666666; text-align: right; margin-bottom: 20px; }\n");
        saida.append(".section { margin-bottom: 20px; }\n");
        saida.append(".section h2 { font-size: 20px; color: #333333; border-bottom: 2px solid #cccccc; padding-bottom: 5px; margin-bottom: 10px; }\n");
        saida.append(".section ul { list-style-type: none; padding: 0; }\n");
        saida.append(".section ul li { margin-bottom: 10px; }\n");
        saida.append("</style>\n");
        saida.append("</head>\n");
        saida.append("<body>\n");
        saida.append("<div class=\"container\">\n");

        for(CurriculoParser.CampoContext campoCtx : ctx.campo())
        {
            visitCampo(campoCtx);
        }

        saida.append("<header>\n");

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        EntradaTabelaDeSimbolos etds = escopoAtual.verificar("NOME");
        if(etds != null)
        {
            saida.append("<h1>").append(etds.valor).append("</h1>\n");
        }

        saida.append("<div class=\"info\">\n");

        etds = escopoAtual.verificar("TELEFONE");
        if(etds != null)
        {
            saida.append("+55 ").append(etds.valor).append(" ");
        }

        etds = escopoAtual.verificar("EMAIL");
        if(etds != null)
        {
            saida.append("&bull; <a href=\"mailto:").append(etds.valor).append("\">Email</a>\n");
        }

        etds = escopoAtual.verificar("LINKEDIN");
        if(etds != null)
        {
            String linkedinUrl = "https://www.linkedin.com/in/" + etds.valor;
            saida.append("&bull; <a href=\"").append(linkedinUrl).append("\" target=\"_blank\">LinkedIn</a>\n");
        }

        etds = escopoAtual.verificar("GITHUB");
        if(etds != null)
        {
            String githubUrl = "https://github.com/" + etds.valor;
            saida.append("&bull; <a href=\"").append(githubUrl).append("\" target=\"_blank\">Github</a>\n");
        }

        EntradaTabelaDeSimbolos cidade = escopoAtual.verificar("CIDADE");
        EntradaTabelaDeSimbolos estado = escopoAtual.verificar("ESTADO");

        if(cidade != null && estado != null)
        {
            saida.append("<div class=\"address\">\n");
            saida.append(cidade.valor).append(" - ").append(estado.valor).append("\n");
            saida.append("</div>\n");
        }

        saida.append("</header>\n");

        for(CurriculoParser.CamposListaContext camposListsCtx : ctx.camposLista())
        {
            saida.append("<div class=\"section\">\n");
            visitCamposLista(camposListsCtx);
            saida.append("</div>\n");
        }

        saida.append("</div>\n");
        saida.append("</body>\n");
        saida.append("</html>\n");

        return null;
    }

    @Override
    public Void visitCampo(CurriculoParser.CampoContext ctx)
    {
        String tipoCampo = ctx.tipoCampo().getText();
        String conteudo = ctx.CADEIA().getText().replace("\"", "");

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

        escopoAtual.inserir(tipoCampo, conteudo);

        return null;
    }

    @Override
    public Void visitCamposLista(CurriculoParser.CamposListaContext ctx)
    {
        if(ctx.educacao() != null)
        {
            saida.append("<h2>Educação</h2>\n");
            visitEducacao(ctx.educacao());
        }
        else if(ctx.experiencia() != null)
        {
            saida.append("<h2>Experiência Profissional</h2>\n");
            visitExperiencia(ctx.experiencia());
        }
        else if(ctx.habilidades() != null)
        {
            saida.append("<h2>Habilidades</h2>\n");
            visitHabilidades(ctx.habilidades());
        }
        else if(ctx.idiomas() != null)
        {
            saida.append("<h2>Idiomas</h2>\n");
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

            saida.append("<ul>\n");

            TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

            EntradaTabelaDeSimbolos etds = escopoAtual.verificar("Curso");
            if(etds!= null)
            {
                saida.append("<li><strong>Curso:</strong> ").append(etds.valor).append("</li>\n");
            }

            etds = escopoAtual.verificar("Instituicao");
            if(etds!= null)
            {
                saida.append("<li><strong>Instituição:</strong> ").append(etds.valor).append("</li>\n");
            }

            etds = escopoAtual.verificar("Periodo");
            if(etds!= null)
            {
                String periodoString = etds.valor.replace("(", "").replace(")", "");
                saida.append("<li><strong>Período:</strong> ").append(periodoString).append("</li>\n");
            }

            etds = escopoAtual.verificar("Descricao");
            if(etds!= null)
            {
                saida.append("<li><strong>Descrição:</strong> ").append(etds.valor).append("</li>\n");
            }
            
            saida.append("</ul>\n");

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

    @Override
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
        String conteudo = ctx.CADEIA().getText().replace("\"", "");

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

        escopoAtual.inserir("Curso", conteudo);

        return null;
    }

    @Override
    public Void visitInstituicao(CurriculoParser.InstituicaoContext ctx)
    {
        String conteudo = ctx.CADEIA().getText().replace("\"", "");

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

        escopoAtual.inserir("Instituicao", conteudo);

        return null;
    }

    @Override
    public Void visitPeriodo(CurriculoParser.PeriodoContext ctx)
    {
        String conteudo = ctx.timestamp().getText();

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

        escopoAtual.inserir("Periodo", conteudo);

        return null;
    }

    @Override
    public Void visitDescricao(CurriculoParser.DescricaoContext ctx)
    {
        String conteudo = ctx.CADEIA().getText().replace("\"", "");

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

        escopoAtual.inserir("Descricao", conteudo);

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

            saida.append("<ul>\n");

            TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();

            EntradaTabelaDeSimbolos etds = escopoAtual.verificar("Empresa");
            if(etds!= null)
            {
                saida.append("<li><strong>Empresa:</strong> ").append(etds.valor).append("</li>\n");
            }

            etds = escopoAtual.verificar("Cargo");
            if(etds!= null)
            {
                saida.append("<li><strong>Cargo:</strong> ").append(etds.valor).append("</li>\n");
            }

            etds = escopoAtual.verificar("Periodo");
            if(etds!= null)
            {
                String periodoString = etds.valor.replace("(", "").replace(")", "");
                saida.append("<li><strong>Período:</strong> ").append(periodoString).append("</li>\n");
            }

            etds = escopoAtual.verificar("Descricao");
            if(etds!= null)
            {
                saida.append("<li><strong>Descrição:</strong> ").append(etds.valor).append("</li>\n");
            }
            
            saida.append("</ul>\n");
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
        String conteudo = ctx.CADEIA().getText().replace("\"", "");


        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        escopoAtual.inserir("Empresa", conteudo);

        return null;  
    }

    @Override
    public Void visitCargo(CurriculoParser.CargoContext ctx)
    {
        String conteudo = ctx.CADEIA().getText().replace("\"", "");

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        escopoAtual.inserir("Cargo", conteudo);

        return null;
    }

    @Override
    public Void visitHabilidades(CurriculoParser.HabilidadesContext ctx)
    {
        escopos.criarNovoEscopo();
        saida.append("<ul>\n");
        visitListaHab(ctx.listaHab());
        saida.append("</ul>\n");
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
        String conteudo = ctx.CADEIA().getText().replace("\"", "");

        saida.append("<li>").append(conteudo).append("</li>");

        return null;
    }

    @Override
    public Void visitIdiomas(CurriculoParser.IdiomasContext ctx)
    {
        escopos.criarNovoEscopo();
        saida.append("<ul>\n");
        visitListaIdiomas(ctx.listaIdiomas());
        saida.append("</ul>\n");
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
        String conteudo = ctx.CADEIA().getText().replace("\"", "");

        saida.append("<li>").append(conteudo).append("</li>");

        return null; 
    }
}