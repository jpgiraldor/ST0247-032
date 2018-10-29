public class Depot extends Station {

    public Depot(int id, String name, double posX, double posY, int sType){
        super(id, name, posX, posY, sType);
        this.idNode = id;
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }
}
