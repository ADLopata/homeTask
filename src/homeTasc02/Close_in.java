package homeTasc02;

import java.util.Scanner;

/**
 * Created by Персикс on 12.02.2015.
 */
public class Close_in {
    public static void main(String[] args) {
       double difference01;
        double difference02;
        double first;
        double second;
        int  comparable= 10;

        Scanner scn = new Scanner(System.in);
         System.out.println("Введите первое сравниваемое число:");
        first= scn.nextDouble();
        System.out.println("Введите второе сравниваемое число:");
        second= scn.nextDouble();

           difference01= Math.abs(first-comparable);
           difference02 = Math.abs(second-comparable);
        if (difference01>difference02){
            System.out.println(second+ " Ближе к 10");
        }
        else {
            System.out.println(first+ " Ближе к 10");
        }


    }
}
