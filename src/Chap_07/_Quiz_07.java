package Chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("=========");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("================");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class HamBurger {
    String name;
    String lettuce = "양상추";
    String patty = "패티";
    String pickle = "피클";

    public HamBurger() {
        this("햄버거");
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> " + lettuce);
        System.out.println("+ " + patty);
        System.out.println("+ " + pickle);
    }
}

class CheeseBurger extends HamBurger {
    String cheese = "치즈";

    public CheeseBurger() {
        super("치즈버거");
    }

    public void cook() {
        this.name = "치즈버거";
        super.cook();
        System.out.println("+ "+cheese);
    }
}

class ShrimpBurger extends HamBurger {
    String shrimp = "새우";

    public ShrimpBurger() {
        super("새우버거");
    }

    public void cook() {
        this.name = "새우버거";
        super.cook();
        System.out.println("+ "+shrimp);
    }
}

