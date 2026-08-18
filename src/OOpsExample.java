public class OOpsExample {
    //what is a class
    //basically its definition of an actual object
    //like we can say the design of a car
    //

}
class Tv{
    private int channel;
    private int volume;
    public void changeChannel(){
        System.out.println("Changing the volume");
    }


    public void changeVolume(){}
}
class Test{
    public static void main(String[] args){
        Tv  t = new Tv();
        t.changeChannel();
        t.changeVolume();
    }

}

