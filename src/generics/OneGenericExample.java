package generics;
class Animal1{
    void eat(){}
}
interface Swimmable{
    void swim();
}
class Dog1 extends Animal1{
    void bark(){}
}
class Fish extends Animal1 implements Swimmable{
    @Override
    public void swim(){
        System.out.println("fish swimming");
    }
}
class Thing<T extends Animal1 & Swimmable>{
    T value;
    Thing(T value){
        this.value = value;
    }
}

public class OneGenericExample {
    public static void main(String[] args) {
//        Thing<Animal1> t = new Thing<>();
//        Thing<Dog1> t1 = new Thing<>();
          Thing<Fish> t3 = new Thing<>(new Fish());
//        Thing<Integer> t4 = new Thing<>(34);
    }
}
