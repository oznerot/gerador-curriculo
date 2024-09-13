package br.ufscar.dc.compiladores.curriculo.gerador;

import java.io.PrintWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.curriculo.gerador.listener.ErrorListener;
import br.ufscar.dc.compiladores.curriculo.gerador.visitor.GeradorHTML;
import br.ufscar.dc.compiladores.curriculo.gerador.visitor.Validation;
import br.ufscar.dc.compiladores.curriculo.gerador.CurriculoParser.CurriculoContext;
import br.ufscar.dc.compiladores.curriculo.gerador.util.ErrorList;

public class Principal
{
    public static void main(String args[]) throws IOException
    {

        CharStream cs = CharStreams.fromFileName(args[0]);
        CurriculoLexer lexer = new CurriculoLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CurriculoParser parser = new CurriculoParser(tokens);
        ErrorListener errLis = new ErrorListener();

        parser.removeErrorListeners();

        parser.addErrorListener(errLis);

        CurriculoContext arvore = parser.curriculo();

        Validation validator = new Validation();

        validator.visitCurriculo(arvore);

        for(String erro : ErrorList.errosSemanticos)
        {
            System.out.println(erro);
        }

        if(ErrorList.errosSemanticos.isEmpty())
        {
            GeradorHTML gerador = new GeradorHTML();

            gerador.visitCurriculo(arvore);

            try(PrintWriter pw = new PrintWriter(args[1]))
            {
                pw.print(gerador.saida.toString());
            }
        }
        System.out.println("Fim da compilacao");       
    }
}
