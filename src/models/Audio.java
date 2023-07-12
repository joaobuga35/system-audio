package models;

public class Audio {
    private String title;
    private int totalListening;
    private int totalLikes;
    private double classification;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getTotalListening() {
        return totalListening;
    }
    public void setTotalListening(int totalListening) {
        this.totalListening = totalListening;
    }
    public int getTotalLikes() {
        return totalLikes;
    }
    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }
    public double getClassification() {
        return classification;
    }
    public void setClassification(double classification) {
        this.classification = classification;
    }
}
