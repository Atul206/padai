/**
 * Created by Atul on 4/29/19.
 */
public class MatchString {

    public static void main(String[] args){
        String s = "aab";
        String p = "c*a*b";

        if(!p.contains("*") && !p.contains(".")){
            if(!s.equals(p)){
                System.out.println(false);
            }
        }

        int count = 1;
        char last_char = s.charAt(0);
        String updateString = "";
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == last_char){
                count++;
            }else{
                updateString += (last_char + '*');
                count = 1;
            }
            last_char = s.charAt(i);
        }
        updateString += (last_char + '*');
        if(p.contains(updateString)){
            System.out.println(true);
        }
        System.out.println(updateString);
    }
}
