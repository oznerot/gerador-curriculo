grammar Curriculo;

PALAVRA_CHAVE
    : 'NOME' | 'EMAIL' | 'CIDADE' | 'ESTADO' | 'ENDERECO' | 'TELEFONE' | 'LINKEDIN' | 'GITHUB' | ':'  | '(' | ')' | 'EDUCACAO' | '-'
    | 'Curso' | 'Instituicao' | 'Periodo' | 'Descricao' | 'EXPERIENCIA' | 'Empresa' | 'Cargo' | 'HABILIDADES' | 'IDIOMAS';

CADEIA: '"' ~('\n' | '"')* '"';

//Tokens ignorados
IGNORADO: (WS | TAB | QUEBRA_LINHA | COMENTARIO) -> skip;
fragment WS: ' ';
fragment TAB: '\t';
fragment QUEBRA_LINHA: '\n';
fragment COMENTARIO: '{ ' ~('\n'|'}')* '}';

//Tokens de Erros
ERRO_CADEIA: '"' ~('\n'|'"')* '\n';
ERRO_COMENTARIO: '{' ~('\n'|'}')* '\n';
NAO_RECONHECIDO: .;

curriculo: campo+ camposLista+ EOF;

campo
	: 'NOME' ':' CADEIA
	| 'EMAIL' ':' CADEIA
    | 'CIDADE' ':' CADEIA
    | 'ESTADO' ':' CADEIA
    | 'ENDERECO' : CADEIA
	| 'TELEFONE' ':' CADEIA
	| 'LINKEDIN' ':' CADEIA
	| 'GITHUB' ':' CADEIA
	;

camposLista
	: educacao
	| experiencia
	| habilidades
	| idiomas
	;

educacao: 'EDUCACAO' ':' listaEduc;

listaEduc: itemEduc*;

itemEduc: '-' curso  instituicao periodo descricao;

curso: 'Curso' ':' CADEIA;

instituicao: 'Instituicao' ':' CADEIA;

periodo: 'Periodo' ':' CADEIA;

descricao: 'Descricao' ':' CADEIA; 

experiencia: 'EXPERIENCIA' ':' listaExp;

listaExp: itemExp*;

itemExp: '-' empresa cargo periodo descricao;

empresa: 'Empresa' ':' CADEIA;

cargo: 'Cargo' ':' CADEIA;

habilidades: 'HABILIDADES' ':' listaHab;

listaHab: itemHab*;

itemHab: '-' CADEIA;

idiomas: 'IDIOMAS' ':' listaIdiomas;

listaIdiomas: itemIdioma*;

itemIdioma: '-' CADEIA;
