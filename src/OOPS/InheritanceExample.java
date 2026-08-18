package OOPS;

public class InheritanceExample {
    public static void main(String[] args){
        //inheritance = specialization
        //interface = polymorphism
        //acquring propertied and methods from an existing class to the one class
        Cylinder cylinder = new Cylinder();
        int radius = cylinder.getRadius();
        System.out.println(radius);
        Parent child = new Child(45);
    }
}
class Circle{
    private int radius = 20;
    public int getRadius(){
        return radius;
    }


}
class Cylinder extends Circle{

}
//cylinder having every properties from the circle
//private members are not directly accessible in child class
//constructors in inheritance
class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
    public Parent(int rad){
        System.out.println("Parent param Constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
    public Child(int rad){
        super(rad);
        System.out.println("Child param Constructor");
    }
}

