class Super{
    static int max(int a, int b){ return Math.max(a, b);}
    static int max(int a, int b, int c){ return Math.max(a, b) + c;}
}
public class MethodOverloading {
    public static void main(String[] args){
       int ans =  Super.max(2,3,5);
        System.out.println(ans);
    }
}
