import java.util.Arrays;
public class Welcome {
    public static void main(String[] args) {
        System.out.println("this is a new welcome program");
        System.out.println("this is shibram sathua");
        System.out.println("SHibaram Sathua");

        int[] arr = new int[]{1,2,4,5,56,90};
        for(int i : arr){
            if(i == arr[0])
                System.out.print("[");
            System.out.print(i+", ");
            if(i == arr[arr.length -1])
                System.out.print("]");
        }
//        System.out.println(Arrays.toString(arr));
    }
}
