package homeTasc02;

/**
 * Created by Персикс on 13.02.2015.
 */
public class section {
    public static void main(String[] args) {
        int a= (int)(Math.random()*150+1)+5;
        if(a<=25||a>=100){
            System.out.println("Число "+a+" не содержится в интервале (25,100)");
        }
        else {
            System.out.println("Число "+a+" содержится в интервале (25,100)");
        }

    }
}
