package DailyProjects.Week_06_RankingAthletes.Attemp1;

public interface AthletesMaybe {
    // Getters and Setters
    String getName();

    void setName(String name);

    double getCareerWins();

    void setCareerWins(double careerWins);

    double getCareerLoses();

    void setCareerLoses(double careerLoses);

    double getTotalGames();

    void setTotalGames(int totalGames);

    int compareTo(Object comp1, Object comp2);
}
