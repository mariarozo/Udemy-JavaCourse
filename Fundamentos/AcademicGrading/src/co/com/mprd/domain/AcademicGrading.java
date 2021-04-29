package co.com.mprd.domain;

public class AcademicGrading {
    /*
    Problem statement: Calculate and print the final score of a student in the
    Systems Design course of the software engineering program. There are two
    partial scores and an exam, the partial scores have 35% and the exam 30%.
    It is approved with a final score >=3.
    */
    
    // Best practices
    // 1. encapsulation - declaring private and static attributes
    private int idScore;
    private double firstScore, secondScore, examScore, finalScore;
    private boolean veredict;
    private static int scoresCounter;
    
    // 1.1. creating default constructor
    public AcademicGrading() {
        this.idScore = ++AcademicGrading.scoresCounter;
    }
    
    // 1.2. creating overloaded constructor
    public AcademicGrading(double firstScore, double secondScore, double examScore) {
        super(); // not necesary but important to remember
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.examScore = examScore;
        this.finalScore = setFinalScore();
        this.veredict = setVeredict();
        this.idScore = ++AcademicGrading.scoresCounter;
    }
    
    // 2. creating getters and setters
    // 2.1. idScore
    public int getIdScore() {
        return this.idScore;
    }
    
    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }
    
    // 2.2. firstScore
    public double getFirstScore() {
        return this.firstScore;
    }
    
    public void setFirstScore(double firstScore) {
        this.firstScore = firstScore;
    }
    
    // 2.3. secondScore
    public double getSecondScore() {
        return this.secondScore;
    }
    
    public void setSecondScore(double secondScore) {
        this.secondScore = secondScore;
    }
    
    // 2.4. examScore
    public double getExamScore() {
        return this.examScore;
    }
    
    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }
    
    // 2.5. finalScore
    public double getFinalScore() {
        return this.finalScore;
    }
    
    //public void setFinalScore(double firstScore, double secondScore, double examScore) {
    public double setFinalScore() {
        // in order to set automatically the final score instead of changing it
        return this.finalScore = (this.firstScore*0.35)+(this.secondScore*0.35)+(this.examScore*0.30);
    }
    
    // 2.6. creating another method
    // this is to state if the student passed or failed
    public boolean isVeredict() {
        return this.veredict;
    }
    
    public boolean setVeredict() {
        return this.veredict = this.finalScore >= 3.0;
    }
    
    // 2.7. scoresCounter
    public int getScoresCounter() {
        return AcademicGrading.scoresCounter;
    }
    
    public void setScoresCounter(int scoresCounter){
        AcademicGrading.scoresCounter = scoresCounter;
    }
    
    // 2.8 toString
    // TESTING: CHANGING BRANCH
    @Override
    public String toString() {
        return "AcademicGrading: {idScore:" + this.idScore + ", firstScore:" + this.firstScore
                + ", secondScore:" + this.secondScore + ", examScore:" + this.examScore
                + ", finalScore:" + this.finalScore + ", veredict:" + this.veredict
                + ", scoresCounter:" + AcademicGrading.scoresCounter + "}";
    }
}