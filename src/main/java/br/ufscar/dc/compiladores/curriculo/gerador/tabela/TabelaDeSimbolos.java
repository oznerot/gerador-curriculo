package br.ufscar.dc.compiladores.curriculo.gerador.tabela;

import java.util.HashMap;

public class TabelaDeSimbolos
{
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;

    public TabelaDeSimbolos()
    {
        tabelaDeSimbolos = new HashMap<>();
    }

    public void inserir(String chave, String valor)
    {
        EntradaTabelaDeSimbolos entrada = new EntradaTabelaDeSimbolos();
        entrada.chave = chave;
        entrada.valor = valor;
        tabelaDeSimbolos.put(chave, entrada);
    }

    public EntradaTabelaDeSimbolos verificar(String chave)
    {
        return tabelaDeSimbolos.get(chave);
    }
}