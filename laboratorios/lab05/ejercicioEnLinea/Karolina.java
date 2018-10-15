import java.util.ArrayList;
import java.util.Scanner;


public class Karolina {
/*
Main class to read from a file
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int esc = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < esc; j++) {
            String tam = sc.nextLine();

            String[] kk = sc.nextLine().split(" ");
            int[] k = new int[2];
            k[0] = Integer.parseInt(kk[0]);
            k[1] = Integer.parseInt(kk[1]);

            int n = Integer.parseInt(sc.nextLine());
            ArrayList<int[]> d = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String b[] = sc.nextLine().split(" ");
                int bb[] = new int[2];
                bb[0] = Integer.parseInt(b[0]);
                bb[1] = Integer.parseInt(b[1]);
                d.add(bb);
            }
            System.out.println(wastes(d, k));
        }

    }
    /*
    Here is where the shortest path is found
     */
    //taken from github alejocano22
    public static String wastes(ArrayList<int[]> d, int[] k) {

        boolean vis[] = new boolean[d.size()];
        int[] ini = new int[2];
        ini[0] = k[0];
        ini[1] = k[1];
        int res = 0;

        do {
            double min = Double.MAX_VALUE;
            int min2 = 0;
            for (int i = 0; i < d.size(); i++) {
                if (!vis[i]) {
                    int a = (int) Math.pow(ini[0] - d.get(i)[0], 2);
                    int b = (int) Math.pow(ini[1] - d.get(i)[1], 2);
                    double dis = Math.sqrt(a + b);
                    if (dis < min) {
                        min = dis;
                        min2 = i;
                    }
                }
            }
            vis[min2] = true;
            res += Math.abs(ini[0] - d.get(min2)[0]) + Math.abs(ini[1] - d.get(min2)[1]);
            ini[0] = d.get(min2)[0];
            ini[1] = d.get(min2)[1];
        } while (!todos(vis));
        res += Math.abs(k[0] - ini[0]) + Math.abs(k[1] - ini[1]);

        return "The shortest path picking up all the wastes is: " + res;

    }
    /*
    Here we check if there is a possible way to pick up all the waste
     */
    public static boolean todos(boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) {
                return false;
            }
        }
        return true;
    }

}
