

public class diagonal_sum {
    public static int daig_sum(int matr[][]){
        //pd
        int sum=0;
        if(matr.length==matr[0].length){
        /*for (int i = 0; i <matr.length; i++) {
            for (int j = 0; j <matr[0].length; j++) {
                if(i==j){
                    sum+=matr[i][j];
                }
                else if(i+j==matr.length-1){
                    sum+=matr[i][j];
                }
            }
        }*/
        for (int i = 0; i <matr.length; i++) {
            //pd
            sum+=matr[i][i];
            //sd
            if(i!=matr.length-1-i){
            sum+=matr[i][matr.length-1-i];
        }
    }
    }
    
        return sum;
    }
public static void main(String[] args) {
    int matr[][]={{1,2,3},{4,5,6},{7,8,9}};
    System.err.println(daig_sum(matr));
}
}
