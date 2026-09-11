public class Variables {
    public static void main(String[] args) {
        
        // Integer - Whole numbers
        int age = 25;
        int quantity = 10;
        int billNumber = 3582;
        
        // Double - Decimal numbers
        double price = 500.50;
        double discount = 10.5;
        
        // String - Text
        String patientName = "Test Patient";
        String paymentMode = "Cash";
        
        // Boolean - True/False
        boolean isPaid = true;
        boolean isRefunded = false;
        
        // Print all values
        System.out.println("=== Patient Info ===");
        System.out.println("Age: " + age);
        System.out.println("Patient: " + patientName);
        
        System.out.println("\n=== Bill Info ===");
        System.out.println("Bill Number: " + billNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: Rs. " + price);
        System.out.println("Discount: " + discount + "%");
        
        System.out.println("\n=== Payment Info ===");
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Is Paid: " + isPaid);
        System.out.println("Is Refunded: " + isRefunded);
    }
}
