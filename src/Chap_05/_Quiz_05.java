package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizes = new int[10];

        for (int i = 0; i < sizes.length ; i++) {
            sizes[i] = 250 + (5*i);
        }

        for (int i = 0; i < sizes.length; i++) {
            System.out.println("사이즈 "+sizes[i]+" (재고 있음)");
        }

        System.out.println("====================");

        for (int stock: sizes) {
            System.out.println("사이즈 " + stock + " (재고 있음)");

        }

    }
}
