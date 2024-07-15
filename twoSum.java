package Arrays;
import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int arr[]={10,4,6,5,13,9};
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the dluplet :");
        int x=sc.nextInt();
        int n = arr.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                    flag =true;
                }
            }
        }
        if(flag==false){
            System.out.println("duplet not found");
        }
    }
}
