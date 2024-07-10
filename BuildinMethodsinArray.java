package Arrays;

import java.util.Arrays;

public class BuildinMethodsinArray {
    public static void main(String[] args) {
        int arr[]={10,40,90,50,20,30,60};
        for(int ele : arr){     //for each loop
            System.out.print(ele+" ");
        }

        Arrays.sort(arr);
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


        //copy of array

        int nums []=arr;    //shallow copy
        System.out.println("\ncopy of array\n");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        nums [0]=70;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(arr[i]+" ");
        }


        int brr[]=Arrays.copyOf(arr,arr.length);
        brr[0]=80;
        System.out.println("\n"+arr[0]);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(arr[i]+" ");
        }

        int crr[]=new int[arr.length];
        for (int i = 0; i < crr.length; i++) {
            crr[i]=arr[i];
        }
        System.out.println();
        crr[0]=100;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(crr[i]+" ");
        }




    }
}
