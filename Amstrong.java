import java.util.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int rem,sum=0,temp;
        temp=n;
        while(n>0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(temp==sum)
        System.out.print("Amstrong");
        else
        System.out.print("Not Amstrong");
        
    }

}
