package g68099.evaluation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExplorerTest {
    @Test
    void addGem_add_one_gem() {
        Explorer e = new Explorer("Alice");

        e.addGem(Gemstone.RUBY);
        e.addGem(Gemstone.TOPAZ);

        //vérifie que les 2 pierres sont présentes
        assertEquals(2, e.getGems().size());
    }

    @Test
    void indexGem() {
        Explorer e = new Explorer("Alice");

        e.addGem(Gemstone.RUBY);
        e.addGem(Gemstone.TOPAZ);
        assertEquals(Gemstone.RUBY, e.getGems().get(0));

    }
}