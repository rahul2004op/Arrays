package Arrays;

public class Matrix_multiplication {

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
    
    public static void main(String []args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{10,20,30},{40,50,60},{70,80,90}};

        System.out.println("1st matrix");
        print(a);

        System.out.println("\n2nd matrix");
        print(b);
        
        int arow=a.length; int acol=a[0].length;
        int brow=b.length; int bcol=b[0].length;
        
        int c[][]=new int[arow][bcol];
        if(arow!=bcol){
            System.out.println("multipication is not possible");
        }
        else{
        for(int i=0;i<arow;i++){
            for(int j=0;j<bcol;j++){
                for(int k=0;k<bcol;k++){
                    c[i][j]=c[i][j]+( a[i][k] * b[k][j] ); 
                }
            }
        }
        
        }

        System.out.println("\n Multiplication of matrix");
        print(c);
    }
}
