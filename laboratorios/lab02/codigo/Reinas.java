/**
 * Write a description of class Reinas here.
 *
 * @Juan Felipe Londoño Gaviria && Juan Pablo Giraldo Restrepo
 * @18/08/2018
 * 
 * 
 */
public class Reinas
{
    
  private static int numS;
    
  
  /** Método para comprobar si puedo poner reina.
   * 
   * 
   */
    private static boolean puedoPonerReina(int r, int[] tablero) {
        for(int i = 0; i < r; i++){
           if(tablero[i] == tablero[r])
                return false;
           if(Math.abs(tablero[i] - tablero[r]) == Math.abs(i - r))
                return false;
        }
        return true;
    }
    
    
    /**Método a ejecutar
     * 
     * Es el que imprime el tablero con las reinas ya ubicadas
     */
    public static int nReinas(int n) {
        numS = 0;
        int[] tablero = new int[n];
        return nReinas(0, n, tablero);
    }
    
    
    /**
     * Método privado el cual es el encargado de ubicar las reinas.
     */
    private static int nReinas(int r, int n, int[] tablero) {
        if (r == n){
            //imprimirTablero(tablero);
            numS++;
        }else{
            for(int i = 0; i < n; i++){
                tablero[r] = i;
                if(puedoPonerReina(r, tablero))
                    nReinas(r+1, n, tablero);
            }
        }
        return numS;
    }
    
    
    /** Método para imprimir el tablero
     * 
     */
    public static void imprimirTablero(int[] tablero) {
        int n = tablero.length;
        System.out.print("    ");
        for (int i = 0; i < n; ++i)
            System.out.print(i + " ");
        System.out.println("\n");
        for (int i = 0; i < n; ++i) {
            System.out.print(i + "   ");
            for (int j = 0; j < n; ++j)
                System.out.print((tablero[i] == j ? "Q" : "#") + " ");
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String [] args) {
        long m = System.currentTimeMillis();
        nReinas(17);
        System.out.println(System.currentTimeMillis()-m);    
     
    }
}