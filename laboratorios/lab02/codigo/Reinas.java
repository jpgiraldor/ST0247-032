import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


import static java.util.Arrays.fill;

/**
 * This method is used for adding queens to the chess table
 */
public class Reinas {
    public static int prueba(int mat [][],int queens){
        int size = mat.length;
        int pos = 0;
        int soluciones = 0;
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                if(esValido(mat, size) && mat[i][j]!=2){//2 significa cuando es un asterisco
                    mat[i][j]=1;
                    pos++;
                }
                if(pos==queens){
                    soluciones++;
                    for (int[] row : mat){
                        Arrays.fill(row, 0);
                    }
                break;
                }
                
            }


        }
        return soluciones;
    }

    public static boolean esValido(int mat[][], int size){
        int sum = 0;
        for(int i = 0;i < size;i++){
            for(int j = 0; j < size; j++){
                if(mat[i][j]==1){
                   sum++;
                }
            }
            if(sum > 1)return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
