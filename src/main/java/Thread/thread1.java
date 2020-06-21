package Thread;
import java.util.concurrent.locks.Lock;

public class thread1  extends Thread{
    @Override
    public void run() {
        System.out.println("运行");
    }

    public static void main(String[] args) {
        new thread1().start();

    }
}
