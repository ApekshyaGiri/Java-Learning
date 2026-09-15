# Day 7: OOP Concepts in Java

## What I Learned
- Class and Object
- Inheritance
- Polymorphism
- Encapsulation

## 1. Class and Object

### Class
Blueprint for creating objects.

```java
class Patient {
    String name;
    int age;
    
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayInfo() {
        System.out.println(name + " - " + age);
    }
}
