
import java.util.Arrays;
import java.util.Scanner;



class bSearch{
    static int binarysearch(int arr[],int key)
    {
        int low=0;int high=arr.length-1;
        while(low<=high)
        {
            int mid=(high-low)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }
        return -1;
        
    }

}
public class binarySearch {
    public static void main(String[] args) {
        Scanner objs=new Scanner(System.in);

        System.err.println("Enter the array size");
        int size=objs.nextInt();
        
        int arr[]=new int[size];
        System.err.println("Enter the elements in an array:");
        for (int i = 0; i < size; i++) {
            arr[i]=objs.nextInt();
            
        }
        System.err.println("Enter the element to search");
        int key=objs.nextInt();
        Arrays.sort(arr);

        System.out.println(bSearch.binarysearch(arr,key));

        
    }
}
