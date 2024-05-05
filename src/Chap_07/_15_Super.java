package Chap_07;

import Chap_07.camera.FactoryCam;
import Chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
