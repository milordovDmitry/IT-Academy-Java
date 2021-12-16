package lesson11;

import java.util.Random;

public class MethodsKPP {

    public static String  genCarNumber() {
         return (geтRndLetter() +  getRndNumber() + getRndNumber() + getRndNumber() + geтRndLetter() + geтRndLetter());
    }

    public static String getRndNumber() {
        int rndNumber = ((int) (Math.random() * 10));
      String rndNumberStr = String.valueOf(rndNumber);
        return rndNumberStr;

    }
    public static Letters geтRndLetter() {
        Letters[] values = Letters.values();
        int length = values.length;
        int rndIndex = new Random().nextInt(length);
        return values[rndIndex];

    }

    public static int getRndTruckSpd() {
        int truckSpd = ((int) (Math.random()*80) + 40);
        return truckSpd;
    }
    public static int getRndCarSpd() {
        int carSpd = ((int) (Math.random()*110));
        return carSpd;
    }
}

