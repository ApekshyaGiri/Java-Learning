
public class ExceptionDemo {
    public static void main(String[] args) {
        
        // ============================================
        // 1. WITHOUT EXCEPTION HANDLING (Error!)
        // ============================================
        System.out.println("=== Without Exception Handling ===");
        
        try {
            int result = 10 / 0;  // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            System.out.println("Error Message: " + e.getMessage());
        }
        
        // ============================================
        // 2. TRY-CATCH
        // ============================================
        System.out.println("\n=== Try-Catch ===");
        
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }
        
        // ============================================
        // 3. MULTIPLE CATCH
        // ============================================
        System.out.println("\n=== Multiple Catch ===");
        
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Error");
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
        
        // ============================================
        // 4. FINALLY
        // ============================================
        System.out.println("\n=== Finally ===");
        
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs!");
        }
        
        // ============================================
        // 5. THROW
        // ============================================
        System.out.println("\n=== Throw ===");
        
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ============================================
        // 6. QA EXAMPLE: Validate Bill Amount
        // ============================================
        System.out.println("\n=== QA Example: Bill Validation ===");
        
        try {
            validateBillAmount(-100);
        } catch (Exception e) {
            System.out.println("Bill Error: " + e.getMessage());
        }
        
        try {
            validateBillAmount(500);
            System.out.println("Bill amount is valid");
        } catch (Exception e) {
            System.out.println("Bill Error: " + e.getMessage());
        }
    }
    
    // ============================================
    // THROW METHOD
    // ============================================
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Age is valid: " + age);
    }
    
    // ============================================
    // QA VALIDATION METHOD
    // ============================================
    static void validateBillAmount(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Bill amount must be greater than 0");
        }
        if (amount > 100000) {
            throw new Exception("Bill amount cannot exceed Rs. 100,000");
        }
    }
}
