package Chap_11_Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Streams {
    public static void main(String[] args) {

//      스트림 생성
        // Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);


        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");

        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 : filter, map, sorted, distict, skip,...
        // 최종 연산 : count, min, max, sum, forEach, anyMatch, allMatch...

        // 90 점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("==================");

        // 90점 이상인 사람의 수
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);


        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("==================");

        // 90점 이상인 점수들 정렬
        Arrays.stream(scores).filter(x->x>=90).sorted().forEach(System.out::println);
        System.out.println("==================");

//        "python", "java", "javascript", "c", "c++", "c#"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x->x.startsWith("c")).forEach(System.out::println);
        System.out.println("==================");

        // java라는 글자를 포함하는 프로그래밍 언어
        Arrays.stream(langs).filter(x->x.contains("java")).forEach(System.out::println);
        System.out.println("==================");

        // 글자 길이가 4이하인 프로그래밍 언어 (정렬)
        Arrays.stream(langs).filter(x -> x.length() <= 4).forEach(System.out::println);

        System.out.println("==================");
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);


        System.out.println("==================");
        // 글자 길이가 4이하인 프로그래밍 언어 중 c 포함
        langList.stream().filter(x->x.length()<=4).filter(x->x.contains("c")).forEach(System.out::println);

        System.out.println("==================");
        // 4글자 이하의 언어 중 c 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("==================");

        boolean allMatch = langList.stream().filter(x -> x.length() <= 3).allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("==================");

        // 4글자 이하의 언어중 c 글자 포함아는 언어 뒤 (어려워요) 글자를 함께 출력
        // map

        langList.stream().filter(x -> x.length() <= 4).filter(x->x.contains("c")).map(x-> x+" (어려워요)").forEach(System.out::println);
        System.out.println("==================");

        // 4글자 이하의 언어중 c 글자 포함아는 언어 대문자 출력
        langList.stream().filter(x->x.length()<=4).filter(x->x.contains("c")).map(x->x.toUpperCase()).forEach(System.out::println);

        //c 글자 포함아는 언어 대문자 출력하여 리스트 저장
        List<String> langListStartWithC = langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).map(x -> x.toUpperCase()).collect(Collectors.toList());

        System.out.println(langListStartWithC);

        langListStartWithC.stream().forEach(System.out::println);


    }
}
