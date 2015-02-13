package homeTasc02;

import java.util.Scanner;

public class PseudoRandom {
    public static void main(String[] args) {
        int n;
        int pceudoR;

        System.out.println("Введите натуральное число");
        Scanner scn= new Scanner(System.in);
        n= scn.nextInt();

        pceudoR= (int ) (Math.random()*(2*n+1))-n;

        System.out.println(pceudoR);
    }
}
