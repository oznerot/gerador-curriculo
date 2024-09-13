package br.ufscar.dc.compiladores.curriculo.gerador.util;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class ErrorList
{
    public static List<String> errosSemanticos = new ArrayList<String>();

    public static void adicionarErroSemantico(Token t, String mensagem)
    {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Erro %d:%d - %s", linha, coluna, mensagem));
    }
}