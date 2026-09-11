# Day 3: Operators in Java

## What I Learned
- Arithmetic operators (+, -, *, /, %)
- Comparison operators (==, !=, >, <, >=, <=)
- Logical operators (&&, ||, !)

## Operators

### Arithmetic Operators

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| + | Addition | 10 + 3 | 13 |
| - | Subtraction | 10 - 3 | 7 |
| * | Multiplication | 10 * 3 | 30 |
| / | Division | 10 / 3 | 3 |
| % | Modulus | 10 % 3 | 1 |

### Comparison Operators

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| == | Equal to | 10 == 3 | false |
| != | Not equal | 10 != 3 | true |
| > | Greater than | 10 > 3 | true |
| < | Less than | 10 < 3 | false |
| >= | Greater or equal | 10 >= 3 | true |
| <= | Less or equal | 10 <= 3 | false |

### Logical Operators

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| && | AND | true && false | false |
| \|\| | OR | true \|\| false | true |
| ! | NOT | !true | false |

## QA Use Cases

### Bill Calculation
```java
double amount = unitPrice * quantity;
double discountAmount = amount * (discountPercent / 100);
double grandTotal = amount - discountAmount;
