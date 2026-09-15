/**
 * Day 7: Class and Object
 * 
 * Class = Blueprint (नक्सा)
 * Object = Instance (वास्तविक वस्तु)
 */
public class ClassObject {
    public static void main(String[] args) {
        
        // Create objects
        Patient p1 = new Patient("Rajesh Hamal", 45, "Male");
        Patient p2 = new Patient("Bikash Kushwaha", 32, "Male");
        
        // Display patient info
        p1.displayInfo();
        p2.displayInfo();
        
        // Create bill objects
        Bill b1 = new Bill(3582, 1000.0, "Cash");
        Bill b2 = new Bill(3583, 2500.0, "Credit");
        
        b1.displayBill();
        b2.displayBill();
    }
}

// ============================================
// Patient Class
// ============================================
class Patient {
    String name;
    int age;
    String gender;
    
    // Constructor
    Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    // Method
    void displayInfo() {
        System.out.println("=== Patient Info ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println();
    }
}

// ============================================
// Bill Class
// ============================================
class Bill {
    int billNo;
    double amount;
    String paymentMode;
    
    Bill(int billNo, double amount, String paymentMode) {
        this.billNo = billNo;
        this.amount = amount;
        this.paymentMode = paymentMode;
    }
    
    void displayBill() {
        System.out.println("=== Bill Info ===");
        System.out.println("Bill No: " + billNo);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Payment: " + paymentMode);
        System.out.println();
    }
}
