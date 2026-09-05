package problemsUnderstandingOOPs;

interface IPaymentProcessor{
    boolean processPayment(Transaction transaction);
}
class CreditCardProcessor implements IPaymentProcessor{
    private  long creditCardNumber;
    private  short cvv;
    public CreditCardProcessor(long  creditCardNumber, short cvv){
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(Transaction transaction) {
        System.out.println("Processing $"+transaction.getAmount()+" via credit card ");
//        return transaction.isSuccessful();
        return true;
    }
}
class UPIProcessor implements IPaymentProcessor{
    private String UPIid = "3284983748@axis.upi";
    @Override
    public boolean processPayment(Transaction transaction){
        System.out.println("Processing $"+transaction.getAmount()+" via UPI ");
//        return transaction.isSuccessful();
        return true;
    }
}
class Transaction{
    private String transactionId;
    private double amount;
    private boolean isSuccessful;
    public Transaction(String transactionId, double amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }
    public boolean isSuccessful(){
        return this.isSuccessful;
    }
    public void setSuccessful(boolean isSuccessful){
        this.isSuccessful = isSuccessful;
    }

}
class CheckOutService{
    private IPaymentProcessor paymentProcessor;
    public CheckOutService(IPaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }
    public void checkOut(Transaction transaction){
        //capture the result
        boolean paymentResult = paymentProcessor.processPayment(transaction);
        //update the transaction state
        transaction.setSuccessful(paymentResult);
        //print the final system status
        if(transaction.isSuccessful()){
            System.out.println("SUCCESSFUL: "+transaction.isSuccessful()+" via checkout ");
        }
        else {
            System.out.println("FAILED: "+transaction.isSuccessful()+" via checkout ");
        }
    }
}
public class ThePaymentGatewaySystem {
    public static void main(String[] args){
        Transaction transaction = new Transaction("12345", 1500.50);
//        transaction.setSuccessful(false);
        UPIProcessor upiProcessor = new UPIProcessor();
        CheckOutService checkOutService = new CheckOutService(upiProcessor);
        checkOutService.checkOut(transaction);

    }
}
