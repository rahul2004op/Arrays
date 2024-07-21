package Arrays;
import java.util.*;
public class Pascal_triangle_in_2D_arraylist {
    public static void main(String[] args) {
       
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the number of rows for pascal triangle :");
            int n=sc.nextInt();

            List<List<Integer>> ans=new ArrayList<> ();
            for(int i=0;i<n;i++){
                List<Integer> a=new ArrayList<>();

                for(int j=0;j<=i;j++){
                    if(j==0 || j==i){   //imp
                        a.add(1);
                    }
                    else{
                        a.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                    }
                }
                ans.add(a);
            }
            System.out.print(ans);
            System.out.println("\n 2nd form of priting");
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i)+" ");
            }
    }
}
