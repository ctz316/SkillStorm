//package DailyProjects.Week_06_RankingAthletes.Attemp2;
//
//import java.util.Comparator;
//
//public class Athletes implements Comparable<Athletes> {
//
//    // Variables
//    private String name;
//    private double careerWins;
//    private double careerLoses;
//    private double winPercent;
//    private double totalGamesPlayed;
//
//    // Constructors
//    public Athletes(String name, double careerWins, double careerLoses) {
//        this.name = name;
//        this.careerWins = careerWins;
//        this.careerLoses = careerLoses;
//    }
//
//    // Overrides
//    @Override
//    public String toString() {
//        return "Athletes{" +
//                "name='" + name + '\'' +
//                ", careerWins=" + careerWins +
//                ", careerLoses=" + careerLoses +
//                ", winPercent=" + winPercent +
//                ", totalGamesPlayed=" + totalGamesPlayed +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Athletes o1) {
//        double thisString = this.winPercent
//        return 0;
//    }
//
//
//    public class BetterPlayer implements Comparator<Athletes> {
//        @Override
//        public double compare(Athletes o1, Athletes o2) {
//            return o1.getWinPercent().compareto(o2.getWinPercent());
//        }
//    }
//
//
//    // Getters and Setters
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public double getCareerWins() {
//        return careerWins;
//    }
//    public void setCareerWins(double careerWins) {
//        this.careerWins = careerWins;
//    }
//    public double getCareerLoses() {
//        return careerLoses;
//    }
//    public void setCareerLoses(double careerLoses) {
//        this.careerLoses = careerLoses;
//    }
//    public double getWinPercent() {
//        return winPercent;
//    }
//    public void setWinPercent(double winPercent) {
//        this.winPercent = winPercent;
//    }
//    public double getTotalGamesPlayed() {
//        return totalGamesPlayed;
//    }
//    public void setTotalGamesPlayed(double totalGamesPlayed) {
//        this.totalGamesPlayed = totalGamesPlayed;
//    }
//}
