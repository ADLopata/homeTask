package homeTasc02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double x1;
        double x2;
        double D;

        System.out.println("Решение уравнения вида ax^2+bx+c=0");
        Scanner scn= new Scanner(System.in);

        System.out.println("Введите значение а:");
        a= scn.nextDouble();
        if(a==0){
            System.out.println("Ноль использовать нельзя");
        }
        System.out.println("Введите значение b:");
        b= scn.nextDouble();
        System.out.println("Введите значение c:");
        c= scn.nextDouble();


        D=Math.sqrt((b*b)-4*a*c);
        System.out.println("D = "+D);
        x1=((-b+D)/2*a);
        System.out.println("x1 = "+x1);


    }
}
