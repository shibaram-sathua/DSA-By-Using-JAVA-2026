public class StringExample {
    public static void main(String[] args){
        System.out.println("THis is Shibaram Sathua");
        String s1 = new String("Cuttack");
        String s2 = new String("Bhubaneswar");
        String s3 = new String("Cuttack");
        //s1 create new one object in heap memeory and in string constant pool
        //s2 create new one object in heap memoey and in string constant pool
        //here s1 and s3 have the same value but they referecning different objects so that they create object
        String s4 = "Priya";
        String s5 = "Priya";
//        System.out.println(s4 == s5);
//        System.out.println(s4.equals(s5));

//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));


        char[] c = {'w','e','l','c','o','m','e'};
//        String s6 = String.valueOf(c);
        System.out.println(c);
//        System.out.println(s6);
    }
}
