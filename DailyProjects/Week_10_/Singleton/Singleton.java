package SkillStorm.DailyProjects.Week_10_.Singleton;

public class Singleton {

    public static void main(String[] args) {
        singleton();
    }

    public static void singleton() {
        DNASequence thisIsMe = DNASequence.getInstance("ATCG");
        System.out.println(thisIsMe.getDNA());

        DNASequence thisIsMe2 = DNASequence.getInstance("FBI");
        System.out.println(thisIsMe.getDNA());

        DNASequence thisIsMe3 = DNASequence.getInstance("CIA");
        System.out.println(thisIsMe.getDNA());
    }


}
