package jan03;

import java.io.File;
import java.io.Serializable;

class MyThread  implements Runnable {


    @Override
    public void run() {

        for(int i=0;i<5;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }

    }
}

public class ThreadUsingRunnableInterface {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        Thread th1 = new Thread(t1);

        th1.start();

    }
}
