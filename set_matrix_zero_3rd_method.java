package Arrays;

public class set_matrix_zero_3rd_method {
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

    public static void main(String args[]){
        int arr[][]={{1,5,6,2,1},{30,0,36,8,11},{0,65,84,20,53}};
        System.out.println("original matrix");
        print(arr);
        int row=arr.length;
        int col=arr[0].length;

        boolean zerorow=false;
        boolean zerocol=false;

        // check for 0th row 
        for(int j=0;j<col;j++){
            if(arr[0][j]==0){
                zerorow=true;
                break;
            }
        }

        // check for 0th cloumn 
        for(int i=0;i<row;i++){
            if(arr[i][0]==0){
                zerocol=true;
                break;
            }
        }
//........................................................................................
        //traverse the submatrix without the 0th row and column
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
//....................................................................
        //traverse the 0th row
        for(int j=1;j<col;j++){
            if(arr[0][j]==0){
                for(int i=1;i<row;i++){
                    arr[i][j]=0;
                }
            }
        }

        //traverse the 0th column
        for(int i=1;i<row;i++){
            if(arr[i][0]==0){
                for(int j=1;j<col;j++){
                    arr[i][j]=0;
                }
            }
        }
//.........................................................................  
        //set 0th row to 0s
        if(zerorow==true){
            for(int j=0;j<col;j++){
                arr[0][j]=0;
            }
        }

        //set 0th column to 0s
        if(zerocol==true){
            for(int i=0;i<row;i++){
                arr[i][0]=0;
            }
        }
        System.out.println("matrix after the operation");
        print(arr);
    }
}
