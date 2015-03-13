package ClassWorkAdditionalTask;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Персикс on 10.03.2015.
 */
public class Main {

    public static void main(String[] args)throws IOException{
        char choice;
        do{
           System.out.println("Menu:\n" +
                    "1 - To enter the string\n" +
                    "2 - To process the data\n" +
                    "3 - To save last calculation\n" +
                    "4 - To see last result\n" +
                    "5 - To see all saved results\n" +
                    "6 - Print available commands\n" +
                    "\n" +
                    "0 - Exit\n" +
                    "-----------------------------");

            System.out.println("Please, enter your choice:");

           /* System.out.println("Menu:");
            System.out.println(" 1 - To enter the string");
            System.out.println(" 2 - To process the data");
            System.out.println("3 - To save last calculation");
            System.out.println(" 4 - To see last result");
            System.out.println(" 5 - To see all saved results");
            System.out.println(" 6 - Print available commands\n");
            System.out.println(" 0 - Exit");
            System.out.println("Please, enter your choice:");*/

            choice=(char)System.in.read();
        /*   Scanner scn= new Scanner(System.in);
            choice=(char)scn.nextInt();*/
        }while (choice<'0'||choice>'6');
            System.out.println("\n");

            switch (choice) {
                case '0':

                    break;
                case '1':
                    System.out.println("Enter the string:");
                    break;
                case '2':
                    System.out.println("Processing the data..");
                    break;
                case '3':
                    System.out.println("save last calculation");
                    break;

                case '4':
                    System.out.println("see last result:");
                    break;
                case '5':
                    System.out.println("see all saved results:");
                    break;
                case '6':
                    System.out.println(":");
                    break;
            }
           }
}
