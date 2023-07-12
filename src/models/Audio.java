package models;

public class Audio {
    private String title;
    private int totalListening;
    private int totalLikes;
    private int classification;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void listening(){
        this.totalListening++;
    }
    public void likes(){
        this.totalLikes++;
    }
    public int getTotalListening() {
        return totalListening;
    }
    public int getTotalLikes() {
        return totalLikes;
    }
    public int getClassification() {
        return classification;
    }
    public void setClassification(int classification) {
        this.classification = classification;
    }
}
