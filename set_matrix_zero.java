package Arrays;

public class set_matrix_zero {
    public static void print(int arr[][]){
        int row=arr.length;
        int col= arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        int row=arr.length;
        int col=arr[0].length;
        System.out.println("original array");
        print(arr);
        
        int temp[][]=new int [row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[i][j]=arr[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(temp[i][j]==0){
                    
                    for(int k=0;k<col;k++){
                        arr[i][k]=0;
                    }
                    for(int l=0;l<row;l++){
                        arr[l][j]=0;
                    }
                }
            }
        }
        System.out.println("after the operation");
        print(arr);
    }
}
