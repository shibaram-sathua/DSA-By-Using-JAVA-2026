import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        String fruit;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter fruit name: ");
        fruit = sc.nextLine();
        switch(fruit){
            case "Mango" -> System.out.println("Mango");
            case "Apple" -> System.out.println("Apple");
            case "Orange" -> System.out.println("Orange");
            case "Amla" -> System.out.println("Amla");
            case "Banana" -> System.out.println("Banana");
            case "Apple and Orange" -> System.out.println("Apple and Orange");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
