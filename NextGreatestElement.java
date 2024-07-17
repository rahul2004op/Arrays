package Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int arr[]={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int ans[]=new int [n];
        ans[n-1]=-1;    //default value
        
        // method 1
        for (int i = 0; i < n-1; i++) {
            int max=arr[0];                 //IMP max must be declear in 1st for loop only
            for(int j=i+1;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            ans[i]=max;
        }
        System.out.println("original array");
        for(int ele:arr){
            System.out.print(ele + " ");
        }

        System.out.println("\n\nrequired array");
        for(int ele:ans){
            System.out.print(ele + " ");
        }


        System.out.println("\n\nmethod 2");
        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        System.out.println("required array");
        for(int ele:ans){
            System.out.print(ele + " ");
        }
    }
}
