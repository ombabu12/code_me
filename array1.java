

import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("eneter the size of an array:");
        int size=scn.nextInt();

        int a[]=new int[size];

        System.out.println("enter "+ size +" elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scn.nextInt();
        }
        /*for (int i = 0; i < a.length; i++) {
            System.err.println("["+a[i]+"]");
            
        }*/
        /*int  index=0;
        while (index<a.length) { 
            System.out.println(a[index]);
            index++;
            
        }*/
        for(int item:a)
        {
            System.err.println(item);
        }
    }

}
