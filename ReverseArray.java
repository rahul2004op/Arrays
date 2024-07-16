package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        for(int i=0;i<n/2;i++){
            int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println("\nafter reversing");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n\nmethod 2");

        int i=0;
        int j=n-1;
        while(i<j){
            int tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;
            i++;
            j--;
        }
        System.out.println("\nafter reversing");

        for(int I=0;I<n;I++){
            System.out.print(arr[I]+" ");
        }




    }
    
}
