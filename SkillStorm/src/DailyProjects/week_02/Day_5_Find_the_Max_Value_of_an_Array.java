package DailyProjects.week_02;

public class Day_5_Find_the_Max_Value_of_an_Array {
    public static void main(String[] args) {

        //////////////////// Class Provided Numbers //////////////////////////////////////////

        int[] numberArray = {72, 34, 53, 23, 43, 23, 45, 69, 71, 95, 52, 12, 34, 33, 73, 40, 50, 20, 99, 71, 24, 53, 24, 53, 29, 40};

        int bigNum = numberArray[0];
        for (int i : numberArray) {
            if (i > bigNum)
                bigNum = i;
        }

        System.out.println("Max number from given list is: " + bigNum);


        //////////////////// Generated Numbers //////////////////////////////////////////

        int[] numberArray2 = {  14, 81, 92, 58, 73, 74, 86, 47, 61, 46, 98, 26, 89,
                44, 24, 83, 23, 72, 69, 82, 68, 20, 37, 12, 01, 06, 96, 10, 72, 48,
                04, 35, 89, 49, 61, 21, 13, 96, 22, 07, 84, 98, 31, 76, 67, 05, 89,
                45, 24, 20, 50, 72, 91, 66, 40, 11, 55, 19, 78, 88, 71, 97, 76, 17,
                77, 77, 39, 06, 98, 44, 32, 81, 24, 24, 32, 33, 33, 04, 21, 67, 45,
                84, 61, 19, 47, 86, 63, 41, 98, 44, 01, 66, 47, 04, 52, 54, 80, 65
        };

        int bigNum2 = numberArray2[0];
        for (int j : numberArray2) {
            if (j > bigNum2)
                bigNum2 = j;
        }

        System.out.println("Max number from number generator is: " + bigNum2);


        //////////////////// Extra Credit ? LOL //////////////////////////////////////////

        int[] numberArray3 = {};

        for (int j : numberArray ) {
            for (int i : numberArray2) {
                if ( j == i) {
                    for (int k : numberArray3 ) {
                        if (j != k) {
                            numberArray3 = new int[]{j};
                            System.out.print(numberArray3[k] + ", ");
                        }
                    }
                }
            }
        }
    }
}
