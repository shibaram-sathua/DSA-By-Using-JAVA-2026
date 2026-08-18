package OOPS;
//classes: Store, Customer, Member
//store needs to register a customer first as a member
//store should invite the members using inviteSale  method
//customer should have to reply that with his name by using call back mmethod
class Store{
    IMember[] mem = new IMember[100];
    int count = 0;
    void register(IMember m){
        mem[count++] = m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].callBack();
        }
    }
}
interface IMember{
    void callBack();
}
class Customer implements IMember{
    String name;
    Customer(String name){
        this.name = name;
    }
    @Override
    public void callBack() {
        System.out.println("Ok I will visit"+name);
    }
}

public class CallBackMethod {
    public static void main(String[] args){
        Store store = new Store();
        Customer customer = new Customer("Jack");
        Customer customer1 = new Customer("Jane");
        store.register(customer);
//        store.register(customer1);
        store.inviteSale();
    }
}
