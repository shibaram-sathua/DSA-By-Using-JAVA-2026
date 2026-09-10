package problemsUnderstandingOOPs;
interface PricingStrategy{
    double calculateFinalPrice(double orderTotal);
}
class NoDiscountStrategy implements PricingStrategy{
    @Override
    public double calculateFinalPrice(double orderTotal) {
        return orderTotal;
    }
}
class FlatDiscountStrategy implements PricingStrategy{
    private double discountAmount;
    public FlatDiscountStrategy(double discountAmount){
        if(discountAmount < 0){
            throw new IllegalArgumentException("Discount amount cannot be negative");
        }
        this.discountAmount = discountAmount;
    }
    @Override
    public double calculateFinalPrice(double orderTotal) {
        // Subtract the discount. If it drops below 0, return 0 instead.
        return Math.max(0, orderTotal - discountAmount);
    }
}
class PercentageDiscountStrategy implements   PricingStrategy{
    private double percentage;
    public PercentageDiscountStrategy(double percentage){
        if(percentage < 0){
            throw new IllegalArgumentException("Percentage cannot be negative");
        }
        this.percentage = percentage;
    }
    @Override
    public double calculateFinalPrice(double orderTotal) {
        double discount = orderTotal * (percentage / 100.0);
        return Math.max(0, orderTotal - discount);
    }
}
class Order{
    private double orderTotal;
    private PricingStrategy  strategy;
    public Order(double orderTotal){
        this.orderTotal = orderTotal;
        this.strategy = new NoDiscountStrategy();
    }
    public void setStrategy(PricingStrategy strategy){
        this.strategy = strategy;
    }
    public void finallBill(){
        double finalPrice = this.strategy.calculateFinalPrice(orderTotal);
        System.out.println("Final Price: " + finalPrice);
    }
}
public class TheFoodDeliveryPricingEngine {
    public static void main(String[] args){
        Order o = new Order (500);
        o.finallBill();
        o.setStrategy(new FlatDiscountStrategy(50));
        o.finallBill();
        o.setStrategy(new PercentageDiscountStrategy(50));
        o.finallBill();
    }
}
