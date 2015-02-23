package homeTasc04;

/**
 * Created by Персикс on 23.02.2015.
 */
public class Teacher extends Person{
    double salary;
    String subject;

    Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        setSalary(salary);
        setSubject(subject);
    }
    private void setSalary( double newSalary){
        salary= newSalary;
    }
    private double getSalary(){
        return salary;
    }
    private void setSubject(String newSubject ){
        subject= newSubject;
    }
    private String getSubject(){
        return subject;

    }
     @Override
    public String  toString () {
        return super.toString() + ", Salary " + getSalary() + ", Subject " + getSubject();

    }




}
