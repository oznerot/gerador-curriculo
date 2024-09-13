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

## Exemplo de arquivo de entrada

NOME: "Maria Oliveira"
EMAIL: "maria.oliveira@example.com"
CIDADE: "São Paulo"
ESTADO: "SP"
ENDERECO: "Avenida das Americas, 456"
TELEFONE: "(11) 98765-4321"
LINKEDIN: "mariaoliveira"
GITHUB: "mariaoliveira"

EDUCACAO: 
- Curso: "Engenharia de Computação"
  Instituicao: "Universidade Federal de São Carlos"
  Periodo: (Jan/12 - Dez/16)
  Descricao: "Curso de Engenharia de Computação com ênfase em sistemas embarcados."
- Curso: "Mestrado em Ciência da Computação"
  Instituicao: "Universidade de São Paulo"
  Periodo: (Mar/17 - Fev/19)
  Descricao: "Mestrado com foco em inteligência artificial e aprendizado de máquina."

EXPERIENCIA:
- Empresa: "Tech Solutions Ltda"
  Cargo: "Desenvolvedor de Software"
  Periodo: (Jan/17 - Dez/19)
  Descricao: "Desenvolvimento de software para sistemas corporativos."
- Empresa: "InovaTech"
  Cargo: "Engenheira de Dados"
  Periodo: (Jan/20 - Abr/20)
  Descricao: "Responsável pela análise e manipulação de grandes volumes de dados."

HABILIDADES:
- "Java"
- "Python"
- "SQL"
- "Machine Learning"

IDIOMAS:
- "Português"
- "Inglês"
- "Espanhol"
