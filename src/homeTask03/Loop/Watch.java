package homeTask03.Loop;

public class Watch {

    public static void main(String[] args){

        int symmetry=0;

        for(int h=1;h<=24;h++){
            for(int m=0;m<=59;m++){
                if(h/10%10==m%10&h%10==m/10%10){
                    symmetry++;
                }
            }
        }
        System.out.println("all matches = "+symmetry);
    }
}
