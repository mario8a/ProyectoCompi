%{
int yystopparser=0;
%}

%token VOID MAIN NOMBRECAMPO ENTERO DECIMAL BOLEANDO CADENA NUM_ENTERO NUM_DECIMAL NUM_BOLEANO NUM_CADENA SUMA RESTA MULTIPLICACION DIVISION AUMENTAR DISMINUIR ASIGNADOR MAYOR MENOR IGUAL MAYORIGUAL MENORIGUAL NOIGUAL SI NO SINO PARA MIENTRAS

%start programa

%%

programa		: principal funciones | principal;

principal		: VOID MAIN '(' VOID ')' '{' lineasCodigos '}';

lineasCodigos		: lineaCodigo |;

lineaCodigo		: lineaCodigo linea | linea;

linea			: invocarMetodo ';' | crearVariable ';' | cambiarValor ';' | bucleCondicion;

invocarMetodo		: NOMBRECAMPO '(' parametrosEnvio ')';

parametrosEnvio		: parEnvio |;

parEnvio		: parEnvio ',' pEnvio | pEnvio;

pEnvio			: valor | NOMBRECAMPO;

valor			: ENTERO | DECIMAL | BOLEANDO | CADENA;

crearVariable		: tipoDato NOMBRECAMPO | tipoDato NOMBRECAMPO asignarValor;

tipoDato		: NUM_ENTERO | NUM_DECIMAL | NUM_BOLEANO | NUM_CADENA;

asignarValor		: ASIGNADOR operAsignacion | ASIGNADOR valor | ASIGNADOR NOMBRECAMPO;

operAsignacion		: aritmetico | invocarMetodo | increDismiVariable;

aritmetico		: oprComun | oprComun oprComplemento;

oprComun		: valor tipoOpr valor | valor tipoOpr NOMBRECAMPO | NOMBRECAMPO tipoOpr valor | NOMBRECAMPO tipoOpr NOMBRECAMPO;

tipoOpr 		: SUMA | RESTA | MULTIPLICACION | DIVISION;

oprComplemento		: oprComplemento oprCom | oprCom;

oprCom			: tipoOpr valor | tipoOpr NOMBRECAMPO;

increDismiVariable	: NOMBRECAMPO indis;

indis			: AUMENTAR | DISMINUIR;

cambiarValor		: NOMBRECAMPO ASIGNADOR cambValor;

cambValor		: valor | operAsignacion | NOMBRECAMPO;

bucleCondicion		: condicionIf | bucleFor | bucleWhile;

condicionIf		: condicionSi | condicionSi condicionNo | condicionSi condicionesSino condicionNo;

condicionSi		: SI '(' condicion ')' '[' lineasCodigos ']';

condicion		: valor condicional valor | valor condicional NOMBRECAMPO | NOMBRECAMPO condicional valor | NOMBRECAMPO condicional NOMBRECAMPO;

condicional		: MAYOR | MENOR | IGUAL | MAYORIGUAL | MENORIGUAL | NOIGUAL;

condicionNo		: NO '[' lineasCodigos ']';

condicionesSino		: condicionesSino condicionSino | condicionSino;

condicionSino		: SINO '(' condicion ')' '[' lineasCodigos ']';

bucleFor		: PARA '(' iniciaFor ';' condicion ';' increDismiVariable ')' '[' lineasCodigos ']';

iniciaFor		: tipoDato NOMBRECAMPO asignarValor;

bucleWhile		: MIENTRAS '(' condicion ')' '[' lineasCodigos ']';

funciones		: funciones funcion | funcion;

funcion			: tipoRetorno NOMBRECAMPO '(' parametroSin ')' '{' lineasCodigos '}';

tipoRetorno 		: tipoDato | VOID;

parametroSin		: parametros |;

parametros		: parametros ',' parametro | parametro;

parametro		: tipoDato NOMBRECAMPO;
