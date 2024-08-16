import java.io.*;

class RailwayTicket {
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

    public static void main(String[] args) throws IOException {
        RailwayTicket ticket = new RailwayTicket();
        DataInputStream in = new DataInputStream(System.in);

        System.out.println("Enter Passenger name: ");
        ticket.name = in.readLine();

        System.out.println("Enter Coach (First_AC, Second_AC, Third_AC, Sleeper):");
        ticket.coach = in.readLine();

        System.out.println("Enter Mobile Number: ");
        ticket.mobno = Long.parseLong(in.readLine());

        System.out.println("Enter Basic Amount: ");
        ticket.amt = Integer.parseInt(in.readLine());

        ticket.update();
        ticket.display();
    }

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
                System.out.println("Invalid coach type!");
        }
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Coach Type: " + coach);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Total Amount: " + totalamt);
    }
}