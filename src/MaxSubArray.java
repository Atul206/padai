import java.util.ArrayList;

/**
 * Created by Atul on 4/24/19.
 */
public class MaxSubArray {
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(0);
        A.add(0);
        A.add(-1);
        A.add(0);

        int sum = A.get(0);
        int  savedStart = 0, savedLast = 0, start = 0, last = 0,j = 0, lastSum = 0;
        ArrayList<Integer> result = new ArrayList();
        Boolean flag = false;
        for(int i = 0 ; i < A.size(); i++) {
            if(A.get(i) > 0) {
                flag = true;
            }
        }
        if(!flag){
            System.out.println("");
        }
        for(int i = 1; i < A.size(); i++){

            if(A.get(i) + sum > sum){
                j++;
                last = j;
                if(lastSum < sum) {
                    savedLast = last;
                    lastSum = sum;
                    savedStart = start;
                }
                sum += A.get(i);
            }else{
                start = i;
                sum = 0;
            }
        }

        if(savedLast == savedStart) {
            System.out.print(A.get(savedStart) + " " + A.get(savedLast));
            return;
        }
        for(int i = savedStart; i <= savedLast; i++) {
            System.out.print(A.get(i) + " ");
        }
    }
}
