package Chap_12;

import Chap_12.clean.Room;

public class _05_Syncronization {
    public static void main(String[] args) {
        Room room = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(" 직원1 청소 시작 ");
                for (int i = 1; i <= 5; i ++) {
                    room.clean("직원1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(" 직원1 청소 끝 ");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println(" 직원2 청소 시작 ");
            for (int i = 1; i <= 5; i ++) {
                room.clean("직원2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println(" 직원2 청소 끝 ");
        };

        Thread thread1 = new Thread(cleaner1);
        Thread thread2 = new Thread(cleaner2);

        thread1.start();
        thread2.start();
    }
}
