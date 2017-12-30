import java.util.List;
import java.util.ArrayList;

public class Calculator {
    private Reader reader;
    private int numOfOperations;

    public Calculator() {
        this.reader = new Reader();
        this.numOfOperations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        List<Integer> values = askValues();
        System.out.println("sum of the values: " + (values.get(0) + values.get(1)));
        numOfOperations++;
    }

    private void difference() {
        List<Integer> values = askValues();
        System.out.println("difference of the values: " + (values.get(0) - values.get(1)));
        numOfOperations++;
    }

    private void product() {
        List<Integer> values = askValues();
        System.out.println("product of the values: " + (values.get(0) * values.get(1)));
        numOfOperations++;
    }

    private void statistics() {
        System.out.println("Calculations done: " + numOfOperations);
    }

    // Ask user for 2 values required for operation
    private List<Integer> askValues() {
        List<Integer> values = new ArrayList<Integer>();

        System.out.print("value1: ");
        values.add(reader.readInteger());   // read the value using the Reader-object
        System.out.print("value2: ");
        values.add(reader.readInteger());   // read the value using the Reader-object

        return values;
    }
}
