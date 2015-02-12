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
        boolean chek = false;

        System.out.println("Решение уравнения вида ax^2+bx+c=0");
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите значение а:");
        a = scn.nextDouble();
        if (a == 0) {
            System.out.println("Ноль использовать нельзя");
        } else {
            System.out.println("Введите значение b:");
            b = scn.nextDouble();
            if (b == 0) {
                System.out.println("Ноль использовать нельзя");
            } else {
                System.out.println("Введите значение c:");
                c = scn.nextDouble();
                if (c == 0) {
                    System.out.println("Ноль использовать нельзя");
                }else {

                D = Math.sqrt((b * b) - 4 * a * c);
                if (D < 0) {
                    System.out.println("Дуйствительных корней нет");
                } else if (D == 0) {
                    x1 = ((-b + D) / 2 * a);
                    x2 = x1;
                    System.out.println("x1 = x2" + x1);

                } else {
                    System.out.println("D = " + D);

                    x1 = ((-b + D) / 2 * a);
                    System.out.println("x1 = " + x1);
                    x2 = ((-b - D) / 2 * a);
                    System.out.println("x1 = " + x1);
                }
            }

        }
    }}}


