package Arrays;

public class Sort_0_1_2_inArray {
    public static void main(String[] args) {
        int arr[]={1,0,2,2,1,0,1,2,0,2,1,0,2,2};
        int n=arr.length;
        System.out.println("original array");
        for(int ele :arr){
            System.out.print(ele +" ");
        }
        int noofzero=0;
      
        int noofone=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                noofzero++;
            }
            if(arr[i]==1){
                noofone++;
            }
          
        }

        for(int i=0;i<n;i++){
            if(i<noofzero){
                arr[i]=0;
            }
            else if(i<noofzero+noofone){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        
        }

        System.out.println("\n\n array after sorting ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }


        System.out.println("\n\n2nd method dutch flag algorithm");
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{   //arr[mid]==2
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.println("array after sorting");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }


    }
}
