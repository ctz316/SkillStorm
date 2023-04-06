//package DailyProjects.Week_06_RankingAthletes.Attemp1;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class RunHere implements Comparable, AthletesMaybe {
//
//    // Setting variables
//    private String name;
//    private double careerWins;
//    private double careerLoses;
//    private double winPercent;
//    private double totalGamesPlayed;
//    private double totalForBoth;
//    private int x = 1;
//    private String comp1;
//    private String comp2;
//
//    // Scanner
//    static Scanner in = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        ArrayList<RunHere> RunHere = new ArrayList<RunHere>();
//
//        RunHere.add(new RunHere("John", 9, 9));
//        RunHere.add(new RunHere("Joe", 5, 10));
//        RunHere.add(new RunHere("Mike", 9, 4));
//        RunHere.add(new RunHere("Jason", 8, 12));
//        RunHere.add(new RunHere("Kevin", 11, 14));
//
//        int temp;
//        do {
//            System.out.println("Please select the first player from the list you would like to compare: ");
//            System.out.println("Press '1' for " + RunHere.get(0));
//            System.out.println("Press '2' for " + RunHere.get(1));
//            System.out.println("Press '3' for " + RunHere.get(2));
//            System.out.println("Press '4' for " + RunHere.get(3));
//            System.out.println("Press '5' for " + RunHere.get(4));
//
//            temp = in.nextInt();
//        } while ((temp != 1) && (temp != 2) && (temp != 3)&& (temp != 4)&& (temp != 5));
//
//        if (temp == 1) {
//            Object comp1 = RunHere.get(0);
//        } else if (temp == 2) {
//            Object comp1 = RunHere.get(1);
//        } else if (temp == 3) {
//            Object comp1 = RunHere.get(2);
//        } else if (temp == 4) {
//            Object comp1 = RunHere.get(3);
//        } else { Object comp1 = RunHere.get(4);
//        }
//
//        do {
//            System.out.println("Please select the second player from the list you would like to compare: ");
//            System.out.println("Press '1' for " + RunHere.get(0));
//            System.out.println("Press '2' for " + RunHere.get(1));
//            System.out.println("Press '3' for " + RunHere.get(2));
//            System.out.println("Press '4' for " + RunHere.get(3));
//            System.out.println("Press '5' for " + RunHere.get(4));
//
//            temp = in.nextInt();
//        } while ((temp != 1) && (temp != 2) && (temp != 3)&& (temp != 4)&& (temp != 5));
//
//        if (temp == 1) {
//            Object comp2 = RunHere.get(0);
//        } else if (temp == 2) {
//            Object comp2 = RunHere.get(1);
//        } else if (temp == 3) {
//            Object comp2 = RunHere.get(2);
//        } else if (temp == 4) {
//            Object comp2 = RunHere.get(3);
//        } else { Object comp2 = RunHere.get(4);
//        }
//
//        System.out.println("The better player is: " + betterPlayer());
//
//    }
//
//
//        // Constructors
//        public RunHere(String name, double careerWins, double careerLoses) {
//            this.name = name;
//            this.careerWins = careerWins;
//            this.careerLoses = careerLoses;
//            winPercent = winPercent(careerWins, careerLoses);
//            totalGamesPlayed = totalGames(careerWins, careerLoses);
////            totalForBoth = totalForBoth();
//        }
//
//        // Methods
//        private double winPercent(double careerWins, double careerLoses) {
//             return winPercent = careerWins / careerLoses;
//        }
//        private double totalGames(double careerWins, double careerLoses) {
//            return totalGamesPlayed = careerWins + careerLoses;
//        }
////        private double totalForBoth(Object comp1, Object comp2) {
////            if (totalGamesPlayed >= 15) {
////            return totalForBoth =  totalGamesPlayed + totalGamesPlayed;
////        }}
//
//
//        //Overrides
//
//    @Override
//    public String toString() {
//        return "RunHere{" +
//                "name='" + name + '\'' +
//                ", careerWins=" + careerWins +
//                ", careerLoses=" + careerLoses +
//                ", winPercent=" + winPercent +
//                ", totalGamesPlayed=" + totalGamesPlayed +
//                ", totalForBoth=" + totalForBoth +
//                ", x=" + x +
//                ", comp1='" + comp1 + '\'' +
//                ", comp2='" + comp2 + '\'' +
//                '}';
//    }
//
////        @Override
////            public int compareTo(Object p1) {
////                this.winPercent(careerWins, careerLoses) - (RunHere) p1;
////                return 0;
////            }
////        @Override
////        public double compare(RunHere x, RunHere y) {
////            if ((totalGamesPlayed) >= 30) {
////
////            }
////        }
////        @Override
////        public String toString() {
////            return this.name = name;
////        }
//
//
//
//    // Getters and Setters
//        @Override
//        public String getName() {
//            return name;
//        }
//        @Override
//        public void setName(String name) {
//            this.name = name;
//        }
//        @Override
//        public double getCareerWins() {
//            return careerWins;
//        }
//        @Override
//        public void setCareerWins(double careerWins) {
//            this.careerWins = careerWins;
//        }
//        @Override
//        public double getCareerLoses() {
//            return careerLoses;
//        }
//        @Override
//        public void setCareerLoses(double careerLoses) {
//            this.careerLoses = careerLoses;
//        }
//        @Override
//        public double getTotalGames() {
//            return totalGamesPlayed;
//        }
//        @Override
//        public void setTotalGames(int totalGames) {
//            totalGamesPlayed = totalGames;
//        }
//
//    @Override
//    public int compareTo(Object comp1, Object comp2) {
//        return 0;
//    }
//
//
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
//}
//
