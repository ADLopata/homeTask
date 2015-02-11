package homeTasc02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by Персикс on 11.02.2015.
 */
public class evenORnot {
    public static void main(String[] args) {
        int i ;
        System.out.println("Введите число");
        Scanner scn= new Scanner(System.in);
        i= scn.nextInt();
      /*  System.out.println((i & 1)==0   ?" есть четное"
                                        :" есть не четное");

*/       if((i%2)==0){
            System.out.println(" четное");
            }
        else {
            System.out.println("Не четное");
        }
        }
 }












