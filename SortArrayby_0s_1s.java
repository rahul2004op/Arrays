package Arrays;

public class SortArrayby_0s_1s {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,0,1,1,0,0,1};
        System.out.println("original array ");
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<n;i++){
            arr[i]=1;
        }
        
        System.out.println("\n\narray after sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n\n2nd method"); // one pass solution

        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            // if(i>j){
            //     break;  //IMP condition or instead of it we can use else if condition
            //                                   or the conditions will be in if case only
            // }
            else if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

            System.out.println("array after sorting");
            for(i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }

       
    }
    
}
