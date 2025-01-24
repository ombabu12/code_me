
public class recursion_1st_occurence_of_an_element_in_an_array {

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,4,9,5,6,4,9,0};
        int item=9;
        int idx=0;
        int x=first_occurenece(arr,item,idx);
        System.err.println(x);
    }
    public static int first_occurenece(int[] arr,int item,int idx){
        if(arr[idx]==item){
            return idx;
        }
        return first_occurenece(arr,item,idx+1);
    }
    }


