package lesson8.getSet;

public class Animal {
    private String country;
    private String voice;


    public String getCounty() {
        return country;
    }

    public String getVoice() {
        return voice;
    }

    public void setCounty(String county) {
        this.country = county;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void voice() {
        System.out.println(getVoice());
    }

    public void say() {
        System.out.println("Животное из страны " + getCounty() + " говорит " + getVoice());
    }
}
