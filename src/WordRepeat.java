import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Atul on 5/28/19.
 */
public class WordRepeat {
    public static void main(String[] args){
        Map<String, Integer> wordMapToCount = new HashMap<>();
        List<String> words = new ArrayList<>();
        words.add("hate");
        words.add("love");
        words.add("peace");
        words.add("love");
        words.add("peace");
        words.add("hate");
        words.add("love");
        words.add("peace");
        words.add("love");
        words.add("peace");

        for (String word : words) {
            if(null == wordMapToCount.get(word)) {
                wordMapToCount.put(word,  1);
            }else{
                wordMapToCount.put(word, (wordMapToCount.get(word) + 1));
            }
        }

        List<Integer> count = wordMapToCount.entrySet()
                .stream().map(x -> x.getValue()).sorted().collect(Collectors.toList());
        System.out.println(count.get(count.size() - 1));
    }
}
