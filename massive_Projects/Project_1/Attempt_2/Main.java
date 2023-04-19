package SkillStorm.massive_Projects.Project_1.Attempt_2;

import SkillStorm.massive_Projects.Project_1.Attempt_2.Events.*;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Open scanner to pass around
        Scanner in = new Scanner(System.in);

        // Starting game
        OpeningStatements oS = new OpeningStatements();
        Characters user = oS.openingGreeting(in);

        DrunkInAz wC = new DrunkInAz();
        wC.welfareCheck(in, user);

        DomesticDisturbance dD = new DomesticDisturbance();
        dD.domesticDisturbance(in, user);

        Speeder sS = new Speeder();
        sS.speed(in, user);

        RidingHorseDrunk rH = new RidingHorseDrunk();
        rH.horse(in, user);

        EmotionalDisturbedPerson eDP = new EmotionalDisturbedPerson();
        eDP.aggravatedPerson(in, user);

        user.gameOver(user);
    }
}