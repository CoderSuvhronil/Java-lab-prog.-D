import java.io.*;
import java.util.ArrayList;
import java.util.List;

class RailwayTicket {
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

    // Method to input passenger details
    void input(DataInputStream in) throws IOException {
        System.out.println("Enter Passenger name: ");
        name = in.readLine();

        System.out.println("Enter Coach (First_AC, Second_AC, Third_AC, Sleeper):");
        coach = in.readLine();

        System.out.println("Enter Mobile Number: ");
        mobno = Long.parseLong(in.readLine());

        System.out.println("Enter Basic Amount: ");
        amt = Integer.parseInt(in.readLine());

        update(); // Update the total amount based on the coach type
    }

    // Method to update total amount based on coach type
    void update() {
        switch (coach) {
            case "First_AC":
                totalamt = amt + 700;
                break;
            case "Second_AC":
                totalamt = amt + 500;
                break;
            case "Third_AC":
                totalamt = amt + 250;
                break;
            case "Sleeper":
                totalamt = amt;
                break;
            default:
                System.out.println("Invalid coach type! Defaulting to Sleeper.");
                coach = "Sleeper";
                totalamt = amt;
        }
    }

    // Method to display passenger details
    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Coach Type: " + coach);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Total Amount for this Passenger: " + totalamt);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        List<RailwayTicket> passengers = new ArrayList<>();

        System.out.println("Enter the number of passengers: ");
        int numPassengers = Integer.parseInt(in.readLine());

        int grandTotal = 0;  // To store the total amount for all passengers

        // Collecting details for each passenger
        for (int i = 0; i < numPassengers; i++) {
            System.out.println("\nEnter details for Passenger " + (i + 1) + ":");
            RailwayTicket ticket = new RailwayTicket();
            ticket.input(in); // Input passenger details
            passengers.add(ticket); // Add ticket to the list
            grandTotal += ticket.totalamt;  // Accumulate the total amount
        }

        // Displaying details for all passengers
        System.out.println("\nPassenger Details:");
        for (RailwayTicket ticket : passengers) {
            ticket.display();
        }

        // Displaying the grand total amount
        System.out.println("Grand Total Amount for All Passengers: " + grandTotal);
    }
}
