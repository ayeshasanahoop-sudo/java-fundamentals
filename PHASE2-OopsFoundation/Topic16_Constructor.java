/**
 * ==========================================
 * Topic 16: Constructors (Complete Deep Dive)
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 * 
 * CONCEPTS COVERED:
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Constructor Overloading
 * 4. The "Secret" Default Constructor Rule
 * 5. Constructor vs Method
 * ==========================================
 */
class Student{
    //Instance Variable
   String name ;
   int age;
   String college ;
   // ==========================================
    // 1. Default Constructor (No arguments)
    // ==========================================
    Student(){
        name ="unknown ";
        age=0;
        college="NSAKCET";//common values 
        System.out.println("DEFAULT CONSTRUCTOR CALLED");

    }
    // ==========================================
    // 2. Parameterized Constructor
    // ==========================================
    Student(String name,int age ){
        //using this to resoleve naming conflicts 
        this.name=name;
        this.age=age;
        this.college=college;
        System.out.println("parameterized constructor");

    }
    // ==========================================
    // 3. Constructor Overloading (Multiple constructors)
    // ==========================================
Student (String name ,int age ,String college ){
    this.name=name;
    this.age =age;
    this.college=college;
    System.out.println(">> 3-Argument Constructor called!");


}
 void display (){
    System.out.println("Name :"+name + ",  Age :  "+age + ",college :" +college );
    System.out.println("---------------------");

 }   
 }
 public class Topic16_Constructor {
    public static void main(String args []){
         System.out.println("==========================================");
        System.out.println("   TOPIC 16: CONSTRUCTORS");
        System.out.println("==========================================\n");
        //1 .calling default 
        System.out.println("--- 1. Default Constructor ---");
        Student s1 =new Student ();
        s1.display();
        //we didn't passed any value so it will use the default 
        // 2. Calling Parameterized Constructor
        System.out.println("--- 2. Parameterized Constructor ---");
        Student s2=new Student("Ayesha ",20);
        s2.display ();
        // 3. Calling Overloaded Constructor (3 arguments)
        System.out.println("--- 3. Constructor Overloading ---");
        Student s3=new Student ("Rahul ",21,"IIT hyderabad");
        s3.display();
          
        System.out.println("\n==========================================");
        System.out.println("   TOPIC 16 COMPLETE! 🎯");
        System.out.println("==========================================");


    }
 }


 /* ==========================================
 * INTERVIEW QUESTIONS & ANSWERS:
 * ==========================================
 * Q1: What is the difference between a Constructor and a Method?
 * A1: 
 *   Constructor: Same name as class, NO return type, called automatically 
 *                when object is created, used to initialize objects.
 *   Method: Any name, HAS a return type (even void), called explicitly 
 *           by the programmer, used to expose object behavior.
 *
 * Q2: Can a constructor be private?
 * A2: YES! It is used in the Singleton Design Pattern to prevent 
 *     other classes from creating objects of this class.
 *
 * Q3: Does a constructor return anything?
 * A3: No, it has no return type. However, behind the scenes, it returns 
 *     the current class instance (the newly created object).
 *
 * Q4: What is Constructor Overloading?
 * A4: Having multiple constructors in the same class with different 
 * */