package Arrays;

public class Search_in_2D_array {
    public static boolean  main(String[] args) {
        int arr[][]={{1,30,84,6,3},{84,12,96,4,52,15},{563,23,525}};
        int row=arr.length;
        int col=arr[0].length;
        int i=0; int j=col-1;
       int target =20;
       while(i<row && j>=0){
            if(target==arr[i][j]){
                return true;
            }
            else if(arr[i][j]<target){
                i++;
            }
            else {
                j--;
            }
       }
        return false;
    }
}
