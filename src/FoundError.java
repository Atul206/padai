import java.util.ArrayList;

/**
 * Created by Atul on 4/24/19.
 */
public class FoundError {
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        int B = 56;
        ArrayList<Integer> ret = new ArrayList<Integer>();
        B = B%A.size();
        for (int i = B; i < A.size(); i++) {
            //ret.add(A.get(i));
            System.out.print(A.get(i));
        }
        for(int i = 0; i < B; i++) {
            System.out.print(A.get(i));
        }
    }
}
