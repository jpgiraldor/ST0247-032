public class Depot {
    public int nodo,StationType;
    public String name;
    public double x,y;

    /**
     * Constructor for the depot class
     * @param nodo
     * @param name
     * @param x
     * @param y
     * @param StationType
     */
    public Depot(int nodo, String name, double x, double y, int StationType){
        this.nodo = nodo;
        this.name = name;
        this.x = x;
        this.y = y;
        this.StationType = StationType;
    }
}