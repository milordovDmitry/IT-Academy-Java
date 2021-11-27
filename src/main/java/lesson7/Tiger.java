package lesson7;

public class Tiger {
    String name;
    int maxRunDist;
    int maxSwimDist;

    public Tiger(String name) {
        this.name = name;
    }

    public void run(int runDist) {
        maxRunDist = 700;
        if (runDist < maxRunDist) {
            System.out.println("Тигр по кличке " + name + " пробежал " + runDist + " метров.");
        } else {
            System.out.println("Тигр по кличке " + name + " не может пробежать больше 700 метров.");
        }
    }

    public void swim(int swimDist) {
        maxSwimDist = 20;
        if (swimDist < maxSwimDist) {
            System.out.println("Тигр по кличке " + name + " проплыл " + swimDist + " метров.");
        } else {
            System.out.println("Тигр по кличке " + name + " не может проплыть больше 20 метров.");
        }
    }
}
