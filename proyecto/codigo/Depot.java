public class Depot {

    int StationType;          //0 = Rápido, 1= Medio, 2= Lento
    int idNode;
    String name;
    double posX;
    double posY;



    //Constructor Station
    public Depot (int id, String name, double X, double Y, int sType) {
        this.idNode = id;
        this.name = name;
        this.posX = X;
        this.posY = Y;
        this.StationType = sType;
    }
}
