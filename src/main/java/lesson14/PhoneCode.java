package lesson14;

import java.util.Random;

public enum PhoneCode {
    CODE1(903),
    CODE2(905),
    CODE3(906),
    CODE4(927),
    CODE5(939),
    CODE6(953),
    CODE7(963),
    CODE8(965),
    CODE9(987);
    public int code;

    PhoneCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    public static PhoneCode rndPhoneCode() {
        PhoneCode[] values = PhoneCode.values();
        int length = values.length;
        int rndIndex = new Random().nextInt(length);
        return values[rndIndex];

   }
}




