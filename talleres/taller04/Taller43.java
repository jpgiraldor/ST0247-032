import java.util.ArrayList;

public class Taller43 {
    
public static boolean hayCamino(Graph g, int i, int j){
      boolean[] visitados = new boolean[g.size()];
      return hayCamino(g, i, j, visitados);
}

public static boolean unCamino(Graph g, int i, int j, boolean[] v){
      boolean[] visitados = new boolean[g.size()];
      return unCamino(g, i, j, visitados);
}

private static int caminoMasCorto(Graph g,int i, int j, boolean[] v){
  v[i] = true;
  if (i == j) 
    return 0;
  int distanciaDeUnCamino = Integer.MAX_VALUE;
  for (Integer vecino: g.getSuccessors(i)){
     distanciaDeUnCamino = caminoMasCorto(g, vecino, j, v);
     if(!v[vecino] && distanciaDeUnCamino < Integer.MAX_VALUE){
          distanciaDeUnCamino = g.getWeight(i,vecino)+distanciaDeUnCamino;
        }
    }
  return distanciaDeUnCamino;                                        
}
private static int ultimoCamino(Graph g, 
                      int i, int j, boolean[] v){
  v[i] = true;
  if (i == j)
    return 0;
  int distanciaDeUnCamino = Integer.MAX_VALUE;
  for (Integer vecino: g.getSuccessors(i)){
     distanciaDeUnCamino = ultimoCamino(g, vecino, j, v);
     if(!v[vecino] && distanciaDeUnCamino < Integer.MAX_VALUE){
          distanciaDeUnCamino = g.getWeight(i,vecino)+distanciaDeUnCamino;
        }
    }
  return distanciaDeUnCamino;                                        
}

private static int primerCamino(Graph g, 
                      int i, int j, boolean[] v){
  v[i] = true;
  if (i == j)
    return 0;
  for (Integer vecino: g.getSuccessors(i)){
    int distanciaDeUnCamino = primerCamino(g, vecino, j, v);
    if(!v[vecino] && distanciaDeUnCamino  < Integer.MAX_VALUE)
          return g.getWeight(i,vecino)+distanciaDeUnCamino;
  }   
  return Integer.MAX_VALUE;                                        
}

private static int primerCaminoMalo(Graph g, 
                      int i, int j, boolean[] v){
  v[i] = true;
  if (i == j)
    return 0;
  for (Integer vecino: g.getSuccessors(i)){
    if(!v[vecino] && primerCamino(g, vecino, j, v)  < Integer.MAX_VALUE)
          return g.getWeight(i,vecino)+primerCamino(g, vecino, j, v);
  }   
  return Integer.MAX_VALUE;                                        
}



private static boolean hayCamino(Graph g, 
                      int i, int j, boolean[] v){
  v[i] = true;
  if (i == j)
    return true;
  for (Integer vecino: g.getSuccessors(i))
     if(!v[vecino] && hayCamino(g, vecino, j, v))
          return true;
  return false;
}

private static boolean hayCaminoMalo(Graph g, 
                      int i, int j, boolean[] v){
  if (i == j)
    return true;
  // Recursiva
  ArrayList<Integer> vecinos = g.getSuccessors(i);
  for (Integer vecino: vecinos)
    if (vecino == j)
       return true;
  return false;
  
}
}

