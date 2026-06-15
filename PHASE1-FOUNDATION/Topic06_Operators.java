     /**
 * ==========================================
 * Topic 06: Operators in Java (All 8 Types!)
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 */
public class Topic06_Operators{
        
    public static void main(String args[]){
        System.out.println("==========================================");
        System.out.println("      ALL 8 OPERATORS IN JAVA");
        System.out.println("==========================================");
        //===================================
        //    TYPE -1   ARITHMETIC OPERATORS 
        //====================================
       System.out.println("\n--- 1. ARITHMETIC OPERATORS ---"); 
       int a=10,  b=3;
       System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));   // 13
        System.out.println("a - b = " + (a - b));   // 7
        System.out.println("a * b = " + (a * b));   // 30
        System.out.println("a / b = " + (a / b));   // 3 (int division!)
        System.out.println("a % b = " + (a % b));   // 1 (remainder!)
 // increment and decrement 
 int count =5;
 System.out.println(" Count ++ = " + count++);// post 
 System.out.println("count  :"+ count );
 System.out.println("++count :"+   ++count); //pre 
 System.out.println("count -- :"+ count --); //post 
 System.out.println("count = :"+ count );
// =====================================
        // TYPE 2: RELATIONAL OPERATORS
        // == != > < >= <=
        // Returns TRUE or FALSE!
        // =====================================
        
System.out.println("\n--- 2. RELATIONAL OPERATORS ---");
int marks=85;

        System.out.println("marks = " + marks);
        System.out.println("marks == 85 : " + (marks == 85));  // true
        System.out.println("marks != 90 : " + (marks != 90));  // true
        System.out.println("marks > 90  : " + (marks > 90));   // false
        System.out.println("marks < 90  : " + (marks < 90));   // true
        System.out.println("marks >= 85 : " + (marks >= 85));  // true
        System.out.println("marks <= 60 : " + (marks <= 60));  // false
       // =====================================
        // TYPE 3: LOGICAL OPERATORS
        // && (AND) || (OR) ! (NOT)
        // =====================================

        System.out.println("\n--- 3. LOGICAL OPERATORS ---");
 boolean isEligible=true;
 boolean hasExperience=false;
              //&& both must be TRUE 
        System.out.println("Eligible and expereince :"+ (isEligible && hasExperience));
             //|| both or 1 to be TRUE
      System.out.println("Eligible OR Experience: " +
                (isEligible || hasExperience)); // true
                // ! = opposite
        System.out.println("NOT Eligible: " + !isEligible); // false

        //REAL example
        int cgpa=9;
        boolean hasProject= true;
        boolean googleReady=(cgpa>=7)&& hasProject ;
        System.out.println("GOOGLE READY :"+googleReady);
        //=====================================
        // TYPE 4: ASSIGNMENT OPERATORS
        // = += -= *= /= %= &= |= <<= >>= ^= 
        // =====================================
        System.out.println("\n--- 4. ASSIGNMENT OPERATORS ---");
        int salary =1000;
        System.out.println("salary = "+ salary );
        salary+= 5000; //salary =salary+5000
        System.out.println(" salary==5000" +salary);
        salary-=2000;
        System.out.println("salary-=2000"+ salary);
        salary*=2;
        System.out.println("salary*=2"+ salary);
        salary/=4;
        System.out.println("salary/=4"+ salary);
        // =====================================
        // TYPE 5: TERNARY OPERATOR
        // condition ? valueIfTrue : valueIfFalse
        // Short form of if-else!
        // =====================================
        System.out.println("\n--- 5. TERNARY OPERATOR ---");
        int studentMarks=75;
String   result =studentMarks>=60?"PASS":"FAIL";
// Google eligibility check!
        int leetcodeCount = 120;
        String googleStatus = leetcodeCount >= 100 ?
                "Apply Google! 🔥" : "Practice more!";
        System.out.println("Status: " + googleStatus);

// =====================================
        // TYPE 6: UNARY OPERATORS
        // + - ++ -- !
        // Works on single operand!
        // =====================================
        System.out.println("\n--- 6. UNARY OPERATORS ---");
int x = 5;
        System.out.println("+x = " + (+x));  // positive
        System.out.println("-x = " + (-x));  // negative

        boolean flag = true;
        System.out.println("!flag = " + !flag); // false
        // =====================================
        // TYPE 7: BITWISE OPERATORS
        // & | ^ ~ << >>
        // Works on bits! (Advanced!)
        // =====================================
System.out.println("\n--- 7. BITWISE OPERATORS ---");
int p = 5;  // binary: 0101
        int q = 3;  // binary: 0011

        System.out.println("p & q = " + (p & q));  // 0001 = 1
        System.out.println("p | q = " + (p | q));  // 0111 = 7
        System.out.println("p ^ q = " + (p ^ q));  // 0110 = 6
        System.out.println("~p    = " + (~p));      // -6
// =====================================
        // TYPE 8: SHIFT OPERATORS
        // << >> >>>
        // =====================================

        System.out.println("\n--- 8. SHIFT OPERATORS ---");
        int num = 8;  // binary: 1000
        System.out.println("num << 1 = " + (num << 1)); // 16 (multiply by 2!)
        System.out.println("num >> 1 = " + (num >> 1)); // 4  (divide by 2!)

        // =====================================
        // SECTION: Real World Example
        // Student Grade Calculator
        // =====================================

 System.out.println("\n--- GRADE CALCULATOR ---");
 int javaMarks=85;
 int dsaMarks=78;
 int projectMarks=92;
 int totalMarks=javaMarks+dsaMarks+projectMarks;
 double average=(double)totalMarks/3;
 char grade = average >= 90 ? 'A' :
                     average >= 80 ? 'B' :
                     average >= 70 ? 'C' : 'D';
        boolean isGoogleEligible = (average >= 75) && (projectMarks >= 80);

        System.out.println("Total   : " + totalMarks);
        System.out.printf("Average : %.2f%n", average);
        System.out.println("Grade   : " + grade);
        System.out.println("Google Eligible: " + isGoogleEligible);

        System.out.println("\n==========================================");
        System.out.println("   Topic 6 COMPLETE! All 8 Operators! 💪");
        System.out.println("==========================================");             



        


    }

}