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
            // проверяем строку на соответствие регулярному выражению \\D* не цифровой символ
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
        // ищет совпадение в строке и разберает ее на массив по пробелам
        String[] srtArr = text.split(" ");
        //создаем масив для подсчета индекса слова
        int[] arrOfInd = {};
        int calcInd = 0;
        //ищем индексы  разобранной строки
       /* for (int p = 0; p < srtArr.length; p++) {
            System.out.print("  " + p);
            создаем споисочный массив поиска  индекса слов
              ArrayList<Integer> fouWord = new ArrayList<Integer>();*/

        for (int i = 0; i < srtArr.length; i++) {

            if (srtArr[i].equals(word)) {
                arrOfInd[i] = calcInd++;
            } else if (srtArr.length == 0)
                throw new NullPointerException("NullPointerException:is no occurrence of finding word");

        }
        return arrOfInd;
    }

        /*// если длинна слова в массиве равна 0
            if (fouWord.toArray().length == 0)
                throw new NullPointerException("NullPointerException: is no occurrence of finding word");

           int[] foundWordInt = new int[(fouWord.toArray()).length];
            for (int r = 0; r < foundWordInt.length; r++) {
                foundWordInt[r] = (Integer)((fouWord.toArray())[r]);
            }
        return foundWordInt;*/




    @Override
    public double[] findNumbers(String text) throws CustomException {
        String []srtArrDoub= text.split(" ");
        double[] arrOfDoub={};
        double calcIndOfDoubl=0;
        for (int i=0;i<srtArrDoub.length;i++){
          //проверка строки текста является ли он вещественным числом
            //случай, когда вещественное число может быть как в обычной форме ( 256.789 ),
          // так и в экспоненциальной форме ( 2.56789e+02 или 2.56789E+02 ).
            if(text.matches("\"[-+]?[0-9]*\\\\.?[0-9]+([eE][-+]?[0-9]+)?\"")){
                arrOfDoub[i]=calcIndOfDoubl++;

            }
            else if(srtArrDoub.length==0) throw new CustomException("CustomException:no double value was found in the text ");
        }
        return arrOfDoub;
    }
}