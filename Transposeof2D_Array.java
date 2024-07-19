package Arrays;

public class Transposeof2D_Array {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col=arr[0].length;
        int trr[][]=new int[row][col];
        System.out.println("originl 2D array ");

        for(int i=0;i<row;i++){  //rows
            for (int j = 0; j < col; j++) { //columns
            
                System.out.print(arr[i][j]+" "); 
            }       
            System.out.println();
        }

        for(int i=0;i<row;i++){   //rows
            for (int j = 0; j < col; j++) {   //columns
                trr[j][i] = arr[i][j];    
            }  
        }

        System.out.println("\ntranspose of array stored in other 2d array");
        for(int i=0;i<row;i++){  //rows
            for (int j = 0; j < col; j++) { //columns
            
                System.out.print(trr[i][j]+" "); 
            }       
            System.out.println();
        }

        System.out.println("\ntranspose of array in same 2d array");
        for(int i=0;i<row;i++){  //rows
            for (int j = 0; j < col; j++) { //columns
            
                System.out.print(arr[j][i]+" "); 
            }       
            System.out.println();
        }

        System.out.println("\ntranspose of array in same 2d array method 2");
        for(int j=0;j<col;j++){  //column
            for (int i = 0; i < row; i++) { //rows
            
                System.out.print(arr[i][j]+" "); 
            }       
            System.out.println();
        }

    }
}
