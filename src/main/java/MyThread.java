import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread{
    CountDownLatch cdl;
    int [] numbers= new int[5];

    public MyThread(CountDownLatch cdl) {
        this.cdl = cdl;
        new Thread(this).start();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numbers[i]= scanner.nextInt();
            cdl.countDown();
        }
        scanner.close();

    }

    public void method () {
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]+i);
        }
    }
}
