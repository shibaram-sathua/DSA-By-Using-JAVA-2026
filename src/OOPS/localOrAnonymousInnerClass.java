package OOPS;
class out{
    //local means inside a method
    void display(){
        class In{
            int y = 45;
            void innerDisplay(){
                System.out.println("ehllo");
            }
        }
        In i = new In();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class localOrAnonymousInnerClass {
    static out o = new out();
    static void main(){
        o.display();
    }
}
