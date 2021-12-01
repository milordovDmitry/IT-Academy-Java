package lesson8.getSet;

public class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("Собака из страны " + getCounty() + " говорит " + getVoice());
    }
}
