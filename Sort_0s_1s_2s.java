package Arrays;

public class Sort_0s_1s_2s {
    public static void main(String[] args) {
        int arr[]={1,0,2,2,1,0,1,2,1,0,1,1,0,2};
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

        for(int i=0;i<noofzero;i++){
            arr[i]=0;
        }
        for(int i=noofzero;i<noofzero+noofone;i++){
            arr[i]=1;
        }
        for(int i=noofzero+noofone;i<n;i++){
            arr[i]=2;
        }

        System.out.println("\n\n array after sorting ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    
}