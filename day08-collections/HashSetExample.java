import java.util.HashSet;

/**
 * Day 8: HashSet
 * 
 * HashSet = Unique items
 * Duplicate हटाउँछ
 */
public class HashSetExample {
    public static void main(String[] args) {
        
        // ============================================
        // 1. CREATE HASHSET
        // ============================================
        HashSet<String> paymentModes = new HashSet<>();
        
        // ============================================
        // 2. ADD ELEMENTS
        // ============================================
        paymentModes.add("Cash");
        paymentModes.add("Card");
        paymentModes.add("Online");
        paymentModes.add("Credit");
        paymentModes.add("Cash");  // Duplicate - add हुँदैन
        
        System.out.println("=== Payment Modes ===");
        System.out.println(paymentModes);
        System.out.println("Size: " + paymentModes.size());
        
        // ============================================
        // 3. QA EXAMPLE: Unique Patients
        // ============================================
        System.out.println("\n=== Unique Patients ===");
        
        HashSet<String> uniquePatients = new HashSet<>();
        uniquePatients.add("Rajesh");
        uniquePatients.add("Bikash");
        uniquePatients.add("Rajesh");  // Duplicate
        uniquePatients.add("Rabin");
        uniquePatients.add("Bikash");  // Duplicate
        
        System.out.println("Unique Patients: " + uniquePatients);
        System.out.println("Total Unique: " + uniquePatients.size());
        
        // ============================================
        // 4. CHECK CONTAINS
        // ============================================
        System.out.println("\n=== Contains ===");
        System.out.println("Has Cash: " + paymentModes.contains("Cash"));
        System.out.println("Has Cheque: " + paymentModes.contains("Cheque"));
        
        // ============================================
        // 5. LOOP THROUGH
        // ============================================
        System.out.println("\n=== Loop Through ===");
        for (String mode : paymentModes) {
            System.out.println("Mode: " + mode);
        }
        
        // ============================================
        // 6. REMOVE
        // ============================================
        paymentModes.remove("Credit");
        System.out.println("\n=== After Remove ===");
        System.out.println(paymentModes);
        
        // ============================================
        // 7. CLEAR ALL
        // ============================================
        paymentModes.clear();
        System.out.println("\n=== After Clear ===");
        System.out.println("Modes: " + paymentModes);
        System.out.println("Size: " + paymentModes.size());
    }
}
