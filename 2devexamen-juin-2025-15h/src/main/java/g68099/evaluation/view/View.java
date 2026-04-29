package g68099.evaluation.view;

import g68099.evaluation.model.Explorer;
import g68099.evaluation.model.ExplorerTeam;

import java.util.List;

public class View {
    public static void display(ExplorerTeam team) {
        System.out.println(team.getName());

        List<Explorer> explorers = team.getExplorers();
        for (int i = 0; i < explorers.size(); i++) {
            Explorer e = explorers.get(i);
            System.out.print(e.getName() + " (" + e.getTotalValue() + ")");
            if (i < explorers.size() - 1) {
                System.out.print(" - ");

            }

        }
        System.out.println(); // pour passer à la ligne suivante

        //  la valeur totale
        System.out.println("€ " + team.getTotalValue());

    }
    }
