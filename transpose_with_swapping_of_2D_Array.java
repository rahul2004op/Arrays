package Arrays;

public class transpose_with_swapping_of_2D_Array {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("originl 2D array ");
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){  //rows
            for (int j = 0; j < col; j++) { //columns
            
                System.out.print(arr[i][j]+" "); 
            }       
            System.out.println();
        }
        
        System.out.println("\ntranspose of array in same 2d array method 3 (swapping method)");
        for(int i=0;i<row;i++){  //rows
            for (int j = 0; j <=i; j++) { //columns
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }         
        }

        //printing
        for (int i = 0; i < row; i++) {    
            for (int j = 0; j < col; j++) {   
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
