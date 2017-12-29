import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes;

    public Changer() {
        this.changes = new ArrayList<Change>();
    }

    public void addChange(Change c) {
        changes.add(c);
    }

    public String change(String s) {
        String changedString = s;
        for (Change c : changes) {
            changedString = c.change(changedString);
        }
        return changedString;
    }
}
