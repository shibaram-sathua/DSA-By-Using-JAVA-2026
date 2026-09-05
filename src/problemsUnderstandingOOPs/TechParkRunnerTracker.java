package problemsUnderstandingOOPs;
class RunningSession{
    private double distanceInKm;
    private double timeInMinutes;
    public RunningSession(double distanceInKm, double timeInMinutes){
       setDistanceInKm(distanceInKm);
        setTimeInMinutes(timeInMinutes);
    }
    public void setDistanceInKm(double distanceInKm){
        if(distanceInKm < 0){
            throw new IllegalArgumentException("Values can not be negative");
        }
        this.distanceInKm = distanceInKm;
    }
    public void setTimeInMinutes(double timeInMinutes){
        if(timeInMinutes < 0){
            throw new IllegalArgumentException("Values can not be negative");
        }
        this.timeInMinutes = timeInMinutes;
    }
    public double calculatePace(){
        return timeInMinutes / distanceInKm;
    }

}
public class TechParkRunnerTracker {
    public static void main(String[] args){
        RunningSession runningSession = new RunningSession(5, 25);
        double pace = runningSession.calculatePace();
        System.out.println(pace);
        runningSession.setTimeInMinutes(24);
        pace = runningSession.calculatePace();
        System.out.println(pace);
        runningSession.setDistanceInKm(-25);

    }
}
