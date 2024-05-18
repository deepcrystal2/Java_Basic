package Chap_09;

import Chap_09.coffee.*;
import Chap_09.user.User;
import Chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("Cola");
        c2.ready();

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("코카콜라");
        c4.ready();

        int c3Name=(int)c3.name;
        System.out.println("주문 고객 번호 : "+c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 번호 : "+c4Name);

//        c4Name = (String) c3.name;

        System.out.println("=================");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name=c5.name;
        System.out.println("주문 고객번호 : "+c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name=c6.name;
        System.out.println("주문 고객번호 : "+c6Name);

        System.out.println("===============");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();



    }
}
