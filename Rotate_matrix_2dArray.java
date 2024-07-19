package Arrays;

public class Rotate_matrix_2dArray {
   
    public static void print(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col=arr[0].length;
        
        System.out.println("original array");
        print(arr);
    

        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;   
            }
        }
        System.out.println("after transpose");
        print(arr);

        for(int i=0;i<row;i++){
            int low=0;
            int high=row-1;
            while(low<high){
                int temp=arr[i][low];
                arr[i][low]=arr[i][high];
                arr[i][high]=temp;
                low++;
                high--;

            }
        }
        System.out.println("after rotating 90 degree to matrix");
        print(arr);
        
    }
}
