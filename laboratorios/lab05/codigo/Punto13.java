
/**
 * Punto 1.3 del laboratorio 5 de EDA2
 * 
 * Juan Felipe Londoño Gaviria - Juan Pablo Giraldo Restrepo 
 * 
 */
public class Punto13
{
     public static int LCS(String a, String b){

        int [][] table = new int [a.length()+1][b.length()+1];

        for(int i = 1 ; i<=a.length(); i++){
            for(int j = 1; j<= b.length(); j++){
                if(a.charAt(i-1) == b.charAt(j-1))
                table[i][j] = table [i-1][j-1]+1;
                else table [i][j]= Math.max(table[i][j-1],table[i-1][j]);

            }
        }
    return table[a.length()][b.length()];
    }
}
