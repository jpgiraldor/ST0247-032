
/**
 * Punto 1.1 del laboratorio 5 de EDA2
 * 
 * Juan Felipe Londoño Gaviria - Juan Pablo Giraldo Restrepo 
 * 
 */
public class Punto11
{
    //Algoritmo que determina la distancia de Levenshtein dadas dos cadenas de Strings, dando la cantidad minima de pasos
    //para pasar de una a otra (Insertar, Remover y Cambiar letra)
    public static int Levenshtein(String a, String b) {
        if(a.length() == 0 || b.length() == 0) {
            return Math.abs(a.length() - b.length());
        } 
        
        if (a.charAt(0) == b.charAt(0))
            return 0 + Levenshtein(a.substring(1),b.substring(1));
        else
            return
                Math.min(Levenshtein(a,b.substring(1)),
                   Math.min(
                      Levenshtein(a.substring(1),b),
                      Levenshtein(a.substring(1),b.substring(1))
                    )
            )+1;
        }
        
}

