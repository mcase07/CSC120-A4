import java.util.ArrayList;

public class Car {
       
    // this is an array for passengers
    ArrayList<Passenger> passengers;
    int maxCapacity;

    public Car(int maxCapacity){
        // attributes
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<Passenger>(maxCapacity);
    }
    // returns maximum capacity user passed in 
    public int getCapacity(){
        return this.maxCapacity;
    }
    // maximum capacity - current number of passengers
    public int seatsRemaining(){
        return this.getCapacity() - this.passengers.size();
    }
    public Boolean addPassenger(Passenger p){
        if (this.seatsRemaining() > 0){
            this.passengers.add(p);
            return true;
        }
        return false;
    }
    public Boolean removePassenger(Passenger p){
        if (this.passengers.contains(p)){
            this.passengers.remove(p);
            return true;
        }
        return false;
    }
    public String printManifest(){
        for (int i = 0; i < this.passengers.size(); i++){
            System.out.println(i);
        }
        return "This car is EMPTY.";

    }
    public static void main(String[] args) {
        Car myCar = new Car(3);
        System.out.println(myCar.printManifest());
    }

}