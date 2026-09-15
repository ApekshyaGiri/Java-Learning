/**
 * Day 7: Polymorphism
 * 
 * Polymorphism = एउटै method ले फरक-फरक काम गर्ने
 * 
 * Types:
 * 1. Method Overloading (Compile-time)
 * 2. Method Overriding (Runtime)
 */
public class Polymorphism {
    public static void main(String[] args) {
        
        // Method Overloading
        System.out.println("=== Method Overloading ===");
        Calculator calc = new Calculator();
        System.out.println("Add 2 int: " + calc.add(10, 20));
        System.out.println("Add 3 int: " + calc.add(10, 20, 30));
        System.out.println("Add 2 double: " + calc.add(10.5, 20.5));
        
        // Method Overriding (Runtime Polymorphism)
        System.out.println("\n=== Method Overriding ===");
        Bill cashBill = new CashBill(1001, 5000);
        Bill creditBill = new CreditBill(1002, 3000);
        
        cashBill.displayType();
        creditBill.displayType();
    }
}

// ============================================
// Method Overloading
// ============================================
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

// ============================================
// Method Overriding
// ============================================
class Bill {
    int billNo;
    double amount;
    
    Bill(int billNo, double amount) {
        this.billNo = billNo;
        this.amount = amount;
    }
    
    void displayType() {
        System.out.println("Generic Bill");
    }
}

class CashBill extends Bill {
    CashBill(int billNo, double amount) {
        super(billNo, amount);
    }
    
    @Override
    void displayType() {
        System.out.println("Cash Bill: Rs. " + amount);
    }
}

class CreditBill extends Bill {
    CreditBill(int billNo, double amount) {
        super(billNo, amount);
    }
    
    @Override
    void displayType() {
        System.out.println("Credit Bill: Rs. " + amount);
    }
}
