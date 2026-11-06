package generics;

class Box{
   private int value;
   public Box(int value){
       this.value = value;
   }
   public void setValue(int value){
       this.value = value;
   }
   public int getValue(){
       return this.value;
   }


}
public class ExampleGenerics {
    public static void main(String[] args){
        String s = "hello";
        Object obj = s;
        System.out.println(obj);
        Object obj2 = "Hello";
        String str = (String)obj2;
        System.out.println(str);
        //compile time error are better than runtime error
        //what is generics


    }
}
