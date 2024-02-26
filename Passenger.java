public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
        // would like to be able to add names to list passengers from Cars class
        // passengers.add(name);
    }
    public Boolean boardCar(Car c) {
        // if there are seats remaining (calling to Car class)
        if (c.addPassenger(null) == true){
            c.addPassenger(this);
            return true;
        }
        return false;
    }
    public Boolean getOffCar(Car c) {
        // if this passenger is on the car (calling to Car class)
        if (c.removePassenger(null) == true){
            c.removePassenger(this);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Car myCar = new Car(3);
        Passenger p = new Passenger("Pria");
        Passenger p2 = new Passenger("Pria2");
        System.out.println(p.boardCar(myCar));
        System.out.println(p2.boardCar(myCar));
        System.out.println(myCar.passengers);
        // System.out.println(p.getOffCar(myCar));
        // System.out.println(myCar.passengers);

    }
}
