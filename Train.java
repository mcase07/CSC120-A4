import java.util.ArrayList;

public class Train {

    ArrayList<Car> cars = new ArrayList<Car>();
    FuelType fuelType;
    double fuelCapacity;
    double currentCapacity;
    int numCars;
    int passengerCapacity;
    Engine newEngine;
    Car newCar;
    String manifest;

    public Train(FuelType f, double fCapacity, double cCapacity, int nCars, int passCapacity){
        this.fuelType = f;
        this.fuelCapacity = fCapacity;
        this.numCars = nCars;
        this.passengerCapacity = passCapacity;

        // initialize Engine and Cars here
        this.newEngine = new Engine(f, fCapacity, cCapacity);
        
        for (int i = 0; i < nCars; i++){
            newCar = new Car(5);
            this.cars.add(newCar);
        }
    } 
    // returns location of engine
    public Engine getEngine(){
        return this.newEngine;   
    }
    // a for loop that finds the maxCapacity of each car and sums
    public int getMaxCapacity(){
        int capacity = 0;
        for (int i = 0; i < this.numCars; i++){
            //i want this to be as an integer ... should already be an integer actually
            // maybe im just not referencing it right?
    
            capacity += this.cars.get(i).getCapacity();
        }
        return capacity;
    }
    public Car getCar(int i){
        return this.cars.get(i);
    }
    // a for loop that finds the seats remaining in each car and sums
    public int seatsRemaining(){
        int seats = 0;
        for (int i = 0; i < this.numCars; i++){
            seats += this.cars.get(i).seatsRemaining();
        }
        return seats;
    }
    // a for loop that compiles the manifests from each car and prints 
    public String printManifest(){
        for (int i = 0; i < this.numCars; i++){
            this.manifest = this.cars.get(i).printManifest();
        }
        return manifest;
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 80.0, 3, 15);
        System.out.println(myTrain.getEngine());
        System.out.println(myTrain.seatsRemaining());
        System.out.println(myTrain.getMaxCapacity());
        System.out.println(myTrain.printManifest());
    }

}
