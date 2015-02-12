package homeTasc02;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        double cathetusA;
        double cathetusB;
        double gipotinuzaC;
        double area;
        double perimeter;

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите первый катет а:");
        cathetusA  = scn.nextDouble();
        System.out.println("Введите второй катет b:");
        cathetusB = scn.nextDouble();

         area=(cathetusA*cathetusB)/2;
        area=Math.rint(100.0*area)/100;
        System.out.println("Площадь прямоугольного треугольника равна:\n"+area);

       gipotinuzaC= Math.hypot(cathetusA, cathetusB);
        perimeter= cathetusA+cathetusB+gipotinuzaC;
        perimeter=Math.rint(100.0*perimeter)/100;
        System.out.println("Периметр прямоугольного треугольника равна:\n"+
                             + perimeter);



    }
}
