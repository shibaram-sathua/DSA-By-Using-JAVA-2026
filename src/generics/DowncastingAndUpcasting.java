package generics;
class Animal{
    public void walk(){

    }
    public void run(){

    }
    public void eat(){

    }
}
class Dog extends Animal{
    public void bark(){

    }
}
class BoxExample{
    private Object value;
    public BoxExample(Object value){
        this.value = value;
    }
    public Object getValue(){
        return this.value;
    }
    public void setValue(Object value){
        this.value = value;
    }
}
public class DowncastingAndUpcasting {
    //so downcasting and upcasting only works upon the thing inside a hirerrachy and parent child class not the
    // neighobour class
    // so java is a type safety language
    public static void main(String[] a){
        BoxExample box = new BoxExample("Shibaram");
        System.out.println(box.getValue());
        System.out.println(box.getValue() + "Shiba");
        BoxExample box1 = new BoxExample(23);
       //System.out.println(box1.getValue()+45);// we cannot do this fot this we have to downcast it..

        Integer x= (Integer) box1.getValue();






       int  value = 10;
//        System.out.println(value);
        String s  = "hello";
//        System.out.println(s);
        //int i = (int) s;//compiler will tell you that is it is incompatible to convert
        //String str = (String) value; // it will also tell that is inconvertible type
        byte b = 34;
        int it = (int) b;
//        it can posssible because they come under same umbrella
//        System.out.println(it);

        //it is called downcasting

        int op = 3095;
        byte bo = (byte) op;
//        it also can be possible because they are under same umbrella

//        System.out.println(bo);
//        it is called upcasting

//        java is a typed language

        Animal animal = new Animal();
        Animal animal2 = new Dog();
//        animal2 can call the animal methods not the dog methods
        Dog dog = new Dog();
//        Dog dog2 = new Animal(); it can not be possible to run compiler will give you the error that it wont be happen


        //casting in non-primitive
        Object obj = "Shibram Sathua";
        String name = (String) obj;
        //the compiler will not tell or decide while it is running jvm will decide convert into the string ffrom the
        // object by seeing the value and give it to the string data typed value.
//        System.out.println(name);

        Integer intk = 45;
        //String name2 = (String) intk;// wheen i wrote this compiler will find the details of error but
//        as it is obvious that the compiler could find this becasuse the datatype is already metnioned if i changed
//        into the Integer into a object type compiler will not decide whether it is a string type or number type


//        Object num = 34;
//        String numasString = (String)num;
//        System.out.println(numasString);
        //it is good to get error in compile time rather than getting exception while it is running becuase it take a
        // few efforts to solve the error before than the run of the program//compile time error is much better than
        // runtime
        //so here i got ClassCastException and it is better ti have error in compile time







        //then generics come into picture these are the problems before generics came into picture
        // 1 type is lost
        // 2 wrong object could be inserted
        // 3 casting became necessary when reading
        // 4 many error shif to runtime

    }


}
