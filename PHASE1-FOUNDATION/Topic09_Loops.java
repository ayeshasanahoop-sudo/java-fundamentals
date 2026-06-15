   /**
 * ==========================================
 * Topic 09: Iteration Statements (Loops) - Complete Guide
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 * 
 * WHAT ARE LOOPS?
 * Blocks of code that repeat until a specific condition becomes false.
 * 
 * 5 TYPES COVERED:
 * 1. while          (Entry-controlled, unknown iterations)
 * 2. do-while       (Exit-controlled, runs at least once)
 * 3. for            (Entry-controlled, known iterations)
 * 4. Enhanced for   (Read-only array/collection traversal)
 * 5. Nested loops   (Loop inside a loop, e.g., rows & columns)
 * 
 * JUMP STATEMENTS:
 * - break: Exits the loop completely.
 * - continue: Skips the current iteration, jumps to the next.
 * ==========================================
 */

public class Topic09_Loops{
 

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("     TOPIC 09: ALL LOOP CONCEPTS");
        System.out.println("==========================================\n");

        // ==========================================
        // 1. WHILE LOOP (Entry-Controlled)
        // Real Life: Eat chips WHILE packet is not empty.
        // ==========================================
        System.out.println("--- 1. While Loop (Counting Down) ---");
        int chips = 3;
        while (chips > 0) {                  // Check condition FIRST
            System.out.println("Eating chip! Remaining: " + chips);
            chips--;                         // ✅ CRITICAL: Update variable to avoid infinite loop
        }
        System.out.println("Packet empty!\n");


        // ==========================================
        // 2. DO-WHILE LOOP (Exit-Controlled)
        // Real Life: Taste soup, THEN decide if it needs salt.
        // ==========================================
        System.out.println("--- 2. Do-While Loop (Runs at least once) ---");
        int pin = 0; 
        int attempts = 0;
        
        do {
            attempts++;
            System.out.println("ATM Attempt " + attempts + ": Enter PIN");
            pin = 1234; // Simulating user entering correct PIN on 1st try
        } while (pin != 1234);               // ✅ CRITICAL: Semicolon required here!
        
        System.out.println("Access Granted!\n");


        // ==========================================
        // 3. FOR LOOP (Entry-Controlled)
        // Real Life: Do exactly 3 push-ups.
        // ==========================================
        System.out.println("--- 3. For Loop (Forward & Reverse) ---");
        
        System.out.print("Forward (1 to 3): ");
        for (int i = 1; i <= 3; i++) {       // init; condition; update
            System.out.print(i + " ");
        }
        
        System.out.print("\nReverse (3 to 1): ");
        for (int i = 3; i >= 1; i--) {       // Counting down requires i--
            System.out.print(i + " ");
        }
        System.out.println("\n");


        // ==========================================
        // 4. ENHANCED FOR LOOP (For-Each)
        // Real Life: Check every chocolate in a box (no index needed).
        // ==========================================
        System.out.println("--- 4. Enhanced For Loop (Read-Only) ---");
        int[] marks = {90, 85, 70};
        
        // Read as: "For each int 'm' inside the 'marks' array"
        for (int m : marks) {
            System.out.println("Student scored: " + m); 
            // Note: We do NOT use marks[i] here. 'm' holds the value directly.
        }
        System.out.println();


        // ==========================================
        // 5. NESTED LOOPS
        // Real Life: For every Day (Outer), eat 3 Meals (Inner).
        // Rule: Inner loop completes FULLY for every single step of the outer loop.
        // ==========================================
        System.out.println("--- 5. Nested Loops (2x2 Grid) ---");
        for (int row = 1; row <= 2; row++) {         // Outer Loop (Controls Rows)
            for (int col = 1; col <= 2; col++) {     // Inner Loop (Controls Columns)
                System.out.print("* ");              // Print stays on same line
            }
            System.out.println();                    // Move to next line after inner loop finishes
        }
        System.out.println();


        // ==========================================
        // 6. JUMP STATEMENTS (break vs continue)
        // ==========================================
        System.out.println("--- 6. Jump Statements ---");
        
        System.out.print("Break (Stops completely at 3): ");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) break;               // Exits the loop entirely
            System.out.print(x + " ");
        }
        
        System.out.print("\nContinue (Skips 3, keeps going): ");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) continue;            // Skips printing 3, jumps to x=4
            System.out.print(x + " ");
        }
        System.out.println("\n");

        System.out.println("==========================================");
        System.out.println("   TOPIC 09 COMPLETE! 🎉");
        System.out.println("   Master of Iteration! 🔄");
        System.out.println("==========================================");
    }

}

 