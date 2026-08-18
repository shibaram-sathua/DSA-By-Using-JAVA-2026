package OOPS;
class Student{
    String name;
    String rollNumber;
    Student(String name, String rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    @Override
    public String toString(){
        return this.name+" "+this.rollNumber;
    }

}

class Subject{
    String subName;
    String subCode;
    Subject(String subName){
        this.subName = subName;
    }
    @Override
    public String toString(){
        return  this.subName+" "+this.subCode;
    }

}
public class ArrayOfObjects {
    public static void main(String[] args){
        Student[] students = new Student[10];
        students[0] = new Student("Shibaram","UNIV-2026-34");
        students[1] = new Student("Ajay","UNIV-2026-56");
        System.out.println(students[0]);
        System.out.println(students[1]);



        Subject[] subjects = new Subject[]{new Subject("Odia"),new Subject("English")};
        System.out.println(subjects[0]);
        System.out.println(subjects[1]);

    }
}
