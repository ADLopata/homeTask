package homeWork06;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;
import java.util.*;
/**
 * Created by Персикс on 06.03.2015.
 */
public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String dividend, String divisor) throws NullPointerException, NumberFormatException,
            ArithmeticException {
        String str = "null";
        if (str.equals(dividend)) throw new NullPointerException("NullPointerException: dividend is null");
        if (str.equals(divisor)) throw new NullPointerException("NullPointerException: divisor is null");

        if (dividend.matches("\\D*")) throw new NumberFormatException("NumberFormatException: dividend is not number");
        if (divisor.matches("\\D*")) throw new NumberFormatException("NumberFormatException: divisor is not number");

        double divid = (Double.parseDouble(dividend));
        double divis = (Double.parseDouble(divisor));

        if (divis == 0) throw new ArithmeticException("ArithmeticException: divisor is equal 0");
        return divid / divis;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        String str = " null";
        if (text.equals(str)) throw new NullPointerException("NullPointerException: text are equal null");
        if (word.equals(str)) throw new NullPointerException("NullPointerException: word are equal null");
        // ищет совпадение в строке и разберает ее на массив
        String[] srtArr = text.split("");
        //ищем индексы  разобранной строки
        for (String x : srtArr) {
            System.out.print(" " + x);
        }
        //создаем споисочный массив поиска  индекса слов
        ArrayList fouWord = new ArrayList<Integer>();

        for (int i = 0; i < srtArr.length; ) {
            if (srtArr[i].equals(fouWord)) {
                fouWord.add(i);
            }

            }
            if (fouWord.toArray().length == 0)
                throw new NullPointerException("NullPointerException: is no occurrence of finding word");


           int[] foundWordInt = new int[(fouWord.toArray()).length];
            for (int r = 0; r < foundWordInt.length; r++) {
                foundWordInt[r] = (int)((fouWord.toArray())[r]);
            }
        return foundWordInt;

    }


    @Override
    public double[] findNumbers(String s) throws CustomException {
        return new double[0];
    }
}