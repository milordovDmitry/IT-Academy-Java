package lesson7;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик");
        Bobik.run(100);
        Bobik.run(600);
        Bobik.swim(5);
        Bobik.swim(20);

        System.out.println("-----------------------------");

        Cat Barsik = new Cat("Барсик");
        Barsik.run(20);
        Barsik.run(70);
        Barsik.swim(20);

        System.out.println("-----------------------------");

        Tiger Tigra = new Tiger("Тигра");
        Tigra.run(300);
        Tigra.run(1000);
        Tigra.swim(10);
        Tigra.swim(30);

    }



}
