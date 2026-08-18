package OOPS;
class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine our = null;
    private CoffeeMachine(){
        coffeeQty = 1;
        waterQty = 1;
    }
    static public CoffeeMachine getInstance(){
        if(our == null){
            our = new CoffeeMachine();
        }
        return our;
    }
}
public class SingletonCLass {
    static void main() {

    }
}
