package g68099.evaluation.controller;

import g68099.evaluation.model.Explorer;
import g68099.evaluation.model.ExplorerTeam;
import g68099.evaluation.model.Gemstone;
import g68099.evaluation.view.View;

public class Controller {

    public static void main(String[] args) {
        // 1. Créer l'équipe
        ExplorerTeam team = new ExplorerTeam("Yellow team");

        // 2. Créer les explorateurs
        Explorer karin = new Explorer("Karin");
        Explorer jenny = new Explorer("Jenny");
        Explorer vicky = new Explorer("Vicky");

        // 3. Donner des pierres précieuses à chaque explorateur
        // (les valeurs dépendent de ce que TU as mis dans Gemstone)
        karin.addGem(Gemstone.DIAMOND);
        karin.addGem(Gemstone.RUBY);

        jenny.addGem(Gemstone.DIAMOND);
        jenny.addGem(Gemstone.EMERALD);
        jenny.addGem(Gemstone.SAPPHIRE);

        vicky.addGem(Gemstone.TOPAZ);

        // 4. Ajouter les explorateurs à l'équipe
        team.add(karin);
        team.add(jenny);
        team.add(vicky);

        // 5. Afficher l'équipe via la View
        View.display(team);
    }
}

