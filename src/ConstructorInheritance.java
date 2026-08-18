class Parent{
    int x;
    public Parent(){
        System.out.println("Parent non param");
    }
    public Parent(int x) {
        System.out.println("Parent Param");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child non param");
    }
    public Child(int x){
        System.out.println("Child param");
    }
    public Child(int x, int y){
        super(x);
        System.out.println("child two param");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
//          Parent p = new Parent();
//          Parent p = new Parent(23);
//          Child c = new Child();
//          Child c2 = new Child(34);
//          Parent p = new Child();
//          Parent p = new Child(34);
            Parent p2 = new Child(23,45);

    }
}
