package Thread;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;


public class fixedThreadPool {
    private static void fixedThreadPool(int size) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(size);
//        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            ThreadPoolTaskExecutor x=new ThreadPoolTaskExecutor();


            Future<Integer> task = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println("执行线程" + Thread.currentThread().getName());
                    return 1;
                }
            });
            System.out.println("第"+i+"次计算,结果:"+task.get());
        }
}}

