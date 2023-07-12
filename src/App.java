import models.Music;
import models.Podcast;

public class App {
    public static void main(String[] args) throws Exception {

        Music myMusic = new Music();
        myMusic.setTitle("Hero");
        myMusic.setSinger("Skillet");
        myMusic.setGenre("Rock");

        
        for (int i = 0; i < 1000; i++) {
            myMusic.likes();
        }
        
        for (int i = 0; i < 1000; i++) {
            myMusic.likes();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("NerdTech");
        myPodcast.setDuration(40);

        for (int i = 0; i < 1000; i++) {
            myPodcast.likes();
        }
        
        for (int i = 0; i < 1000; i++) {
            myPodcast.likes();
        }

        System.out.println(myPodcast.getTitle() + " a classificação deste podcast é: " + myPodcast.getClassification());
        System.out.println(myMusic.getTitle() + " a classificação desta musíca é: " + myMusic.getClassification());
    }
}
