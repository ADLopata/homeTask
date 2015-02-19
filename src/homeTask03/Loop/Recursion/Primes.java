package homeTask03.Loop.Recursion;

import java.util.Scanner;

/**•	Создайте код, который выводит все простые
 *  числа из интервала от 2 до n (заданного с клавиатуры).
 *  Результат должен быть: 2,3,5,7 ...
 */
public class Primes {
    public static void main(String[] args) {
        System.out.println("Type the numbers");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        interval(n);
        System.out.print("  " + n);
    }


    public static int interval(int n) {
        if (n > 2) {
            n = n - 1;
            interval(n);
            System.out.print("  "+ n);
        }
        return n;
    }
}