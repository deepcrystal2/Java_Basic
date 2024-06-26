package Chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("(알수없음)");
        list.add("김종국");
        list.add("(알수없음)");
        list.add("강호동");
        list.add("(알수없음)");
        list.add("박명수");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("==============");

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println("==============");

        iterator = list.iterator();   // 위치 초기화
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=============");

        iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("(알수없음)")) {
                iterator.remove();  // 삭제
            }
        }

        iterator = list.iterator();   // 위치 초기화
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=============");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");

        Iterator<String> iterator1 = set.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator() // 제공되지 않음

        Iterator<String> iteratorMap = map.keySet().iterator();

        while (iteratorMap.hasNext()) {
            System.out.println(iteratorMap.next());
        }
        System.out.println();

        Iterator<Integer> iteratorValue = map.values().iterator();

        while (iteratorValue.hasNext()) {
            System.out.println(iteratorValue.next());
        }
        System.out.println();

        Iterator<Map.Entry<String, Integer>> iteratorMap2 = map.entrySet().iterator();

        while (iteratorMap2.hasNext()) {
            System.out.println(iteratorMap2.next());
        }

    }
}
