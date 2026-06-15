/**
 * ==========================================
 * Topic 13: Methods (Functions)
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 * 
 * CONCEPTS COVERED:
 * 1. What is a Method? (Reusability)
 * 2. Method Anatomy (Return type, Name, Parameters)
 * 3. The 4 Types of Methods (Input/Output combinations)
 * 4. Parameters vs Arguments
 * ==========================================
 */

public class Topic13_Methods {

    // ==========================================
    // TYPE 1: No Input, No Return (void)
    // ==========================================
    public static void greetUser() {
        System.out.println("Hello! Welcome to the Java Program.");
    }

    // ==========================================
    // TYPE 2: Input, No Return (void)
    // ==========================================
    public static void printStudentDetails(String name, int age) {
        System.out.println("Student: " + name + ", Age: " + age);
    }

    // ==========================================
    // TYPE 3: No Input, Returns Something
    // ==========================================
    public static String getCollegeName() {
        return "NSAKCET"; // Sends this text back to where it was called
    }

    // ==========================================
    // TYPE 4: Input, Returns Something (The Juicer!)
    // ==========================================
    public static int calculateTotal(int math, int science) {
        int total = math + science;
        return total; // Sends the calculated total back
    }

    // ==========================================
    // MAIN METHOD (The Starting Point)
    // ==========================================
    public static void main(String[] args) {
                System.out.println("==========================================");
        System.out.println("   TOPIC 13: METHODS");
        System.out.println("==========================================\n");
        // calling type 1 
        System.out.println("--- Type  1 : no Inputs,No Returns -----");
        greetUser();
        //calling type 2 
        System.out.println("\n ---Type 2: Inputs ,No returns ------");

printStudentDetails("Ayesha ",21);
//caling type 3
System.out.println("\n ---- Type 3 ; No Input ,Returns something---- ");
 // We MUST catch the returned value in a variable!
 String college =getCollegeName();
System.out.println("college :"+ college );
//calling Type 4 
System.out.println("/n  Type 4 : Input , Retrun Something ");
int mathmarks=90;
int scienecmarks=85;
//pass Argument ,catch the return total 
int finalTotal= calculateTotal(mathmarks,scienecmarks);
System.out.println("Total marks :"+finalTotal);
       System.out.println("\n==========================================");
        System.out.println("   TOPIC 13 COMPLETE! ");
        System.out.println("==========================================");
    }
}

