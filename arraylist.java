
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(90);
        list.add(23);
        list.add(89);
        list.add(45);
        System.err.println(list);
        System.err.println("");
        list.add(78);
        for (int i = 0; i <list.size(); i++) {
            System.err.print(list.get(i)+" ");
        }
        list.set(1,24);
        // list.remove(2);
        System.err.println();
        System.err.println(list);
        // System.err.println(list.size());
        Collections.sort(list);
        System.err.println(list);
    
        

    }

}
