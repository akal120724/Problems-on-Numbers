import java.util.*;
public class TriangularNum {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        int n=ob.nextInt();
        int sum=0;
        if(n<0)
        for(n=1;sum<=n;n++){
            sum=sum+n;
        }if(sum == n){
            System.out.print("Triangular Number");
        }else{
            System.out.print("Not Triangular Number");

        }
    }

}
