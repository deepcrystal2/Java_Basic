package Chap_10;

import Chap_10.converter.Convertable;
import Chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(2);

//        convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원"), 1);
        Convertable convertable = (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원");
        convertUSD(convertable, 1);
    }

    public static void convertUSD(Convertable converter, int USD) {
        converter.convert(USD);
    }

}
