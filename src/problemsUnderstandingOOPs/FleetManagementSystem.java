package problemsUnderstandingOOPs;
interface Aircraft{
     void takeOff();
    public void land();
}
class CommercialJet implements Aircraft{
    private PassengerCabin pc;
    public CommercialJet(PassengerCabin pc, int count){
        this.pc = pc;
        pc.boardPassenger(count);
    }
    @Override
    public void takeOff(){

    }
    @Override
    public void land(){

    }
}
class CargoPlane implements Aircraft{
    public CargoPlane(FreightHold fh, double tonnage){
        fh.loadCargo(tonnage);
    }
    @Override
    public void takeOff(){

    }
    @Override
    public void land(){

    }
}
class PassengerCabin{
    int maxPassengerCapacity = 230;
    public void boardPassenger(int passengerCapacity){
        if(passengerCapacity > maxPassengerCapacity){
            System.out.println("Passenger capacity exceeded");
        }
        else{
        System.out.println("Passenger capacity: " + passengerCapacity+" boarded in commercial jet");}
    }
}
class FreightHold{
    double maxCargoWeight = 100;
    public void loadCargo(double tonnage){
        if(tonnage > maxCargoWeight){
            System.out.println("Freight capacity exceeded");
        }
        else{
        System.out.println("Freight capacity: " + tonnage +" loaded in cargo plane");}
    }
}
public class FleetManagementSystem {
    public static void main(String[] args){
        CommercialJet c = new CommercialJet(new  PassengerCabin(), 1590);
        c.takeOff();
        CargoPlane cb = new CargoPlane(new  FreightHold(), 50);
        cb.takeOff();
    }
}
