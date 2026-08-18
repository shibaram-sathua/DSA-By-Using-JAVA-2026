package OOPS;

public class InterfaceExamples {
    //its simply abstract class with all abstract methods
    //purpose to achieve polymorphism
    //one calss can be implemented from more than one interfaces
    //class SmartPhone extends Phone implements ICamera, IMusicPlayer{}
    //SmartPhone s = new SmartPhone();
    //Phone p = s;// it will only call the phone methods
    //ICamera c = s; it will only call the ICamera methods
    //IMusicPlayer m = s; it will only call the IMusicPlayer methods


    //donts and do
    //1 by default the mthods inside the interface are public and abstract
    //2 it can not be private
    //3 we can have member and those are final and static by default.
    //can not have body for a method inside an interface
    //it can have static method with body.
    //i can access the member static method by using interface name and proceeding with
    //A interface can extends from another interface
    //it can have default methods inside an interface
    //i can have private methods but those are not abstract by default and these private are used in default method.
    //i can call a dog as animal
    // but i can not call a Suzuki car as a musicplay though i can play music inside it
    //has a interface
    //is a inheritance


}
