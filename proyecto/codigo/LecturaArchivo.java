import java.util.Scanner;
import java.io.*;

public class LecturaArchivo {
    int n;
    int m;
    // number of unvisited clients
    int u;
    int breaks;
    double r;
    double speed;
    double Tmax;
    double Smax;
    double St_customer;
    double Q;

    public void readFile(String Filename) {
        try {
            File file = new File("C:\\Users\\Felipe Londoño G\\Desktop\\DataSets/dummy.txt *ACTUALIZAR*");
            Scanner sc = new Scanner(file);


            String ln = sc.nextLine();
            this.n = Integer.valueOf(ln.split(" ")[2]);
            String lm = sc.nextLine();
            this.m = Integer.valueOf(lm.split(" ")[2]);
            String lu = sc.nextLine();
            this.u = Integer.valueOf(ln.split(" ")[2]);
            String lbreaks = sc.nextLine();
            this.breaks = Integer.valueOf(lbreaks.split(" ")[2]);
            String lr = sc.nextLine();
            this.r = Float.valueOf(lr.split(" ")[2]);
            String lspeed = sc.nextLine();
            this.speed = Float.valueOf(lspeed.split(" ")[2]);
            String lTmax = sc.nextLine();
            this.Tmax = Float.valueOf(lTmax.split(" ")[2]);
            String lSmax = sc.nextLine();
            this.Smax = Float.valueOf(lSmax.split(" ")[2]);
            String lst_customer = sc.nextLine();
            this.St_customer = Float.valueOf(lst_customer.split(" ")[2]);
            String lQ = sc.nextLine();
            this.Q = Float.valueOf(lQ.split(" ")[2]);

            /*System.out.println("N = " + n + " m = " + m + " u = " + u + " breaks= " + breaks + " r= " + r + " speed= " + speed + " Tmax= " + Tmax + " Smax= " + Smax + " st_customer= " + St_customer + " Q= " + Q);*/


            String nLine = sc.nextLine();

            while (!nLine.equals("")) {

                String[] values = nLine.split(" ");
                int id = Integer.valueOf(values[0]);
                String name = values[1];
                double posX = Double.valueOf(values[2]);
                double posY = Double.valueOf(values[3]);
                String nType = values[4];
                int sType = Integer.valueOf(values[5]);

                nLine = sc.nextLine();
                /*System.out.println(id);
                System.out.println(name);
                System.out.println(posX);
                System.out.println(posY);
                System.out.println(nType);
                System.out.println(sType);
                System.out.println();
                */
                switch (nType) {
                    case "d":
                        new Depot(id, name, posX, posY, 0);
                        break;
                    case "c":
                        new Node(id, name, posX, posY);
                        break;
                    case "s":
                        new Station(id, name, posX, posY, sType);
                        break;
                }

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
