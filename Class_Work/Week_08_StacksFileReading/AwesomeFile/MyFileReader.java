package SkillStorm.Class_Work.Week_08_StacksFileReading.AwesomeFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileReader {

    private final String txtFile = "C:\\Users\\ctz316\\IdeaProjects\\SkillStorm\\SkillStorm\\src\\Class_Work\\Week_08_StacksFileReading\\AwesomeFile\\AwesomeFile.txt";

    public void readFile() throws IOException {
        FileInputStream in = null;

        try {
            in = new FileInputStream(txtFile);
            int inByte;
            System.out.println("My awesome file : ");
            while ((inByte = in.read()) != -1) {
                System.out.print((char)inByte); // Need to convert into letters.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Didn't find file.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Didn't find file.");
            ex.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

}
