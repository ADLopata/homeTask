package homeTasck05;

import com.sourceit.hometask.basic.*;
import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Персикс on 27.02.2015.
 */
public class FractionNumberOperation implements com.sourceit.hometask.basic.FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber firstNum, FractionNumber secondNum) {
       com.sourceit.hometask.basic.FractionNumber fno= new homeTasck05.FractionNumber();
        fno.setDivisor( firstNum.getDivisor()*secondNum.getDivisor());
        fno.setDividend(firstNum.getDividend()*secondNum.getDivisor()+secondNum.getDividend()*firstNum.getDivisor());

        return fno;
    }

    @Override
    public FractionNumber sub(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        return null;
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        return null;
    }
}
