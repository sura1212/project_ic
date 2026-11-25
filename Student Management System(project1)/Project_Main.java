import java.util.Scanner;

class  Student{
    int id;
    String name;
    String dep;
    Student(int id,String name,String dep){
        this.id=id;
        this.name=name;
        this.dep=dep;

    }
    public void displayStudentInform(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("dep="+dep);
    }
}
class Subjects  {
    String sub1;
    String sub2;
    String sub3;
    double sub1Marks;
    double sub2Marks;
    double sub3Marks;
    double total;
    double average;
    Subjects(String sub1, String sub2, String sub3, double sub1Marks,double sub2Marks,double sub3Marks){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub1Marks=sub1Marks;
        this.sub2Marks=sub2Marks;
        this.sub3Marks=sub3Marks;

    }
    public void SubjectsMarks(){
        System.out.println("sub1->"+sub1 + "sub1Marks->"+sub1Marks);
        System.out.println("sub2->"+sub2 + "sub2Marks->"+sub2Marks);
        System.out.println("sub3->"+sub3 + "sub3Marks->"+sub3Marks);

    }
    public  void CalculateTotal(){
         total=(sub1Marks+sub2Marks+sub3Marks);
        System.out.println("total marks="+total);
    }
    public  void CalculateAverage(){
         average=total/3.0;
         System.out.println("the average="+average);
    }
    public  void CheckPassFail(){
        if(sub1Marks <=35 ||sub2Marks <=35 || sub3Marks<=35 ){
            System.out.println("the  Student is fail in the exam");
        }
        else{
            System.out.println("the  Student is pass in the exam");
        }
    }
    public  void  Grade(){
        if(average >=90){
            System.out.println("the grade="+"A+");

        }
        else if(average >=80 || average<=89){
            System.out.println("the grade ="+"A");
        }
        else if(average>=70 || average<=79){
            System.out.println("the is grade="+"b");
        }
        else{
            System.out.println("no gradethe Student ");
        }
    }
 } 
 
public class Project_Main {

    static Scanner sc = new Scanner(System.in);

    
    public static void addStudent(int count, int totalStudents) {

        
        if (count > totalStudents) {
            System.out.println("\nAll Student Records Completed!");
            return;
        }

        System.out.println("\n====== Student " + count + " Details ======");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter Department: ");
        String dep = sc.next();

        Student s = new Student(id, name, dep);

        System.out.print("Enter Subject 1: ");
        String sub1 = sc.next();

        System.out.print("Enter Subject 2: ");
        String sub2 = sc.next();

        System.out.print("Enter Subject 3: ");
        String sub3 = sc.next();

        System.out.print("Enter Marks 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Marks 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Marks 3: ");
        double m3 = sc.nextDouble();

        Subjects su = new Subjects(sub1, sub2, sub3, m1, m2, m3);

        System.out.println("\n----- Student Information -----");
        s.displayStudentInform();

        
        System.out.println("\n----- Subject Marks -----");
        su.SubjectsMarks();

       
        System.out.println("\n----- Total -----");
        su.CalculateTotal();

        System.out.println("\n----- Average -----");
        su.CalculateAverage();

        System.out.println("\n----- Pass or Fail -----");
        su.CheckPassFail();

        System.out.println("\n----- Grade -----");
        su.Grade();

      
        addStudent(count + 1, totalStudents);
    }

    public static void main(String[] args) {

        System.out.print("How many students do you want to enter? ");
        int totalStudents = sc.nextInt();

        if (totalStudents <= 0) {
            System.out.println("Please enter a valid number of students.");
        } else {
            addStudent(1, totalStudents);
        }

        
    }
}