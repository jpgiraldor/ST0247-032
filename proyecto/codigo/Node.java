public class Node{
    public int nodo;
    public String name;
    public double x;
    public double y;
    public boolean isVisited;

    /**
     * Constructor for the class node
     * @param nodo
     * @param name
     * @param x
     * @param y
     * @param isVisited
     */
    public Node(int nodo, String name, double x, double y, boolean isVisited) {
        this.nodo = nodo;
        this.name = name;
        this.x = x;
        this.y = y;
        this.isVisited = isVisited;
    }


    //===============================below are setters and getters
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public int getNodo(){
        return nodo;
    }

    public String getName() {
        return name;
    }

    public boolean getIsVisited(){
        return isVisited;
    }



    //---------------------------------------------Below are setters

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setNodo(int nodo){
        this.nodo = nodo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsVisited(boolean visited) {
        isVisited = isVisited;
    }
}