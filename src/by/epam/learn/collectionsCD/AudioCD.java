package by.epam.learn.collectionsCD;

import java.util.ArrayList;
import java.util.Comparator;

class AudioCD extends AudioTrack {
    float totalTimeDuration = 0;
    public AudioCD() {
        ArrayList<AudioTrack> trackList = new ArrayList<>();
        trackList.add(new AudioTrack("·Morcheeba - Otherwise", "Electronic", (float) 3.42));
        trackList.add(new AudioTrack("·Jimmy Somerville - To Love Somebody", "Reggae", (float) 4.17));
        trackList.add(new AudioTrack("·AHA - Lifelines", "Rock", (float) 4.17));
        trackList.add(new AudioTrack("·Perry Como - Magic Moments", "Swing", (float) 2.42));
        trackList.add(new AudioTrack("·Mr. Big - To Be With You", "Rock", (float) 3.27));

        System.out.println("Track List: ");
        System.out.println(trackList + "\n");

        trackList.sort(Comparator.comparing(AudioTrack::getTrackGenre));
        trackList.indexOf(trackList);
        System.out.println("Sorted Track List by Genre: ");
        System.out.println(trackList +"\n");

        for (AudioTrack tracks : trackList) {
            totalTimeDuration = totalTimeDuration + tracks.getDuration();
        }
        System.out.println("TimeDuration of CD: ");
        System.out.println(totalTimeDuration + " minutes"+"\n");

        System.out.println("The tracks' duration in the range of 2.0 ÷ 3.0 minutes are: ");
        for (AudioTrack tracks : trackList) {
            if (tracks.getDuration() > 3.0 && tracks.getDuration() < 4.0) {
                System.out.println(tracks.toString());
            }
        }
    }
}