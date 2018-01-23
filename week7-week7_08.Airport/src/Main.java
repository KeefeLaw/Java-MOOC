import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();

        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                // Add airplane
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = reader.nextInt();
                reader.nextLine();  // Consume remaining \n
                airport.addPlane(id, capacity);
            } else if (command.equals("2")) {
                // Add flight
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departureCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String arrivalCode = reader.nextLine();
                airport.addFlight(id, departureCode, arrivalCode);
            }
        }
        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                // Print planes
                airport.printPlanes();
            } else if (command.equals("2")) {
                // Print flights
                airport.printFlights();
            } else if (command.equals("3")) {
                // Print plane info
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                airport.printPlane(id);
            }
        }
    }
}
