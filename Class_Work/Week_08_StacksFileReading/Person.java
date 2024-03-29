package SkillStorm.Class_Work.Week_08_StacksFileReading;

public class Person {

//                       *********************************************************************
//                       **************** Writing a excel ************************************
//                       *********(P.S. writes a file or over writes )************************
    // Variables
    private String name;
    private int age;
    private String hairColor;

    // Constructor
    public Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    // Override
    public String toString() {
        return "[ Name = " + name + ", Age = " + age + ", Hair Color = " + hairColor + " ]";
    }
}
