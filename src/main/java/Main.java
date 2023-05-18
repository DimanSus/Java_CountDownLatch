import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        MyThread myThread = new MyThread(countDownLatch);
        try {
            countDownLatch.await();
        } catch (InterruptedException e){
            System.out.println(e);
        }

        myThread.method();
    }
}
