package Arrays;
import java.util.Scanner;
public class Sumofelemetsinarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int arr[]={13,15,54,20,68,95,48,31,79};
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("sum is "+sum);
        int ad[]=new int[10];
        int total=0;
        for(int i=1;i<=5;i++){
            System.out.print("enter the numbers in array :");
            ad[i]=sc.nextInt();
            
        }
        for(int i=0;i<=ad.length;i++){
            total=total+ad[i];
        }
        System.out.print(" total is "+ total);
    }
}
