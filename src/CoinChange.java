import java.util.Arrays;
import java.util.Scanner;
public class CoinChange {
    public static void main(String args[]){
        int coins[]={1,3,5};
        int target=11;
        System.out.println(coinChange(coins,target));

    }
    static int coinChange(int coins[],int target){
        if(target==0)
            return 0;
        int min=Integer.MAX_VALUE;
        for(int c:coins){
           if(c<=target){
               int result=coinChange(coins,target-c);
                if(result!=Integer.MAX_VALUE){
                    min=Math.min(min,result+1);
                }
               }
           }
        return min;
        }
    }

