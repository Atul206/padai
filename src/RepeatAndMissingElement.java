import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Atul on 4/24/19.
 */
public class RepeatAndMissingElement {

    public static void main(String[] args){
        List<Integer> A = new ArrayList<Integer>();
        A.add(3);
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(3);
        int repeat = -1, missing = -1;
        Integer[] B = new Integer[A.size() + 1];
        for(int i = 0; i <= A.size(); i++) {
            B[i] = new Integer(0);
        }

        for(Integer a: A){
            B[a] = B[a] + 1;
            System.out.println(B[a]);
        }

        System.out.println(B.length);
        for(int i = 1; i < B.length; i++) {
            if(B[i] > 1){
                repeat = i;
            }
            if(B[i] == 0) {
                missing = i;
            }
        }
        System.out.println(repeat + " " + missing);
    }
}
