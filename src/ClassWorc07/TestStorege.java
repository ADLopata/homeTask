package ClassWorc07;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Персикс on 25.03.2015.
 */
public class TestStorege {
    public static void main(String[] args) throws InterruptedException {
        Storege s= new Storege();
        new Producer(s);
        new Consumer(s);
      //  ExecutorService exec= Executors.newCachedThreadPool();
       // exec.execute(new Producer(s));
        //exec.execute(new Consumer(s));


    }
}
