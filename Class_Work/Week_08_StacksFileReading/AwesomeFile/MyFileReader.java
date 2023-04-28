package SkillStorm.Class_Work.Week_08_StacksFileReading.AwesomeFile;

import SkillStorm.Class_Work.Week_08_StacksFileReading.Person;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class MyFileReader {

    private final String txtFile = "Class_Work/Week_08_StacksFileReading/AwesomeFile/AwesomeFile.txt";
    private final String txtFile2 = "Class_Work/Week_08_StacksFileReading/AwesomeFile/AwesomeFile2.txt";
    private final String csvFile = "Class_Work/Week_08_StacksFileReading/AwesomeFile/MyCSV.csv";

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
        } finally {      // *** VERY IMPORTANT *** Need to close file, which is what this last bit of code is doing.
            try {
                in.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
//                       *********************************************************************
//                       **************** Better reader **************************************
//                       *********************************************************************
    public void readFile2() throws IOException {
        FileReader fR = null;
        BufferedReader bR = null;

        try {
            fR = new FileReader(txtFile);
            bR = new BufferedReader(fR);  // bF does the actual reading - returns null when it hits eof.
            String line;

            System.out.println("My awesome file : ");
        while ((line = bR.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                bR.close();
                fR.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

//                       *********************************************************************
//                       **************** Best reader ****************************************
//                       *********************************************************************
    // This will get rid of the open resources automatically. So, no need FINALLY to close.
    public void readFile3() throws IOException {

        try (
                FileReader fR = new FileReader(txtFile);
                BufferedReader bR = new BufferedReader(fR); ){ // bF does the actual reading - returns null when it hits eof.
                String line;

                System.out.println("My awesome file : ");
                while ((line = bR.readLine()) != null) {
                    System.out.println(line);
                }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

//                       *********************************************************************
//                       **************** Check for file *************************************
//                       *********************************************************************

    public void checkForFile() {
        File file = new File(txtFile2);

        //See if exists
        if (file.exists()) {
            System.out.println("The file is real");
        } else {
            System.out.println("No idea what that is.");
        }
    }
//                       *********************************************************************
//                       **************** Is File a directory ********************************
//                       *********************************************************************
    public void isFileADirectory() {
        File file = new File(txtFile2);

        // Check if directory
        if (file.isDirectory()) {
            System.out.println("It's a directory.");
        } else {
            System.out.println("Not a directory.");
        }
    }
//                       *********************************************************************
//                       **************** Writing a file and print ***************************
//                       *********(P.S. writes a file or over writes )************************
    public void writeFile() {
        final String txtFile3 = "Class_Work/Week_08_StacksFileReading/AwesomeFile/AwesomeFile3.txt";

        File file = new File(txtFile3);

        try (BufferedWriter bW = new BufferedWriter(new FileWriter(txtFile3))) {
            bW.write("My New text to a created file.");
            bW.newLine();
            bW.write("Chomp Chomp."); // write and append do the same exact thing. overwrite!
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // read and print the contents of the file
        try (BufferedReader bR = new BufferedReader(new FileReader(txtFile3 ))) {
            String line;
            while ((line = bR.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

//                       *********************************************************************
//                       **************** Reading a CSV file and print ***********************
//                       *********************************************************************

        public List<Person> readCSV(){

            List<Person> people = new LinkedList<>();

            try (BufferedReader bR = new BufferedReader(new FileReader(csvFile))) {
                String line;
                line = bR.readLine(); // This is to read the first line which is the
                // header and not error out. Needs to be placed before the looping reader starts

                while ((line = bR.readLine()) != null) {
                    // CSV is a comma seperated value file
                    String[] vals = line.split(",");

                    Person record = new Person(vals[0].trim(), Integer.parseInt(vals[1].trim()), vals[2].trim());
                    people.add(record);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.out.println(people);
            return people;
        }

//                       *********************************************************************
//                       **************** Writing a CSV file and print ***********************
//                       *********************************************************************

    public void writeCSV(List<Person> people){
        File file = new File("Class_Work/Week_08_StacksFileReading/AwesomeFile/MyCSV_2");

        try (BufferedWriter bW = new BufferedWriter(new FileWriter(file))) {
            for (Person p : people) {
                bW.write(p.getName() + "," + p.getAge() + "," + p.getHairColor());
                bW.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    }