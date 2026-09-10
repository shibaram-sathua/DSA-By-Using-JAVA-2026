package problemsUnderstandingOOPs;
// interface segrefation
interface IPaymentHandler{
    boolean pay(double amount);
}
interface IInventoryManager{
    boolean reserveItem(String itemId);
}
interface INotificationSender{
    boolean sendReceipt(String message);
}
class UPIPayment implements IPaymentHandler{
    @Override
    public boolean pay(double amount){
        System.out.println("Processing the order amount");
        return true;
    }
}
class BangaloreWareHouse implements IInventoryManager{
    @Override
    public boolean reserveItem(String itemId) {
        System.out.println("Reserved in inventory"+itemId);
        return true;
    }
}
class SmsNotifier implements INotificationSender{
    @Override
    public boolean sendReceipt(String message) {
        System.out.println("Sending: "+message);
        return true;
    }
}
class CheckOutManager{
    private INotificationSender sender;
    private IInventoryManager inventoryManager;
    private IPaymentHandler paymentHandler;
    public CheckOutManager(INotificationSender sender, IInventoryManager inventoryManager, IPaymentHandler paymentHandler){
        this.sender = sender;
        this.inventoryManager = inventoryManager;
        this.paymentHandler = paymentHandler;
    }
    public void processingOrder(String itemid, double amount){
        try{if(paymentHandler.pay(amount)){
            if(inventoryManager.reserveItem(itemid)){
                sender.sendReceipt("Order has been successfully processed");
            }
        }}
        catch(Exception e){
            System.out.println(e+"Error processing order");
        }
    }
}
public class TheUltimateOrchestrator {
    public static void main(String[] args){
        UPIPayment upiPayment = new UPIPayment();
        SmsNotifier smsNotifier = new SmsNotifier();
        BangaloreWareHouse bangaloreWareHouse = new BangaloreWareHouse();
        CheckOutManager checkOutManager = new CheckOutManager(new SmsNotifier(),new BangaloreWareHouse(), new UPIPayment());
        checkOutManager.processingOrder("Macbook PRO",167000.0);
    }
}
