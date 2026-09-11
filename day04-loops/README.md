# Day 4: Loops in Java

## What I Learned
- For loop
- While loop
- Do-while loop
- Nested loops
- Break and continue

## Types of Loops

### 1. For Loop
Used when you know how many times to loop.


for (int i = 1; i <= 5; i++) {
    System.out.println("Item " + i);
}


### 2. While Loop
Used when you don't know how many times to loop.

int count = 1;
while (count <= 5) {
    System.out.println("Count: " + count);
    count++;
}

### 3. Do-While Loop
Runs at least once.

int num = 1;
do {
    System.out.println("Number: " + num);
    num++;
} while (num <= 5);

### 4. Nested Loop
Loop inside a loop.

java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();

### 5. Break and Continue
java
// Break - stop loop
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;
    System.out.println(i);
}

// Continue - skip iteration
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}

    
