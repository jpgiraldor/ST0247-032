
public class PuntoOpcional4
{
    public static void permutacionpto4(String base, String s) {
        if(base.length() == s.length()) {
            System.out.println(base);
        } else {
            for(int i=0; i<s.length(); i++) {
                permutacionpto4(base + s.charAt(i), s);
            }
        }
    }
    
     public static void main(String [] args) {
        permutacionpto4("", "abc");
    }
}
