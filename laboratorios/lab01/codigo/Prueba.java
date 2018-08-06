import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

public class Prueba {

    public void Lab1() throws Exception {

        DigraphAL graph = new DigraphAL(310154);
        int num=0;
        int x=0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        File file =
                new File("C:\\Users\\jpgir\\Documents\\Eafit\\Semestre 3\\Estructura datos y algoritmos 2\\medellin_colombia-grande.txt");
        Scanner sc = new Scanner(file);

        for(int i=1;i<310154;i++) {
            num=sc.nextInt();
            if (num >= 100) {
            hmap.put(num,num);
            }


            if (sc.next() == "Arcos.") {
                x=i;
                break;
            }
        }
        for(int i=x;i<700000;i++){
            int next = sc.nextInt();
            hmap.get(sc.nextInt());
            graph.addArc(next,sc.nextInt(),sc.nextInt());


            }
        }
    public static void Main(String[]args){
        Prueba p=new Prueba();
        Lab1 rf=new Lab1();
        rf();
    }

}





