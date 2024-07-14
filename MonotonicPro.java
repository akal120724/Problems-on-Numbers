import java.util.*;
public class MonotonicPro {
    public static void main(String[]args){
        Scanner obj= new Scanner(System.in);
        int size=obj.nextInt();
        int arr[]=new int[size];
        int itr;
        boolean increasing=true;
        boolean decreasing=true;
        for(itr=0;itr<size;itr++)
        arr[itr]=obj.nextInt();
        for(itr=0;itr<size-1;itr++){
          if(arr[itr]>arr[itr+1]){
            increasing=false;
          }
          if(arr[itr]<arr[itr+1]){
            decreasing=false;
          }
        }
        if(increasing || decreasing){
            System.out.print("Monotonic");
        }else{
            System.out.print("Not a Monotonic");
        }   
    }
}
