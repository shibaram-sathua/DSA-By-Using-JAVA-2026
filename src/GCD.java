public class GCD {
    public static void main(String[] args){
        int m  = 56;
        int n = 64;
        while(m != n){
            if(m > n){
                m = m - n;
            }
            else{
                n = n - m;
            }
        }
        System.out.println(m);
    }

}
