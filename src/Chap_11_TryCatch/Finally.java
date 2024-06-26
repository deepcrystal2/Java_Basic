package Chap_11_TryCatch;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
//            System.out.println("택시에 탑승한다");
        } catch (Exception e) {
            System.out.println("!! 문제발생 : "+e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }

        // try + catch
        // try + catch + finally
        // try + finally

        System.out.println("===========");

        try {
            System.out.println(3/0);
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
