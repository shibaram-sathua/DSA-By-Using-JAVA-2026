package javaEnum;
enum PaymentSts {
    SUCCESS,
    FAILED,
    PENDING
}
public class DemoEnum {
    //predefined set of constants
    //Enum --> Enumerations (Enumerated type)
    public static void main() {
        PaymentSts status =  PaymentSts.SUCCESS;
//        PaymentSts status2 =  100;
        System.out.println(status.name());
    }
}
