package Arrays;

public class SpiralPrint_in_2D_Array {
    public static void print(int arr[][]){
        int row =arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][]={{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26},{27,28,29,30}};
        int row=arr.length;
        int col=arr[0].length;
        System.out.println("original array ");
        print(arr);
        int maxr=row-1;
        int minr=0;
        int maxc=col-1;
        int minc=0;

        while(minr<=maxr && minc<=maxc){
            //left to right
            for(int j=minc;j<=maxc;j++){
                System.out.print(arr[minr][j] +" ");
            }
            minr++;

            //top to bottom
            if(minr>maxr || minc>maxc) break;   // imp statement 
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;

            // right to left
            if(minr>maxr || minc>maxc) break; 
            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }
            maxr--;
            
            // bottom to top
            if(minr>maxr || minc>maxc) break; 
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }
       
    }
}
