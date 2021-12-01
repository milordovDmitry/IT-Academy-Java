package lesson8.getSet;

public class VoiceRunner {
    public static void main(String[] args) {

        Cat rusCat = new Cat();
        rusCat.setCounty("Россия");
        rusCat.setVoice("Мяу");

        Cat japCat = new Cat();
        japCat.setCounty("Япония");
        japCat.setVoice("Nya!");

        Cat engCat = new Cat();
        engCat.setCounty("Англия");
        engCat.setVoice("Meow!");

        Dog rusDog = new Dog();
        rusDog.setCounty("Россия");
        rusDog.setVoice("Гав-гав!");

        Dog japDog = new Dog();
        japDog.setCounty("Япония");
        japDog.setVoice("Kian kian!");

        Dog engDog = new Dog();
        engDog.setCounty("Англия");
        engDog.setVoice("Woof woof!");

        Animal[] animals = new Animal[]{rusCat, japCat, engCat, rusDog, japDog, engDog};

        for (Animal a : animals) {
            a.voice();
            a.say();
            System.out.println("----------------------------------");
        }
    }
}
