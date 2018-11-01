import java.util.*;

public class Vehicle {
    public int id;
    public ArrayList<Node> Route = new ArrayList<Node>();
    public double batCapacity;
    public int CurLoc;
    public double time;
    public boolean Closed;

    /**
     * Constructor for the class vehicle
     * @param id
     * @param batCapacity
     */
    public Vehicle(int id, double batCapacity){
        this.id = id;
        this.CurLoc = 0;                    //Vehicle starts in depot
        this.batCapacity = batCapacity;     //total battery level at the beginning
        this.time = time;
    }

    /**
     * New nodes are created
     * @param Customer
     */
    public void addCustomer(Node Customer){
        Route.add(Customer);
        this.CurLoc = Customer.nodo;

    }
}
