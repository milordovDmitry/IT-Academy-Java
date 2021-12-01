package lesson8.abs;

public abstract class Animal {
    protected String country;
    protected String voice;

    protected abstract void say();

    protected abstract void voice();

    protected String getCountry() {
        return country;
    }

    protected String getVoice() {
        return voice;
    }
}

