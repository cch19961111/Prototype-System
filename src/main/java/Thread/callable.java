package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class callable implements Callable {
    @Override
    public Object call() throws Exception {
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callable cal=new callable();
        FutureTask fk=new FutureTask(cal);
        new Thread(fk,"c1").start();
        System.out.println(fk.get());

    }
}
