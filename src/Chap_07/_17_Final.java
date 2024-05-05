package Chap_07;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class
        // public (final) void


        // public > abstract > static > final

        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();


    }
}
