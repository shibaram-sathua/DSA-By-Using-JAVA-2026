import java.util.Arrays;
import java.util.Scanner;
class Demo{
    static void update(int[] arr){
      int start = 0;
      int end = arr.length - 1;
      while(start < end){
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
      }
    }
}
public class AllAboutMethods {
//    static int max(int c, int d){
//        if(c > d){
//            return c;
//        }else {
//            return d;
//        }
//    }
    public static void main() {
//        int ans = max(3,4);
//        System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the elements: of index "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Demo.update(arr);
        System.out.println(Arrays.toString(arr));
        //here because we are passing the reference to the object if we modify something inside the method it will also updtate the actuall object.
    }
}
