import java.util.*;
public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq1,rev1=0,rev2=0,sq2;
        int rem;
        sq1=n*n;
        while(n!=0){
            rem=n%10;
            rev1= rev1*10+rem;
            n=n/10;
        }
        sq2=rev1*rev1;
        while(sq1!=0){
            rem=sq1%10;
            rev2=rev2*10+rem;
            sq1=sq1/10;
        }if(sq2 == rev2){
            System.out.print("Adam");
        }else{
            System.out.print("Not");
        }
    }
}
