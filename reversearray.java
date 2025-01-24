public class reversearray {
public static void main(String[] args) {
    int ak[]={10, 9, 8 ,7, 6};
    int n=ak.length;
    for(int i=0;i<n/2;i++){
        int temp=ak[i];
        ak[i]=ak[n-i-1];
        ak[n-i-1]=temp;
    }
    for(int k=0;k<n;k++){
        System.err.print(ak[k] +" ");
    }
    
    /*int n=ak.length;
    int m=1;
    int s=m+1;
    int e=n-1;
    
    
    for(int i=s;i<n-1;i++){
        int temp=ak[i];
        ak[i]=ak[n-1];
        ak[n-1]=temp;
    }

/*while(s<=e){
    int temp=ak[s];
    ak[s]=ak[e];
    ak[e]=temp;
    s++;
    e--;

}
    for(int k=0;k<n;k++){
        System.err.print(ak[k] +" ");
    }*/

}
}
