import java.util.*;

public class Organize{
    int numVehicles;
    int numCustomers;
    Vehicle vehicles[];
    double cost;
    double batteryCapacity;

    /**
     * Constructor method also all the vehicles are stored in an array
     * @param numCustomers
     * @param numVehicles
     */
    public  Organize(int numCustomers,int numVehicles){
        this.numVehicles = numVehicles;
        this.numCustomers = numCustomers;
        this.cost = 0;
        vehicles = new Vehicle[numVehicles];
        //vehiclesBestSolution = new Vehicle[numVehicles];
        for (int i = 0; i < numVehicles ; i++){
            vehicles[i] = new Vehicle(i+1,batteryCapacity);

        }
    }

    /**
     * A method in order to find the distance between two nodes
     * @param actual
     * @param next
     * @return
     */
    public double distance(Node actual, Node next) {
        double dis;
        dis = Math.sqrt(Math.pow(actual.getX(),2) - Math.pow(next.getX(),2) + Math.pow(actual.getY(),2) - Math.pow(next.getY(),2));
        System.out.println(dis);
        return dis;
    }

    /**
     * A formula is done to see the amount of time and battery spent
     * @param dis
     * @param speed
     * @param C_Rate
     * @return
     */
    public double [] formula(double dis, double speed, double C_Rate){
        double []ans = new double[2];
        double time = dis/speed;
        double B_consumed = dis/C_Rate;

        ans[0] = time;
        ans[1] = B_consumed;
        return ans;
    }

    /**
     * Where the majority of the algorithm is supposed to go
     * @param nodes
     * @param costMatrix
     */
    public void Greedy(Node nodes[], double[][]costMatrix){

      double CandCost,EndCost;
      int VehIndex = 0;

      while(unvisitedNode(nodes)){
        int custIndex = 0;
        Node Candidate = null;
        double minCost = (float)Double.MAX_VALUE;

        if (vehicles[VehIndex].Route.isEmpty()){
            vehicles[VehIndex].addCustomer(nodes[0]);
        }

        for (int i = 0; i < numCustomers; i++){
            if (nodes[i].isVisited == false){
                CandCost = costMatrix[vehicles[VehIndex].CurLoc][i];
                if (minCost > CandCost){
                    minCost = CandCost;
                    custIndex = i;
                    Candidate = nodes[i];
                }
            }
        }

        if (Candidate == null){
            if(VehIndex+1 < vehicles.length){       //The route is ended
                if(vehicles[VehIndex].CurLoc != 0){
                    EndCost = costMatrix[vehicles[VehIndex].CurLoc][0];
                    vehicles[VehIndex].addCustomer(nodes[0]);
                    this.cost += EndCost;
                }
                VehIndex = VehIndex + 1;
            }

        }
        else{
            vehicles[VehIndex].addCustomer(Candidate);
            nodes[custIndex].isVisited = true;
            this.cost += minCost;

        }
    }
    EndCost = costMatrix[vehicles[VehIndex].CurLoc][0];
    vehicles[VehIndex].addCustomer(nodes[0]);
    this.cost = EndCost;
    }

    public boolean unvisitedNode(Node nodes[]){
        for (int i = 0; i < nodes.length ; i++){
            if(!nodes[i].isVisited){
                return true;
            }
        }
        return false;
    }

    /**
     * The main method where a lot of things are done like the creation of random nodes in order to test the algorithm
     * @param args
     */
    public static void main(String[] args) {
        Random ran = new Random(151190);

        //Problem Parameters
        int NoOfCustomers = 35;
        int NoOfVehicles = 10;
        int VehicleCap = 50;

        Organize s = new Organize(NoOfCustomers, NoOfVehicles);
        //Depot Coordinates
        int Depot_x = 50;
        int Depot_y = 50;

        Node[] Nodes = new Node[NoOfCustomers + 1];
        Node depot = new Node(0,"hola",Depot_x, Depot_y,false);

        Nodes[0] = depot;
        for (int i = 1; i <= NoOfCustomers; i++) {
            String hola = i+"p";
            Nodes[i] = new Node(i, //Id ) is reserved for depot
                    hola,
                    ran.nextInt(100), //Random Cordinates
                    ran.nextInt(100),
                    false
            );
        }
        double[][] distanceMatrix = new double[NoOfCustomers + 1][NoOfCustomers + 1];
        double Delta_x, Delta_y;

        for (int i = 0; i <= NoOfCustomers; i++) {
            for (int j = i + 1; j <= NoOfCustomers; j++) //The table is summetric to the first diagonal
            {                                      //Use this to compute distances in O(n/2)

                //Delta_x = (Nodes[i].x - Nodes[j].x);
                //Delta_y = (Nodes[i].y - Nodes[j].y);

                double distance = s.distance(Nodes[i],Nodes[j]);
                        //  Math.sqrt((Delta_x * Delta_x) + (Delta_y * Delta_y));

                distance = Math.round(distance);                //Distance is Casted in Integer
                //distance = Math.round(distance*100.0)/100.0; //Distance in double

                distanceMatrix[i][j] = distance;
                distanceMatrix[j][i] = distance;
            }
        }
        int printMatrix = 0; //If we want to print diastance matrix

        if (printMatrix == 1){
            for (int i = 0; i <= NoOfCustomers; i++) {
                for (int j = 0; j <= NoOfCustomers; j++) {
                    System.out.print(distanceMatrix[i][j] + "  ");
                }
                System.out.println();
            }
        }

        //Compute the greedy Solution
        System.out.println("Attempting to resolve Vehicle Routing Problem (VRP) for "+NoOfCustomers+
                " Customers and "+NoOfVehicles+" Vehicles"+" with "+VehicleCap + " units of capacity\n");



        s.Greedy(Nodes, distanceMatrix);

    }
}
