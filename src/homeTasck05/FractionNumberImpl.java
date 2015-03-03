package homeTasck05;

/**
 * Created by Персикс on 27.02.2015.
 */
public class FractionNumberImpl implements com.sourceit.hometask.basic.FractionNumber {

    private int dividend;//делимое числитель
    private int divisor;//делитель знаменатель
   // private static final int	DEFAULT_DIVISOR_VALUE =1 ;


    @Override
    public void setDividend(int dividend) {
     this.dividend= dividend;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) {
    this.divisor= divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double doubleValue() {
        return ((double)dividend/divisor);
    }

    @Override
    public int compareTo(com.sourceit.hometask.basic.FractionNumber obj) {
        if(doubleValue()<obj.doubleValue()) {
            return -1;
        }
         else if (doubleValue()>obj.doubleValue()){
            return 1;
        }
           return 0;
    }

   public String toString(){
       return getDividend()+"/"+getDivisor();
   }

}
