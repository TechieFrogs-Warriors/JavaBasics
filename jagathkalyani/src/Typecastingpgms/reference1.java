package Typecastingpgms;
public class reference1 {
    public static void main(String[] args) {
        //Creating an object of the Student class
        employee2 employee2 = new employee2("Kalyani", 30, "B.TECH", 1256);
        //Converting the object of Student to Person
        worker worker = new worker("Krishna", 20);
        //Converting the object of student to person
        worker = (employee2) employee2;
        worker.displayworker();
                                                      //Converting sub class variable to super class type
        
    }
    
}
public class worker {    // Person with two instance variables name and age 
    private String name;    //and one instance method displayPerson() which displays name and age
    private int age;
    public worker(String name, int age){
       this.name = name;
       this.age = age;
    }
    public void displayworker() {
       System.out.println("Data of the Person class: ");
       System.out.println("Name: "+this.name);
       System.out.println("Age: "+this.age);
    }
 }
 public class employee2 extends worker {  //Another class named Student extends the person class and name and age it has two variables branch and student_id
    int employee2_id;
    employee2(String name, int age, String branch, int employee2_id){   // It has a method displayData() which displays  four values
       String branch;
       super(name, age);
       this.branch = branch;
       this.employee2_id = employee2_id;
    }
    public void displayemployee2() {
       System.out.println("Data of the Student class: ");
       System.out.println("Name: "+this.name);
       System.out.println("Age: "+this.age);
       System.out.println("Branch: "+this.branch);
       System.out.println("Student ID: "+this.employee2_id);
    }
