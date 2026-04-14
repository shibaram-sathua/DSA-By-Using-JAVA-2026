package StringProblems;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseBySwapping {

    static String reverseString(String str) {
        // char[] strSequence = str.toCharArray();
        //System.out.println(Arrays.toString(strSequence));
        char[] strSequence = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strSequence[i] = str.charAt(i);
        }
        int start = 0;
        int end = strSequence.length - 1;
       while(start <= end){
           char temp = strSequence[start];
           strSequence[start] = strSequence[end];
           strSequence[end] = temp;
           start++;
           end--;
       }
       String result = "";
       for(int i = 0; i < strSequence.length; i++){
           result += strSequence[i];
       }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().trim();
        System.out.println(reverseString(str));
    }
}
