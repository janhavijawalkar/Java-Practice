import java.util.Scanner;

//ip:12345   op:5
public class Count_dig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        int count=0;
        if(num==0)
        {
            count++;
        }
        else{
            while(num!=0){
                num=num/10;
                count++;
            }
        }
        System.out.println(count);
    }
}
