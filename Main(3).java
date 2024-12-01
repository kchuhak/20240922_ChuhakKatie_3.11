import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter the month (1-12)
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        // prompt the user to enter the year
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.close(); 
        
        int daysInMonth;

        // determine the number of days in the month
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month! Please enter a value between 1 and 12.");
                return; // exit the program for invalid month input
        }

        // display the result
        System.out.println("Month " + month + " of year " + year + " has " + daysInMonth + " days");
    }
}