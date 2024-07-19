package Arrays;

public class LargestElement_in_2D_array {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{5,64,78},{100,20,46}};
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {  //rows
            for (int j = 0; j < arr[0].length; j++) {   //cloumns
                    if(max<arr[i][j]){
                        max=arr[i][j];
                    }   
            }
        }
        System.out.println("max element in 2d array :"+max);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                    sum=sum+arr[i][j]; 
            }
        }

        System.out.println("\nsum of all elements on array :" + sum);
    }
}
