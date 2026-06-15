/**
 * ==========================================
 * Topic 10: Jump Statements
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 * 
 * CONCEPTS COVERED:
 * 1. break statement (exit loop/switch)
 * 2. continue statement (skip iteration)
 * 3. Labeled break (exit nested loops)
 * 4. Practical examples
 * ==========================================
 */

public class Topic10_JumpStatement {

    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("   TOPIC 10: JUMP STATEMENTS");
        System.out.println("==========================================\n");
        
        // ==========================================
        // 1. BREAK STATEMENT
        // ==========================================
        System.out.println("--- 1. Break Statement (Exit Loop) ---");
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break;  // Loop stops completely when i = 5
            }
            System.out.println("i = " + i);
        }
        // Output: 1, 2, 3, 4 (then stops)
        
        
        // ==========================================
        // 2. CONTINUE STATEMENT
        // ==========================================
        System.out.println("\n--- 2. Continue Statement (Skip Iteration) ---");
        
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue;  // Skips only this iteration, loop continues
            }
            System.out.println("i = " + i);
        }
        // Output: 1, 2, (skip 3), 4, 5
        
        
        // ==========================================
        // 3. BREAK IN WHILE LOOP
        // ==========================================
        System.out.println("\n--- 3. Break in While Loop ---");
        
        int num = 1;
        while (num <= 10) {
            if (num == 6) {
                System.out.println("Breaking at num = " + num);
                break;
            }
            System.out.println("num = " + num);
            num++;
        }
        
        
        // ==========================================
        // 4. CONTINUE IN WHILE LOOP
        // ==========================================
        System.out.println("\n--- 4. Continue in While Loop ---");
        
        int count = 0;
        while (count < 5) {
            count++;
            if (count == 3) {
                System.out.println("Skipping count = " + count);
                continue;
            }
            System.out.println("count = " + count);
        }
        
        
        // ==========================================
        // 5. LABELED BREAK (Exit Nested Loops)
        // ==========================================
        System.out.println("\n--- 5. Labeled Break (Exit Nested Loops) ---");
        
        outerLoop:  // Label for outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking both loops at i=" + i + ", j=" + j);
                    break outerLoop;  // Exits BOTH loops
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        
        // ==========================================
        // 6. LABELED CONTINUE (Skip to Next Outer Iteration)
        // ==========================================
        System.out.println("\n--- 6. Labeled Continue ---");
        
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("Skipping to next i at i=" + i + ", j=" + j);
                    continue outer;  // Skips to next iteration of outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        
        // ==========================================
        // 7. BREAK IN SWITCH (Classic Use Case)
        // ==========================================
        System.out.println("\n--- 7. Break in Switch Statement ---");
        
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;  // Prevents fall-through
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;  // Without this, it would print Thursday too!
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Weekend");
        }
        
        
        // ==========================================
        // 8. PRACTICAL EXAMPLE: Prime Number Check
        // ==========================================
        System.out.println("\n--- 8. Practical: Prime Number Check ---");
        
        int number = 17;
        boolean isPrime = true;
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;  // Not prime, exit loop immediately
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a PRIME number");
        } else {
            System.out.println(number + " is NOT a prime number");
        }
        
        
        // ==========================================
        // 9. PRACTICAL EXAMPLE: Skip Negative Numbers
        // ==========================================
        System.out.println("\n--- 9. Practical: Skip Negative Numbers ---");
        
        int[] numbers = {1, 2, -3, 4, -5, 6, 7};
        
        System.out.print("Positive numbers: ");
        for (int n : numbers) {
            if (n < 0) {
                continue;  // Skip negative numbers
            }
            System.out.print(n + " ");
        }
        System.out.println();
        
        
        // ==========================================
        // 10. PRACTICAL EXAMPLE: Search with Break
        // ==========================================
        System.out.println("\n--- 10. Practical: Search with Break ---");
        
        int[] arr = {10, 20, 30, 40, 50};
        int searchFor = 30;
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchFor) {
                System.out.println("Found " + searchFor + " at index " + i);
                found = true;
                break;  // Stop searching once found
            }
        }
        
        if (!found) {
            System.out.println(searchFor + " not found in array");
        }
        
        
        System.out.println("\n==========================================");
        System.out.println("   TOPIC 10 COMPLETE! 🎯");
        System.out.println("==========================================");
        System.out.println("\nKEY POINTS:");
        System.out.println("✓ break: Exits the loop/switch completely");
        System.out.println("✓ continue: Skips current iteration, continues loop");
        System.out.println("✓ Labeled break/continue: For nested loops");
        System.out.println("✓ Use break to optimize (stop when done)");
        System.out.println("✓ Use continue to filter (skip unwanted)");
    }
}

