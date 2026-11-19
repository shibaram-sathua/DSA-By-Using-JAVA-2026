package generics;
class Pot<T>{//so this is the type parameter
    private T value;
    Pot(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
    public void setValue(T value){
        this.value = value;
    }
}

// i can do this also
class Pair<T,U>{
    private T value1;
    private U value2;
    Pair(T value1, U value2){
        this.value1 = value1;
        this.value2 = value2;
    }
}
public class DemoGenerics {
    public static void main(String[] args){
        Pot<Integer> p1 = new Pot<>(34);
        System.out.println(p1.getValue() + 34);
        Pot<String> p2 = new Pot<>("Shibram");
        System.out.println(p2.getValue()+344);
        Pair<String,Integer> pair = new Pair<>("Shibaram",34);
    }


}
