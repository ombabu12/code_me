public class targetsumtriplet {

    public static int triplet(int a[],int n,int target){
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for (int k =j+1; k <n; k++) {
                    if(a[i]+a[j]+a[k]==target){
                        System.err.println(a[i]+" , "+a[j]+" and "+a[k]);
                        
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []a={5,9,7,1,2,4,6,8,3};
        int n=a.length;
        int target=10;
        triplet(a, n, target);
    }

}
