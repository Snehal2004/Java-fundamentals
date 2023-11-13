//1. Hello World //

public class gitfundamentals {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


//2. variables and data types //
/*
public class VariablesExample {
    public static void main(String[] args) {
        int age = 25;
        double height = 5.8;
        String name = "John";
        System.out.println(name + " is " + age + " years old and " + height + " feet tall.");
    }
}
*/

// 3. Arithmetic operations //
/*
public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}
*/

// 4. conditional statements//
/*
public class ConditionalStatements {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
}
*/


// 5. Loops//
/*
public class LoopsExample {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
        // While loop
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }
        // Do-While loop
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);
    }
}*/


//6. Arrays //
/*
public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

*/
//7.Functions/Methods: //
/*
public class MethodsExample {
    public static void main(String[] args) {
        int result = addNumbers(5, 3);
        System.out.println("Sum: " + result);
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }
}

*/

//8.String Manipulation: //
/*
public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
    }
}

*/

//9.Switch Statements: //
/*
public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            // ... (continue for other days)
            default:
                System.out.println("Invalid day");
        }
    }
}

*/

//10.Input/Output: //
/*
import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}

*/

//11.Exception Handling: //
/*
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

*/

//12.Object-Oriented Concepts: //
/*
public class Dog {
    String breed;
    int age;

    void bark() {
        System.out.println("Woof! Woof!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.breed = "Labrador";
        myDog.age = 3;
        System.out.println("My dog is a " + myDog.breed + " and is " + myDog.age + " years old.");
        myDog.bark();
    }
}

*/

//13.Inheritance: //
/*
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}

*/

//14.Polymorphism: //
/*
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw();
    }
}

*/

//15.Encapsulation://
/*
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
    }
}

*/

//16.Abstraction://
/*
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractionExample {
    public static

*/

// prime number //
/*
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}*/

//fibonacci series//
/*
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci Sequence: " + firstTerm + ", " + secondTerm);

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}

*/
// factorial number//
/*
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}

*/


