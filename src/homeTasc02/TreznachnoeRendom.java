package homeTasc02;

import java.util.Random;
import java.util.Scanner;

public class TreznachnoeRendom {
    public static void main(String[] args) {
        int first;
        int second;
        int therd;
        Random r= new Random();
        int n ;
        System.out.println("Введите трезначное число");
        Scanner scn = new Scanner(System.in);
        n=scn.nextInt();
        n=(int)r.nextInt(999)+100;
         first=n%10;
        second=(n/10)%10;
        therd=(n/100)%10;
        if(first>= second&first>therd||first> second&first>=therd){
            System.out.println("В числе "+n+" наибольшая цифра " +first);
        }
        else {
            if (second>first&second>=therd) {
                System.out.println("В числе "+n+" наибольшая цифра " +second);
            }
            else {
                System.out.println("В числе "+n+" наибольшая цифра " +therd);
            }
        }
    }
}
