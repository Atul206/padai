import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by Atul on 4/24/19.
 */
public class LargestNumber {
    public static void main(String[] str){
        List<Integer> A = new ArrayList<Integer>();
        A.add(3);
        A.add(30);
        A.add(34);
        A.add(5);
        A.add(9);

        String largestNumber = String.valueOf(A.get(0));
        for(int i = 0 ; i < A.size(); i++) {
            if((String.valueOf(A.get(i)) +","+ largestNumber).compareTo(largestNumber +","+ String.valueOf(A.get(i))) > 0){
                largestNumber = String.valueOf(A.get(i)) + largestNumber;
            }else{
                largestNumber = largestNumber + String.valueOf(A.get(i));
            }
        }

        System.out.println(largestNumber);

        Consumer predicate = x -> x = 4;
        Optional<Integer> optional = Optional.of(5);
        optional.ifPresent(predicate);
        optional.isPresent();

    }
}
