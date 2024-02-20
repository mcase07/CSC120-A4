public class Engine {
    double maxFuel;
    double currentFuel;
    FuelType fuelType;

    public Engine(FuelType f, double mFuel, double cFuel){
        this.fuelType = f;
        this.maxFuel = mFuel;
        this.currentFuel = cFuel;
        }
        
    public void refuel(){
        this.currentFuel = this.maxFuel;
    }
    public Boolean go(){
        this.currentFuel = currentFuel - 10;
        System.out.println(currentFuel);
        return this.currentFuel > 0;
    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}

