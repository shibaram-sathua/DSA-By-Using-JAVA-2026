import java.util.Scanner;
public class ReverseByWord{

    static String revStrByWrd(String s){
        //split the string by dots
        String[] words = s.split("\\.");

        // to reverse the string into a list or into a mutable stringbuiler
        StringBuilder str = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            //to skip all those spaces caused by leading and multiple dots
            if(!words[i].isEmpty()){
                if(str.length() > 0){
                    str.append(".");
                }
            }
            str.append(words[i]);
        }
        return str.toString();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String s = sc.nextLine().trim();
        System.out.println(revStrByWrd(s));
        sc.close();

    }
}
