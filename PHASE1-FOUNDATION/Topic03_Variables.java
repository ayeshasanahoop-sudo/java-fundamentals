/**
 * ==========================================
 * Topic 03: Variables in Java
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 *
 * WHAT IS A VARIABLE?
 * A named memory location that stores data!
 * Like a labeled box storing information!
 *
 * THREE TYPES:
 * 1. Local Variable    → inside method
 * 2. Instance Variable → inside class
 * 3. Static Variable   → shared by all
 * ==========================================
 */
 public class Topic03_Variables{
   //===================================
   //    INSTANCE VARIABLES 
   // INSIDE CLASS ,OUTSIDE METHOD 
   //DEFAULT VALUE ASSIGN AUTOMATICALLY 
   //=================================

   String studentName;   // default =null 
   int studentAge;     // default value =0
   double studentCgpa;    //default value =0.0
   boolean isPlaced;    // default value =false ;
// =====================================
    // STATIC VARIABLE
    // Shared by ALL objects!
    // Only ONE copy exists in memory!
    // =====================================

    static String collegeName= "NSAKCET";
    static int totalStudent=0;
      public static void main(String args[]) {
         System.out.println("================================");
         System.out.println("        VARIABLE IN JAVA       ");
         System.out.println("=================================");
         // ==========================================
         // SECTION 1: LOCAL VARIABLES
         //DECLARED INSIDE METHODS 
         //MUST INITIALIZE BEFORE USE!
         //==========================================
         System.out.println("\n----Local Variables-----");
 String name ="AYESHA SIDDIQUI";
 int age =21;
 double cgpa=20;
 boolean isPassed=true;
 char grade='A';
 System.out.println("NAME      :"+ name );
 System.out.println("AGE       : "+ age );
 System.out.println("CGPA      : "  + cgpa);
 System.out.println("IS PASS   :  " + isPassed);
 System.out.println(" GRADE    :"+   grade);
  // =====================================
  //VARIABLES DECLARARTION IN STYLES 
  //=====================================
  System.out.println("/n--DECLARTION IN STYLES--");
     //STYLE 1 Declare and initialize together 
      int marks =95;
      System.out.println("Style 1-> declare+init "+ marks);
      //STYLE 2 Declare first value Later 
      int salary;
      salary =1800000;
      System.out. println("STYLE 2  -> declare then init "+ salary);
      // STYLE 3-> MULIRBLE variables same type 
      int x =10,y=20,z=30;
       System.out.println("Style 3 -> multiple  : "+x+" ,"+y+","+z);
       //===================================
       // SECTION 3 : Changing Variable values
       //=====================================
        System.out.println("\n---changing  Variables Values ----");
          int score =0;
          System.out.println("INITIAL SCORE : " + score );
          score =50;
          System.out.println("Firste attempt"+ score );
          score=85;
          System.out.println("second attempt "+ score);
          score = score + 10;
          System.out.println("After bonus :" + score );
          // ===================================
          // INSTANCE VARIABLE 
          // CREATING OBJECT TO ACCESS THEM 
          //========================================
          System.out.println("/n ---  INSTANCE VARIABLES -----");
//CREATING STUDENT 1 OBJECT 
Topic03_Variables student1=new Topic03_Variables();
student1.studentName="AYESHA";
student1.studentAge=21;
student1.studentCgpa=8.85;
student1.isPlaced=true;
//CREATING STUDENT 2 OBJECT 
Topic03_Variables student2=new Topic03_Variables();
student2.studentName="FATIMA";
student2.studentAge=23;
student2.studentCgpa=7.00;
student2.isPlaced=false;
 System.out.println( "student 1 :" +student1.studentName +"|STUDENT AGE :"+student1.studentAge  +
"|CGPA :" + student1.studentCgpa +   "|IS PLACED :"+  student1.isPlaced );
// =====================================
        // SECTION 5: Static Variable
        // Same value shared by all objects!
        // =====================================
System.out.println("/n --Static Variables---");
 totalStudent=2;
 System.out.println(collegeName );
 System.out.println( totalStudent );
 //======================================
 //DEFAULT VALUE 
 //=========================================
 Topic03_Variables defaultDemo = new Topic03_Variables();

System.out.println("String default  : " + defaultDemo.studentName);
        System.out.println("int default     : " + defaultDemo.studentAge);
        System.out.println("double default  : " + defaultDemo.studentCgpa);
        System.out.println("boolean default : " + defaultDemo.isPlaced);

 System.out.println("\n==========================================");
        System.out.println("   Topic 3 COMPLETE!");
        System.out.println("   Variables = Boxes with Labels! ");
        System.out.println("==========================================");















         
      }


 }
