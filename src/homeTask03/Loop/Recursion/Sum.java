package homeTask03.Loop.Recursion;

import java.util.Scanner;

/**
 * •	Написать метод, который для данного числа n
 * (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
 */
public class Sum {
    public static void main(String[] args) {
        Scanner  scn= new Scanner(System.in);
      int  n= scn.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n){

        if (n>1){
            return n + sum(n -1);
        }return n;



    }

}
