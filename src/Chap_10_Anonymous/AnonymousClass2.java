package Chap_10_Anonymous;

abstract class HomeMadeBurger {
    public abstract void cook();

}

public class AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 소고기 ");
            }
        };
    }
}
