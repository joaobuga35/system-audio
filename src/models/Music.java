package models;

public class Music extends Audio {
    private String singer;
    private String genre;

    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getClassification(){
        if(this.getTotalLikes() > 500){
            return 10;
        } else {
            return 5;
        }
    }
}
