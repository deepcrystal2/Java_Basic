package Chap_11_TryCatch;

public class Catch {
    public static void main(String[] args) {
        try {
//            System.out.println(3 / 0);
//            int[] arr = new int[3];
////            arr[5] = 100;
//            Object obj = "test";
//            System.out.println((int) obj);

            String s = null;
            System.out.println(s.toLowerCase());


        } catch (ArithmeticException e) {
            System.out.println("뭔가 잘못 계산 하셨네요?");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스를 잘못 설정했어요.");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형 변환입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요.");
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
