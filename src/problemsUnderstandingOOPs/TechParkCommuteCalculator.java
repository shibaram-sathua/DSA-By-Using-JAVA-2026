package problemsUnderstandingOOPs;
import java.util.ArrayList;
class CommuteService{

    //in commute serivce we only need one method
    //it accepts any objects that implements ITransprotMode
    public void calculateTripCost(ITransportMode mode, double distanceInKm){
        //the magic happens here the jvm dynamically dispatch
        double fare = mode.calculateTransportFares(distanceInKm);
        //usgin mode.getClass().getSimpleName() will print car citybus dynamically
        System.out.println("Cost by "+mode.getClass().getSimpleName()+": "+fare);
    }

}
interface  ITransportMode{
    double calculateTransportFares(double distanceInKm);
}
class Metro implements ITransportMode{
    private final double baseFare = 10;
    private final double ratePkm = 3;
    @Override
    public double calculateTransportFares(double distanceInKm) {
        return baseFare+(ratePkm * distanceInKm );
    }
}
class CityBus implements ITransportMode{
    private final double baseSafetyFare = 5;
    private double rate = 2;
    @Override
    public double calculateTransportFares(double distanceInKm) {
        return (baseSafetyFare/2)+(rate*distanceInKm+2);
    }
}
class Cab implements ITransportMode{
    private final double baseFare = 12;
    private double ratePkm = 3;
    private static double surgeMultiplier = 1.0;
    @Override
    public double calculateTransportFares(double distanceInKm) {
        return baseFare*surgeMultiplier*distanceInKm;
    }
}
public class TechParkCommuteCalculator {
    public static void main(String[] args){
        CommuteService service = new  CommuteService();
        double distanceInKm = 15;
       service.calculateTripCost(new Metro(),distanceInKm);
       service.calculateTripCost(new Cab(),distanceInKm);
       service.calculateTripCost(new CityBus(),distanceInKm);
    }
}
