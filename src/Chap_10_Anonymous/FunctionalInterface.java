package Chap_10_Anonymous;

import Chap_10_Anonymous.converter.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter krwConverter = new KRWConverter();
        // krwConverter.convert(140);

        convertUSD((USD)->System.out.println(USD + "달러 =" + (USD * 1400) + "원"),1);

        Convertible convertible = (USD)->System.out.println(USD + "달러 =" + (USD * 1400) + "원");
        convertUSD(convertible,1);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParameter c1 = () -> System.out.println("1 달러 = 1400원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 " + (USD * KRW) + " 원");
        };

        c1.convert();

        // 전달값이 2개인 경우
        ConvertibleWithTwo c2 = (USD, KRW) -> {
            System.out.println(USD + " 달러 " + (USD * KRW) + " 원");
        };
        c2.convert(10,1400);

        // 반환값이 있는 경우?
        ConvertibleWithReturn c3 = (USD,KRW) -> {
            return USD * KRW;
        };
        int result = c3.convert(20, 1400);

        System.out.println("20달러 ="+result+"원");


    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
