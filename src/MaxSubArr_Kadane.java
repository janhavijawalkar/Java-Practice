public class MaxSubArr_Kadane {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int maxsum=0;
        int currsum = 0;
        for (int start = 0; start < arr.length; start++) {
                currsum = currsum + arr[start];
                maxsum=Math.max(currsum,maxsum);
                // int max = Arrays.stream(subarray).max().getAsInt();
                // System.out.println(max);
                if(currsum<0){
                    currsum=0;
                }
        }
        //int max = Arrays.stream(subarray).max().getAsInt();
        System.out.println(maxsum);
    }
}