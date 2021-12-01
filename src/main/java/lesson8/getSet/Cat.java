package lesson8.getSet;

public class Cat extends Animal {

    @Override
    public void say() {
        System.out.println("Кошка из страны " + getCounty() + " говорит " + getVoice());
    }
}









