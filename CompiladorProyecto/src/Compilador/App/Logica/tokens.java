package Compilador.App.Logica;




public class tokens {
    public static String yytname[] = 
    {
 "$end", "error", "$undefined", "VOID", "MAIN", "NOMBRECAMPO", "ENTERO",
  "DECIMAL", "BOLEANDO", "CADENA", "NUM_ENTERO", "NUM_DECIMAL",
  "NUM_BOLEANO", "NUM_CADENA", "SUMA", "RESTA", "MULTIPLICACION",
  "DIVISION", "AUMENTAR", "DISMINUIR", "ASIGNADOR", "MAYOR", "MENOR",
  "IGUAL", "MAYORIGUAL", "MENORIGUAL", "NOIGUAL", "SI", "NO", "SINO",
  "PARA", "MIENTRAS", "'('", "')'", "'{'", "'}'", "';'", "','", "'['",
  "']'"   
    };
    
    public static int yytoknum[]=        
    { 0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,    40,    41,   123,   125,    59,    44,    91,    93
    };
    
}
