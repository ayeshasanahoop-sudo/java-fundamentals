    /**
 * ==========================================
 * Topic 08: Scanner Class
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 */
import java.util.Scanner;

public class Topic08_ScannerClass {
    public static void main(String args []){
        System.out.println("==========================================");
        System.out.println("         SCANNER CLASS IN JAVA");
        System.out.println("==========================================");
        // Creating Scanner object
        // System.in = reads from keyboard!

        Scanner sc =new Scanner(System.in);
        System.out.println("\n--- Reading Different Types ---");
        System.out.println("Enter Your Name: ");

    String name =sc.nextLine();
    System.out.println("enter your age :");
    int age =sc.nextInt();
    System.out.print("Enter your CGPA: ");
    double cgpa= sc.nextDouble();

System.out.println("\n--- Your Profile ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("CGPA : " + cgpa);
// Google eligibility check !
if (cgpa>=7.0){
     System.out.println("Status: Eligible for Google! ");
        } else {
            System.out.println("Status: Improve CGPA!");
        }
//=====================================
        // All Scanner methods
        // =====================================

        System.out.println("\n--- Scanner Methods ---");
        System.out.println("next()       → reads one word");
        System.out.println("nextLine()   → reads full line");
        System.out.println("nextInt()    → reads integer");
        System.out.println("nextDouble() → reads decimal");
        System.out.println("nextFloat()  → reads float");
        System.out.println("nextLong()   → reads long");
    System.out.println("nextBoolean()→ reads true/false");



     sc.close(); // always close !
     System.out.println("\n==========================================");
        System.out.println("   Topic 8 COMPLETE! Input mastered! ");
        System.out.println("==========================================");
    }


}







    

