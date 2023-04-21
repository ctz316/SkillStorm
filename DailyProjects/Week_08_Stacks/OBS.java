package SkillStorm.DailyProjects.Week_08_Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OBS {

public static void main(String[] args) {

//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//    List<Integer> doubledNumbers = numbers.stream().map(n -> n * 2).collect(Collectors.toList());


    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());


}
}
