import java.util.Scanner;

public class Reader {
    private Scanner scanner;

    public Reader() {
        this.scanner = new Scanner(System.in);
    }

    // Scan next line as string
    public String readString() {
        return scanner.nextLine();
    }

    // Scan next line as int
    public int readInteger() {
        return Integer.parseInt(scanner.nextLine());
    }
}
