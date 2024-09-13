# Gerador de Curriculo

## Integrante do grupo ##
- Ana Luisa Conrado Ferreira de Oliveira
- Vitor Enzo Araujo Costa

O projeto é um gerador HTML de currículo simples baseado em um gramática desenvolvida na disciplina de Construção de Compiladores.  
A gramática consiste em um campo global onde suas informações pessoais como nome, email e cidade declaradas e uma lista de campos dentre
Experiencia Profissional, Educação, Habilidades e Idiomas.
Cada campo possui seus subcampos, sendo os de Educação: Curso, Instituto, Periodo e Descrição, por exemplo.

## Compilar 

``` mvn clean compile ``` ``` mvn generate-sources ``` ``` mvn package ```

## Rodar

``` java -jar [PATH_PROJETO]/curriculo-gerador/target/curriculo-gerador-1.0-SNAPSHOT-jar-with-dependencies.jar [PATH_ENTRADA] [PATH_SAIDA_HTML]```
