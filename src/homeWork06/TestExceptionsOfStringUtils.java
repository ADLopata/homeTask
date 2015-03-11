package homeWork06;

import com.sourceit.hometask.exceptions.CustomException;

/**
 *  Add implementation for the StringUtils interface. Pay attention to the exceptions which
 should be triggered during working flow.
 */
public class TestExceptionsOfStringUtils {
 public static void main(String[] args) {
    StringUtilsImpl sui = new StringUtilsImpl();
  /*    try {
        System.out.print(sui.div("6","2"));
      }catch (NullPointerException e){
         System.out.print(e.getMessage());
      }catch (NumberFormatException f){
         System.out.println(f.getMessage());
      }catch (ArithmeticException ae){
         System.out.println(ae.getMessage());
  }*/

   String text1="it is spring";
    String word=  "spring";
      try {
          int [] y= sui.findWord(text1,word);
          for (int r=0;r<y.length;r++) {
              System.out.print(y[r]);
          }
      }catch (NullPointerException np){
       System.out.println(np.getMessage());

      }
     System.out.println();
     String t5 = "4.5 6 9.4";
     try {
               for (int i = 0; i < (sui.findNumbers(t5)).length; i++) {
             System.out.print(sui.findNumbers(t5)[i] + " ");
         }
     }catch (CustomException a){
         System.out.print(a.getMessage());
     }



 }
}
