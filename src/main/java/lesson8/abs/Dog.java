package lesson8.abs;

public class Dog extends Animal {
    String animalClass = "Собака";

    public Dog(String country, String voice) {
        this.country = country;
        this.voice = voice;
    }

    public void say() {
        System.out.println(animalClass + " из страны " + getCountry() + " говорит " + getVoice());
    }

    public void voice() {
        System.out.println(getVoice());
    }
}
