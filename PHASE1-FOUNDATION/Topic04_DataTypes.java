public class Topic04_DataTypes {
    public static void main(String args[]){
        System.out.println("============================");
        System.out.println("     DATA TYPES IN JAVA       ");
        System.out.println("=================================");

// =====================================
        // SECTION 1: Integer Types
        // For whole numbers (no decimal!)
        // =====================================
        System.out.println("\n---INTEGER TYES---");
        byte byteVal=100;    // 1 byte -128 to 127

        short shortVal=10000; // 2bytes   -32k to 32k
        int intVal=1000000;   //4 bytes -2B to2B
        long longVal=8019175030L;  // 8 bytes very large 'L'at end must 
        System.out.println( "Byte =" +byteVal + "(1 Byte");
        System.out.println("Short =" + shortVal + "(2 Bytes");
        System.out.println( "Int  =" +  intVal  +"(4 Bytes)");
        System.out.println("Long  ="+ longVal   + "(8 Bytes)");

// =====================================
        // SECTION 2: Decimal Types
        // For numbers with decimal point!
        // =====================================
        System.out.println( "\n---DECIMAL TYPES---");
        float floatVal=3.14f;    //f at end  7 digits (4 Bytes)
        double doubleVal=3.567890; // 15 digits  (8 bytes)
        double cgpa=9.52;
        double salary =48000000.00;

System.out.println("Float  ="+   floatVal +"(7 digits)");
System.out.println("Double  ="+ doubleVal + "(15 digits)");
System.out.println("CGPA  ="+  cgpa );
System.out.println("Salary ="+ salary);

    // =====================================
        // SECTION 3: Character Type
        // For SINGLE character only!  --->alphabets,digits,symbols 
        // 
      // =====================================

System.out.println("\n--- CHARACTERS TYPES ---");
char letter ='A';  // enclose ''
char digits='9'; 
char symbols='@';
 //char store as number internally !
 int asciiA='A';         //65
 int asci='a';        //97       variables names should not be same ;

System.out.println( "ASCII OF A :" +letter);
System.out.println( "ASCII OF 9 :" +digits);
System.out.println(   "ASCII OF @ :" +  symbols);
 // =====================================
        // SECTION 4: Boolean Type
        // Only TRUE or FALSE!
        // =====================================
        System.out.println("\n---   BOOLEAN TYPES----");

        boolean isGoogleReady = true;
        boolean isExamDone = true;
        boolean isPlaced = false;
        boolean hasDream = true;

        System.out.println("Google Ready : " + isGoogleReady);
        System.out.println("Exam Done    : " + isExamDone);
        System.out.println("Placed       : " + isPlaced);
        System.out.println("Has Dream    : " + hasDream);
        // =====================================
        // SECTION 5: String (Non-Primitive)
        // Most commonly used!
        // =====================================

 System.out.println("\n---STRING (Non-Primitive)");
 String name="AYESHA SIDDIQUI ";
 String college="NSAKCET";
 String dream="Google Engineer";
 String empty ="";
 System.out.println(" NAME ="+name );
 System.out.println("COLLEGE="+college);
 System.out.println("Dream ="+ dream);
 System.out.println("Length ="+ empty);
   // =====================================
        // SECTION 6: Complete Student Profile
        // Using ALL data types together!
        // =====================================
        System.out.println("\n--- STUDENT PROFILE---");
        String sName ="AYESHA SIDDIQUI";
        int sAge=21;
        char sGender='F';
        double sCgpa=9.52;
        float sAttendance=87.5f;
        boolean sIsPlaced =true;
        short sSubjects=30;
        long sPhone=816743639L;
        Byte sSemester =7;
        System.out.println("NAME  :"+sName);
        System.out.println("AGE    :"+sAge);
        System.out.println("GENDER  :"+sGender);
        System.out.println("CGPA     :"+sCgpa);
        System.out.println("ATTENDANCE:"+sAttendance);
        System.out.println("PLACEMENT  :"+sIsPlaced);
System.out.println("SUBJECTS :" +sSubjects);
System.out.println("PHONE     :"+sPhone);
System.out.println("SEMESTER   :" +sSemester);
System.out.println("\n====================================");
System.out.println("         TOPIC 4 COMPLETED             ");
System.out.println("===========================================");


    






    }
    
}
