package Arrays;
import java.util.Scanner;
public class LinearSearchinarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of Array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the elements of array :");
            arr[i]=sc.nextInt();
        } 
        
        System.out.print("enter the element to be searched :");
        int key=sc.nextInt();

        boolean flag=false; 
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                
                flag=true;
                 index=i;
                break;
            } 
        }
        if(flag==true){
            System.out.print("element found at index "+index); 
        }
        else{
            System.out.println("element not found ");
        }
        

    }
    
}
