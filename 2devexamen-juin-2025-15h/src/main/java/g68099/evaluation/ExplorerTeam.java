package g68099.evaluation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExplorerTeam {
    public static final int MAX_EXPLORERS = 5;

    private String name;
    private List<Explorer> explorers = new ArrayList<>();

    public List<Explorer> getExplorers() {
        return Collections.unmodifiableList(explorers);
    }

    public ExplorerTeam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Explorer e) {
        if(explorers.size() >= MAX_EXPLORERS) {
            throw new RuntimeException(" le nombre MAXIMUM d'explorers est atteint");
        }
        explorers.add(e);

    }

    public int getTotalValue() {
        int total = 0;
        for (Explorer e: explorers) {
            total += e.getTotalValue();
        }
        return total;
    }

}
