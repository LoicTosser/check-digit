package com.osslot.checkdigit;


public class CheckDigit {


    public static int checkDigit(String number) {
        int sumDigits = sumDigits(Integer.parseInt(number));
        return sumDigits < 10 ? sumDigits : checkDigit(Integer.toString(sumDigits));
    }


    public static int sumDigits(int i) {
        int iModulus10 = i % 10;
        int dividedBy10 = i / 10;
        return i == 0 ? 0 : iModulus10 + sumDigits(dividedBy10);
    }

}
