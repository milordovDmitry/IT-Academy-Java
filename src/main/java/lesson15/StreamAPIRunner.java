package lesson15;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIRunner {
    public static void main(String[] args) {


        splitAndCalculate("Lorem Ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at " +
                " " +
                "blandit blandit " +
                "faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit " +
                "tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula " +
                "mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio " +
                "nec mi tempor dignissim blandit.");

        splitAndCalculate("Семь раз отмерь, 1 раз отрежь!");

        String str = inputText();
        splitAndCalculate(str);

    }

    static void splitAndCalculate(String s) {
        Map<String, Integer> map1 = Stream.of(s.split("[^A-Za-zА-Яа-я0-9]+"))
                .map(String::toLowerCase)
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        map1.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .forEach((a) -> System.out.println(a.getKey()));
        System.out.println("-----------------------------------");
    }

    static Scanner in = new Scanner(System.in);

    static String inputText() {
        System.out.println("Введите текст:");
       return  in.nextLine();
    }

}
