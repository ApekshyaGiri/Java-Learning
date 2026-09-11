public class Operators {
    public static void main(String[] args) {
        
        // ============================================
        // 1. ARITHMETIC OPERATORS
        // ============================================
        int a = 10;
        int b = 3;
        
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));  // 13
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 30
        System.out.println("a / b = " + (a / b));  // 3
        System.out.println("a % b = " + (a % b));  // 1
        
        // ============================================
        // 2. QA EXAMPLE: Bill Calculation
        // ============================================
        double unitPrice = 500.0;
        int quantity = 2;
        double discountPercent = 10.0;
        
        double amount = unitPrice * quantity;
        double discountAmount = amount * (discountPercent / 100);
        double grandTotal = amount - discountAmount;
        
        System.out.println("\n=== Bill Calculation ===");
        System.out.println("Unit Price: Rs. " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Discount: Rs. " + discountAmount);
        System.out.println("Grand Total: Rs. " + grandTotal);
        
        // ============================================
        // 3. COMPARISON OPERATORS
        // ============================================
        int billTotal = 1000;
        int receivedAmount = 500;
        
        System.out.println("\n=== Comparison Operators ===");
        System.out.println("billTotal == receivedAmount: " + (billTotal == receivedAmount));
        System.out.println("billTotal != receivedAmount: " + (billTotal != receivedAmount));
        System.out.println("billTotal > receivedAmount: " + (billTotal > receivedAmount));
        System.out.println("billTotal < receivedAmount: " + (billTotal < receivedAmount));
        System.out.println("billTotal >= receivedAmount: " + (billTotal >= receivedAmount));
        System.out.println("billTotal <= receivedAmount: " + (billTotal <= receivedAmount));
        
        // ============================================
        // 4. LOGICAL OPERATORS
        // ============================================
        boolean isPaid = true;
        boolean isRefunded = false;
        boolean isActive = true;
        
        System.out.println("\n=== Logical Operators ===");
        System.out.println("isPaid && isActive: " + (isPaid && isActive));
        System.out.println("isPaid || isRefunded: " + (isPaid || isRefunded));
        System.out.println("!isPaid: " + (!isPaid));
        
        // ============================================
        // 5. QA EXAMPLE: Payment Status
        // ============================================
        int total = 1000;
        int paid = 1000;
        
        System.out.println("\n=== Payment Status ===");
        if (paid == total) {
            System.out.println("Status: Paid");
        } else if (paid < total && paid > 0) {
            System.out.println("Status: Due");
        } else if (paid == 0) {
            System.out.println("Status: Credit");
        } else if (paid > total) {
            System.out.println("Status: Overpaid");
        }
    }
}
