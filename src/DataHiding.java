class Agent{
    private String name;
    private double code;
    String officialName;
    public Agent(){
        this.name = "Surya";
        this.officialName = this.name+"kumar kundu";
        this.code = Math.floor(Math.random()*100);
    }
    //getter and setter
    public void setCode(int code,String boss){
        if(boss.equals("754035"))
            this.code = code;
    }
    public double getCode(String boss){
        return this.code;
    }

    public String getName(){
        return this.officialName;
    }
}
public class DataHiding {
    public static void main(String[] args) {
        Agent agent1 = new Agent();
        String name =  agent1.getName();
        System.out.println(name);

        double code = agent1.getCode("754035");
        System.out.println(code);

        agent1.setCode(45,"754035");
        System.out.println(agent1.getCode("754035"));

    }

}
