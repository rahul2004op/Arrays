package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,5,9,51};
        int brr[]={7,19,22,56,91};
        
        int m=arr.length;
        int n=brr.length;
        int crr[]=new int[n+m];

        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(arr[i]<brr[j]){
                crr[k]=arr[i];
                i++;
                k++;
            }
            else if(brr[j]<arr[i]){
                crr[k]=brr[j];
                j++;
                k++;
            }

        }

        if(i==m){
            while(j<n){
                crr[k]=brr[j];
                j++;
                k++;
            }
        }
        if(j==n){
            while(i<m){
                crr[k]=arr[i];
                i++;
                k++;
            }
        }
        System.out.println("sorted array");
        for( i=0;i<n+m;i++){
            System.out.print(crr[i]+" ");
        }
    }
}


