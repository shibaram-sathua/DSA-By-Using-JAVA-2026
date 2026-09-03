package aboutListInterface;
import java.util.ArrayList;
import java.util.List;

public class LearnAboutArrayList {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.get(1));
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("For each loop");
        for(int k : list){
            System.out.println(k);
        }

        System.out.println("Existance");
        System.out.println(list.contains(50));
        System.out.println(list.contains(3));

        System.out.println("remove");
        System.out.println(list.remove(1));

        System.out.println("add or insert something");
        list.add(2,89);

        System.out.println("set");
        System.out.println("It will replace the index number");
        list.set(2,89);

        System.out.println(list);









    }
}
