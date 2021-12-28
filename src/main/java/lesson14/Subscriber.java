package lesson14;

import java.util.HashSet;
import java.util.Set;

import static lesson14.PhonebookRunner.*;


public class Subscriber {
    private final String fio;
    private final long phoneNumber;
    private final Set<Subscriber> linkedSubscribers = new HashSet<>(); // список контактов

    public String getFio() {
        return fio;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Subscriber(String fio, long phoneNumber) {
        this.fio = fio;
        this.phoneNumber = phoneNumber;
            }

    public Set<Subscriber> getLinkedSubscribers() {
        return linkedSubscribers;

    }
   // public long[]contacts;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Subscriber subscriber = (Subscriber) obj;
        return (fio == subscriber.getFio() && phoneNumber == subscriber.getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "fio='" + fio + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
    // генерация случайного абонента
    public static Subscriber genRndSubscriber() {
        long phoneNumber = genRndPhoneNmbr();
        String fio = rndFio();
        return new Subscriber(fio, phoneNumber);
    }
}

