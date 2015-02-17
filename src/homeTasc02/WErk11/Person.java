package homeTasc02.WErk11;

/**
 * Created by Персикс on 14.02.2015.
 */
public class Person {
   long storag;

   public void  setAge(int newAge ){
       setParam(newAge, 48);
    }
    public void setWeight(int newWeight){
      setParam(newWeight,32);
    }
    public void setGrowth (int newGrowth){
        setParam(newGrowth,16);
    }
    public void setDateOfBirth(int newDateOfBirth){
        setParam(newDateOfBirth,0);
    }

    public int getAge(){
        return getParam(48) ;
    }
    public int getWeight() {
        return getParam(32);
    }
    public int getGrowth(){
        return getParam(16) ;
    }
    public int getDateOfBirth(){
        return getParam(0) ;
    }

    public void  setParam(int newParam, int shift ){
        long mask= 0xffffl<<shift;
        mask=~mask;
        storag=storag & mask;

        long param = ((long)newParam)<<shift;
        storag= storag|param;
    }

    public int getParam(int shift){
        int newParam= (int)(storag>>>shift);
        newParam=  newParam & 0xffff;
        return (int) newParam ;

    }


}
