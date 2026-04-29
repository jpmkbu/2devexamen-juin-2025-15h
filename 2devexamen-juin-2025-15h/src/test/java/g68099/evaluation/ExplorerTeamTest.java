package g68099.evaluation;

import org.junit.jupiter.api.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExplorerTeamTest {
    @Test
    void add_one_explorerTeam() {
        ExplorerTeam team = new ExplorerTeam("Blue");
        Explorer e = new Explorer("Alice");

        team.add(e);

        List<Explorer> test = List.of(e);

        assertEquals(test, team.getExplorers());


    }
}