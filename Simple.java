/*
**************************************************************
Program Name: Simple.java
Author: Tamara Gagic
Description: Prints a simple message about Java.
**************************************************************

Evaluation of Program Names:
1. simple
   - Legal Identifier? Yes.
   - Good Choice? No. While it is a legal identifier, it does not follow Java naming conventions for class names, which should start with a capital letter.

2. SimpleProgram
   - Legal Identifier? Yes.
   - Good Choice? Yes. This name is a legal identifier and follows Java naming conventions. It starts with a capital letter and is more descriptive than just `Simple`.

3. 1Simple
   - Legal Identifier? No.
   - Good Choice? No. Identifiers cannot start with a number.

4. _Simple_
   - Legal Identifier? Yes.
   - Good Choice? No. This is a legal identifier, but it is not a good choice for a class name. Underscores at the beginning and end of a class name are not normal.

5. *Simple*
   - Legal Identifier? No.
   - Good Choice? No. Identifiers cannot contain special characters like `*`.

6. $123_45
   - Legal Identifier? Yes.
   - Good Choice? No. Although this is a legal identifier, its confusing and non-descriptive.

7. Simple!
   - Legal Identifier? No.
   - Good Choice? No. Identifiers cannot contain special characters like `!`.
*/

public class Simple {
    public static void main(String[] args) {
        System.out.println("Java rocks!!");
    }
}

