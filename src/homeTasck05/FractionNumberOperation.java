package homeTasck05;

import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Персикс on 27.02.2015.
 */
public class FractionNumberOperation implements com.sourceit.hometask.basic.FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber firstNum, FractionNumber secondNum) {
        FractionNumberImpl fno= new FractionNumberImpl();
        fno.setDivisor( firstNum.getDivisor()*secondNum.getDivisor());
        fno.setDividend(firstNum.getDividend()*secondNum.getDivisor()+secondNum.getDividend()*firstNum.getDivisor());

        return fno;
    }

    @Override
    public FractionNumber sub(FractionNumber first, FractionNumber second) {
        FractionNumberImpl sube = new FractionNumberImpl();
        sube.setDivisor(first.getDivisor()*second.getDivisor());
        sube.setDividend(first.getDividend()*second.getDivisor()-second.getDividend()*first.getDivisor());
        return sube;
    }

    @Override
    public FractionNumber mul(FractionNumber firs, FractionNumber second){
        FractionNumberImpl mult= new FractionNumberImpl();
        mult.setDividend(firs.getDividend() * second.getDividend());
        mult.setDivisor(firs.getDivisor()*second.getDivisor());
        return mult;
    }

    @Override
    public FractionNumber div(FractionNumber first, FractionNumber second){
        FractionNumberImpl divi = new FractionNumberImpl();
        divi.setDividend(first.getDividend()*second.getDivisor());
        divi.setDivisor(first.getDivisor()*second.getDividend());

        return divi;
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        FractionNumberImpl pars= new FractionNumberImpl();
              int index= s.indexOf('/');//в нашей  s строке считаем номер индекса /
              if(index ==-1){//если / нет в нашей строке (число им  вид 2-> 2/1)то возвращаем строку которую преобразуем в интежер

          //  Integer i= new Integer(s);//более медленная вариация следующей записи ,но идентичная
            pars.setDividend(Integer.valueOf(s));//в наш числитель загужаем нашу строчку к примеру просто число 2.

            //в знаменатель загружаем из интерфейса конст = 1 и получаем число не 2 ,а 2/1
            pars.setDivisor(com.sourceit.hometask.basic.FractionNumber.DEFAULT_DIVISOR_VALUE);
             return pars;
        }
        // создаем экземпляр строки и возвращаем ее от 0 индекса до /.
          String srt= s.substring(0,index);
        //преобразуем в интеджер созданую стринговую строку
        Integer i = new Integer(srt);
        //загружаем преобразованую строку в метод setчеслителя
        pars.setDividend(i);
        //создаем экземпляр строки и возвращаем ее от следуещего индекса / и до конца строки
        String str1 = s.substring(index +1,s.length());
        //загружаем винтедж созданую стринговую строку в знаменатель
        pars.setDivisor(Integer.valueOf(str1));

        return pars;
    }
}
