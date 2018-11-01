

public class Station{

   int StationType;          //0 = Rápido, 1= Medio, 2= Lento
    double[] L = {0.51, 1.01, 2.04}; // Tiempo de carga en horas para cada tipo de estación 
    //double G;                 // Nivel de la batería en watts/hora para cada tipo de estación y para cada punto de soporte
    int idNode;
    String name;
    double posX;
    double posY;



    //Constructor Station
    public Station (int id, String name, double X, double Y, int sType) {
        this.idNode = id;
        this.name = name;
        this.posX = X;
        this.posY = Y;
        this.StationType = sType;

}
    //Obtener L
    public double getL() {
        return L;
    }

    //Obtener G
    public double getG() {
        return G;
    }

    //Setear L
    public void setL(double l) {
        L = l;
    }

    //Setear G
    public void setG(double g) {
        G = g;
    }

    public int getStationType() {
        return StationType;
    }

    public void setStationType(int stype){
        this.StationType = stype;
    }
}






