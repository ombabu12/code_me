
import java.util.ArrayList;
import java.util.Iterator;

public class arraylsit1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.err.println(list);
        for(int i=0;i<list.size();i++){
            System.err.println("the element is"+list.get(i));
        }
        for(Integer element:list){
            System.err.println("foreach element is" + element);
        }
        Iterator<Integer> it =list.iterator();
        while(it.hasNext()){
            System.err.println("iterator"+ it.next()); 
        }

        /*System.err.println(list);
        list.set(2, 40);
        System.err.println(list);

        System.err.println(list.contains(40));*/
       /* System.err.println(list);
        list.remove(1);
        System.err.println(list);
        list.remove(Integer.valueOf(3));
        System.err.println(list);
        list.clear();
        list.add(2, 80);
        System.err.println(list);
        List<Integer> list1=new ArrayList<>();
        list1.add(50);
        System.err.println(list1);
        list.addAll(list1);
        System.err.println(list);
        System.err.println(list.get(1));*/
    }

}
