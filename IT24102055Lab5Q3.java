import java.util.Scanner;

public class IT24102055Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final int MAX_DAYS_IN_MONTH = 31;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1: Start date and end date cannot be less than 1 or greater than 31
        if (startDate < 1 || startDate > MAX_DAYS_IN_MONTH || endDate < 1 || endDate > MAX_DAYS_IN_MONTH) {
            System.out.println("Error: Days must be between 1 and 31");
            return; // Exit the program
        }

        // Validation 2: Start date should be less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return; // Exit the program
        }

        // Calculate number of days reserved
        int numberOfDaysReserved = endDate - startDate;

        // Calculate discount based on the number of days reserved
        double discountRate;
        if (numberOfDaysReserved < 3) {
            discountRate = 0;
        } else if (numberOfDaysReserved <= 4) {
            discountRate = 10;
        } else {
            discountRate = 20;
        }

        // Calculate total amount
        double totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        double discount = totalAmount * discountRate / 100;
        double amountToBePaid = totalAmount - discount;

        // Display the result
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
        System.out.println("Total Amount to be Paid: " + amountToBePaid);

        scanner.close();
    }
}
