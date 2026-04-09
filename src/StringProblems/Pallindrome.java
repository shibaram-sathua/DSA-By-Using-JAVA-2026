package StringProblems;
import java.util.Scanner;
public class Pallindrome {
    static String reverseStr(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to check whether it is pallindrome or not!");
        String str = sc.nextLine().trim().toLowerCase();
       // System.out.println(reverseStr(str));
        if(str.equals(reverseStr(str))){
            System.out.println("pallondrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
        sc.close();
    }
}
