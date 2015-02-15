package homeTask03.Loop.Arreys;

import java.util.Random;

public class DimensionalArray {
    public static void main(String[] args) {
        int[][] arrey  = new int[8][5];
        for(int line=0;line<arrey.length;line++){
            for(int column=0;column<arrey[line].length;column++){
                arrey[line][column]=(int)(Math.random()*90)+10;
                System.out.print(arrey[line][column]+" ");
            }
            System.out.println(" ");
        }

    }


}
