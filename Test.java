// PRIMITIVE: Original NOT changed
public static void tryToChange(int num) {
    num = 999;  // Changes the COPY
}

int x = 50;
tryToChange(x);
System.out.println(x);  // Output: 50 (NOT changed!)


// OBJECT: Original CAN be changed
public static void changeName(Student s) {
    s.name = "Changed";  // Changes the ACTUAL object
}

Student s1 = new Student();
s1.name = "Original";
changeName(s1);
System.out.println(s1.name);  // Output: "Changed" (YES, changed!)
