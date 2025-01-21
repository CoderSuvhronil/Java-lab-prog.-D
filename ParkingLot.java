import java.io.*;

public class ParkingLot {
    int vno;      // Vehicle number
    int hours;    // Number of hours parked
    double bill;  // Parking bill

    // Method to take input
    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Vehicle Number: ");
        vno = Integer.parseInt(br.readLine());
        
        System.out.print("Enter Number of hours parked: ");
        hours = Integer.parseInt(br.readLine());
    }

    // Method to calculate parking bill
    void calculate() {
        bill = 3.0; // Base bill for the first hour
        if (hours > 1) {
            bill += (hours - 1) * 1.50; // Additional charge for extra hours
        }
    }

    // Method to display details
    void display() {
        System.out.println("Vehicle Number: " + vno);
        System.out.println("Number of hours parked: " + hours);
        System.out.println("Total Bill: Rs " + bill);
    }

    // Main method
    public static void main(String args[]) throws IOException {
        ParkingLot lot = new ParkingLot();
        lot.input();      // Take input
        lot.calculate();  // Calculate bill
        lot.display();    // Display details
    }
}
