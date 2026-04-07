import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        String fruit;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter fruit name: ");
        fruit = sc.nextLine();
        switch(fruit){
            case "Mango":{
                System.out.println("Mango");
                break;
            } 
            case "Apple":
                {
                    System.out.println("Apple");
                    break;
                }
            case "Orange":
                {
                    System.out.println("Orange");
                    break;
                }
            case "Amla":{
                 System.out.println("Amla");
                 break;
            }
            case "Banana":{
                 System.out.println("Banana");
                 break;
            }
            case "Apple and Orange":
                {
                    System.out.println("Apple and Orange");
                    break;
                }

            default:
                {
                    System.out.println("Please enter a valid fruit");
                    break;
                }
        }
    }
}
