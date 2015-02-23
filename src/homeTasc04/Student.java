package homeTasc04;

/**
 * Created by Персикс on 23.02.2015.
 */
public class Student extends Person {
    String idNumber;
    double gpa;

    Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        setIdNumber(idNumber);
        setGpa(gpa);
    }
    public void setIdNumber(String newIdNumber){
        idNumber= newIdNumber;
    }
    public String getIdNumber(){
         return idNumber;
     }
    public void setGpa(double newGpa){
        gpa= newGpa;
    }
    public double getGpa(){
        return gpa;
    }

     @Override
    public String toString(){
        return super.toString()+ ", idNumber "+ getIdNumber()+ ", gpa "+ getGpa() ;
    }
}
