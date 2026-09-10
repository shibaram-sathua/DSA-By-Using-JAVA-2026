package problemsUnderstandingOOPs;
//the goal is interface segregation
interface IElectronicReturn{
    boolean inspectHardware();
}
interface IApparelReturn{
    boolean checkSizeAndFit();
}
class DigitalPencil implements IElectronicReturn{
    @Override
    public boolean inspectHardware(){
        System.out.println("Checking battery and bluetooth syncc...");
        return false;
    }
}
class RunnigShoe implements IApparelReturn{
    @Override
    public boolean checkSizeAndFit(){
        System.out.println("Checking for wear and tear on the shoes...");
        return true;
    }
}
class ReturnService{
    public void processReturn(IElectronicReturn item){
        if(item.inspectHardware()){
            System.out.println("refund approved");
        }
        else {
            System.out.println("refund rejected");
        }
    }
    public void processReturn(IApparelReturn item){
        if(item.checkSizeAndFit()){
            System.out.println("refund approved");
        }
        else {
            System.out.println("refund rejected");
        }
    }
}
public class ECommerceReturnsProcessor {
    public static void main(String[] args){
        ReturnService returnService = new ReturnService();
        DigitalPencil digitalPencil = new DigitalPencil();
        RunnigShoe runnigShoe = new RunnigShoe();
        returnService.processReturn(digitalPencil);
        returnService.processReturn(runnigShoe);
    }
}
