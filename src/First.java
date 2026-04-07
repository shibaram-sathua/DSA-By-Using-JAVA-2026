import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedInputStream;
public class First {
    public static void main(String[] args){
//        System.out.print("Enter your age: ");

//        int age = sc.nextInt();//help to store integer
//        System.out.println(age);

       //for(initialization, condition, updation){}

//        int[] nums = {1,2,3,4,5};
//        int[] digits = new int[]{1,2,3,4,5};



        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int[] nums = new int[98];
        int[] arr = {2,3,4,5};
        System.out.println("The length of the array is: "+arr.length);
        System.out.println("Enter 5 random numbers");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter "+(i+1)+"st number: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1= new BufferedReader(new InputStreamReader(System.in));
    }

}
