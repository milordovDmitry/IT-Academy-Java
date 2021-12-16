package lesson11;

public class MoveRunner {
    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[8];

        vehicles[0] = new Car();
        vehicles[1] = new Car();
        vehicles[2] = new Car();
        vehicles[3] = new Car();
        vehicles[4] = new Truck();
        vehicles[5] = new Truck();
        vehicles[6] = new Truck();
        vehicles[7] = new Truck();

        for (Vehicle v : vehicles) {
            v.move();
        }

        System.out.println("----------------------------------");
    }
}

