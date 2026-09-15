public class StringMethods {
    public static void main(String[] args) {
        
        String patientName = "Rajesh Hamal";
        String paymentMode = "Cash";
        String status = "Paid";
        
        // ============================================
        // 1. LENGTH
        // ============================================
        System.out.println("=== Length ===");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Length: " + patientName.length());
        
        // ============================================
        // 2. UPPERCASE / LOWERCASE
        // ============================================
        System.out.println("\n=== Case Conversion ===");
        System.out.println("Uppercase: " + patientName.toUpperCase());
        System.out.println("Lowercase: " + patientName.toLowerCase());
        
        // ============================================
        // 3. CHARACTER AT INDEX
        // ============================================
        System.out.println("\n=== Char At ===");
        System.out.println("First char: " + patientName.charAt(0));
        System.out.println("Last char: " + patientName.charAt(patientName.length() - 1));
        
        // ============================================
        // 4. SUBSTRING
        // ============================================
        System.out.println("\n=== Substring ===");
        System.out.println("First name: " + patientName.substring(0, 6));
        System.out.println("Last name: " + patientName.substring(7));
        
        // ============================================
        // 5. CONTAINS
        // ============================================
        System.out.println("\n=== Contains ===");
        System.out.println("Contains 'Rajesh': " + patientName.contains("Rajesh"));
        System.out.println("Contains 'Kumar': " + patientName.contains("Kumar"));
        
        // ============================================
        // 6. EQUALS
        // ============================================
        System.out.println("\n=== Equals ===");
        System.out.println("status.equals('Paid'): " + status.equals("Paid"));
        System.out.println("status.equals('paid'): " + status.equals("paid"));
        System.out.println("status.equalsIgnoreCase('paid'): " + status.equalsIgnoreCase("paid"));
        
        // ============================================
        // 7. TRIM
        // ============================================
        String nameWithSpaces = "   Rajesh   ";
        System.out.println("\n=== Trim ===");
        System.out.println("Before: '" + nameWithSpaces + "'");
        System.out.println("After: '" + nameWithSpaces.trim() + "'");
        
        // ============================================
        // 8. REPLACE
        // ============================================
        System.out.println("\n=== Replace ===");
        String billNo = "BILL-2026-001";
        System.out.println("Original: " + billNo);
        System.out.println("Replaced: " + billNo.replace("-", "/"));
        
        // ============================================
        // 9. SPLIT
        // ============================================
        System.out.println("\n=== Split ===");
        String csvData = "Rajesh,1000,Paid,Cash";
        String[] parts = csvData.split(",");
        
        for (String part : parts) {
            System.out.println(part);
        }
        
        // ============================================
        // 10. QA EXAMPLE: Validate Email
        // ============================================
        System.out.println("\n=== Email Validation ===");
        
        String[] emails = {
            "test@example.com",
            "invalid-email",
            "user@domain",
            "@example.com"
        };
        
        for (String email : emails) {
            boolean isValid = email.contains("@") && 
                              email.contains(".") && 
                              email.indexOf("@") > 0;
            
            System.out.println(email + " -> " + (isValid ? "Valid" : "Invalid"));
        }
        
        // ============================================
        // 11. QA EXAMPLE: Compare Strings
        // ============================================
        System.out.println("\n=== String Comparison ===");
        
        String expected = "Paid";
        String actual = "Paid";
        
        if (expected.equals(actual)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
        
        // ============================================
        // 12. STRING BUILDER
        // ============================================
        System.out.println("\n=== StringBuilder ===");
        
        StringBuilder sb = new StringBuilder();
        sb.append("Patient: ");
        sb.append(patientName);
        sb.append(", Status: ");
        sb.append(status);
        
        System.out.println(sb.toString());
    }
}
