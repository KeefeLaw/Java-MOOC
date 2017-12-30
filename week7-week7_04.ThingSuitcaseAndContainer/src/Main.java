
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    /*
    adds 100 suitcases into the container it receives as parameter;
    there is one brick in each suitcase.
    The bricks weight will then increase by one each time until the weight becomes 100 kg.

    I assume this description means: Add 100 suitcases, each with a single brick, where
    each brick is incrementally heavier than the last.
     */
    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i=1; i<=100; i++) {
            Thing t = new Thing("Brick", i);
            Suitcase s = new Suitcase(100);
            s.addThing(t);
            container.addSuitcase(s);
        }
    }
}
