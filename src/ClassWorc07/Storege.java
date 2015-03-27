package ClassWorc07;

/**
 * Created by Персикс on 24.03.2015.
 */
public class Storege {
    int i;
   private boolean dataPres=false ;
    synchronized int get() throws InterruptedException {
        while (dataPres==true){
            wait();
        }
        System.out.println("Consumer:"+i);
       // dataPres=false;
        notify();
     return i;
    }

    synchronized void put(int i) throws InterruptedException {

        while (dataPres==true){
            wait();
        }
        this.i=i;
     //   dataPres=false;
        System.out.println("Producer:"+ i);

        notify();
    }
}

