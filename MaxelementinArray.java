package Arrays;
import java.util.Scanner;

public class MaxelementinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number of elements in array :");
        int n=sc.nextInt();
        int arr[]=new int [10];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the elemets in array :");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i <n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max element of array :"+max);

        System.out.println("\n2nd method ");
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) {
                mx=Math.max(mx,arr[i]);         
        }
        System.out.println("max element of array :"+mx);

    }
}
