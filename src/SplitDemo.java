import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[ ]");
        String s[]=p.split("APS Microtech Pvt Ltd");

        for(String s1:s){
            System.out.println(s1);
        }
    }
}
