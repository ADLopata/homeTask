package homeWork06;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;
import javafx.scene.shape.Path;

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
        if (dividend.matches("\\D*")) throw new NumberFormatException("NumberFormatException:" +
                "dividend is not number");
        if (divisor.matches("\\D*")) throw new NumberFormatException("NumberFormatException: divisor is not number");

        double divid = (Double.parseDouble(dividend));
        double divis = (Double.parseDouble(divisor));

        if (divis == 0) throw new ArithmeticException("ArithmeticException: divisor is equal 0");
        return divid / divis;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null) throw new NullPointerException("NullPointerException: text are equal null");
        if (word == null) throw new NullPointerException("NullPointerException: word are equal null");
        // ищет совпадение в строке и разберает ее на массив по пробелам
        String[] textArr = text.split(" ");
        //создаем масив для подсчета индекса слова
        int calcInd = 0;
        //ищем индексы  разобранной строки
        int findWords[] = new int[20];

        for (int index = 0; index < textArr.length; index++) {
            if (word.equals(textArr[index])) {

                findWords[calcInd] = index;
                calcInd++;
                // System.out.println(calcInd);
            }

        }//создаем массив для того чтобы выводить индекс без нулевых значений
        int[] in = new int[calcInd];
        System.arraycopy(findWords, 0, in, 0, calcInd);
        if (findWords.length == 0)
            throw new NullPointerException("NullPointerException:is no occurrence of finding word");
//
        return in;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        String[] srtArrDoub = text.split(" ");
        double[] arrOfDoub = new double[10];
        int calcIndOfDoubl = 0;
        for (int i = 0; i < srtArrDoub.length; i++) {
            //проверка строки текста является ли он вещественным числом

               if(srtArrDoub[i].contains(".") ){

                arrOfDoub[calcIndOfDoubl++] = Double.parseDouble(srtArrDoub[i]);

            }
        }
            double[]resArr= new double[calcIndOfDoubl];
            System.arraycopy(arrOfDoub,0,resArr,0,calcIndOfDoubl);

            if(srtArrDoub.length==0)throw new CustomException( "CustomException:"+
                    "Not double value was found in the text");


        return resArr;
    }

}
