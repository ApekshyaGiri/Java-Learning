/**
 * Day 7: Inheritance
 * 
 * Inheritance = एउटा class ले अर्को class को properties inherit गर्ने
 * 
 * Parent Class → Child Class
 */
public class Inheritance {
    public static void main(String[] args) {
        
        // Create objects
        CashBill cashBill = new CashBill(1001, 5000.0, 5000.0);
        CreditBill creditBill = new CreditBill(1002, 3000.0, "Rajesh");
        
        // Display
        cashBill.displayBill();
        creditBill.displayBill();
    }
}

// ============================================
// Parent Class: Bill
// ============================================
class Bill {
    int billNo;
    double amount;
    
    Bill(int billNo, double amount) {
        this.billNo = billNo;
        this.amount = amount;
    }
    
    void displayBill() {
        System.out.println("Bill No: " + billNo);
        System.out.println("Amount: Rs. " + amount);
    }
}

// ============================================
// Child Class: CashBill
// ============================================
class CashBill extends Bill {
    double receivedAmount;
    
    CashBill(int billNo, double amount, double receivedAmount) {
        super(billNo, amount);  // Call parent constructor
        this.receivedAmount = receivedAmount;
    }
    
    @Override
    void displayBill() {
        System.out.println("=== Cash Bill ===");
        super.displayBill();  // Call parent method
        System.out.println("Received: Rs. " + receivedAmount);
        System.out.println("Change: Rs. " + (receivedAmount - amount));
        System.out.println();
    }
}

// ============================================
// Child Class: CreditBill
// ============================================
class CreditBill extends Bill {
    String patientName;
    
    CreditBill(int billNo, double amount, String patientName) {
        super(billNo, amount);
        this.patientName = patientName;
    }
    
    @Override
    void displayBill() {
        System.out.println("=== Credit Bill ===");
        super.displayBill();
        System.out.println("Patient: " + patientName);
        System.out.println("Status: Credit");
        System.out.println();
    }
}
