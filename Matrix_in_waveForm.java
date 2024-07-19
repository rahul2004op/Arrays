package Arrays;

public class Matrix_in_waveForm {
   
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col=arr[0].length;

        System.out.println("original array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nWave printing of matrix");
        for(int i=0;i<row;i++){
            if(i%2==0){
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for(int j=col-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                }
            }
            System.out.println();
        }
    }

