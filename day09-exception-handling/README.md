# Day 9: Exception Handling in Java

## What I Learned
- Exception types
- try-catch
- Multiple catch
- finally
- throw/throws

## Exception Types

| Exception | When |
|-----------|------|
| ArithmeticException | Divide by zero |
| NullPointerException | Null object access |
| ArrayIndexOutOfBoundsException | Invalid array index |
| NumberFormatException | Invalid number format |
| FileNotFoundException | File not found |
| SQLException | Database error |

## try-catch

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}

##multiple catch
try {
    String str = null;
    System.out.println(str.length());
} catch (ArithmeticException e) {
    System.out.println("Arithmetic Error");
} catch (NullPointerException e) {
    System.out.println("Null Pointer Error");
} catch (Exception e) {
    System.out.println("General Error");
}
