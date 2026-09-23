public class Koko_Banana {
    public static void main(String[] args) {
        int [] piles={3,6,7,11};
        int h=8;
        int res=minEatingSpeed(piles,h);
        System.out.println(res);
    }
        public static int minEatingSpeed(int[] piles, int h){
            int low=1;
            int high=0;

            for(int pile:piles){
                if(high<pile){
                    high=pile;
                }
            }
            while(low<high){
                int mid=low+high/2;
                int hours=0;
                for (int pile:piles){
                   hours=hours+(pile+mid-1)/mid;
                    //(pile+i-1)/i to avoid math.ceil
                }
            if(hours<=h){
                high=mid;
            }
            else{
                low=mid+1;
            }
            }
        return low;
    }
}
