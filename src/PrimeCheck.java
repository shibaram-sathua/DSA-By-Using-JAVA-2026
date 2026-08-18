import java.util.Scanner;
public class PrimeCheck {
    static Boolean prime(int number){
        boolean ans;
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return ans = false;
            }
        }
        return ans = true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println(prime(number)?true:false);
        }

}
