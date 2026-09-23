import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Freq_String {
    public static void main(String[] args) {
        String str="Hello Everyone";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
