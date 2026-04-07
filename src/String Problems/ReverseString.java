import java.util.Scanner;
public class ReverseString {
    static String Solution1(String str){
        String s1 = "";
        for(int i = str.length() - 1; i >= 0; i--){
            s1 = s1 + str.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the string:");
        String s1 = new String();
        s1 = sc.nextLine().trim();
        System.out.println(ReverseString.Solution1(s1));
        sc.close();
    }
}
