import java.util.Scanner;
public class MaxmOccurringCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        // String str = "Shibaram sathua";
        int[] arr = new int[127];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
            //here arr['a']  = means arr[97]
            //char converted into ASCII value
        }
        int max = 1;
        char c = ' ';
        for(int i = 0; i < str.length(); i++){
            if(max < arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
            System.out.println(c);

    }
}
