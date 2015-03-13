package ClassWorkAdditionalTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Персикс on 10.03.2015.
 */
public class Result {
  private   int charCount;
   private List<String>result;

    public void setResult(List<String> result) {
        this.result = result;
    }

    public List<String> getResult() {
        return result;
    }
    public void setCharCount(int charCount) {
        this.charCount = charCount;
    }

    public int getCharCount() {
        return charCount;
    }

    @Override
    public String toString() {
        return "Result{" +
                "charCount=" + charCount +
                ", result=" + result +
                '}';
    }



  /*  public void processString(String text){
     String[] arrText= text.split("");
        for (int i=0; i< arrText.length; i++){

        }*/

    }



