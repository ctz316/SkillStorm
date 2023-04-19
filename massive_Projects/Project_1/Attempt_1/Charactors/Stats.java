package SkillStorm.massive_Projects.Project_1.Attempt_1.Charactors;

public abstract class Stats {

    // Items variables
        private Boolean pepper;
        private Boolean paperclip;
        private Boolean screwdriver;
        private Boolean salt;
        private Boolean book;
        private Boolean napkin;
        private Boolean sugar;
        private Boolean toiletPaper;
        private Boolean stripOfCloth;
        private Boolean smallRock;
        private Boolean smokes;
        private String bag = "empty";

    // Constructors
    public Stats(boolean pepper, Boolean paperclip, Boolean screwdriver,
                 Boolean salt, Boolean book, Boolean napkin, Boolean sugar, Boolean toiletPaper, Boolean stripOfCloth,
                 Boolean smallRock, Boolean smokes, String bag) {
    }

    // Setters and getters
        public Boolean getPepper() {
            return pepper;
        }
        public void setPepper(Boolean pepper) {
            this.pepper = pepper;
        }
        public Boolean getPaperclip() {
            return paperclip;
        }
        public void setPaperclip(Boolean paperclip) {
            this.paperclip = paperclip;
        }
        public Boolean getScrewdriver() {
            return screwdriver;
        }
        public void setScrewdriver(Boolean screwdriver) {
            this.screwdriver = screwdriver;
        }
        public Boolean getSalt() {
            return salt;
        }
        public void setSalt(Boolean salt) {
            this.salt = salt;
        }
        public Boolean getBook() {
            return book;
        }
        public void setBook(Boolean book) {
            this.book = book;
        }
        public Boolean getNapkin() {
            return napkin;
        }
        public void setNapkin(Boolean napkin) {
            this.napkin = napkin;
        }
        public Boolean getSugar() {
            return sugar;
        }
        public void setSugar(Boolean sugar) {
            this.sugar = sugar;
        }
        public Boolean getToiletPaper() {
            return toiletPaper;
        }
        public void setToiletPaper(Boolean toiletPaper) {
            this.toiletPaper = toiletPaper;
        }
        public Boolean getStripOfCloth() {
            return stripOfCloth;
        }
        public void setStripOfCloth(Boolean stripOfCloth) {
            this.stripOfCloth = stripOfCloth;
        }
        public Boolean getSmallRock() {
            return smallRock;
        }
        public void setSmallRock(Boolean smallRock) {
            this.smallRock = smallRock;
        }
        public Boolean getSmokes() {
            return smokes;
        }
        public void setSmokes(Boolean smokes) {
            this.smokes = smokes;
        }
        public String getBag() {
            return bag;
        }
        public void setBag(String bag) {
            this.bag = bag;
        }
}
