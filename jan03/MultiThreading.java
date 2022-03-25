package jan03;

class T extends Thread{

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

public class MultiThreading {

    // multi threading

    // thread  // mini process

    // thread // 3 / 4 thread

    // By extending a thread class

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());   // main thread
        System.out.println(Thread.currentThread().getPriority());

        for(int i=1;i<=5;i++){
            System.out.println("Hello");
        }

        T t = new T();
        T t2 = new T();
        T t3 = new T();

        t.start();
        t2.start();
        t3.start();
    }

}
