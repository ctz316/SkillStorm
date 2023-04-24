package SkillStorm.DailyProjects.Week_08_Stacks;

public class TestGround {

        public static boolean checkForFactor(int base, int factor) {
            int temp;
            boolean checkForFactor = false;
            temp = ((base / factor) % 2);
            if (temp == 0) {
                checkForFactor = true;
            } else {
                checkForFactor = false;
            }
            return System.out.println(checkForFactor);
        }
    }

