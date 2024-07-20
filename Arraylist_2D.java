package Arrays;
import java.util.*;

public class Arraylist_2D {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10); a.add(20); a.add(30);

        ArrayList<Integer> b=new ArrayList<>();
        b.add(40); b.add(50); b.add(60); b.add(70);

        ArrayList<Integer> c=new ArrayList<>();
       
        ArrayList<Integer> d=new ArrayList<>();
        d.add(80); 

        List<List<Integer>> list= new ArrayList<>();
        list.add(a); list.add(b); list.add(c); list.add(d);

        //printing 
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }

        for(int i=0;i<list.size();i++){
            System.out.print("\n"+list.get(1).get(1));
            break;
        }

        System.out.println("\n2nd method of printing ");

        for(int i=0;i<list.size();i++){
            List<Integer> x =list.get(i);
            for(int j=0;j<x.size();j++){
                System.out.print(x.get(i));
            }
            System.out.println();
        }

    }
}
