package OOPS;
abstract class Super2{
    int age = 34;
    final int M = 34;
//i can have constructor inside a abstract class
    Super2(){
        System.out.println("Super2");
    }
    void method1(){
        System.out.println("method1");
    }
    void method2(){
        System.out.println("method2");
    }//it can have concrete methods also

    abstract  void method3();
}
public class AbstractionClass {
    public static void main(String[] args){

    }
}
//dont and do
//They can have reference of abstract class but can not have a object of abstract class
//if one abstract method is there class must be declared abstract
//if a class is abstract i can not make it final as it mean to be extended ot inherited
//i can not make the method as final also, becasue we  can not override the abstract method are meant to be overrides
//abstract class can not be static also
//it can have concrete methods. and members also
//abstract method cannot be static
//if one class is extending from abstract class it should override all the abstract method.

