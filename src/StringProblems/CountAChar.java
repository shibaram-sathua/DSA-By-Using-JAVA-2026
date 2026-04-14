
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.Scanner;
public class CountAChar {
    static int countCharInAString(String str, char target){
        int count = 0;
        for(int i = 0; i <= str.length() - 1; i++){
            if(str.toLowerCase().charAt(i) == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine().trim();
        System.out.println("Enter the character to find the counts in the string");
        char c = sc.next().trim().charAt(0);
        System.out.println(countCharInAString(str, c));
        sc.close();
    }
}
