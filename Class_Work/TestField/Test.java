package SkillStorm.Class_Work.TestField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Test {

    static String name = "";
    static String email = "";
    static String workExperience = "";
    static String education = "";
    static String phoneNumber = "";

    public static void main(String[] args) throws IOException {

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        inputName(scanner);
        inputEmail(scanner);
        inputPhoneNumber(scanner);
        inputWorkExperience(scanner);
        inputEducation(scanner);
        outputResume();
    }

    public static void inputName(BufferedReader scanner) throws IOException {
        String confirmation;
        do {
            System.out.print("Enter your name: ");
            name = scanner.readLine();
            System.out.print("Is your name correct?" + name + "(y/n): ");
            confirmation = scanner.readLine();
        } while (!confirmation.equalsIgnoreCase("y"));
    }

    public static void inputEmail(BufferedReader scanner) throws IOException {
        String confirmation = "";
        String email;
        Pattern emailRegex = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        do {
            System.out.print("Enter your email address: ");
            email = scanner.readLine();
            if (!emailRegex.matcher(email).matches()) {
                System.out.println("Invalid email address format. Please enter a valid email address.");
                continue;
            }
            System.out.println("Your email is: " + email);
            System.out.print("Is this the correct email address? (y/n): ");
            confirmation = scanner.readLine();
        } while (!confirmation.equalsIgnoreCase("y"));
    }


    public static void inputPhoneNumber(BufferedReader scanner) throws IOException {
        String confirmation = "";
        String phonePattern = "^\\d{3}-\\d{3}-\\d{4}$";
        do {
            System.out.print("Enter your phone number (XXX-XXX-XXXX format): ");
            phoneNumber = scanner.readLine();
            if (!phoneNumber.matches(phonePattern)) {
                System.out.println("Invalid phone number format. Please enter in XXX-XXX-XXXX format.");
                continue;
            }
            System.out.print("Is this the correct phone number? " + phoneNumber + " (y/n): ");
            confirmation = scanner.readLine();
        } while (!confirmation.equalsIgnoreCase("y"));
    }


    public static void inputWorkExperience(BufferedReader scanner) throws IOException {
        StringBuilder allWorkExperience = new StringBuilder();
        String confirmation;
        do {
            System.out.print("Enter a work experience or type 'done' to finish: ");
            confirmation = scanner.readLine();
            if (!confirmation.equalsIgnoreCase("done")) {
                allWorkExperience.append(confirmation).append("\n");
            }
        } while (!confirmation.equalsIgnoreCase("done"));

        workExperience = allWorkExperience.toString().trim();

        System.out.print("Is your work experience correct?" + workExperience + "(y/n): ");
        confirmation = scanner.readLine();
        if (!confirmation.equalsIgnoreCase("y")) {
            System.out.println("Please enter your work experience again:");
            inputWorkExperience(scanner);
        }
    }

    public static void inputEducation(BufferedReader scanner) throws IOException {
        StringBuilder allEducation = new StringBuilder();
        String confirmation;
        boolean isConfirmed = false;
        do {
            System.out.println("Enter your education (press enter after each degree, type 'done' to finish):");
            allEducation.setLength(0); // clear the StringBuilder
            do {
                confirmation = scanner.readLine();
                if (!confirmation.equalsIgnoreCase("done")) {
                    allEducation.append("- ").append(confirmation).append("\n");
                }
            } while (!confirmation.equalsIgnoreCase("done"));

            education = allEducation.toString().trim();
            System.out.print("Is your education correct?" + education + "(y/n): ");
            confirmation = scanner.readLine();
            if (confirmation.equalsIgnoreCase("y")) {
                isConfirmed = true; // information is confirmed
            } else {
                System.out.println("Please enter your education again:");
            }
        } while (!isConfirmed);
    }

    public static void outputResume() throws IOException {
        System.out.println();
        System.out.println("Your resume information:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Work Experience: " + workExperience);
        System.out.println("Education: " + education);

    }
}