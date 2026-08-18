package OOPS;
import java.io.IO;
//why do i create a construcotr
class Super{
    Super(){
        System.out.println("Super");
    }
}




public class ConstructorExample {
    public static void main(String[] args) {
        Integer num = Integer.parseInt(IO.readln("Enter a number: "));
        IO.println(num);
        IO.println(num.getClass().getSimpleName());
        Super s = new Super();
    }
}
