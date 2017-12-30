import java.util.ArrayList;
import java.util.List;

public class Suitcase {
    private List<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    // Adds Thing to things if it does not exceed maxWeight
    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public String toString() {
        if (things.isEmpty()) {
            return String.format("empty (0 kg)");
        } else if (things.size() == 1) {
            return String.format("1 thing (%d kg)", totalWeight());
        } else {
            // Tests fail with string formatter
            //return String.format("%1$s things ($2$d kg)", things.size(), totalWeight());
            return things.size() + " things (" + totalWeight() + " kg)";
        }
    }

    // Print all Things in Suitcase
    public void printThings() {
        for (Thing t : things) {
            System.out.println(t);
        }
    }

    // Returns total weight of all Things in Suitcase
    public int totalWeight() {
        int weight = 0;
        for (Thing t : things) {
            weight += t.getWeight();
        }
        return weight;
    }

    // Returns the heaviest Thing in Suitcase
    public Thing heaviestThing() {
        if (things.size() == 0) {
            return null;
        } else {
            Thing heaviestThing = things.get(0);
            for (int i=1; i<things.size(); i++) {
                if (things.get(i).getWeight() > heaviestThing.getWeight()) {
                    heaviestThing = things.get(i);
                }
            }
            return heaviestThing;
        }
    }
}
