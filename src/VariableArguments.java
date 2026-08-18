import java.io.IO;
public class VariableArguments {
    static void show(int ...v){
        int sum = 0;
        for(int a: v){
            sum += a;
        }
        System.out.println(sum);
    }

    static void main() {
        show(new int[]{1,2,3,5,6,98});
//        String name = IO.readln("Enter yout name: ");
//        IO.println("hello world "+name+" you are welcome");

    }
}
