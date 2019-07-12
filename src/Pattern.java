import java.util.ArrayList;

/**
 * Created by Atul on 4/24/19.
 */
public class Pattern {
    public static void main(String[] args){
        int A = 4;
        int k = 0;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int j = 0; j < A; j++){
           temp.add(0);
        }
        for (int i = 0 ; i < A; i++) {
            arr.add(temp);
        }

        for(int i = 0; i < A; i++){
            for(int j = 0; j < A; j++){
                if(i >= k && j >= k && i < A - k && j < A - k) {
                    arr.get(i).set(j, A - k);
                    arr.get(j).set(i, A - k);
                    arr.get(A - 1 - i).set(A - 1 - j, A - k);
                    arr.get(A - 1 - j).set(A - 1 - i, A - k);
                }
            }
            k++;
        }

        for(int i = 0; i < A; i++){
            for(int j = 0; j < A; j++){
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }

    }
}
