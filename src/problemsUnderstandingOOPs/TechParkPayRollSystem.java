package problemsUnderstandingOOPs;
abstract class Employee{
    private final String id;
    String name;
    protected double baseSalary;
    public Employee(String id,String name, double baseSalary){
        this.id = id;
        this.name  = name;
        this.baseSalary = baseSalary;
    }
    abstract double calculateBonus();
    // Inside abstract class Employee
    public double calculateTotalPayout() {
        return baseSalary + calculateBonus();
        // It dynamically calls the correct child's bonus math!
    }
    @Override
    public String toString(){
        return "id: "+id+", name: "+name+", Total Salary: "+calculateTotalPayout();
    }
}
class Manager extends Employee{
    public Manager(String id,String name, double baseSalary){
        super(id,name,baseSalary);
    }
    @Override
    double calculateBonus(){
        return baseSalary/5;
    }

}
class ProgrammerAnalyst extends Employee{
    public ProgrammerAnalyst(String id, String name, double baseSalary){
        super(id,name,baseSalary);
    }
    @Override
    double calculateBonus(){
        return baseSalary / 10;
    }

}
class Trainee extends Employee{
    int trainingDurationInMonths;
    public Trainee(String id,String name, double baseSalary,int durationInMonths){
        super(id,name,baseSalary);
        this.trainingDurationInMonths = durationInMonths;
    }
    @Override
    double calculateBonus(){
        return 5000;
    }
    @Override
    public String toString(){
        return super.toString() + ", Training duration in months: "+trainingDurationInMonths;
    }
}
public class TechParkPayRollSystem {
    public static void main(String[] args){
        Employee e1 = new Manager("cts-22-87","Karthik",1000000);
        Employee e2 = new ProgrammerAnalyst("cts-23-09","John",870000);
        Employee e3= new Trainee("cts-26-58","Jyothika",400000,10);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }

}
