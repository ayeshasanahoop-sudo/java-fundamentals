/**
 * ==========================================
 * Topic 07: Control Statements
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 */
public class Topic07_ControlStatement{
    public static void main(String args[]){
        System.out.println("================================");
        System.out.println("         CONTROL STATEMENT ");
        System.out.println("===================================");
                              // =====================================
                                      // TYPE 1: if statement
                                // Only runs if condition is TRUE!
                                // =====================================
        System.out.println("\n ----1. if Statement");
                    int marks =85;
                    if (marks>=65){
        System.out.println("you passed ");
       }             if (marks >=90){
        System.out.println("DISTINCTION ");

        }
      
                                       // =====================================
                                              // TYPE 2: if-else statement
                                            // Runs one of two blocks!
                                        // =====================================
         System.out.println("/n--- 2. if-else STATEMENT ---");
                          int cgpa = 8;
                         if (cgpa>=7){
      System.out.println("eligible for google ");
                             }else {
                       System.out.println("Improve CGPA first !");

         }
   
      // =====================================
        // TYPE 3: if-else-if LADDER
        // Multiple conditions checked!
        // =====================================   


System.out.println("\n--- 3. if-else-if LADDER ---");
int score =78;
if (score >=90){
    System.out.println("grade A (outstanding )!");
}else if (score>=80) {
    System.out.println( "grade b excellent ");

}else  if (score >=70){
    System.out.println("grade c (good)");

} else if (score >=60){
    System.out.println("grade d (Average)");

} else {
    System.out.println("grade F failded!"); // deafult if every cases false 

}
     // =====================================
        // TYPE 4: NESTED if
        // if inside another if!
        // =====================================
        System.out.println("\n--- 4. NESTED if ---");
int dsa =150;
boolean hasProject=true;
double gpa=8.5;
if (dsa>=150){
    System.out.println("DSA CRACK)");

    if(hasProject){
    System.out.println("project worked");
        if(gpa>=7.0){
            System.out.println("GPA cracked ");


        }else{
            System.out.println("gpa failed");

        }
    } else{
        System.out.println("project didnt worked ");

    }
} else{
    System.out.println("DSA failed");

}

// =====================================
        // TYPE 5: switch-case
        // For exact value matching!
        // =====================================

        System.out.println("\n--- 5. switch-case ---");
        int day =3;
        switch(day){
            case 1:
                System.out.println("Monday -core java");
                break;
                case 2:
                    System.out.println("Tuesday -DSA!");
                    break;
                    case 3:
                        System.out.println("wednesday - project ");
                        break;
            case 4:
                System.out.println("Thursday - Spring Boot!");
                break;
            case 5:
                System.out.println("Friday - ReactJS!");
                break;
            default:
             System.out.println("Weekend - Rest + GitHub!"); 
        }
             // =====================================
        // switch with String (Java 7+)
        // =====================================
        System.out.println("\n--- switch with String ---");
        String certificate="Google cloud ";
        switch(certificate){
            case "Google cloud" :

System.out.println("DONE! ✅ Best cert!"); // prints!
                break;
            case "AWS":
                System.out.println("Cloud certified!");
                break;
            case "Kaggle":
                System.out.println("AIML certified!");
                break;
            default:
                System.out.println("Keep learning!");

        
        }

         // =====================================
        // Real world: Google Eligibility Check
        //======================================
  System.out.println("\n--- GOOGLE ELIGIBILITY CHECKER ---");
  int leetcode=150;
  int project =2;
  double myCgpa=8.0;
  boolean hasInternship=false;
  if (leetcode>=200){
    System.out.println("DSA EXCELLENT !");
  }else if (leetcode>=100){

  
  System.out.println("DSA good KEEP going");
} else{
System.out.println("DSA: Need more practice!");

}
 if (project >=2&& myCgpa>=7.0){
System.out.println("Projects + CGPA: READY! ✅");
            if (hasInternship) {
                System.out.println("With internship: STRONG! 🔥");
            } else {
                System.out.println("Add internship by Sept! 💪");
            }
 }     else {
    System.out.println("working ");

 } 
System.out.println("\n==========================================");
        System.out.println("   Topic 7 COMPLETE! Decisions mastered! ");
        System.out.println("==========================================");
    }





 }


  

        














    

