package Chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //set (중복 허용하지 않음)
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : "+set.size());

        // 순회
        for (String s : set) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("===========================");

        //  확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("=======================");


        // 삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매전) : " + set.size());

        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매후) : " + set.size());

        for (String s : set) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("=======================");


        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품수 :"+set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("=======================");

        // 세트 : 중복 허용 x, 순서 보장 x
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i);
        }
    }
}
