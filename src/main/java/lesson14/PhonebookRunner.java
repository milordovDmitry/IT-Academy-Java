package lesson14;

import lesson13.Name;
import lesson13.Surname;
import java.util.*;

import static lesson14.PhoneCode.*;
import static lesson14.Subscriber.*;


public class PhonebookRunner {

    public static Collection<Long> setOfNumbers = new HashSet<>(); // для хранения номеров
    static Random rnd = new Random();


    public static void main(String[] args) {

        // создаем список из 1000 шт. случайных абонентов и замеряем время

        long start = System.currentTimeMillis();
        List<Subscriber> subscriberList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            subscriberList.add(genRndSubscriber());
        }
        System.out.println("Затраченное время на создание списка (LIST): " + (System.currentTimeMillis() - start));

        // создаем массив из 1000 шт. случайных абонентов и замеряем время
        start = System.currentTimeMillis();
        Subscriber[] subscriberArray = new Subscriber[1000];
        for(Subscriber s : subscriberArray) {
            s.genRndSubscriber();
        }
        System.out.println("Затраченное время на создание массива (Array): " + (System.currentTimeMillis() - start));

        // заполняем для абонентов список контактов linkedSubscribers в количестве 100 шт.
        for (Subscriber subscriber : subscriberList) {
            for (int i = 0; i < 100; i++) {
                Subscriber rndSubscriber = subscriberList.get(rnd.nextInt(subscriberList.size()));
                subscriber.getLinkedSubscribers().add(rndSubscriber);
            }
        }
        //System.out.println(subscriberList.size());

//        subscriberList.forEach(System.out::println);
//
//        System.out.println(setOfNumbers.size());
//
//        setOfNumbers.forEach(System.out::println);
    }

    // случайная фамилия/имя
    public static String rndFio() {
        return rndName() + " " + rndSurname();
    }

    // случайное имя из перечисления
    public static Name rndName() {
        Name[] values = Name.values();
        int length = values.length;
        int rndIndex = new Random().nextInt(length);
        return values[rndIndex];
    }

    // случайная фамилия из перечисления
    public static Surname rndSurname() {
        Surname[] values = Surname.values();
        int length = values.length;
        int rndIndex = new Random().nextInt(length);
        return values[rndIndex];
    }

    // генерация случайного номера телефона вида 8XXXYYYYYYY (X - префикс оператора, Y - счлучайный номер) и
    // добавление его в список setOfNumbers. Если номер был сгененриован ранее, то метод вызывет
    // сам себя для избежания повторов.
    public static long genRndPhoneNmbr() {
        long newNumber = Long.parseLong(String.valueOf(8) + rndPhoneCode().getCode() + rndNmbr());

        newNumber = (setOfNumbers.contains(newNumber)) ? genRndPhoneNmbr() :
               newNumber;
        setOfNumbers.add(newNumber);
        return newNumber;
    }
// генерация случайного номера из 7 цифр от 0 до 9
    public static long rndNmbr() {
        long rndNmbr =
                Long.parseLong(String.valueOf(rndFigure()) + rndFigure() + rndFigure() + rndFigure() + rndFigure() +
                        rndFigure() + rndFigure());
        return rndNmbr;
    }

// генерация случайной цифры от 0 до 10
    static int rndFigure() {
        return rnd.nextInt(10);
    }
}
