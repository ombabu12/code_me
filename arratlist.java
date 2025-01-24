
import java.util.ArrayList;

public class arratlist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();

        list1.add("hello");
        list1.add("I am nakul");
        
        list1.add(1, "spectactular");

        System.err.println(list1);
        System.err.println(list1.get(2));
        list1.set(2, "allout");
        System.err.println(list1);


        /*list.add(7);
        list.add(2);
        list.add(3);
        list.add(234);
        list.add(345);
        list.add(34567);
        list.add(90);
        list.add(87);
        list.add(12345);
        Collections.sort(list);
        System.err.println(list);


        System.err.println(list);

       int element= list.get(3);
       System.err.println(element);

       list.add(1,8);
       System.err.println(list);

       list.addFirst(1);
       System.err.println(list);

       list.addLast(10);
       System.err.println(list);
       list.addAll(list);
       System.err.println(list);

       list.addAll(1, list);
       System.err.println(list);

       int el=list.getFirst();
       System.out.println(el);

       list.set(1, 6);
       System.err.println(list);

       list.remove(3);
       System.err.println(list);

       System.err.println(list.size());

       for(int i=0;i<list.size();i++){
        System.err.print(list.get(i));
       }*/



    }

}
