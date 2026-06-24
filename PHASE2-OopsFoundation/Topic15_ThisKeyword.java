

/**
 * ==========================================
 * Topic 15: This Keyword (Complete Deep Dive)
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 * 
 * CONCEPTS COVERED:
 * 1. Resolving naming conflicts (Instance vs Local)
 * 2. Calling current class methods
 * 3. Constructor Chaining (this())
 * 4. Passing 'this' as method argument
 * 5. Passing 'this' as constructor argument
 * 6. Returning 'this' (Method Chaining)
 * ==========================================
 */
// ==========================================
// CLASS 1: Naming Conflicts & Method Calling
// ==========================================
class  Student {
    String name; //Intsance variables 
    int age ;//Intance variables 
// way 1:resolving conflicts 
Student (String name ,int age ){
    this.name =name ;
    this.age =age ; //'this.name' = instance variable, 'name' = parameter

    
}   void displayDetails(){
    System.out.println("Name: " + this.name + ", Age: " + this.age);

} 
//calling the current class methods
 void printSummary(){
    System.out.println("-- student summary ");
    this.displayDetails(); //callung instance method using this 
 }
}
    //========================================
//    class 2  :: constructor  chanining 
//=========================================
 class Employee {
    String name ;
    int id ;
     double salary ;
     //default constructor 
Employee (){
    // Way 3: Calling parameterized constructor using this()
        // MUST be the first line!
        this("Unknown", 0, 0.0);
        System.out.println("Defaultt constructor executed ");
}
 // Parameterized Constructor
 Employee (String name ,int id ,double salary ){
this.name=name ;
this.id=id;
this.salary=salary;
System.out.println("Parameterized Constructor executed");

    }

 }
// ==========================================
// CLASS 3: Passing 'this' as Argument
// ==========================================
class processor {
  // Way 4: Receiving 'this' as a method argument
  void processStudent(Student s){
    System.out.println("processing student  :"+ s.name);

  }  
}   
class college {
String collegeName;
college(String collegeName ){
    this.collegeName=collegeName;

} 
void admitStudent (Student s){
     // Way 5: Passing 'this' to another class's method

     processor p =new processor();
     p.processStudent(s);   //passing  's'
     System.out.println(s.name + " admitted to " + this.collegeName);


}
}
// ==========================================
// CLASS 4: Returning 'this' (Method Chaining)
// ==========================================
class Calculator {
    double result =0;
    //way6 :returning current object 
Calculator add(double num) {
    result+=num ;
    return this ; //return current clauclator object 

}
Calculator subtract(double num) {
        result -= num;
        return this;
    }

    Calculator multiply(double num) {
        result *= num;
        return this;
    }

    void showResult() {
        System.out.println("Final Result: " + result);

    }
}
 // =================================
 //MAIN PROGRAM 
 //=====================================
 public class Topic15_ThisKeyword {
    public static void main (String args [] ){
        System.out.println("==========================================");
        System.out.println("   TOPIC 15: THIS KEYWORD");
        System.out.println("==========================================\n");
        //1 naming conflicts 
        System.out.println("----- 1 . Resolving Naming confllicts ----");
        Student s1 =new Student ("Ayesha ",20);
        s1.printSummary();
        //2 .constructor chaining 
        System.out.println("\n -----2.constructor chaining (this())---- ");
        Employee e1=new Employee(); // Calls default, which calls parameterized
        // Output will show Parameterized executed FIRST, then Default
        // 3. Passing 'this' as Argument
        System.out.println( "\n ---3. .passing 'this' as an argument ---- ");
        college nsakcet =new college ("NSAKCET");
        nsakcet.admitStudent (s1);
 // 4. Method Chaining (Returning 'this')
        System.out.println("\n--- 4. Method Chaining ---");
        Calculator calc = new Calculator();
        
        // Chaining multiple methods in one line!
        calc.add(10).subtract(2).multiply(5).showResult(); 
        // (10 - 2) * 5 = 40.0
        
        
        System.out.println("\n==========================================");
        System.out.println("   TOPIC 15 COMPLETE! ");
        System.out.println("==========================================");
    }
}

   /*
 * ==========================================
 * INTERVIEW QUESTIONS & ANSWERS:
 * ==========================================
 * Q1: What is the 'this' keyword in Java?
 * A1: 'this' is a reference variable that holds the reference of the 
 *     current class object. It points to the object that invoked the method.
 *
 * Q2: Can we use 'this' in a static method?
 * A2: NO. Static methods belong to the class, not to any specific object.
 *     Since 'this' refers to a specific object, it cannot be used in a 
 *     static context. (Compile-time error).
 *
 * Q3: What is Constructor Chaining?
 * A3: It is the process of calling one constructor from another 
 *     constructor within the same class using the 'this()' keyword.
 *
 * Q4: What is the strict rule for using 'this()'?
 * A4: 'this()' MUST be the very first statement inside the constructor. 
 *     If you put it on the second line, the compiler will throw an error.    
 * Q5: What is Method Chaining?
 * A5: A design pattern where methods return the current object ('this').
 *     This allows calling multiple methods sequentially in a single line 
 *     (e.g., obj.method1().method2()). Used in Builder Pattern.
 *
 * Q6: Is it mandatory to use 'this' to call instance variables?
 * A6: No. If the local variable and instance variable have different names,
 *     Java automatically assumes you mean the instance variable. 'this' is 
 *     only mandatory when there is a naming conflict.
 *
 * Q7: Can 'this' be assigned a new value?  
 *  A7: NO. 'this' is a final reference. You cannot do 'this = new Object()'.
 * ==========================================
 */






 
 
