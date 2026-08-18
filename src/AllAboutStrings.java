public class AllAboutStrings {
    public static void main(String[] args){
        //string stored in string constant pool
        char[] c = {'s','h','i','b','a'};
        String str = new String(c);
        System.out.println(c);

        String city2 =new String("Cuttack");
        String city1 = new String("Cuttack");
        System.out.println(city2 == city1);
        System.out.println(city1.equals(city2));
    }
    //public final class String extends Object implements charSequence, seriziable, comparable{}
    String s = "shibara";
    //string contstant pool (scp)
    //to create string there are three classes
    //String StringBuffer StringBuilder
    //

    //so instance variable are stored in heap area
    //local variable are stored in stack area
    //static variable are stored in method area

    //main() is a method stored in stack area
    //object stored in heap area
    //t.show() is sotored in stack area


    //string constant pool is inside the heap area

    String sname = new String("Shibara");
    //this will create two objects

    String sname2 = "Shibaram";
    // it will only create one object
    //inside in string constant pool the object will get created
    //in scp garbage collector will not work as

    //why it is immutable
    String sub = new String("Network Programming");
    String s2 = sub.concat("For Btech");



    String city1 = "cuttack";

    String city3 = "Cuttack";

    //why it be final
    // treated like constant or not to be inheritae

    //immutable ? the string objects are immuatable which means once string object is created its fata or state can not be changed but a new string object is created

//so these are the constructor
    //public String(){}
    //public String(String str){}
    //public String(StringBuffer sb){}
    //public String(StringBuilder sv){}
    // public String(char[] arr){}
    // public String(byte[] arr){}




}
