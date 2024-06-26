package Chap_11_TryCatch;

public class TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러, 예외)
        //int i = "문자열";
//        int[] arr = new int[3];
//        arr[5] = 100;

        try {
//            System.out.println(3/0);
            int[] arr = new int[3];
//            arr[5] = 100;
            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

    }
}

