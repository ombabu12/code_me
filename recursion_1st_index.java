public class recursion_1st_index {
public static void main(String[] args) {
    int arr[]={1,2,6,4,5,3,7,8,9,3};
    int item=10;
    System.err.println(index( arr, item, 0));

}
public static int index(int[] arr,int item,int idx){
    if(idx==arr.length){
        return -1;
    }
    if(arr[idx]==item){
        return idx;
    }
    return index(arr,item,idx+1);
}
}
