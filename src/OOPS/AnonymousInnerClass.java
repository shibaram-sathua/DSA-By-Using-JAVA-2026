package OOPS;
abstract class My{
    abstract void display();
}
class O{
    public void meth(){
        My m = new My(){
            @Override
            void display(){
                System.out.println("Hello");
            }
        };
        m.display();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){
        O o = new O();
        o.meth();

    }

}
