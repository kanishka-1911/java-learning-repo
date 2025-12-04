# ☕ Java Exception Handling — Notes

## Exception?
event that occurs during program execution and disrupts the normal flow of the program.
Java uses exception handling to prevent program crashes.

##  Why Exception Handling?
- To avoid abnormal termination
- To handle unexpected situations gracefully
- To separate error-handling logic from normal code


## Types of Exceptions

## 1.checked :
- Checked at compile time
- Must be handled using `try-catch` or `throws`
- Examples: `IOException`, `SQLException`, `ClassNotFoundException`

## 2.unchecked:
- Occur at run time
- Not checked by compiler
- Examples: `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`

## 3.Errors:
- Serious issues → cannot be handled
- Example: `StackOverflowError`, `OutOfMemoryError`

## `try-catch` Block

```java
try {
    // risky code
} catch (Exception e) {
    // handling code
}
