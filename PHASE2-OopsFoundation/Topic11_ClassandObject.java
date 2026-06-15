/**
 * ==========================================
 * Topic 11: Class and Object 
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * ==========================================
 * 
 * CONCEPTS COVERED:
 * 1. Class Definition (Blueprint)
 * 2. Object Creation (Instance)
 * 3. Instance Variables with Default Values
 * 4. Local Variables
 * 5. Reference Variables
 * 6. Dot Operator (.)
 * 7. Anonymous Objects
 * 8. Null References
 * 9. Passing Objects to Methods
 * 10. Returning Objects from Methods
 * 11. Memory Allocation (Stack vs Heap)
 * ==========================================
 */

// ==========================================
// THE BLUEPRINT (CLASS)
// ==========================================
class Student{
    // instance variable (with default value)
    String name ="unknown";
    int age =0;
    double gpa;
    // behaviour methods ()
    void display(){
        System.out.println("Name :"+name + " |Age :" + age    +" |Cgpa :"+ gpa );

    }
}
// ==============================
//Main Porgram 
//==============================
public class Topic11_ClassandObject {
    
    // METHOD THAT TAKES OBJECT AS PARAMETER
    static void checkStudent(Student s) {
        System.out.println("--- Checking Student via Method ---");
        s.display();
    }
    
    // METHOD THAT RETURNS OBJECT
    static Student createTopper(String studentName, double studentGpa) {
        Student newStudent = new Student();
        newStudent.name = studentName;
        newStudent.gpa = studentGpa;
        newStudent.age = 20;
        return newStudent;  // Returning the object
    }
    
public static void main(String args[]){
    
        System.out.println("==========================================");
        System.out.println("   TOPIC 11: CLASS & OBJECT (COMPLETE)");
        System.out.println("====================================");
        
        //==============================
        //LOCAL VARIABLES (STORED IN STACK )
    //=========================================
    System.out.println("1.----Local Variables ----");
    int count=10;
    System.out.println("Local variable count: " + count);
     //==========================================
        // 2. STANDARD OBJECT CREATION
        // ==========================================
        System.out.println("\n--- 2. Standard Object Creation --");

Student s1 =new Student ();
 System.out.println("Object s1 (uses default values):");
        System.out.println("Name: " + s1.name);  // Output: Unknown (default)
        System.out.println("Age: " + s1.age);    // Output: 0 (default)
        System.out.println("GPA: " + s1.gpa);    // Output: 0.0 (default)
        
        // ==========================================
        // 3. CHANGING VALUES USING DOT OPERATOR
        // ==========================================
        System.out.println("\n--- 3. Changing Values (Dot Operator) ---");
        s1.name="Ayesha ";  // goes to Heap change 
        s1.age=21;
        s1.gpa=9.5;
        System.out.println("Object s1 (after changing):");
        s1.display();  // Output: Name: Ayesha | Age: 20 | GPA: 9.5
        
        // ==========================================
        // 4. MULTIPLE INDEPENDENT OBJECTS
        // ==========================================
        System.out.println("\n--- 4. Multiple Independent Objects ---");
        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 21;
        s2.gpa = 8.8;
        
        Student s3 = new Student();
        s3.name = "Priya";
        s3.age = 19;
        s3.gpa=8.5;
        System.out.println("Object s2: ");
        s2.display();
        System.out.println("object s3: ");
        s3.display();
 System.out.println("\nNote: s1, s2, s3 are completely independent in Heap!");
 // ==========================================
        // 5. ANONYMOUS OBJECT (Unreferenced)
        // ==========================================
        System.out.println("\n--- 5. Anonymous Object ---");
        new Student().display();  // Created, used once, then garbage collected
        // Can't use it again - no reference variable!
        
        // ==========================================
        // 6. NULL REFERENCE (Danger Zone!)
        // ==========================================
        System.out.println("\n--- 6. Null Reference ---");
        Student s4 = null;  // Reference exists, but no object
        System.out.println("s4 is null. Points to nothing in Heap.");
        // s4.display();  // UNCOMMENTING THIS CAUSES NullPointerException!
        System.out.println("If we call s4.display(), program will CRASH!");
        // ==========================================
        // 7. REFERENCE COPYING (Shares Same Memory)
        // ==========================================
        System.out.println("\n--- 7. Reference Copying ---");
        Student s5 = new Student();
        s5.name = "Original";
        s5.age = 25;
        
        Student s6 = s5;  // s6 points to SAME object as s5
        s6.name = "Changed";  // Changes BOTH s5 and s6!
        
        System.out.println("s5 name: " + s5.name);  // Output: Changed
        System.out.println("s6 name: " + s6.name);  // Output: Changed
        System.out.println("Both point to same object in Heap!");
        // ==========================================
        // 8. PASSING OBJECT TO METHOD
        // ==========================================
        System.out.println("\n--- 8. Passing Object to Method ---");
        checkStudent(s1);  // Passes reference of s1
        // Method can access/modify original object!
        
        
        // ==========================================
        // 9. RETURNING OBJECT FROM METHOD
        // =========================================
         
        // ==========================================
        // 9. RETURNING OBJECT FROM METHOD
        // ==========================================
        System.out.println("\n--- 9. Returning Object from Method ---");
        Student topper = createTopper("Ayesha Siddiqui", 9.8);
        System.out.println("Created topper:");
        topper.display();
        // ==========================================
        // 10. MEMORY VISUALIZATION
        // ==========================================
        System.out.println("\n--- 10. Memory Layout ---");
        System.out.println("STACK MEMORY:");
        System.out.println("  count = 10");
        System.out.println("  s1 -> address1");
        System.out.println("  s2 -> address2");
        System.out.println("  s3 -> address3");
        System.out.println("  s4 -> null");
        System.out.println("  s5 -> address5");
        System.out.println("  s6 -> address5 (same as s5!)");
        System.out.println("\nHEAP MEMORY:");
        System.out.println("  address1: [name=Ayesha, age=20, gpa=9.5]");
        System.out.println("  address2: [name=Rahul, age=21, gpa=8.8]");
        System.out.println("  address3: [name=Priya, age=19, gpa=9.2]");
        System.out.println("  address5: [name=Changed, age=25, gpa=0.0]");
          System.out.println("\n==========================================");
        System.out.println("   TOPIC 11 COMPLETE! ");
        System.out.println("   Master of Class & Object! ");
        System.out.println("==========================================");
    }
}

        
        
        
        
        


        
        


        


 

        
  


    

