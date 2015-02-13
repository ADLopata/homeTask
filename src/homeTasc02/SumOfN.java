package homeTasc02;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        int n;
        int firstN;
        int sesondN;
        int sumN;

        System.out.println("Введите чимло :\n");
        Scanner scn= new Scanner(System.in);
        n= scn.nextInt();

        firstN= n%10;
        sesondN= (n-firstN)/10;
        sumN= firstN+sesondN;

        System.out.println(n+":"+"\n"+firstN+"+"+ sesondN +"=" +sumN);

    }
}
