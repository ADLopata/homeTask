package homeTasck05;


import com.sourceit.hometask.basic.FractionNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
      FractionNumberImpl f1= new FractionNumberImpl();
        f1.setDividend(3);
        f1.setDivisor(5);
        System.out.print(f1.toString()+ " = "+ f1.doubleValue());
       System.out.println();

      FractionNumberImpl f2 = new FractionNumberImpl();
        f2.setDividend(4);
        f2.setDivisor(8);
        System.out.print(f2.toString()+ " = "+ f2.doubleValue());
        System.out.println();

        System.out.println("Operations on fractions numbers : ");

        FractionNumberOperation fno= new FractionNumberOperation();
        System.out.println("Sum : "+ fno.add(f1,f2).toString()+ " = "+ fno.add(f1,f2).doubleValue());
        System.out.println("Multiplication : "+ fno.mul(f1, f2).toString()+ " = "+ fno.mul(f1, f2).doubleValue());
        System.out.println("Division : "+ fno.div(f1, f2).toString()+ " = "+ fno.div(f1, f2).doubleValue());
        System.out.println("Subtraction : "+ fno.sub(f1, f2).toString()+ " = "+ fno.sub(f1, f2).doubleValue());

        System.out.println("Unsorted Array: ");
        //создаем массив интерфейса
        FractionNumber[]fn= new FractionNumber[7];
        for(int i=0;i< fn.length;i++ ) {
            FractionNumberImpl fni = new FractionNumberImpl();
            fni.setDividend(((int) (Math.random() * 100)));
            fni.setDivisor(((int) (Math.random() * 100)));
            fn[i] = fni;
            // создаем цикл for-each где х то что принемает последовательно значение из коллекции
            //а fn колекция по которой должен идти цикл for

        }
          for(int x=0; x<7; x++){
            System.out.print(Objects.toString(fn[x])+" ");
        }
       /* идентичная запись предиущей
       for(FractionNumber x: fn) {
            // выводим 7 элементов коллекции ,то что принимает х
            System.out.print(Objects.toString(x)+" ");

        }*/
        System.out.println();
        System.out.println("Sorted Array: ");
    //создаем анонимный класс
        Arrays.sort (fn, new Comparator<FractionNumber>() {
            @Override
            public int compare(FractionNumber o1, FractionNumber o2) {
                return o1.compareTo(o2);
            }
        });
        for(FractionNumber x: fn) {
            // выводим 7 элементов коллекции ,то что принимает х
            System.out.print(Objects.toString(x) + " ");
            System.out.println();
            System.out.println();

            System.out.print(x.doubleValue() + " ");
        }
    }
}
