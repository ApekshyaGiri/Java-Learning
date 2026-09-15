import java.util.ArrayList;

/**
 * Day 8: ArrayList
 * 
 * ArrayList = Dynamic array
 * Size automatically बढ्छ
 */
public class ArrayListExample {
    public static void main(String[] args) {
        
        // ============================================
        // 1. CREATE ARRAYLIST
        // ============================================
        ArrayList<String> patients = new ArrayList<>();
        
        // ============================================
        // 2. ADD ELEMENTS
        // ============================================
        patients.add("Rajesh Hamal");
        patients.add("Bikash Kushwaha");
        patients.add("Rabin Singh");
        patients.add("Anishan Awale");
        
        System.out.println("=== All Patients ===");
        System.out.println(patients);
        
        // ============================================
        // 3. SIZE
        // ============================================
        System.out.println("\n=== Size ===");
        System.out.println("Total patients: " + patients.size());
        
        // ============================================
        // 4. GET ELEMENT
        // ============================================
        System.out.println("\n=== Get Element ===");
        System.out.println("First patient: " + patients.get(0));
        System.out.println("Last patient: " + patients.get(patients.size() - 1));
        
        // ============================================
        // 5. LOOP THROUGH
        // ============================================
        System.out.println("\n=== Loop Through ===");
        for (String patient : patients) {
            System.out.println("Patient: " + patient);
        }
        
        // ============================================
        // 6. REMOVE ELEMENT
        // ============================================
        patients.remove("Rabin Singh");
        System.out.println("\n=== After Remove ===");
        System.out.println(patients);
        
        // ============================================
        // 7. CHECK IF CONTAINS
        // ============================================
        System.out.println("\n=== Contains ===");
        System.out.println("Contains Rajesh: " + patients.contains("Rajesh Hamal"));
        System.out.println("Contains Rabin: " + patients.contains("Rabin Singh"));
        
        // ============================================
        // 8. QA EXAMPLE: Bill Items
        // ============================================
        System.out.println("\n=== Bill Items ===");
        
        ArrayList<Double> billAmounts = new ArrayList<>();
        billAmounts.add(500.0);
        billAmounts.add(1200.0);
        billAmounts.add(800.0);
        billAmounts.add(2000.0);
        
        double total = 0;
        for (Double amount : billAmounts) {
            total += amount;
        }
        
        System.out.println("Bills: " + billAmounts);
        System.out.println("Total: Rs. " + total);
        System.out.println("Average: Rs. " + (total / billAmounts.size()));
        
        // ============================================
        // 9. CLEAR ALL
        // ============================================
        billAmounts.clear();
        System.out.println("\n=== After Clear ===");
        System.out.println("Bills: " + billAmounts);
        System.out.println("Size: " + billAmounts.size());
    }
}
