package Arrays;

public class Rollno {
    public static void main(String[] args) {
        int arr[]={81,23,45,69,21,25,84,95};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<35){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n"+arr[arr.length-1]);
    }
    
}
