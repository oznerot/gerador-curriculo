grammar Curriculo;

PALAVRA_CHAVE
    : 'NOME' | 'EMAIL' | 'CIDADE' | 'ESTADO' | 'ENDERECO' | 'TELEFONE' | 'LINKEDIN' | 'GITHUB' | ':'  | '(' | ')' | 'EDUCACAO' | '-'
    | 'Curso' | 'Instituicao' | 'Periodo' | 'Descricao' | 'EXPERIENCIA' | 'Empresa' | 'Cargo' | 'HABILIDADES' | 'IDIOMAS';

CADEIA: '"' ~('\n' | '"')* '"';

MESANO: MES '/' ANO;

fragment MES: 'Jan' | 'Fev' | 'Mar' | 'Abr' | 'Mai' | 'Jun' | 'Jul' | 'Ago' | 'Set' | 'Out' | 'Nov' | 'Dez';
fragment ANO: [0-9][0-9];

//Tokens ignorados
IGNORADO: (WS | TAB | QUEBRA_LINHA | COMENTARIO) -> skip;
fragment WS: ' ';
fragment TAB: '\t';
fragment QUEBRA_LINHA: '\n';
COMENTARIO: '{' ~('\n'|'}')* '}';

//Tokens de Erros
ERRO_CADEIA: '"' ~('\n'|'"')* '\n';
ERRO_COMENTARIO: '{' ~('\n'|'}')* '\n';
NAO_RECONHECIDO: .;

curriculo: campo+ camposLista+ EOF;

campo: tipoCampo ':' CADEIA;

tipoCampo: 'NOME' | 'EMAIL' | 'CIDADE' | 'ESTADO' | 'ENDERECO' | 'TELEFONE' | 'LINKEDIN' | 'GITHUB';

camposLista
	: educacao
	| experiencia
	| habilidades
	| idiomas
	;

educacao: 'EDUCACAO' ':' listaEduc;

listaEduc: campoEduc+;

campoEduc: '-' itemEduc+;

itemEduc
	: curso
	| instituicao
    | periodo
    | descricao
    ;

curso: 'Curso' ':' CADEIA;

instituicao: 'Instituicao' ':' CADEIA;

periodo: 'Periodo' ':' timestamp;

descricao: 'Descricao' ':' CADEIA;

timestamp: '(' MESANO '-' MESANO')';

experiencia: 'EXPERIENCIA' ':' listaExp;

listaExp: campoExp+;

campoExp: '-' itemExp+;

itemExp
	: empresa
	| cargo
	| periodo
	| descricao;

empresa: 'Empresa' ':' CADEIA;

cargo: 'Cargo' ':' CADEIA;

habilidades: 'HABILIDADES' ':' listaHab;

listaHab: campoHab+;

campoHab: '-' CADEIA;

idiomas: 'IDIOMAS' ':' listaIdiomas;

listaIdiomas: campoIdioma+;

campoIdioma: '-' CADEIA;
