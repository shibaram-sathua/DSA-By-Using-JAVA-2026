package problemsUnderstandingOOPs;
import java.util.List;
import java.util.ArrayList;
class SmartPhone{
    private final List<ILinkedDevice> linkedDevices = new ArrayList<ILinkedDevice>(10);
    public void pair(ILinkedDevice iLinkedDevice){
        linkedDevices.add(iLinkedDevice);
    }
    public void unpair(ILinkedDevice iLinkedDevice){
        linkedDevices.remove(iLinkedDevice);
    }
    public void broadcast(String message){
       for(ILinkedDevice iLinkedDevice : linkedDevices){
           iLinkedDevice.printNotification(message);
       }
    }
}
interface ILinkedDevice{
    void printNotification(String message);
}
class Laptop implements ILinkedDevice{
    @Override
    public void printNotification(String message){
        System.out.println(message+" from "+this.getClass().getSimpleName());
    }
}
class SmartWatch implements ILinkedDevice{
    @Override
    public void printNotification(String message){
        System.out.println(message+" from "+this.getClass().getSimpleName());
    }
}
class SmartTv implements ILinkedDevice{
    @Override
    public void printNotification(String message){
        System.out.println(message+" from "+this.getClass().getSimpleName());
    }
}
public class SmartDeviceSync {
   public static void main(String[] args){
       SmartPhone smartPhone = new SmartPhone();
       ILinkedDevice smartWatch = new SmartWatch();
       ILinkedDevice laptop = new Laptop();
       ILinkedDevice smartTv = new SmartTv();
       smartPhone.pair(laptop);
       smartPhone.pair(smartWatch);
       smartPhone.pair(smartTv);
       smartPhone.unpair(smartWatch);
       smartPhone.broadcast("Hello World");
   }
}
