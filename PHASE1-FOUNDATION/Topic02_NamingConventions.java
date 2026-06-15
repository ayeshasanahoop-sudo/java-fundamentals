/**
 * ==========================================
 * Topic 02: Naming Conventions + Comments
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * ==========================================
 *
 * WHAT ARE NAMING CONVENTIONS?
 * Rules for naming classes, methods,
 * variables and constants in Java!
 * Following these = professional code!
 *
 * WHY IMPORTANT?
 * Google engineers follow strict rules!
 * Clean code = easy to read = teamwork!
 * ==========================================
 */

public class Topic02_NamingConventions {

    // =====================================
    // CONSTANTS → ALL_CAPS_WITH_UNDERSCOREssss
    // Values that NEVER change!
    // =====================================

    static final double PI_VALUE = 3.14159;
    static final int MAX_STUDENTS = 100;
    static final String COLLEGE_NAME = "NSAKCET";
    static final String GOOGLE_GOAL = "Google Internship 2027";

    // =====================================
    // INSTANCE VARIABLES → camelCase
    // =====================================

    String studentName;
    int studentAge;
    double studentCgpa;
    boolean isPlaced;

    public static void main(String[] args) {

        // =====================================
        // SECTION 1: Variable naming demo
        // =====================================

        System.out.println("==========================================");
        System.out.println("    NAMING CONVENTIONS DEMO");
        System.out.println("==========================================");

        // camelCase variables
        String firstName = "Ayesha";        // name variable
        String lastName = "Siddiqui";       // last name
        int studentAge = 20;                // age variable
        double studentCgpa = 8.5;          // CGPA decimal
        boolean isEligible = true;          // boolean starts with 'is'
        char gradeLevel = 'A';              // single character

        System.out.println("\n--- Student Details ---");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Age        : " + studentAge);
        System.out.println("CGPA       : " + studentCgpa);
        System.out.println("Eligible   : " + isEligible);
        System.out.println("Grade      : " + gradeLevel);

        // =====================================
        // SECTION 2: Constants demo
        // =====================================

        System.out.println("\n--- Constants (Never Change!) ---");
        System.out.println("PI Value    : " + PI_VALUE);
        System.out.println("Max Students: " + MAX_STUDENTS);
        System.out.println("College     : " + COLLEGE_NAME);
        System.out.println("My Goal     : " + GOOGLE_GOAL);

        // =====================================
        // SECTION 3: Method naming demo
        // =====================================

        System.out.println("\n--- Method Names (camelCase) ---");
        System.out.println("getStudentName()    → gets name");
        System.out.println("calculateSalary()   → calculates salary");
        System.out.println("isEligibleForJob()  → checks eligibility");
        System.out.println("sendEmailAlert()    → sends email");

        // =====================================
        // SECTION 4: Class naming demo
        // =====================================

        System.out.println("\n--- Class Names (PascalCase) ---");
        System.out.println("StudentInfo         → student data");
        System.out.println("BankAccount         → banking system");
        System.out.println("FaceSecuritySystem  → your project! 🔥");
        System.out.println("TrustListVerifier   → your project! 🔥");

        // =====================================
        // SECTION 5: Good vs Bad naming
        // =====================================

        System.out.println("\n--- Good vs Bad Naming ---");

        // GOOD naming
        int totalMarks = 450;
        String collegeName = "NSAKCET";
        boolean isGoogleReady = true;

        // BAD naming (never do this!)
        // int x = 450;           // meaningless!
        // String cn = "NSAKCET"; // abbreviated!
        // boolean flag = true;   // unclear!

        System.out.println("Total Marks  : " + totalMarks);
        System.out.println("College Name : " + collegeName);
        System.out.println("Google Ready : " + isGoogleReady);

        // =====================================
        // SECTION 6: Comment types demo
        // =====================================

        // Single line comment: explaining one thing
        System.out.println("\n--- Comments Demo ---");

        /* Multi line comment:
           This section demonstrates
           all three types of comments
           used in professional Java code! */

        /**
         * Documentation comment:
         * Used for generating JavaDoc
         * documentation automatically!
         */

        System.out.println("3 types: single, multi, javadoc!");

        System.out.println("\n==========================================");
        System.out.println("   Topic 2 COMPLETE!");
        System.out.println("   Clean code = Google level code! ");
        System.out.println("==========================================");
    }
}