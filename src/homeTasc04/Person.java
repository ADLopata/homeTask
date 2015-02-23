package homeTasc04;

/**
 * Created by Персикс on 23.02.2015.
 */
public class Person  {
    String name;
    int age;
    String gender;


    Person(String name, int age,String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String newName){
      name= newName;
    }
    public String getName(){
        return name;
    }

   public void setAge(int newAge){
      age= newAge;
   }
    public int getAge(){
        return age;
    }

    public void setGender(String newGender){
        gender= newGender;
    }
    public String getGender(){
        return gender;
    }


    public String  toString (){
      return  getName()+ ", age "+ getAge()+", gender "+ getGender();
    }

}

