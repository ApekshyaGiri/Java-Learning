public class Loops {
    public static void main(String[] args) {
        
        // ============================================
        // 1. FOR LOOP
        // ============================================
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Item " + i);
        }
        
        // ============================================
        // 2. QA EXAMPLE: Multiple Bill Items
        // ============================================
        String[] items = {"Paracetamol", "Amoxicillin", "Ibuprofen", "Cetirizine"};
        double[] prices = {50.0, 120.0, 80.0, 30.0};
        
        double total = 0;
        
        System.out.println("\n=== Bill Items ===");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + ": Rs. " + prices[i]);
            total += prices[i];
        }
        System.out.println("Total: Rs. " + total);
        
        // ============================================
        // 3. WHILE LOOP
        // ============================================
        System.out.println("\n=== While Loop ===");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // ============================================
        // 4. QA EXAMPLE: Retry Failed Test
        // ============================================
        int maxRetries = 3;
        int attempt = 1;
        boolean testPassed = false;
        
        System.out.println("\n=== Test Retry ===");
        while (attempt <= maxRetries && !testPassed) {
            System.out.println("Attempt " + attempt + ": Running test...");
            
            // Simulate test result (pass on 2nd attempt)
            if (attempt == 2) {
                testPassed = true;
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed, retrying...");
            }
            attempt++;
        }
        
        // ============================================
        // 5. DO-WHILE LOOP
        // ============================================
        System.out.println("\n=== Do-While Loop ===");
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
        
        // ============================================
        // 6. BREAK AND CONTINUE
        // ============================================
        System.out.println("\n=== Break Example ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Stop loop when i = 5
            }
            System.out.println("i = " + i);
        }
        
        System.out.println("\n=== Continue Example ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip when i = 3
            }
            System.out.println("i = " + i);
        }
        
        // ============================================
        // 7. NESTED LOOP
        // ============================================
        System.out.println("\n=== Nested Loop ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
