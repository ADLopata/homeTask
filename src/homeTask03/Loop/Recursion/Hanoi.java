package homeTask03.Loop.Recursion;

import java.util.Scanner;

/**
 * Created by Персикс on 20.02.2015.
 */
public class Hanoi {

        char spire1;
        char spire2;
        char spire3;
        int n;
        Hanoi(){
            spire1 = 'A';
            spire2 = 'B';
            spire3 = 'C';
            System.out.print("Введите количество дисков n = ");
            Scanner con = new Scanner(System.in);
            n = con.nextInt();
           System.out.println("\nОписание, как переложить " + n + " дисков со столбика А на В через промежуточный С");
            System.out.println("(Нумерация дисков - сверху вниз)");
        } // constructor HanoyTowers

        void moveDisks(int m, char from, char help, char to){
            if (m == 1){
                System.out.printf("%s %d %s %c %s %c%n " , "диск", m, "со столбика",from, "на столбик", to);
            }
            else{
                moveDisks(m-1, from, help, to);
                System.out.printf("%s %d %s %c %s %c%n" , "диск", m, "со столбика",from, "на столбик",to);
                moveDisks(m-1, help, to, from);
            }
        } // moveDisks
        void moveDisksWrapper(){
            moveDisks(n, spire1, spire2, spire3);
        } // moveDisksWrapper
    } // class HanoyTowers
    class ProblemHT {
        public static void main(String[] args) {
            Hanoi ht = new Hanoi();
            ht.moveDisksWrapper();
        } // main
    } // class ProblemHT

