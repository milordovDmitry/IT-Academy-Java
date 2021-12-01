package lesson8.absract;

public class VoiceRunner {
    public static void main(String[] args) {
        Animal[] animals = new Animal[7];
        animals[0] = new Cat("Россия", "Мяу!");
        animals[1] = new Cat("Япония", "Nya!");
        animals[2] = new Cat("Англия", "Meow!");
        animals[3] = new Cat("Дания", "Miav!");
        animals[4] = new Dog("Россия", "Гав-гав!");
        animals[5] = new Dog("Англия", "Woof woof!");
        animals[6] = new Dog("Япония", "Kian kian!");

        for (Animal a : animals) {
            a.voice();
            a.say();
            System.out.println("----------------------------------");
        }
    }
}
