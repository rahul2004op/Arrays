package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("\nenter the number of rotation in array :");
        int k=sc.nextInt();
        int brr[]=new int [n];
        System.out.print("\narray after rotation\n");

        int i=0;
        int j=n-k-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        int I=n-k;
        int J=n-1;
        while(I<=J){
            int temp=arr[I];
            arr[I]=arr[J];
            arr[J]=temp;
            I++;
            J--;
        }
       
        for (int a = 0; a <n-1; a++) {
            int temp=arr[a];
            arr[a]=arr[n-a-1];
            arr[n-a-1]=temp;

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
