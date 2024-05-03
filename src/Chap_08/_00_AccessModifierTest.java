package Chap_08;

import Chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation)
        // 정보은닉 (Information Hiding)

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
//        b1.resolution = "FHD" // default
//        b1.price = 200000 // private
//        b1.getColor() = "블랙"; // protected
    }
}
