package OOPS;
class Mamal{
    void display(){
        System.out.println("Mamal");
    }
}
class Reptile extends Mamal{
    int c = 34;
    @Override
    void display(){
        //super.display();
        System.out.println("Reptile");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Mamal r = new  Reptile();
        r.display();
        //System.out.println(r.c);// it will not get executed
    }
}
