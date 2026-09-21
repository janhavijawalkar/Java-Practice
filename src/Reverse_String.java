public class Reverse_String {
    public static void main(String args[]){
        String str="Hello World";
        char[] arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            if (arr[left] == ' ') {
                left++;
            } else if (arr[right] == ' ') {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            left++;
            right--;
        }
        System.out.print(arr);
        }
    }

