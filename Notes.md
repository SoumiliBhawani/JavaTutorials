# Types of Operators in Java

## 1. Arithmetic Operators
Used for basic mathematical calculations.
- `+` (Addition)
- `-` (Subtraction)
- `*` (Multiplication)
- `/` (Division)
- `%` (Modulus)

**Example:**
```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```
## 2. Relational Operators
Used to compare values, returning true or false.
- `==` (Equal to)
- `!=` (Not equal to)
- `>` (Greater than)
- `<` (Less than)
- `>=` (Greater than or equal to)
- `<=` (Less than or equal to)

**Example:**
```java
int x = 5, y = 10;
System.out.println(x == y); // false
System.out.println(x < y);  // true
```

## 3. Logical Operators
Used to combine boolean expressions.
- `&&` (Logical AND)
- `||` (Logical OR)
- `!` (Logical NOT)
- `^` (Logical XOR)

## Logical AND (`&&`)
| A     | B     | A && B |
|-------|-------|--------|
| false | false | false  |
| false | true  | false  |
| true  | false | false  |
| true  | true  | true   |

---

## Logical OR (`||`)
| A     | B     | A \|\| B |
|-------|-------|----------|
| false | false | false    |
| false | true  | true     |
| true  | false | true     |
| true  | true  | true     |

---

## Logical NOT (`!`)
| A     | !A    |
|-------|-------|
| false | true  |
| true  | false |

**Example:**
```java
boolean a = true, b = false;
System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a);     // false
System.out.println(a ^ b);  // true
```
## 4. Assignment Operators
Used to assign values to variables.
- `=` (Simple assignment)
- `+=`,`-=`, `*=`, `/=`, `%=` (Compound assignments)

**Example:**
```java
int num = 10;
num += 5; // num = 15
num *= 2; // num = 30
```
## 5. Increment and Decrement Operators
Increase or decrease a variable by 1.
- `++` (Increment)
- `--` (Decrement)

**Example:**
```java
int count = 5;
System.out.println(++count); // Pre-increment: 6
System.out.println(count++); // Post-increment: 6 (then becomes 7)
```
## Bitwise Operators
Operate on binary representations of integers.
- `&` (AND)
- `|` (OR)
- `^` (XOR)
- `~` (NOT)
- `<<` (Left Shift)
- `>>` (Right Shift)
- `>>>` (Unsigned Right Shift)

---

## 1. Bitwise AND (`&`)
| A | B | A & B |
|---|---|-------|
| 0 | 0 | 0 |
| 0 | 1 | 0 |
| 1 | 0 | 0 |
| 1 | 1 | 1 |

---

## 2. Bitwise OR (`|`)
| A | B | A \| B |
|---|---|--------|
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 1 |

---

## 3. Bitwise XOR (`^`)
| A | B | A ^ B |
|---|---|-------|
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 0 |

---

## 4. Bitwise NOT (`~`)
Unary operator — flips each bit.

| A | ~A |
|---|----|
| 0 | 1  |
| 1 | 0  |

> ⚠️ In Java, integers are stored in **two’s complement**, so `~x = -(x+1)`.

---

## 5. Left Shift (`<<`)
Shifts bits to the left, filling with 0.

Example with `a = 5 (0101)`:

| Expression | Result (Binary) | Result (Decimal) |
|------------|-----------------|------------------|
| a << 1     | 1010            | 10 |
| a << 2     | 10100           | 20 |

---

## 6. Right Shift (`>>`)
Shifts bits to the right, preserving the **sign bit**.

Example with `a = 20 (10100)`:

| Expression | Result (Binary) | Result (Decimal) |
|------------|-----------------|------------------|
| a >> 1     | 1010            | 10 |
| a >> 2     | 101             | 5 |

---

## 7. Unsigned Right Shift (`>>>`)
Shifts bits to the right, filling with **0** (ignores sign bit).

Example with `a = -20` (in binary two’s complement):

| Expression | Result (Binary) | Result (Decimal) |
|------------|-----------------|------------------|
| a >>> 1    | Large positive value (sign bit cleared) | Depends on 32-bit representation |

---

**Example:**
```java
int a = 5;  // 0101
int b = 3;  // 0011
System.out.println(a & b); // 1 (0001)
System.out.println(a | b); // 7 (0111)
System.out.println(a ^ b); // 6 (0110)
```

## 7. Conditional(Ternary Operator)
Shorthand for `if-else`
- `?:`

**Example:**
```java
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result); // Adult
```
## 8. Object-oriented Operators
- `new` → create objects

- `instanceof ` → check type compatibility

- `this` → reference current object

- `super` → reference parent class

**Example:**
```java
String s = new String("Hello");
System.out.println(s instanceof String); // true
```
---
# Java Operator Precedence

Operator precedence determines the order in which operators are evaluated in expressions.  
Operators with higher precedence are evaluated before those with lower precedence.  
Parentheses `()` can always be used to override precedence.



## Precedence Table (Highest to Lowest)

| Precedence Level | Operators | Description |
|------------------|-----------|-------------|
| 1 (Highest) | `()`, `[]`, `.` | Parentheses, array indexing, member access |
| 2 | `++`, `--`, `+` (unary), `-` (unary), `~`, `!` | Unary operators (increment, decrement, sign, bitwise NOT, logical NOT) |
| 3 | `*`, `/`, `%` | Multiplication, division, modulus |
| 4 | `+`, `-` | Addition, subtraction |
| 5 | `<<`, `>>`, `>>>` | Bitwise shift operators |
| 6 | `<`, `<=`, `>`, `>=`, `instanceof` | Relational operators |
| 7 | `==`, `!=` | Equality operators |
| 8 | `&` | Bitwise AND |
| 9 | `^` | Bitwise XOR |
| 10 | `|` | Bitwise OR |
| 11 | `&&` | Logical AND |
| 12 | `||` | Logical OR |
| 13 | `?:` | Ternary conditional operator |
| 14 | `=`, `+=`, `-=`, `*=`, `/=`, `%=` , `&=`, `^=`, `|=`, `<<=`, `>>=`, `>>>=` | Assignment operators |
| 15 (Lowest) | `,` | Comma (rarely used in Java) |

<img width="527" height="261" alt="image" src="https://github.com/user-attachments/assets/0c0426ed-4d26-40ab-8a20-9b6acd12178f" />


## Example Demonstrations

### Multiplication before Addition
```java
int result = 10 + 5 * 2; 
// Multiplication first: 5 * 2 = 10
// Then addition: 10 + 10 = 20
```
### Using Parentheses to Override
```java
int result2 = (10 + 5) * 2; 
// Parentheses force addition first: 15 * 2 = 30
```
### Combining Pre/Post Increment
```java
int x = 5;
int y = ++x + x++; 
// Step 1: ++x → x = 6, value = 6
// Step 2: x++ → value = 6, then x = 7
// y = 6 + 6 = 12
```
---
