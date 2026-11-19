package generics;
//this is generic method

public class GenericMethod {
    public static <T> T getResult(T value) {
        return value;
    }

    public static <T> void printResult(T value) {
        System.out.println(value);
    }
    //access modifiers <T> returnType methodName (T parametername){

//}


    //i only want numbers to be used as the generic data type
    // and this is called bounds in generics
    // upper bound

    public static void main(String[] args){
        Gen<Integer> gen1 = new Gen<>();
        gen1.value = 23;
        gen1.printDouble();
    }

}
class Gen<T extends Number>{
    T value;
    public void printDouble(){
        System.out.println(value.doubleValue());
    }
    //so upper bound tells that T can be atleast Number or its subtype
    // we can add more constraint to it
//    class Box <T extends Animal & Swimmable, Flyable>
}
