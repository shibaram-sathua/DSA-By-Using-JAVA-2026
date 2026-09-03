package javaEnum;

class PaymentStatus{
    //if i make all these fields as string then
    public static final String SUCCESS = "Success";
    public static final String FAILURE = "Failure";
    public static final String PENDING = "Pending";
}
class Roles{
    //if i make all these fields as string then
    public static final int USER = 1;
    public static final int ADMIN = 2;
    public static final int MANAGER = 0;
}

/*
problems
Type Safety
poor readability
no grouping of related entities
duplicate is also a problem same with the string data type
enum introduced in java 5

*
*
* */
public class shiba {
    static void main() {
        String status = PaymentStatus.SUCCESS;
        int succees1 = 200;//it makes no sense either i do have to assign 1 to it or PaymentStatus.SUCCESS

        //so if anyone see this code he or she will have to go to see the enum in every time
        //here 2 makes no senses
        //we need something like the status one can know which status it is representing
        //here i am comparing status with the emoloyee role so it dosent make any sense // if i have written this accidently it will run perfect but it dosn'e carry any logic beghind. so it makes mo sense.
        //idhar nhi hoga because of this lower case//there are more complex things

        if (status == "success") {

        }

    }
}
