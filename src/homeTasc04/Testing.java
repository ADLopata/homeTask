package homeTasc04;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Персикс on 23.02.2015.
 */
public class Testing {
    public static void main(String[] args) {
        Person pers1= new Person("Vasya", 23, "men");
        Teacher t1 = new Teacher("Olga",35,"women",100,"History");
        Student s1= new Student("Vasya", 23,"men","23265jk",50);
        CollegeStudent cs= new CollegeStudent("Ric",26,"men","2365y",3.5, 5 ,"c hemistry" );

        Person p[]= {pers1,t1,s1,cs} ;

        for(int i=0; i<p.length; i++){

            System.out.println(p[i].toString());
        }
    }

}
