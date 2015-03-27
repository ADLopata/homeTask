package ClassWorc07;

import java.util.concurrent.TimeUnit;

/**
 * Created by Персикс on 24.03.2015.
 */
public class Consumer implements Runnable {

    private Storege stor;
     public Consumer(Storege s){
        stor=s;
         new Thread(this).start();
     }


    @Override
    public void run() {
        while (true){
        try {
            TimeUnit.SECONDS.sleep(1);
            stor.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}
