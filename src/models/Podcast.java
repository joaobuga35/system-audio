package models;

public class Podcast extends Audio {
    private int duration;

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int getClassification(){
        if(this.getTotalLikes() > 2500){
            return 50;
        } else {
            return 15;
        }
    }
}
