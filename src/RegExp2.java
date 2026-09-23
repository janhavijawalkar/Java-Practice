import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {
    public static void main(String[] args) {
        int count=0;
        Pattern p=Pattern.compile("[^abc]");
       // Pattern p1=Pattern.compile("[0-9]");
        Matcher m=p.matcher("a7b@z#9");
       // Matcher m1=p1.matcher("a7b@z#9");
        while(m.find()){

            System.out.println(m.start()+".."+m.group());
        }
    }
}
