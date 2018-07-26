import java.util.ArrayList;
    public class Taller2 {

	public static ArrayList<String> combinations(String s) {
		ArrayList<String> combi = new ArrayList<String>();
	    combinations("", s, combi);
	    return combi;
	}
	// recomendacion
	private static void combinations(String pre, String pos, ArrayList<String> list) {
		 if(pos.length() == 0) {
          list.add(pre);
        }else{
           combinations(pre + pos.charAt(0), pos.substring(1), list);
           combinations(pre, pos.substring(1), list);
        }
	}

	public static ArrayList<String> permutations(String s) {
		ArrayList<String> permu = new ArrayList<String>();
		permutations("", s, permu);
		return permu;
	}

	// recomendacion
	private static void permutations(String pre, String pos, ArrayList<String> list) {
		if(pos.length()==0) {
            list.add(pre);
        } else {
            for(int i=0; i< pos.length(); i++) {
                permutations(pre + pos.charAt(i), pos.substring(0,i)+pos.substring(i+1), list);
            }
        }
	}

	public static void main(String [] args) {
	    ArrayList<String> arreglo = permutations("abcd");
	    for(String s : arreglo)
    	    System.out.println(s + " " +AdvancedEncryptionStandard.desencriptarArchivo(s));
	   
	   }
}
