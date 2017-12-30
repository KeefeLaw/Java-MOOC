import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeight) {
        this.suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }

    // Adds Suitcase to suitcases if it does not exceed maxWeight
    public void addSuitcase(Suitcase s) {
        if (totalWeight() + s.totalWeight() <= maxWeight) {
            suitcases.add(s);
        }
    }

    public String toString() {
        if (suitcases.isEmpty()) {
            return String.format("empty (%d kg)", totalWeight());
        } else if (suitcases.size() == 1) {
            return String.format("1 suitcase (%d kg)", totalWeight());
        } else {
            // Tests fail with string formatter
            //return String.format("%1$s suitcases ($2$d kg)", suitcases.size(), totalWeight());
            return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }

    // Returns total weight of all Suitcases
    public int totalWeight() {
        int weight = 0;
        for (Suitcase s : suitcases) {
            weight += s.totalWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Suitcase s : suitcases) {
            s.printThings();
        }
    }
}
