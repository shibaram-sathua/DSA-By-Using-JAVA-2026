import java.util.*;
public class ArrayLIstJava {
//    static void clearConsole() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }
    static void main(String[] args) {
        //its a resiable array
//        int[] arr = new int[5];
//        arr = new int[10];
//        System.out.println(arr.length);

//        ArrayList<Integer> list = new ArrayList<>(4);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        for(int i: list){
//            System.out.println(i);
//        }
//        System.out.println(Arrays.toString(list.toArray()));
//
//        var arr2 = new ArrayList<Integer>();
        //arraylist store objects not primitve data type

        Scanner sc = new Scanner(System.in);
        var names = new ArrayList<String>();
        for(int i = 0; i < 5; i++){
            System.out.print("Enter the name: ");
            names.add(sc.nextLine());
//            clearConsole();
        }
        System.out.println(Arrays.toString(names.toArray()));
        System.out.println(names.get(3));
    }
}
