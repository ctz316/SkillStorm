//package SkillStorm.Class_Work.TestField;
//
//import java.util.Scanner;
//import java.io.*;
//
//
//    public class Resumeinput2change1 {
//        public static void main(String[] args) throws IOException {
//            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
//
//            String name = "";
//            String confirmation;
//            do  {
//                System.out.print("Enter your name: ");
//                name = scanner.readLine();
//                // Prompt the user to confirm their input
//                //			System.out.println("You entered: " + name);
//                System.out.print("Is your name correct?" + name + "(y/n): ");
//                confirmation = scanner.readLine();
//
//            } while (!confirmation.equalsIgnoreCase("y"));
//
//
//            String email = "";
//            do {
//                System.out.print("Enter your email address: ");
//                email = scanner.readLine();
//                System.out.println("Your email is: " + email);
//                System.out.print("Is this the correct email address? (y/n): ");
//                confirmation = scanner.readLine();
//
//            } while (!confirmation.equalsIgnoreCase("y"));
//
//
//            String phoneNumber = "";
//            do {
//
//                System.out.print("Enter your phone number (XXX-XXX-XXXX format): ");
//                phoneNumber = scanner.readLine();
//                //			System.out.println("You entered: " + phoneNumber);
//                System.out.print("Is this the correct phone number?" + phoneNumber + "(y/n): ");
//                confirmation = scanner.readLine();
//
//            } while (!confirmation.equalsIgnoreCase("y"));
//
//
//
//            String workExperience = "";
//            StringBuilder allWorkExperience = new StringBuilder();
//            boolean isConfirmed = false;
//            boolean
//
//            while (isConfirmed) {
//                System.out.print("Enter a work experience or type 'done' to finish: ");
//                allWorkExperience.setLength(0); // clear the StringBuilder
//                do {
//                    confirmation = scanner.readLine();
//                    if (!confirmation.equalsIgnoreCase("done")) {
//                        allWorkExperience.append("").append(confirmation).append("\n");
//                    }
//                } while (!confirmation.equalsIgnoreCase("done"));
//
//                workExperience = allWorkExperience.toString().trim();
//                //			System.out.println("You entered: " + workExperience);
//                System.out.print("Is your work experience correct?" + workExperience + "(y/n): ");
//                confirmation = scanner.readLine();
//                if (confirmation.equalsIgnoreCase("y")) {
//                    isConfirmed = true; // information is confirmed
//                } else {
//                    // prompt user to enter work experience again
//                    System.out.println("Please enter your work experience again:");
//                }
//            }
//
//
//            String education = "";
//            StringBuilder allEducation = new StringBuilder();
//
//            boolean isConfirm = false;
//
//            while (!isConfirm) {
//                System.out.println("Enter your education (press enter after each degree, type 'done' to finish):");
//                allEducation.setLength(0); // clear the StringBuilder
//                do {
//                    confirmation = scanner.readLine();
//                    if (!confirmation.equalsIgnoreCase("done")) {
//                        allEducation.append("- ").append(confirmation).append("\n");
//                    }
//                } while (!confirmation.equalsIgnoreCase("done"));
//
//                education = allEducation.toString().trim();
//                //			System.out.println("You entered: " + education);
//                System.out.print("Is your education correct?" + education + "(y/n): ");
//                confirmation = scanner.readLine();
//                if (confirmation.equalsIgnoreCase("y")) {
//                    isConfirmed = true; // information is confirmed
//
//
//
//
//
//
//                }
//                System.out.println();
//                System.out.println("Your resume information:");
//                System.out.println("Name: " + name);
//                System.out.println("Email: " + email);
//                System.out.println("Phone number: " + phoneNumber);
//                System.out.println("Work experience: " + workExperience);
//                System.out.println("Education: " + education);
//
//                // Write the data to a CSV file
//                FileWriter writer = new FileWriter("resume.csv");
//                writer.write("Name,Email,Phone Number,Work Experience,Education\n");
//                writer.write(name + "," + email + "," + phoneNumber + "," + workExperience + "," + education + "\n");
//                writer.close();
//            }
//        }
//
//    }
