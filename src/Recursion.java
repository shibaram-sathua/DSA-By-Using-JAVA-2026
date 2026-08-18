public class Recursion {
    //only recursion
    // a function call itself
    static void fun(int n){
        if(n > 0){
            System.out.println(n);
            fun(n - 1);
        }
    }
    //function which follows recursion but backtracked
    static void gun(int n){
        if(n > 0){
            gun(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args){
//        fun(3);
        gun(3);
    }

}
