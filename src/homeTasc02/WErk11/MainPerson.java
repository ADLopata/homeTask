package homeTasc02.WErk11;

/**
 * Created by Персикс on 14.02.2015.
 */
public class MainPerson {
    public static void main(String[] args) {
        Person perinf= new Person();
        perinf.setAge(15);
        perinf.setWeight(65);
        perinf.setGrowth(190);
        perinf.setDateOfBirth(1986);

        System.out.println(perinf.getAge());
        System.out.println(perinf.getWeight());
        System.out.println(perinf.getGrowth());
        System.out.println(perinf.getDateOfBirth());
           }
}
