package Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        String car = "경차"; // 차량 종류
        int hour = 5; // 주차시간
        int fee = hour * 4000; // 총 요금

        // if
        if (car == "장애인" || car == "경차") {
            fee /= 2; // 50% 할인 적용
        }
        if (fee > 30000) {
            fee = 30000;
        }



        System.out.println("주차요금은 " + fee + " 입니다.");


}
}
