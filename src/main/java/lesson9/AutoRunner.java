package lesson9;


public class AutoRunner {

    public static void main(String[] args) {
        Auto[] automobile = new Auto[7];
        automobile[0] = new Car("Веста");
        automobile[1] = new Car("Гранта");
        automobile[2] = new Car("Логан");
        automobile[3] = new Car("Порше");
        automobile[4] = new Truck("Камаз");
        automobile[5] = new Truck("Белаз");
        automobile[6] = new Truck("Scania");


        for (Auto a : automobile) {
            a.move((int) (Math.random() * 1000) + 1);
            System.out.println("----------------------------------");
        }
    }
}
