import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Day 10: File Handling
 * 
 * File पढ्ने, लेख्ने, र manage गर्ने
 */
public class FileHandling {
    public static void main(String[] args) {
        
        // ============================================
        // 1. CREATE FILE
        // ============================================
        System.out.println("=== Create File ===");
        
        try {
            File file = new File("test-data.txt");
            
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
        
        // ============================================
        // 2. WRITE TO FILE
        // ============================================
        System.out.println("\n=== Write to File ===");
        
        try {
            FileWriter writer = new FileWriter("test-data.txt");
            writer.write("TC_LOGIN_001,Valid Login,PASS\n");
            writer.write("TC_LOGIN_002,Wrong Password,PASS\n");
            writer.write("TC_LOGIN_003,Empty Email,FAIL\n");
            writer.write("TC_LOGIN_004,Empty Password,PASS\n");
            writer.close();
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("Error writing: " + e.getMessage());
        }
        
        // ============================================
        // 3. READ FROM FILE
        // ============================================
        System.out.println("\n=== Read from File ===");
        
        try {
            File file = new File("test-data.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }
        
        // ============================================
        // 4. BUFFERED READER
        // ============================================
        System.out.println("\n=== Buffered Reader ===");
        
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("test-data.txt")
            );
            
            String line;
            int lineNumber = 1;
            
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ============================================
        // 5. FILE INFO
        // ============================================
        System.out.println("\n=== File Info ===");
        
        File file = new File("test-data.txt");
        
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
        }
        
        // ============================================
        // 6. DELETE FILE
        // ============================================
        System.out.println("\n=== Delete File ===");
        
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete file");
        }
    }
}
