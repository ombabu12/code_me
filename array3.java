public class array3 {
    public static void main(String[] args) {
       int arr1[]={1,2,3,4,5};
       int max=arr1[0];
       int min=arr1[0];

       for(int i=0;i<5;i++)
       {
        if(max<arr1[i])
        {
            max=arr1[i];
        }
       }
       System.out.println("maximum element is"+max);

       for(int i=0;i<5;i++)
       {
        if(min>arr1[i])
        {
            min=arr1[i];
        }
       }
       System.out.println("minimum element is"+min);

    }

    private static int extracted() {
        return 0;
    }
}
