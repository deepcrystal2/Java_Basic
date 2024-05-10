package Chap_08;

import Chap_08.camera.FactoryCam;
import Chap_08.detector.AdvancedFireDetector;
import Chap_08.detector.Detectable;
import Chap_08.detector.FireDetector;
import Chap_08.reporter.NormalReporter;
import Chap_08.reporter.VideoReporter;

import java.rmi.NoSuchObjectException;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();


        System.out.println("==================");
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("==================");
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);


        factoryCam.detect();
        factoryCam.report();
    }
}
