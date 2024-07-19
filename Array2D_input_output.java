package Arrays;

import java.util.Scanner;

public class Array2D_input_output {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of rows :");
        int m=sc.nextInt();
        System.out.print("enter the number of cloumns :");
        int n=sc.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.err.print("enter the elements :");
                arr[i][j]=sc.nextInt();     
            }
        }
            //output of 2d array
        System.out.println("\noutput");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

        System.out.println("\n2nd method of output");
        for(int []ele : arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
