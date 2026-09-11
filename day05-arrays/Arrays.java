public class Arrays {
    public static void main(String[] args) {
        
        // ============================================
        // 1. SINGLE DIMENSION ARRAY
        // ============================================
        System.out.println("=== Single Dimension Array ===");
        
        int[] numbers = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // ============================================
        // 2. QA EXAMPLE: Bill Items Array
        // ============================================
        System.out.println("\n=== Bill Items ===");
        
        String[] itemNames = {"Paracetamol", "Amoxicillin", "Ibuprofen"};
        int[] quantities = {2, 1, 3};
        double[] prices = {50.0, 120.0, 80.0};
        
        double grandTotal = 0;
        
        for (int i = 0; i < itemNames.length; i++) {
            double amount = quantities[i] * prices[i];
            grandTotal += amount;
            
            System.out.println("Item: " + itemNames[i]);
            System.out.println("  Qty: " + quantities[i]);
            System.out.println("  Price: Rs. " + prices[i]);
            System.out.println("  Amount: Rs. " + amount);
        }
        System.out.println("Grand Total: Rs. " + grandTotal);
        
        // ============================================
        // 3. ENHANCED FOR LOOP
        // ============================================
        System.out.println("\n=== Enhanced For Loop ===");
        
        String[] paymentModes = {"Cash", "Card", "Credit", "Online"};
        
        for (String mode : paymentModes) {
            System.out.println("Payment Mode: " + mode);
        }
        
        // ============================================
        // 4. FIND MAX VALUE
        // ============================================
        System.out.println("\n=== Find Max Bill ===");
        
        double[] billAmounts = {500.0, 1200.0, 800.0, 2000.0, 150.0};
        double maxAmount = billAmounts[0];
        
        for (int i = 1; i < billAmounts.length; i++) {
            if (billAmounts[i] > maxAmount) {
                maxAmount = billAmounts[i];
            }
        }
        System.out.println("Maximum Bill: Rs. " + maxAmount);
        
        // ============================================
        // 5. FIND MIN VALUE
        // ============================================
        System.out.println("\n=== Find Min Bill ===");
        
        double minAmount = billAmounts[0];
        for (int i = 1; i < billAmounts.length; i++) {
            if (billAmounts[i] < minAmount) {
                minAmount = billAmounts[i];
            }
        }
        System.out.println("Minimum Bill: Rs. " + minAmount);
        
        // ============================================
        // 6. SUM AND AVERAGE
        // ============================================
        System.out.println("\n=== Sum and Average ===");
        
        double sum = 0;
        for (double amount : billAmounts) {
            sum += amount;
        }
        double average = sum / billAmounts.length;
        
        System.out.println("Total: Rs. " + sum);
        System.out.println("Average: Rs. " + average);
    }
}
