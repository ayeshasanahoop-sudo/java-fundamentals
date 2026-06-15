
/**
 * ==========================================
 * Topic 05: Type Casting in Java
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * ==========================================
 *
 * WHAT IS TYPE CASTING?
 * Converting one data type to another!
 *
 * TWO TYPES:
 * 1. Widening = small to large (automatic!)
 * 2. Narrowing = large to small (manual!)
 * ==========================================
 */      
public class Topic05_TypeCasting{
    public static void main(String args[]){


        System.out.println("==========================================");
        System.out.println("         TYPE CASTING IN JAVA");
        System.out.println("==========================================");
        // =====================================
        // SECTION 1: Widening Casting
        // Small → Large = AUTOMATIC!
        // byte → short → int → long → float → double
        // =====================================
        System.out.println("\n--WIDENING CASTING (Automatic)");
         byte byteVal=10;
         short  shortVal=byteVal;
         int intVal=shortVal;
         long longVal=intVal;
         float floatVal=longVal;
         double doubleVal=floatVal;

        System.out.println("byte   = " + byteVal);
        System.out.println("short  = " + shortVal);
        System.out.println("int    = " + intVal);
        System.out.println("long   = " + longVal);
        System.out.println("float  = " + floatVal);
        System.out.println("double = " + doubleVal);
        System.out.println("All same value! No data loss! ");
        // =====================================
        // SECTION 2: Narrowing Casting
        // Large → Small = MANUAL (type)!
        // =====================================
             double dVal=9.99;             
             float fVal= (float)dVal;  //force it !
              long lVal=(long)dVal;   //decimal gone 
             int iVal=(int) dVal;
             short sVal =(short) dVal;
              byte bVal=(byte)dVal;
         System.out.println( "original double :"+ dVal);
         System.out.println(" float  : " + fVal);
         System.out.println("long   : " + lVal + " ← decimal LOST!");
         System.out.println(" int    : " + iVal + " ← decimal LOST!");
         System.out.println(" short  : " + sVal + " ← decimal LOST!");
         System.out.println(" byte   : " + bVal + " ← decimal LOST!");
            System.out.println("\n---- CHAR and INT CASTING -----");
                char charVal ='A';
             System.out.println(charVal); // widening 
                int   ascii  =charVal;
             System.out.println(" 'A' as int type  ="+ascii);
                int number =66;
                char  charFromInt=(char)number; 
                System.out.println(charFromInt) ;
                                                   //int --->char (narrowing)         
              // ===================================
                //           MOST IMP USE CASE 
                //===================================
                System.out.println("\n--------DIVISION PROBLEM ------");
                int marks =450;
                int totalMarks=600;
                double dMarks=(double) marks/totalMarks;
                System.out.println("right percentage :"+ dMarks);
                double finalpercentage=((double)marks/totalMarks)*100;
                System.out.println("finla percentage:"+finalpercentage+ "%");
    //===================================
    // STRING CONVERSION 
    //=================================
    System.out.println("\n----STRING CONVERSION-----");
    //string to int 
    String ageStr="20";
    int ageInt=Integer.parseInt(ageStr);
    System.out.println("String '20' to int :"+ageInt);
    System.out.println("Age +5 :"+(ageInt +5));

// string to double 
String cgpaStr="9.52";   // in primitve data type
double cgpaDouble=Double.parseDouble(cgpaStr);
System.out.println("string 9.52 to double :"+ cgpaDouble);
//into to string 
int rollNo=12345;
String rollStr=String.valueOf(rollNo);
System.out.println("int to string :"+rollStr);
// =====================================
        // SECTION 6: Data Loss Warning
        // =====================================

        System.out.println("\n--- DATA LOSS WARNING ---");

        int bigNumber = 130;
        byte smallByte = (byte) bigNumber;  // 130 > byte range!
        System.out.println("int 130  byte = " + smallByte); // -126!

        double pi = 3.14159265;
        int piInt = (int) pi;
        System.out.println("double PI  int = " + piInt); // 3!
       System.out.println("\n==========================================");
        System.out.println("   Topic 5 COMPLETE!");
        System.out.println("   Widening=Auto, Narrowing=Manual! ");
        System.out.println("==========================================");
    }
}