package lesson8.abs;

public class Cat extends Animal {
    String animalClass = "Кошка";

    public Cat(String country, String voice) {
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
