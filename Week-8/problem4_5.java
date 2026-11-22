package week8;

class ObjectOriented {
    public void abstraction() {
        System.out.println("OOP Concept: Abstraction hides internal implementation details.");
    }

    public void polymorphism() {
        System.out.println("OOP Concept: Polymorphism allows one interface with multiple forms.");
    }

    public void inheritance() {
        System.out.println("OOP Concept: Inheritance allows code reusability.");
    }
}

class JavaLanguage extends ObjectOriented {
    public void persistence() {
        System.out.println("Java Feature: Persistence via Serialization and JDBC.");
    }

    public void interfaces() {
        System.out.println("Java Feature: Supports multiple inheritance using Interfaces.");
    }
}

// Named CPP because '+' is not allowed in Java class names
class CPP extends ObjectOriented {
    public void template() {
        System.out.println("C++ Feature: Templates enable generic programming.");
    }

    public void friendFunction() {
        System.out.println("C++ Feature: Friend functions can access private members of a class.");
    }
}

public class problem4_5 {
    public static void main(String[] args) {
        System.out.println("=== JavaLanguage Object ===");
        JavaLanguage javaObj = new JavaLanguage();
        // Parent methods
        javaObj.abstraction();
        javaObj.polymorphism();
        javaObj.inheritance();
        // Own methods
        javaObj.persistence();
        javaObj.interfaces();

        System.out.println("\n=== C++ (CPP) Object ===");
        CPP cppObj = new CPP();
        // Parent methods
        cppObj.abstraction();
        cppObj.polymorphism();
        cppObj.inheritance();
        // Own methods
        cppObj.template();
        cppObj.friendFunction();
    }
}