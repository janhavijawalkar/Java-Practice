import java.util.HashMap;

public class FirstUnique_char {
    public static void main(String[] args) {
        String str="loveleetcode";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for(int i=0;i<=str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.get(ch)==1)
            {
                System.out.println("1st Unique Char:"+ch);
                break;
            }
        }

    }
    }
