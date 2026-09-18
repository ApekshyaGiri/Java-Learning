import java.io.*;
import java.util.ArrayList;

/**
 * Day 10: QA Example - Test Data File
 * 
 * Test data file पढ्ने र use गर्ने
 */
public class TestDataFile {
    public static void main(String[] args) {
        
        // ============================================
        // 1. CREATE TEST DATA FILE
        // ============================================
        String fileName = "login-test-data.csv";
        
        try {
            FileWriter writer = new FileWriter(fileName);
            
            // Header
            writer.write("email,password,expected\n");
            
            // Test Data
            writer.write("test@example.com,Test@123,PASS\n");
            writer.write("test@example.com,wrongpass,FAIL\n");
            writer.write(",Test@123,FAIL\n");
            writer.write("test@example.com,,FAIL\n");
            writer.write("invalid-email,Test@123,FAIL\n");
            
            writer.close();
            System.out.println("Test data file created: " + fileName);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ============================================
        // 2. READ TEST DATA
        // ============================================
        System.out.println("\n=== Test Data ===");
        
        ArrayList<String[]> testData = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
            );
            
            String line;
            boolean isHeader = true;
            
            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    System.out.println("Header: " + line);
                    isHeader = false;
                    continue;
                }
                
                String[] data = line.split(",");
                testData.add(data);
                System.out.println("Data: " + line);
            }
            reader.close();
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ============================================
        // 3. PROCESS TEST DATA
        // ============================================
        System.out.println("\n=== Process Test Data ===");
        
        for (String[] data : testData) {
            String email = data[0];
            String password = data[1];
            String expected = data[2];
            
            System.out.println("\nTest Case:");
            System.out.println("  Email: " + email);
            System.out.println("  Password: " + password);
            System.out.println("  Expected: " + expected);
            
            // Validate
            String result = validateLogin(email, password);
            System.out.println("  Actual: " + result);
            System.out.println("  Status: " + (result.equals(expected) ? "PASS" : "FAIL"));
        }
        
        // ============================================
        // 4. WRITE RESULTS
        // ============================================
        System.out.println("\n=== Write Results ===");
        
        try {
            FileWriter writer = new FileWriter("test-results.csv");
            writer.write("email,password,expected,actual,status\n");
            
            for (String[] data : testData) {
                String email = data[0];
                String password = data[1];
                String expected = data[2];
                String actual = validateLogin(email, password);
                String status = actual.equals(expected) ? "PASS" : "FAIL";
                
                writer.write(email + "," + password + "," + 
                            expected + "," + actual + "," + status + "\n");
            }
            
            writer.close();
            System.out.println("Results written to: test-results.csv");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // ============================================
    // VALIDATE LOGIN
    // ============================================
    static String validateLogin(String email, String password) {
        if (email == null || email.isEmpty()) {
            return "FAIL";
        }
        if (password == null || password.isEmpty()) {
            return "FAIL";
        }
        if (!email.contains("@")) {
            return "FAIL";
        }
        if (!password.equals("Test@123")) {
            return "FAIL";
        }
        return "PASS";
    }
}
