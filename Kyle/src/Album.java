import sun.jvm.hotspot.jdi.ArrayTypeImpl;

public class Album {

    public String Title;
    public String artist;
    public int releaseYear;
    public enum MusicGenre {
        RAP, ROCK, POP, COUNTRY;
    }


    public Album(String Title, String artist, int releaseYear) {
        this.Title = Title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return Title;
    }

    public String getArtist() {
        return artist;
    }
    public int getReleaseYear(){
        return releaseYear;
    }

}
