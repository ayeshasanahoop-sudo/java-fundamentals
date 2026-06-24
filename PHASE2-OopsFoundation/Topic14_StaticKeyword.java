/**
 * ==========================================
 * Topic 14: Static Keyword (Complete Deep Dive)
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 * 
 * CONCEPTS COVERED:
 * 1. Static Variables (Shared memory in Method Area)
 * 2. Static Methods (Class-level methods)
 * 3. Static Blocks (Runs before main)
 * 4. Static Nested Classes
 * 5. Restrictions (What static CANNOT do)
 * ==========================================
 */

// ==========================================
// CLASS 1: Demonstrating Static Variables
// ==========================================
class Student {
    // Instance variable: Each object gets its own copy (Stored in Heap)
    String name; 
    int rollNo;
    
    // Static variable: ONLY ONE copy shared by all objects (Stored in Method Area)
    static String collegeName = "NSAKCET"; 
    
    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    // Instance method to display details
    void display() {
        // We can access both static and non-static variables here
        System.out.println("Roll: " + rollNo + ", Name: " + name + ", College: " + collegeName);
    }
}

// ==========================================
// CLASS 2: Demonstrating Static Methods & Blocks
// ==========================================
class MathUtility {
    
    // STATIC BLOCK: Runs exactly ONCE when class is loaded
    static {
        System.out.println("[Static Block] MathUtility class loaded into memory!");
    }
    
    // Static method: Belongs to class, not object
    static int add(int a, int b) {
        return a + b;
    }
    
    // Static method calling another static method
    static int square(int num) {
        return num * num; // Can call static methods directly
    }
}

// ==========================================
// CLASS 3: Demonstrating Restrictions
// ==========================================
class RestrictionsDemo {
    int instanceVar = 10;       // Non-static
    static int staticVar = 20;  // Static
    
    // Non-static method
    void instanceMethod() {
        System.out.println(instanceVar); // ✅ OK
        System.out.println(staticVar);   // ✅ OK (Instance can access static)
    }
    
    // Static method
    static void staticMethod() {
        // System.out.println(instanceVar); // ❌ COMPILE ERROR! Cannot access non-static
        System.out.println(staticVar);     // ✅ OK
        
        // System.out.println(this.instanceVar); //  COMPILE ERROR! 'this' not allowed
    }
}

// ==========================================
// MAIN PROGRAM
// ==========================================
public class Topic14_StaticKeyword {
    
    // Static block in the main class
    static {
        System.out.println("[Main Static Block] Program is starting...\n");
    }

    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("   TOPIC 14: STATIC KEYWORD");
        System.out.println("==========================================\n");
        
        // ==========================================
        // 1. Static Variable Demo
        // ==========================================
        System.out.println("--- 1. Static Variables (Shared Memory) ---");
        
        Student s1 = new Student("Ayesha", 101);
        Student s2 = new Student("Rahul", 102);
        
        s1.display();
        s2.display();
        
        // Changing static variable using Class Name (Best Practice)
        System.out.println("\nChanging college name for ALL students...");
        Student.collegeName = "IIT Hyderabad"; 
        
        s1.display(); // Both will show IIT Hyderabad!
        s2.display();
        
        
        // ==========================================
        // 2. Static Method Demo
        // ==========================================
        System.out.println("\n--- 2. Static Methods (No Object Needed) ---");
        
        // Calling static method directly using Class Name
        int sum = MathUtility.add(10, 20);
        System.out.println("Sum: " + sum);
        
        int sq = MathUtility.square(5);
        System.out.println("Square: " + sq);
        
        // Note: We NEVER created an object of MathUtility!
        
        
        // ==========================================
        // 3. Static vs Instance Access Rules
        // ==========================================
        System.out.println("\n--- 3. Access Rules ---");
        
        RestrictionsDemo obj = new RestrictionsDemo();
        obj.instanceMethod(); // Works perfectly
        
        RestrictionsDemo.staticMethod(); // Works perfectly
        // obj.staticMethod(); // Works but BAD PRACTICE. Always use ClassName.method()
        
        
        System.out.println("\n==========================================");
        System.out.println("   TOPIC 14 COMPLETE! ");
        System.out.println("==========================================");
    }
}

/*
 * ==========================================
 * INTERVIEW QUESTIONS & ANSWERS:
 * ==========================================
 * Q1: What is the difference between static and instance variables?
 * A1: Instance variables are stored in Heap memory and each object gets 
 *     its own copy. Static variables are stored in Method Area and only 
 *     ONE copy is shared among all objects.
 *
 * Q2: Can we access instance variables from a static method?
 * A2: NO. Static methods are loaded before objects are created. Since 
 *     instance variables belong to objects, they don't exist yet.
 *
 * Q3: Why is the main method static?
 * A3: Because the JVM needs to call it to start the program BEFORE 
 *     creating any objects of the class.
 *
 * Q4: Can we overload static methods?
 * A4: YES. Method overloading works perfectly fine with static methods.
 *
 * Q5: Can we override static methods?
 * A5: NO. Overriding is based on dynamic polymorphism (Runtime). 
 *     Static methods are bound at compile time (Static binding). 
 *     If you define the same static method in a child class, it is 
 *     called "Method Hiding", not overriding.
 *
 * Q6: When does a static block execute?
 * A6: It executes exactly once when the class is loaded into memory by 
 *     the ClassLoader, which happens before the main method executes.
 * ==========================================
 *
 *
 */