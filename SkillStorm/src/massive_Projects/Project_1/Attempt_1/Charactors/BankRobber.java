package massive_Projects.Project_1.Attempt_1.Charactors;

public class BankRobber extends Stats{

    // Variables
    private Double aggression = 50.0;
    private Double savvy = 10.0;
    private Double stealth = 25.0;

    // Constructor
    public BankRobber(String gameName, double aggression, double savvy, double stealth, boolean pepper, Boolean paperclip, Boolean screwdriver,
                      Boolean salt, Boolean book, Boolean napkin, Boolean sugar, Boolean toiletPaper,
                      Boolean stripOfCloth, Boolean smallRock, Boolean smokes, String bag) {
        super(pepper, paperclip, screwdriver, salt, book, napkin, sugar, toiletPaper, stripOfCloth, smallRock, smokes, bag);
    }


    // Overrides
    @Override
    public String toString() {
        return String.format("%s %s %s",getAggression(), getStealth(), getPaperclip());
    }

    // Getters and setters
    public Double getAggression() {
        return aggression;
    }

    public void setAggression(Double aggression) {
        this.aggression = aggression;
    }

    public Double getSavvy() {
        return savvy;
    }

    public void setSavvy(Double savvy) {
        this.savvy = savvy;
    }

    public Double getStealth() {
        return stealth;
    }

    public void setStealth(Double stealth) {
        this.stealth = stealth;
    }
}