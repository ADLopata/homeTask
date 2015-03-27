package ClassWorc07;

import java.util.concurrent.TimeUnit;

/**
 * Created by Персикс on 24.03.2015.
 */
public class Producer implements Runnable {
   private Storege stor;

    public Producer(Storege s){
        stor=s;
        new  Thread(this).start();
    }

    @Override
    public void run() {
        int i=0;
        try {
            while (true){
                TimeUnit.SECONDS.sleep(1);
                stor.put(i++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
