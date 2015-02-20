package homeTask03.Loop.Recursion;

import java.util.Scanner;

/**
 * Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент
 * последовательности Фибоначчи
 * для вычисления пятнадцатого элемента.
 */
public class Fibonachi {
   static   int a=0;
    public static void main(String[] args) {

        int in =0;
        System.out.print("enter the number: " );
        Scanner scn= new Scanner(System.in);
        in=scn.nextInt();
        System.out.print(" elements of the Fibonacci numbers: " );
        Fib(in);

        System.out.println( " \n number of repetitions of 4 elements: "+a);

    }

    public static int Fib(int n){
   if(n==4){
       a=a+1;// сситает кол- повторений элементов 4
   }
     System.out.print("  " + n);//выводит элементы нашего дерева на экран
            if (n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return Fib(n-2)+Fib(n-1);


    }

}
