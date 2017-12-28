
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        //printWithSmileys("Method");
        //printWithSmileys("Beerbottle");
        //printWithSmileys("Interface");
    }

    // Print string surrounded by ':)' smileys
    private static void printWithSmileys(String characterString) {
        boolean odd = characterString.length() % 2 == 1;
        int stringLength;
        if (odd) {
            stringLength = characterString.length() + 1;    // round up
        } else {
            stringLength = characterString.length();
        }
        int numTopAndBottomSmileys = (stringLength / 2) + 3;    // divide string by smiley length (2)
        // and include first, last, and buffer smileys
        printSmileys(numTopAndBottomSmileys);
        if (odd) {
            System.out.println(":) " + characterString + "  :)");   // buffer right side with 1 extra space
        } else {
            System.out.println(":) " + characterString + " :)");
        }
        printSmileys(numTopAndBottomSmileys);
    }

    // Print number of smileys on a single line with a line break at end
    private static void printSmileys(int numberOfSmileys) {
        for (int i=0; i<numberOfSmileys; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

}
