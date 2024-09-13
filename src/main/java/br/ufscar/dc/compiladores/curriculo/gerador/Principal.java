package br.ufscar.dc.compiladores.curriculo.gerador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.curriculo.gerador.listener.ErrorListener;
import br.ufscar.dc.compiladores.curriculo.gerador.visitor.Validation;
import br.ufscar.dc.compiladores.curriculo.gerador.CurriculoParser.CurriculoContext;

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

        System.out.println("Fim da compilacao");       
    }
}
