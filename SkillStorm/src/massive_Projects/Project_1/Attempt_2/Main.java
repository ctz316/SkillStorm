package massive_Projects.Project_1.Attempt_2;

import java.util.Scanner;

;
import static massive_Projects.Project_1.Attempt_2.Events.DomesticDisturbance.domesticDisturbance;
import static massive_Projects.Project_1.Attempt_2.Events.DrunkInAz.welfareCheck;
import static massive_Projects.Project_1.Attempt_2.Events.EmotionalDisturbedPerson.aggravatedPerson;
import static massive_Projects.Project_1.Attempt_2.Events.OpeningStatements.openingGreeting;
import static massive_Projects.Project_1.Attempt_2.Events.RidingHorseDrunk.horse;
import static massive_Projects.Project_1.Attempt_2.Events.Speeder.speed;

public class Main {

    public static void main(String[] args) {

        // Open scanner to pass around
        Scanner in = new Scanner(System.in);

        // Starting game
        Characters user = openingGreeting(in);
        welfareCheck(in, user);
        aggravatedPerson(in, user);
        speed(in, user);
        horse(in, user);
        domesticDisturbance(in, user);
        user.gameOver(user);
    }
}