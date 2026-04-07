import java.util.Scanner;
public class TakeInput {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Welcome "+name);
//
//        System.out.println("Enter the character");
//        char c = sc.next().charAt(0);
//        System.out.println("The character is "+c);


        System.out.println("THis is the test of scanner bug");
        String word = sc.nextLine();
        System.out.println(word);
        System.out.println("Enter an Integer: ");
        int firstNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("The number you have written is "+firstNumber);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        System.out.println("The sentence is "+sentence);

        

    }
}
