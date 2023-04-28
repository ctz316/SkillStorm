package SkillStorm.Class_Work.Week_08_StacksFileReading;

import SkillStorm.Class_Work.Week_08_StacksFileReading.AwesomeFile.MyFileReader;

import java.io.IOException;
import java.util.List;

public class Week_08_FileReading {

    public static void main(String[] args) throws IOException {
        MyFileReader reader = new MyFileReader();

//        reader.readFile();
//        System.out.println("**********************************************************************");
//        reader.readFile2();
//        System.out.println("**********************************************************************");
//        reader.readFile3();
//        reader.checkForFile();
//        reader.isFileADirectory();
//        reader.writeFile();
//        reader.readCSV();

//        ********** Need these 2 to work ******************
        List<Person> people = reader.readCSV();
        reader.writeCSV(people);
    }

}
