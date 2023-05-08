package SkillStorm.DailyProjects.Week_10_.Singleton;

public class DNASequence {

    // variables
    private static DNASequence instance = null;
    private String dNA;

    // constructor
    private DNASequence(String dNA) {
        this.dNA = dNA;
    }

    // 2nd Constructor to connect the private constructor
    public static DNASequence getInstance(String dNA) {
        if (instance == null) {
            instance = new DNASequence(dNA);
        }
        return instance;
    }

    // methods
    public String getDNA() {
        return "Your DNA is made up of: " + Adenine() + Thymine() + Cytosine() + Guanine();
    }
    public String Adenine() {
        return "Adenine";
    }
    public String Thymine() {
        return ", Thymine";
    }
    public String Cytosine() {
        return ", Cytosine";
    }
    public String Guanine() {
        return ", Guanine";
    }

}
