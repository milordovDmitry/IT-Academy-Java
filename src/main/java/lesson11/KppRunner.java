package lesson11;

public class KppRunner {
    public static void main(String[] args) {

        double weightLimit = 8;
        double widthLimit = 2.5;
        double heightLimit = 4;

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
            v.kpp(weightLimit, widthLimit, heightLimit);
        }
        System.out.println("----------------------------------");
    }
}

