package lesson10;

import java.util.Scanner;

public class Methods {

    // стартовое меню
    public static void printMenu() {
        while (true) {

            System.out.println("Что будем конвертировать?\nВведите номер:");
            System.out.println("'1' - Деньги" + "\n" + "'2' - Температура" + "\n" + "'3' - Завершить работу " +
                    "программы.");

            int command = inputInt();

            if (command == 1) {
                System.out.println("_______________________");
                System.out.println("Конвертируем деньги");
                convertCurrency();
            } else if (command == 2) {
                System.out.println("_______________________");
                System.out.println("Конвертируем температуру");
                System.out.println("Данная функция появится в следующей версии" + "\n" + "Следите за обновлениями");
                // TODO
            } else if (command == 3) {
                System.out.println("_______________________");
                System.out.println("Завершение работы программы");
                break;
            } else {
                System.out.println("Такой команды еще нет");
                System.out.println("-----------------------");

            }
        }
    }

    // меню конвертации валюты
    public static double convertCurrency() {
        while (true) {
            System.out.println("Выберете валюту, которую вы хотите конертировать" + "\n" + "1. Рубли" + "\n" + "2. " +
                    "Доллары." + "\n" + "3. Евро " + "\n" + "4. Вернуться в меню.");

            int commandCurrency = inputInt();
            if (commandCurrency == 1) {
                System.out.println("Введите сумму в рублях");
                double sumR = inputDouble();
                Rubles rub = new Rubles(sumR);
                System.out.println("Сумма в рублях: " + sumR);
                System.out.println("--------------------------------");

                while (true) {
                    System.out.println("Выберете валюту в которую вы хотите конвертировать");
                    System.out.println("1. Доллары." + "\n" + "2. Евро" + "\n" + "3. Вернуться в меню");
                    int rToAnother = inputInt();
                    if (rToAnother == 1) {
                        System.out.println("--------------------------------");
                        System.out.println("Суммах в рублях: " + sumR + "\n" + "Сумма в долларах: " + rub.convert(rub.sum, CurrencyCourses.RUBTODOL.getCourse()));
                        System.out.println("--------------------------------");
                    } else if (rToAnother == 2) {
                        System.out.println("--------------------------------");
                        System.out.println("Суммах в рублях: " + sumR + "\n" + "Сумма в евро: " + rub.convert(rub.sum
                                , CurrencyCourses.RUBTOEUR.getCourse()));
                        System.out.println("--------------------------------");
                    } else if (rToAnother == 3) {
                        printMenu();

                    } else {
                        System.out.println("--------------------------------");
                        System.out.println("Такой валюты еще нет");
                        System.out.println("--------------------------------");
                    }
                }

            } else if (commandCurrency == 2) {
                System.out.println("Введите сумму в долларах");
                double sumD = inputDouble();
                Dollars dol = new Dollars(sumD);
                System.out.println("Сумма в долларах: " + sumD);
                System.out.println("--------------------------------");

                while (true) {
                    System.out.println("Выберете валюту в которую вы хотите конвертировать");
                    System.out.println("1. Рубли." + "\n" + "2. Евро" + "\n" + "3. Вернуться в меню");
                    int dToAnother = inputInt();
                    if (dToAnother == 1) {
                        System.out.println("--------------------------------");
                        System.out.println("Суммах в долларах: " + sumD + "\n" + "Сумма в рублях: " + dol.convert(dol.sum, CurrencyCourses.DOLTORUB.getCourse()));
                        System.out.println("--------------------------------");
                    } else if (dToAnother == 2) {
                        System.out.println("--------------------------------");
                        System.out.println("Суммах в долларах: " + sumD + "\n" + "Сумма в евро: " + dol.convert(dol.sum
                                , CurrencyCourses.DOLTOEUR.getCourse()));
                        System.out.println("--------------------------------");
                    } else if (dToAnother == 3) {
                        printMenu();

                    } else {
                        System.out.println("--------------------------------");
                        System.out.println("Такой валюты еще нет");
                        System.out.println("--------------------------------");
                    }
                }
            } else if (commandCurrency == 3) {
                System.out.println("Введите сумму в евро");
                double sumE = inputDouble();
                Euro eur = new Euro(sumE);
                System.out.println("Сумма в евро: " + sumE);
                System.out.println("--------------------------------");

                while (true) {
                    System.out.println("Выберете валюту в которую вы хотите конвертировать");
                    System.out.println("1. Доллары." + "\n" + "2. Рубли" + "\n" + "3. Вернуться в меню");
                    int rToAnother = inputInt();
                    if (rToAnother == 1) {
                        System.out.println("--------------------------------");
                        System.out.println("Суммах в евро: " + sumE + "\n" + "Сумма в долларах: " + eur.convert(eur.sum, CurrencyCourses.EURTODOL.getCourse()));
                        System.out.println("--------------------------------");
                    } else if (rToAnother == 2) {
                        System.out.println("--------------------------------");
                        System.out.println("Суммах в евро: " + sumE + "\n" + "Сумма в рублях: " + eur.convert(eur.sum
                                , CurrencyCourses.EURTORUB.getCourse()));
                        System.out.println("--------------------------------");

                    } else if (rToAnother == 3) {
                        printMenu();

                    } else {
                        System.out.println("--------------------------------");
                        System.out.println("Такой валюты еще нет");
                        System.out.println("--------------------------------");
                    }
                }
            } else if (commandCurrency == 4) {
                printMenu();
            } else {
                System.out.println("--------------------------------");
                System.out.println("Такой валюты еще нет");
                System.out.println("--------------------------------");
            }
        }
    }

    // проверка на ввод double
    private static double inputDouble() {
        Scanner inD = new Scanner(System.in);
        while (!inD.hasNextDouble()) {
            System.out.println("--------------------------------");
            System.out.println("Вы ввели не число. Введите число");
            inD.next();
        }
        return inD.nextDouble();
    }

    // проверка на ввод int
    private static int inputInt() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("--------------------------------");
            System.out.println("Вы ввели не число. Введите число");
            in.next();
        }
        return in.nextInt();
    }
}
