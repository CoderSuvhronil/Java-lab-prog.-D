import java.io.DataInputStream;
import java.io.IOException;

class ParkingLot {
    int vno;
    int hours;
    double bill;

    void input() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Vehicle Number: ");
        vno = Integer.parseInt(dis.readLine());
        System.out.print("Enter Number of Hours Parked: ");
        hours = Integer.parseInt(dis.readLine());
    }

    void calculate() {
        bill = 3.0; // For the first hour
        if (hours > 1) {
            bill += (hours - 1) * 1.50; // For each additional hour or part thereof
        }
    }

    void display() {
        System.out.println("Vehicle Number: " + vno);
        System.out.println("Number of Hours: " + hours);
        System.out.println("Total Bill: Rs." + bill);
    }

    public static void main(String[] args) throws IOException {
        ParkingLot lot = new ParkingLot();
        lot.input();
        lot.calculate();
        lot.display();
    }
}
