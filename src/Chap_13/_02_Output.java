package Chap_13;

public class _02_Output {
    public static void main(String[] args) {

        System.out.println("========정수=========");
        System.out.printf("%d%n",1);
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234);       // __1234 (6자리의 공간을 확보하고 1234 출력)
        System.out.printf("%06d%n",1234);       // 001234 (6자리 확보 후 1234 출력하는데 빈공간은 0으로 채움)
        System.out.printf("%6d%n", -1234);      // _-1234
        System.out.printf("%+6d%n",1234);       // _+1234
        System.out.printf("%,12d%n", 1000000000);   // __1,000,000,000 (세자리마다 콤마로 구분)
        System.out.printf("%-6d%n",1234);       // 1234__ (6자리의 공간을 확보하고 왼쪽 정렬 1234 출력)

        System.out.println("========실수==========");
        System.out.printf("%f%n", Math.PI);         // 3.141593
        System.out.printf("%.2f%n", Math.PI);       // 3.14
        System.out.printf("%6.2f%n", Math.PI);      //__3.14 (6자리 공간 확보하고 소수점 둘째자리)
        System.out.printf("%-6.2f%n", Math.PI);     // 3.14__
        System.out.printf("%06.2f%n",Math.PI);      // 003.14
        System.out.printf("%+6.2f%n", Math.PI);     //__+3.14 (항상 + 기호 표시)

        System.out.println("========문자열==========");
        System.out.printf("%s%n","Java");
        System.out.printf("%6s%n","Java");
        System.out.printf("%-6s%n","Java");
        System.out.printf("%6.2s%n", "Java");       // ____Ja
        System.out.printf("%-6.2s%n","Java");       // Ja____

        System.out.println("========응용==========");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 "+90+ " "+80+" "+85.0);
        System.out.println("서태웅 "+100+ " "+100+" "+100.0);
        System.out.println("채치수 "+95+ " "+100+" "+97.5);

        System.out.println("========응용2==========");
        System.out.println("이름      영어   수학   평균"); // 공백 각각 6,3,3 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("========참고==========");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");

    }
}
