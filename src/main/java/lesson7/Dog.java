package lesson7;

public class Dog {
    String name;
    int maxRunDist;
    int maxSwimDist;

    public Dog(String name) {
        this.name = name;
    }

    public void run(int runDist) {
        maxRunDist = 500;
        if (runDist < maxRunDist) {
            System.out.println("Собака по кличке " + name + " пробежала " + runDist + " метров.");
        } else {
            System.out.println("Собака по кличке "  + name + " не может пробежать больше 500 метров.");
        }
    }

    public void swim(int swimDist) {
        maxSwimDist = 20;
        if (swimDist < maxSwimDist) {
            System.out.println("Собака по кличке " + name + " проплыла " + swimDist + " метров.");
        } else {
            System.out.println("Собака по кличке " + name + " не может проплыть больше 20 метров.");
        }
    }
}
