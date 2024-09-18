/*
**************************************************************
Program Name: Hello.java
Author: Tamara Gagic
Description: This program prints a "Hello, World!" message.
             Below are results from introducing various syntax errors
             to understand Java compiler messages.

1. Class name different from file name:
   - Error Message: "Hello.java:6: error: class Helo is public, should be declared in a file named Helo.java"

2. Misspelling inside the string:
   - Error Message: No error.
   - Explanation: The compiler does not check the content of strings.

3. No ending quotation mark in a string literal:
   - Error Messages:
     - "Hello.java:8: error: ';' expected"
     - "Hello.java:8: error: unclosed string literal"

4. No beginning quotation mark in a string literal:
   - Error Messages:
     - "Hello.java:8: error: cannot find symbol"
     - "Hello.java:8: error: ';' expected"
     - "Hello.java:8: error: not a statement"
     - "Hello.java:8: error: unclosed string literal"

5. No semicolon after a statement:
   - Error Message: "Hello.java:8: error: ';' expected"
**************************************************************
*/

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

