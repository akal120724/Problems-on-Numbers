import java.util.*;
public class StrongNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,rem;
        int temp=n;
        while(n!=0){
           int fact=1,i=1;
            rem=n%10;
            while(i<=rem){
                fact= fact*i;
                i++;
            }sum=sum+fact;
            n=n/10; 
        }
        if(sum==temp){
        System.out.print("Strong Number");
        } else{
        System.out.print("Not a Strong Number");
    }
   }
}
