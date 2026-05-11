# 🧠 Java - Introduction to Programming  
##  Loops

### 🔁 Overview
A **loop** is used to execute a block of statements repeatedly until a particular condition is satisfied.  
Each loop generally consists of:
- **Initialization statement**
- **Test condition**
- **Increment/Update statement**

---

## 🔹 For Loop
**Syntax:**
```java
for (initialization; condition; update) {
    // body of loop
}
```
**Example**
```java
for (int i = 1; i <= 20; i++) {
    System.out.println(i);
}
```
## 🔹 While Loop
**Syntax:**
``` java
while (condition) {
    // body of loop
}
```
**Example**
```java
int i = 0;
while (i <= 20) {
    System.out.println(i);
    i++;
}
```
## 🔹 Do-While Loop
**Syntax:**
```java
do {
    // body of loop
} while (condition);
```
**Example**
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i <= 20);
```

## ⚙️ Methods / Functions

### 🧩 What is a Function?
A **function** (or **method** in Java) is a block of code that performs a specific task.

---

### 💡 Why Use Functions?
- Avoid **code redundancy** — write once, use multiple times.
- Simplify **maintenance** — update logic in one place.
- Improve **readability** and **organization** of code.

---

### 🧱 Syntax
```java
return-type function_name(parameter1, parameter2, ... parameterN) {
    // function body
}
```
### 🔙 Return Type
The return type defines the data type of the value returned by the function.

Example: A function that adds two integers and returns their sum → return type is int.

If a function does not return any value, its return type is void.
### 🏷️ Function Name
- A unique identifier for the function.

- Recommended to declare a function before using it.
### 🎯 Parameters
Functions can take inputs called parameters.
```java
int add(int num1, int num2)
```
Here, num1 and num2 are parameters of type int.
### 🚀 The main() Function

The main function is the entry point of every Java program.
Execution starts from the beginning of the main() method.

---
