public class Rutas {

    public static int horasExtra(int trab, int maxh,int[]mor,int []night){
        int suma = 0;
        //se hace suponiendo que el arrgelo esta ordenando de menor a mayor
        int []cantidadhoras = new int[trab];

        for(int i=0 ; i < trab ; i++){
            cantidadhoras[i] = mor[i];
        }
        for(int i=0 ; i < trab ; i++){
            for(int j = 0 ; j < trab ; j++  ) {
                if (cantidadhoras[i] + night[j] <= maxh){
                    cantidadhoras[i] += night[j];
                    night[j] = 10000000;
                    i++;
                }
                else if(night[j] < 100){
                    cantidadhoras[i] += night[j];
                }
            }
        }
        for(int i=0 ; i < trab ; i++){
            if(cantidadhoras[i] > maxh){
                suma += cantidadhoras[i] - maxh;
            }
        }
        System.out.println(suma);
        return suma;
    }

    public static void main(String[] args) {
        int mor[]={10,10};
        //mor={10,15};
        horasExtra(2,20,mor,mor);
    }
}
