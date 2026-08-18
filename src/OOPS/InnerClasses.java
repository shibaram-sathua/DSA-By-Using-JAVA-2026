package OOPS;
class Outer{
    int s = 34;
    class Inner{
        int y = 20;
        void innerDisplay(){
            System.out.println("Inner display");
            System.out.println(y);
            System.out.println(s);
        }
    }
    void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class InnerClasses {
     static Outer outer = new Outer();
     static Outer.Inner i = new Outer().new Inner();
    static void main(){outer.outerDisplay();
        System.out.println(i.y);}
    //inner classes
    //nested
    //local
    //anonymous
    //static
    //nested

}
