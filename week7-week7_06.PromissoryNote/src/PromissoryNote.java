import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {
    private Map<String, Double> promissory;

    public PromissoryNote() {
        this.promissory = new HashMap<String, Double>();
    }

    // stores the information about loans to specific people
    public void setLoan(String toWhom, double value) {
        promissory.put(toWhom, value);
    }

    // returns the entity of the debt held by the parameter person
    public double howMuchIsTheDebt(String person) {
        if (promissory.containsKey(person)) {
            return promissory.get(person);
        } else {
            return 0;
        }
    }
}
