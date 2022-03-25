package jan03;

public class ThreadEasyMethod {

    public static void main(String[] args) {


        new Thread(() -> {

            for(int i=0;i<5;i++){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }

        }).start();

        new Thread(() -> {

            for(int i=0;i<5;i++){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }

        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}
