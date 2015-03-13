package ClassWorkAdditionalTask;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Персикс on 10.03.2015.
 */
public class Processor extends Result {
    private Result resalt;
    private Result lastResult;
    private List<Result> savedResult = new LinkedList<Result>();
    Result res = new Result();

    public void processString(String text) {
        // String[] arrText= text.split("");
        char[] arrChar = text.toCharArray();
        StringBuilder sb = null;
        int countChar = 0;

        for (int i = 0; i < arrChar.length; i++) {

            if (Character.isLetter(arrChar[i])) {
                sb.append(arrChar);
                countChar++;
            } else if (res == null)

        }

    public void saveResalt() {

    }

    public void getLastResalt() {
        return lastResult;
    }

    public void List

    <Resalt> getResalt(List<Result> list) {

    }
}
}
