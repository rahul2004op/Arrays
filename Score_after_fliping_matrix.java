package Arrays;

public class Score_after_fliping_matrix {
    public static void main(String[] args) {
        int arr[][]={{0,1,1},{0,0,1},{1,0,1}};
        int row=arr.length;
        int col=arr[0].length;

        //put 1 on oth position of every row
        for(int i=0;i<row;i++){
            if(arr[i][0]==0){
                for(int j=0;j<col;j++){ // fliping the values
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }    
        }
        // fliping those valus where no of zeros are greater than no. of ones
        for(int j=1;j<col;j++){
            int noofzero=0; int noofone=0;
            for(int i=0;i<row;i++){
                if(arr[i][j]==1){
                    noofone++;
                }
                else{
                    noofzero++;
                }
            }
            if(noofzero>noofone){
                for(int i=0;i<row;i++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }

        int score=0;
        int x=1;
        for(int j=col-1;j>=0;j--){
            for(int i=0;i<row;i++){
                score=score + (arr[i][j] * x);
            }
            x=x*2;
        }
        System.out.println("final answer :"+ score);

      
    }
}
