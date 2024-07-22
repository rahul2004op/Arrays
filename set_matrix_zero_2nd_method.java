package Arrays;

public class set_matrix_zero_2nd_method {
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
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        System.out.println("original array");
        print(arr);
        int row=arr.length;
        int col=arr[0].length;
        boolean rowarray[]= new boolean[row];
        boolean colarray[]= new boolean[col];
        
        
        //marking the perticular rows and columns 

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    rowarray[i]=true;
                    colarray[j]=true;
                }
                
            }
        }

        // set true rows to zero
        for(int i=0;i<row;i++){
           if(rowarray[i]==true){
            for(int j=0;j<col;j++){
                arr[i][j]=0;
            }
           }
        }
        // set true columns to zero 
        for(int j=0;j<col;j++){
            if(colarray[j]==true){
             for(int i=0;i<row;i++){
                 arr[i][j]=0;
             }
            }
         }

         System.out.println("array after the opeartion");
         print(arr);
    }
}
