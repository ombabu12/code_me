public class reversearray2 {
public static void main(String[] args) {
    int a[]={10,20,30,40,50};
    int n=a.length;
    int b[]=new int[n];
    int j=n;
    for (int idx = 0; idx < n; idx++) {
        b[j-1]=a[idx];
        j=j-1;
        
    }
    for(int k=0;k<n;k++){
        System.err.print(b[k] +" ");
    }
}
}
