public class Greedy {
    public static int[] bodeguita(int n, int []denominaciones){
        int[] dev = new int[denominaciones.length];
        for(int i = 0; i < denominaciones.length; i++){
            if(n-denominaciones[i] >= 0){
                n = n-denominaciones[i];
                dev[i]+=1;
                i=-1;
            }
        }
        for(int i=0;i<dev.length;i++) System.out.println(dev[i]);
        return dev;
    }

    public static void main(String[] args) {
        int[] hoo = {5,2,1};

        bodeguita(10,hoo);
    }
}
