public class Engine {
    double maxFuel;
    double currentFuel;
    FuelType fuelType;

    public Engine(FuelType f, double mFuel, double cFuel){
        this.fuelType = f;
        this.maxFuel = mFuel;
        this.currentFuel = cFuel;
        }
    }
//do same below for each file
    public static void main(String [] args){
        Engine newEngine = new Engine(FuelType.STEAM, 100.0, 80.0);
        System.out.println(newEngine.fuelType);
    }
}

