import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase en la cual se implementan los metodos del Taller de Clase #3
 * 
 * @author Mauricio Toro, Mateo Agudelo
 */
public class Taller3 {
	
	

	
	private static int nReinas(int n, int col, int[][] tablero) {
		int i, j;

	
		for (i = 0; i < col; i++)
			if (tablero[row][i] == 1)
				return false;

		
		for (i=row, j=col; i>=0 && j>=0; i--, j--)
			if (tablero[i][j] == 1)
				return false;


		for (i=row, j=col; j>=0 && i<N; i++, j--)
			if (tablero[i][j] == 1)
				return false;

		return true;
	}

	
	boolean solveNQUtil(int tablero[][], int col)
	{
		
		if (col >= n)
			return true;

		
		for (int i = 0; i < n; i++)
		{
			
			if (isSafe(tablero, i, col))
			{
				
				tablero[i][col] = 1;

				
				if (solveNQUtil(tablero, col + 1) == true)
					return true;

				
				tablero[i][col] = 0; // BACKTRACK
			}
		}

		
		return false;
	}
	
	public static void imprimirTablero(int[] tablero) {
		int n = tablero.length;
		System.out.print("    ");
		for (int i = 0; i < n; ++i)
			System.out.print(i + " ");
		System.out.println("\n");
		for (int i = 0; i < n; ++i) {
			System.out.print(i + "   ");
			for (int j = 0; j < n; ++j)
				System.out.print((tablero[i] == j ? "Q" : "#") + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static ArrayList<Integer> camino(Digraph g, int inicio, int fin) {
		// complete...
	}

	// recomendacion
	private static boolean dfs(Digraph g, int nodo, int objetivo, boolean[] visitados, ArrayList<Integer> list) {
		// complete...
	}

}