import java.util.HashMap;

/*public class FirstRepchar {
    public static void main(String[] args) {
        String str="heloabaohel";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;i<str.length();j++){
                if(str.charAt(i)==str.charAt(j));{
                    System.out.print(str.charAt(i));
                    return;
                }
            }
        }
    }
}  */
public class FirstRepchar {
    public static void main(String[] args) {
        String str="hello";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for(int i=0;i<=str.length();i++){
            char ch=str.charAt(i);
            if(map.get(ch)>1){
                System.out.println("First rep char:"+ch);
                break;
            }
        }

    }
}
