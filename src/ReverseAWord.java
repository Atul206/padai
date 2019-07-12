import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Atul on 4/21/19.
 */
public class ReverseAWord {

    public static void main(String[] args){
        String correctString = "pqr.mno";
        char[] stringToCharArray = correctString.toCharArray();
        Stack<String> wordStack = new Stack<String>();

        String retVal = "";
        for (char data:stringToCharArray) {
            if(data == '.'){
                wordStack.push(retVal);
                retVal = "";
            }else {
                retVal += data;
            }
        }
        wordStack.push(retVal);
        while (!wordStack.empty()){
            System.out.print(wordStack.pop());
            System.out.print(".");
        }
    }
}
