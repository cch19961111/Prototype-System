package Thread;

public class runnable  implements Runnable{


    @Override
    public void run() {
        System.out.println("实现线程");

    }

    public static void main(String[] args) {
        runnable run=new runnable();
        new Thread(run,"1").start();


    }
}
