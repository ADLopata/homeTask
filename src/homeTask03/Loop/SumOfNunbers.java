package homeTask03.Loop;


import java.util.Scanner;

public class SumOfNunbers {

    public static void main(String[] args) {
        int a,c=0;
        System.out.println("enter the number");
        Scanner scn=new Scanner(System.in);
        if(scn.hasNextInt()){
            a=scn.nextInt();
            while(a!=0){
                c=c+a%10;
                a/=10;
            }

            System.out.println("The sum of all numbers is equal to the number entered "+c);
        }
        else System.out.println("Error. You entered is not a number  !");
    }
}
