# ☕ Java Self-Review & Practice Guide (Exercises 2.1 – 2.6)

This guide helps you revise **Java fundamentals** using exercises from *Java How to Program (Deitel)*.  
It includes clear explanations, corrected answers, and sample programs.

---

## 📑 Table of Contents
- [2.1 Fill in the Blanks](#21-fill-in-the-blanks)
- [2.2 True/False](#22-truefalse)
- [2.3 Write Statements](#23-write-statements)
- [2.4 Correct Errors](#24-correct-errors)
- [2.5 Product of Three Integers](#25-product-of-three-integers)
- [2.6 Complete Program](#26-complete-program)
---

## 📘 Chapter 2 – Self-Review Exercises

### 2.1 Fill in the Blanks
- `{` begins the body of every method, and `}` ends it.  
- The `if` statement is used to make decisions.  
- `//` begins an end-of-line comment.  
- Spaces, newlines, and tabs are called **whitespace**.  
- Keywords are reserved words in Java.  
- Java applications begin execution at method `main`.  
- `System.out.print`, `System.out.println`, and `System.out.printf` display output.

---

### 2.2 True/False
- a) ❌ False – Comments do not print text; they are for documentation.  
- b) ✅ True – All variables must have a type.  
- c) ❌ False – Java is case-sensitive (`number` ≠ `NuMbEr`).  
- d) ❌ False – `%` works with floating-point numbers as well.  
- e) ❌ False – `*`, `/`, `%` have higher precedence than `+`, `-`.

---

### 2.3 Write Statements

```java
// a) Declare variables
int c, thisIsAVariable, q76354, number;

// b) Prompt user
System.out.print("Enter an integer: ");

// c) Input integer
value = input.nextInt();

// d) Print one line
System.out.println("This is a Java program");

// e) Print two lines
System.out.println("This is a Java\nprogram");

// f) Print using printf
System.out.printf("%s\n%s\n", "This is a Java", "program");

// g) Conditional check
if (number != 7)
    System.out.println("The variable number is not equal to 7");
```
## 2.4 Correct Errors

// a) Incorrect semicolon
if (c < 7)
    System.out.println("c is less than 7");

// b) Incorrect operator
if (c >= 7)
    System.out.println("c is equal to or greater than 7");


### 2.5 Product of three Integers
// Calculate the product of three integers
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int x, y, z, result;

System.out.print("Enter first integer: ");
x = input.nextInt();

System.out.print("Enter second integer: ");
y = input.nextInt();

System.out.print("Enter third integer: ");
z = input.nextInt();

result = x * y * z;
System.out.printf("Product is %d%n", result);

### 2.6 Complete Program

```java
// Product.java
// Calculate the product of three integers.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d%n", result);
    }
}
``` 
### Sample Output
Enter first integer: 10 <br>
Enter second integer: 20 <br>
Enter third integer: 30 <br>
Product is 6000
