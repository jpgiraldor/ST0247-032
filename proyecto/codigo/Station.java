public class Station{
    public int nodo,StationType;          //Station identifier // 0 = Rápido, 1= Medio, 2= Lento
    public double L,G;                   // Tiempo de carga en horas para cada tipo de estación y para cada punto de soporte //  Nivel de la batería en watts/hora para cada tipo de estación y para cada punto de soporte
    public double x,y;
    public String name;

    /**
     * Constructor for the class station
     * @param nodo
     * @param name
     * @param x
     * @param y
     * @param StationType
     */
    public Station (int nodo, String name, double x, double y, int StationType) {
        this.nodo = nodo;
        this.name = name;
        this.x = x;
        this.y = y;
        this.StationType = StationType;

    }

    /**
     * L getter
     * @return
     */
    public double getL() {
        return L;
    }

    /**
     * G getter
     * @return
     */
    //Obtener G
    public double getG() {
        return G;
    }

    /**
     * L setter
     * @param l
     */
    public void setL(double l) {
        L = l;
    }

    /**
     * G setter
     * @param g
     */
    public void setG(double g) {
        G = g;
    }

    /**
     * Stationtype getter
     * @return
     */
    public int getStationType() {
        return StationType;
    }

    /**
     * stationtype setter
     * @param stype
     */
    public void setStationType(int stype){
        this.StationType = stype;
    }
}