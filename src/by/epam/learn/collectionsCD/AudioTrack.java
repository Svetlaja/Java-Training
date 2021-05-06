package by.epam.learn.collectionsCD;

public class AudioTrack {
    float duration;
    String trackAuthorAndTitle =" ";
    String trackGenre =" ";

    public AudioTrack() {}
    public AudioTrack(float duration) {
        super();
        this.duration=duration;
    }

    public AudioTrack(String trackAuthorAndTitle,String trackGenre,float duration) {
        this.trackAuthorAndTitle= trackAuthorAndTitle;
        this.trackGenre=trackGenre;
        this.duration=duration;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }
    public String getTrackAuthorAndTitle() {
        return trackAuthorAndTitle;
    }
    public void setTrackAuthorAndTitle(String trackAuthorAndTitle) {
        this.trackAuthorAndTitle = trackAuthorAndTitle;
    }
    public String getTrackGenre() {
        return trackGenre;
    }
    public void setTrackGenre(String trackGenre) {
        this.trackGenre = trackGenre;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('\n').append("track:  ").append(trackAuthorAndTitle).append('\t');
        sb.append("(genre:  ").append(trackGenre).append("):  ").append(duration);
        return sb.toString();
    }
    protected void AudioCD(){}
}