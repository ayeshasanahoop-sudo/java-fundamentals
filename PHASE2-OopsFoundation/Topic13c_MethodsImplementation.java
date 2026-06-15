/**
 * ==========================================
 * Topic 13c: Methods - All Implementation Ways
 * ==========================================
 * Author  : Ayesha Siddiqui
 * GitHub  : github.com/ayeshasanahoop-sudo
 * College : NSAKCET, Hyderabad
 * Goal    : Google Internship 2027
 * ==========================================
 * 
 * CONCEPTS COVERED:
 * 1. Four Categories of Methods (with/without args & return)
 * 2. Instance Method (2 access ways)
 * 3. Class/Static Method (4 access ways)
 * 4. Method Overloading (3 ways)
 * 5. Method Overriding (basic intro)
 * ==========================================
 */
// ==========================================
// PART 1: Four Categories of Methods
// ==========================================
class Calculator {
    int instanceVar = 100;
    static int staticVar = 200;
    
    // TYPE 1: With Arguments, With Return
    int add(int a, int b) {
        return a + b;
    }
    
    // TYPE 2: With Arguments, Without Return (void)
    void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
        // TYPE 3: Without Arguments but With Return 
        int getNumber() {
            return 45; }
 // TYPE 4: Without Arguments, Without Return (void)
           void display(){
            System.out.println("Welcome to calcualtor ");

           } 
// STATIC METHOD (Class Method)
     static void staticDisplay (){
    System.out.println("static method called ");

     // Can only access staticVar, NOT instanceVar

}
}
// ==========================================
// PART 2: Method Overloading (3 Ways)
// ==========================================

    class MathOperations {
    // WAY 1: Different Number of Parameters
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // WAY 2: Different Data Types
    double add(double a, double b) {
        return a + b;
    }
    // WAY 3: Different Order of Parameters
    void display(int a, String b) {
        System.out.println("Int: " + a + ", String: " + b);
    }
    
    void display(String a, int b) {
        System.out.println("String: " + a + ", Int: " + b);
    }
    
}// ==========================================
// PART 3: Method Overriding (Parent-Child)
// ==========================================
class Animal{
    void makeSound(){
        System.out.println("Anmial make sounds");

    }
}
class DogextendAnimal{
    @override 
    void makeSound(){
        System.out.println(" wolfs make sounds");


    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
}

// ==========================================
// MAIN PROGRAM
// ==========================================
public class Topic13c_MethodsImplementation{

    static void samClassStatic(){
        System.out.println("Static method in same class - direct call");

    }


public static void main(String args[]){
    System.out.println("==========================================");
        System.out.println("   TOPIC 13c: METHODS - ALL WAYS");
        System.out.println("======================================");

// ==========================================
        // 1. Four Categories of Methods
        // ==========================================
        System.out.println("--- 1. Four Categories ---");
        Calculator calc = new Calculator();
        int sum =calc.add(10,20);
        System.out.println("Type 1 (add): " + sum);
        // type 2 with arg ,without return 
        calc.printSum(15,25);
        // Type 3 without arg with return 
         ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
        



}





    }















       











    
