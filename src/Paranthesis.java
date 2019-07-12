import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Atul on 4/21/19.
 */
public class Paranthesis {

    public static void main(String[] args){
        String parantesis = "{(()[])}";
        if(parantesis.length()%2 == 1){
            System.out.println(false);
            return;
        }
        Stack<Character> reverse = new Stack<Character>();
        for(int i = 0; i < parantesis.length(); i++) {
            if(parantesis.charAt(i) == '}' && reverse.peek() == '{'
                    || parantesis.charAt(i) == ')' && reverse.peek() == '('
                    || parantesis.charAt(i) == ']' && reverse.peek() == '['
                    || parantesis.charAt(i) == '>' && reverse.peek() == '<'){
                reverse.pop();
            }else{
                reverse.push(parantesis.charAt(i));
            }
        }
        if(reverse.empty()){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
