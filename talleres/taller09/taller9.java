
public class Taller9
{
    public static int distancia(String a, String b) {
        if(a.length() == 0 || b.length() == 0) {
            return Math.abs(a.length() - b.length());
        } 
        
        if (a.charAt(0) == b.charAt(0))
            return 0 + distancia(a.substring(1),b.substring(1));
        else
            return
                Math.min( distancia(a,b.substring(1)),
                   Math.min(
                      distancia(a.substring(1),b),
                      distancia(a.substring(1),b.substring(1))
                    )
            )+1;
        }
    }

