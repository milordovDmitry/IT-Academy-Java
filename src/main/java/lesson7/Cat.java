package lesson7;

    public class Cat {
        String name;
        int maxRunDist;

        public Cat(String name) {
            this.name = name;
        }

        public void run(int runDist) {
            maxRunDist = 50;
            if (runDist < maxRunDist) {
                System.out.println("Кошка по кличке " + name + " пробежала " + runDist + " метров.");
            } else {
                System.out.println("Кошка по кличке " + name + " не может пробежать больше 50 метров.");
            }
        }

        public void swim(int swimDist) {
            System.out.println("Кошка по кличке " + name + " не умеет плавать.");
        }
    }



