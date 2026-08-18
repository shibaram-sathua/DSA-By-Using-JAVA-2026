public class Student {
    private String name;
    private int age;
    private int marks;
    public Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    private String validPassFail(){
        return this.marks >= 40? "Pass":"Fail";
    }

    @Override
    public String toString(){
        return "Student: "+ this.name+"\nAge: "+ this.age+"\nMarks: "+ this.marks+"\nResult: "+validPassFail();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rahul",21,72);
        System.out.println(student1);
        System.out.println();
        Student student2 = new Student("Amit",20, 32);
        System.out.println(student2);
    }
}
