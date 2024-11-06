import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RailwayTicket {
    private String name;
    private String coach;
    private long mobNo;
    private int amount;
    private int totalAmount;

    // Constructor to initialize and update total amount based on coach type
    public RailwayTicket(String name, String coach, long mobNo, int amount) {
        this.name = name;
        this.coach = coach;
        this.mobNo = mobNo;
        this.amount = amount;
        updateTotalAmount();
    }

    // Method to update total amount based on coach type
    private void updateTotalAmount() {
        switch (coach) {
            case "First_AC":
                totalAmount = amount + 700;
                break;
            case "Second_AC":
                totalAmount = amount + 500;
                break;
            case "Third_AC":
                totalAmount = amount + 250;
                break;
            default:
                System.out.println("Invalid coach type! Defaulting to Sleeper.");
                coach = "Sleeper";
                totalAmount = amount;
        }
    }

    // Method to display passenger details
    public void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Coach Type: " + coach);
        System.out.println("Mobile Number: " + mobNo);
        System.out.println("Total Amount for this Passenger: " + totalAmount);
        System.out.println("-----------------------------");
    }

    // Getter for total amount to calculate the grand total
    public int getTotalAmount() {
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<RailwayTicket> passengers = new ArrayList<>();

        System.out.print("Enter the number of passengers: ");
        int numPassengers = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        int grandTotal = 0;  // To store the total amount for all passengers

        // Collecting details for each passenger
        for (int i = 0; i < numPassengers; i++) {
            System.out.println("\nEnter details for Passenger " + (i + 1) + ":");
            System.out.print("Enter Passenger Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Coach (First_AC, Second_AC, Third_AC, Sleeper): ");
            String coach = scanner.nextLine();

            System.out.print("Enter Mobile Number: ");
            long mobNo = scanner.nextLong();

            System.out.print("Enter Basic Amount: ");
            int amount = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            RailwayTicket ticket = new RailwayTicket(name, coach, mobNo, amount);
            passengers.add(ticket);  // Add ticket to the list
            grandTotal += ticket.getTotalAmount();  // Accumulate the total amount
        }

        // Displaying details for all passengers
        System.out.println("\nPassenger Details:");
        for (RailwayTicket ticket : passengers) {
            ticket.display();
        }

        // Displaying the grand total amount
        System.out.println("Grand Total Amount for All Passengers: " + grandTotal);
        scanner.close();
    }
}
