package g68099.evaluation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Explorer {
    private String name;
    private List<Gemstone> gems = new ArrayList<>();

    public Explorer(String name) {
        this.name = name;
    }
        public String getName() {
        return name;
    }

    public List<Gemstone> getGems() {
        return Collections.unmodifiableList(gems);
    }

    public void addGem(Gemstone g) {
        gems.add(g);
    }

    public int getTotalValue() {
        int total = 0;
        for( Gemstone g : gems) {
            total += g.getValue();
        }
        return total;
    }
}
