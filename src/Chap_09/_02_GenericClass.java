package Chap_09;

import Chap_09.coffee.*;
import Chap_09.user.User;
import Chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber coffeeByNumber = new CoffeeByNumber(33);

        coffeeByNumber.ready();

        CoffeeByNickname coffeeByNickname = new CoffeeByNickname("짱구");

        coffeeByNickname.ready();

        CoffeeByName coffeeByName = new CoffeeByName(34);

        coffeeByName.ready();

        CoffeeByName coffeeByName2 = new CoffeeByName("뚱이");

        coffeeByName2.ready();

        System.out.println("=============");

        int c3Name = (int) coffeeByName.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) coffeeByName2.name;
        System.out.println("주문 고객 이름 : "+c4Name);

//        c4Name = (String) coffeeByName.name;

        System.out.println("=============");

        Coffee<Integer> integerCoffee = new Coffee<>(34);
        integerCoffee.ready();

        int c5Name = integerCoffee.name;
        System.out.println("주문 고객 번호 : "+ c5Name);

        Coffee<String> stringCoffee = new Coffee<>("스펀지밥");
        stringCoffee.ready();

        System.out.println("=============");
        CoffeeByUser<User> coffeeByUser7 = new CoffeeByUser<>(new User("흰둥이"));
        coffeeByUser7.ready();

        CoffeeByUser<User> coffeeByUser8 = new CoffeeByUser<>(new VIPUser("이준영"));
        coffeeByUser8.ready();

        System.out.println("=============");
        orderCoffee("키에우안","비엔나");
        orderCoffee(33, "라떼");


    }

    public static <T,V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee+" 준비 완료 : "+ name);
    }


}
