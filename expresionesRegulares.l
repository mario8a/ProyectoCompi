%{
#include <stdio.h>
#include <conio.h>
#include "C:\Users\BRANDON EL MAESTRO\Desktop\Compilador Brandon 2\AnaLexicos.h";
%}


%option noyywrap
%option yylineno

ignora " "|\t|\n
caracter [A-Za-z]
digito [0-9]
boleano "true"|"false"

%%

{ignora}*				{;}
"."					{return ('.');}
"{"					{return ('{');}
"}"					{return ('}');}
";"					{return (';');}
","					{return (',');}
")"					{return (')');}
"("					{return ('(');}
"["					{return ('[');}
"]"					{return (']');}
"if"					{return SI;}
"elseif"				{return SINO;}
"else"					{return NO;}
"for"					{return PARA;}
"while"					{return MIENTRAS;}
"void"					{return VOID;}
"main"					{return MAIN;}
"int"					{return NUM_ENTERO;}
"decimal"				{return NUM_DECIMAL;}
"boolean"				{return NUM_BOLEANO;}
"string"				{return NUM_CADENA;}
"+"					{return SUMA;}
"-"					{return RESTA;}
"*"					{return MULTIPLICACION;}
"/"					{return DIVISION;}
"++"					{return AUMENTAR;}
"--"					{return DISMINUIR;}
"="					{return ASIGNADOR;}
">"					{return MAYOR;}
"<"					{return MENOR;}
"=="					{return IGUAL;}
">="					{return MAYORIGUAL;}
"<="					{return MENORIGUAL;}
"!="					{return NOIGUAL;}
{digito}+				{return ENTERO;}
{digito}+"."{digito}			{return DECIMAL;}
{boleano}				{return BOLEANDO;}
"\""({digito}|{caracter}|" ")*"\""	{return CADENA;}
{caracter}({caracter}|(digito))*	{return NOMBRECAMPO;}
.					{printf("Error en linea: %d\n",yylineno);}


%%

yyerror(char * msg)
{
printf("%s\n",msg);
}

int main(void)
{
char NombreArchivo[50];
printf("Ruta del archivo: ");
gets(NombreArchivo);
yyin=fopen(NombreArchivo,"rt");
if(yyin==NULL)
printf("\nNo se puede leer el archivo");
else
yyparse();
fclose(yyin);
getch();
}
