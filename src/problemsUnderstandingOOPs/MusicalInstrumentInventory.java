package problemsUnderstandingOOPs;

import java.util.ArrayList;
import java.util.List;

abstract class Instrument{
    private String brand;
    private double price;
    Instrument(String brand,double price){
        this.brand=brand;
        this.price=price;
    }
    String getBrand(){
        return brand;
    }
    double getPrice(){
        return price;
    }
    abstract void playSound();
}
class AcousticGuitar extends Instrument{

    public AcousticGuitar(String brand, double price){
        super(brand,price);
    }
    @Override
    public void playSound(){
        System.out.println("Strimming Acoustic chords");
    }
    public void tunedIn(){
        System.out.println("Tuning Acoustic chords");
    }
}
class ElectricKeyboard extends Instrument{
    public ElectricKeyboard(String brand, double price){
        super(brand,price);
    }
    @Override
    public void playSound(){
        System.out.println("Playing synth melody");
    }
    public void plugin(){
        System.out.println("Connecting to the power");
    }

}
public class MusicalInstrumentInventory {
    public static void main(String[] args){
        List<Instrument> listOfInstruments = new ArrayList<Instrument>();
        listOfInstruments.add(new AcousticGuitar("Kadence A281 Guitar",7800));
//        listOfInstruments.add(new ElectricKeyboard("Yamaha",5000));
        for(Instrument instrument : listOfInstruments){
            instrument.playSound();

            if(instrument instanceof AcousticGuitar){
               AcousticGuitar guitar = (AcousticGuitar) instrument;
               guitar.tunedIn();
            }
            else if(instrument instanceof ElectricKeyboard){
                ElectricKeyboard keyboard = (ElectricKeyboard) instrument;
                keyboard.plugin();
            }

            //i can write like this
            /*
            if(instrument instanceof AcousticGuitar guitar){
            guitar.tunedIn();
            }
            //this is modern and cleaner called pattern variable and downcasting
            * */
        }
    }
}
