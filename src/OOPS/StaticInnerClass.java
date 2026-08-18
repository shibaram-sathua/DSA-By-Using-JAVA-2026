package OOPS;
class Oo{
    static int x = 10;
    int y = 20;
    static class Inner{
        void display(){
            System.out.println(x);
//            System.out.println(y);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args){
        Oo.Inner i = new Oo.Inner();
        i.display();
    }
}
