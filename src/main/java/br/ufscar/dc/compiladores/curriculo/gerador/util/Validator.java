package br.ufscar.dc.compiladores.curriculo.gerador.util;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.Map;

public class Validator
{
    private static final Map<String, Integer> mesMap = new HashMap<>();

    static
    {
        mesMap.put("Jan", 1);
        mesMap.put("Fev", 2);
        mesMap.put("Mar", 3);
        mesMap.put("Abr", 4);
        mesMap.put("Mai", 5);
        mesMap.put("Jun", 6);
        mesMap.put("Jul", 7);
        mesMap.put("Ago", 8);
        mesMap.put("Set", 9);
        mesMap.put("Out", 10);
        mesMap.put("Nov", 11);
        mesMap.put("Dez", 12);
    }

    public static boolean isValidNome(String nome)
    {
        String regex = "^([a-zA-Z\u0080-\u024F]+(?:\\. |-| |'))*[a-zA-Z\u0080-\u024F]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nome);

        return matcher.matches();
    }
    public static boolean isValidEmail(String email)
    {
        String regex = "^([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static boolean isValidCidade(String cidade)
    {
        String regex = "^([a-zA-Z\u0080-\u024F]+(?:\\. |-| |'))*[a-zA-Z\u0080-\u024F]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cidade);

        return matcher.matches();
    }

    public static boolean isValidEstado(String estado)
    {
        String regex = "^([a-zA-Z\u0080-\u024F]+(?:\\. |-| |'))*[a-zA-Z\u0080-\u024F]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(estado);

        return matcher.matches();
    }

    public static boolean isValidEndereco(String endereco)
    {
        String regex = "^([a-zA-Z0-9 ]+, *[0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(endereco);

        return matcher.matches();
    }

    public static boolean isValidTelefone(String telefone)
    {
        String regex = "^(\\([0-9]{2}\\) ?[0-9]{4,5}-?[0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        return matcher.matches();
    }

    public static boolean isValidLinkedin(String linkedin)
    {
        String regex = "^([a-zA-Z0-9]{3,100})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(linkedin);

        return matcher.matches();
    }

    public static boolean isValidGithub(String github)
    {
        String regex = "^([a-zA-Z0-9]{3,100})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(github);

        return matcher.matches();
    }

    public static boolean isValidPeriodo(String dataInicio, String dataFinal)
    {
        String[] inicio = dataInicio.split("/");
        String[] fim = dataFinal.split("/");

        String mesInicio = inicio[0];
        int anoInicio = Integer.parseInt(inicio[1]);

        String mesFim = fim[0];
        int anoFim = Integer.parseInt(fim[1]);

        if(anoFim < anoInicio)
        {
            return false;
        }

        else if(anoFim == anoInicio)
        {
            return mesMap.get(mesFim) >= mesMap.get(mesInicio);
        }

        return true;
    }
}