package br.ufscar.dc.compiladores.curriculo.gerador;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class ErrorListener extends BaseErrorListener
{
    static boolean onlyOnce = false;

    public ErrorListener() {}

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e)
    {
        Token token = (Token) offendingSymbol;
        String tokenText = token.getText();
        String tokenType = CurriculoLexer.VOCABULARY.getDisplayName(token.getType());

        if(!onlyOnce)
        {
            if(tokenType.equals("NAO_RECONHECIDO"))
            {
                System.out.println("Linha " + line + ": " + tokenText + " - simbolo nao identificado");
                onlyOnce = true;
            }
            else if(tokenType.equals("ERRO_CADEIA"))
            {
                System.out.println("Linha " + line + ": " + tokenText + " - cadeia literal nao fechada");
                onlyOnce = true;
            }
            else if(tokenType.equals("ERRO_COMENTARIO"))
            {
                System.out.println("Linha " + line + ": " + tokenText + " - comentario nao fechado");
            }
            else
            {
                if(tokenText.equals("<EOF>"))
                {
                    tokenText = "EOF";
                }

                System.out.println("Linha " + line + ", erro sintatico proximo a " + tokenText);
            }

        }

    }   
}