package Chap_09.coffee;

public class CoffeeByNickname {
    public String nickname; // Integer, Double

    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : "+nickname);
    }
}
