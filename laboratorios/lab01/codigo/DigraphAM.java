import java.util.ArrayList;
public class DigraphAM extends Graph {
    //Grafo con matriz
    int[][] mat;
//
    public DigraphAM(int size) {
        super(size);
        mat = new int[size][size];
        /*
        for(int i=1; i<size; i++){
            mat[i][0] = i;
            mat[0][i] = i;
        }
        */
    }

    public void addArc(int source, int destination, int weight) {
        mat[source][destination] = weight;
    }


    public int getWeight(int source, int destination) {
        return mat[source][destination];
    }

    public ArrayList<Integer> getSuccessors(int vertex) {
        ArrayList<Integer> np = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (mat[vertex][i] != 0) {
                np.add(i);
            }
        }
        return np;
    }

    public void recorrerMatriz(Graph g) {
        int suma = 0;
        int suma1=0;
        int ind=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    if (mat[i][j]!=0){
                    suma ++;
                }
                if (j ==4) {
                    if(suma>suma1){
                    ind=i;
                    suma1=suma;}
                    suma=0;
                    break;

                }

            }
        }
        System.out.println("Este es el nodo con mas vecinos: "+ind+" Esta es la cantidad de vecinos: "+suma1);
    }
}