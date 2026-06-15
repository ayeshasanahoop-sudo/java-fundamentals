/**
 * ==========================================
 * Topic 12: Access Modifiers
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * 
 * ==========================================
 * 
 * CONCEPTS COVERED:
 * 1. private (Only inside the class)
 * 2. default (Same package)
 * 3. protected (Same package + Child classes)
 * 4. public (Everywhere)
 * ==========================================
 */
class BankAccount{
    // 1. PRIVATE: Only accessible inside THIS class
    private double balance=1000.0;
    // 2. DEFAULT: Accessible in same package (no keyword)
    String bankName="HDFC Bank";
     // 3. PROTECTED: Accessible in same package + child classes
    protected String accountType = "Savings"; 
    // 4. PUBLIC: Accessible everywhere
    public String ownerName ="Ayesha ";
    // public mehtod to access the private variable safely 
    public double getBalance(){
        return balance ;//Allowed: we are inside the same class 


    }
}

public class Topic12_AccessModifier {
    public static void main(String args[]){
        System.out.println("===========================");
        System.out.println("    TOPIC 12 ACCESS MODIFIER ");
        System.out.println("==================================");
        BankAccount acc =new BankAccount ();
        // ✅ PUBLIC: Works perfectly
        System.out.println(" OWNER (PUBLIC)" +acc.ownerName );
        // ✅ DEFAULT: Works perfectly (same package)
        System.out.println("Bank (default)"+acc.bankName);
        // ✅ PROTECTED: Works perfectly (same package)
        System.out.println("Type (protected )" + acc.accountType);
        
        // ❌ PRIVATE: WILL GIVE ERROR IF UNCOMMENTED!
        // System.out.println("Balance (Private): " + acc.balance); 
        // Error: balance has private access in BankAccount
        // ✅ THE SOLUTION: Use the public method to get private data!
        System.out.println("Balance (via Public Method): " + acc.getBalance());

        System.out.println("\n==========================================");
        System.out.println("   TOPIC 12 COMPLETE! 🛡️");
        System.out.println("==========================================");
    }



    }
    

