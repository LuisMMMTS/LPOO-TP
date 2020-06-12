import java.util.ArrayList;
import java.util.List;

public class Band extends Act {
    private List<Artist> artists = new ArrayList<Artist>();

    public Band(String name, String country) {
        super(name, country);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public void addArtist(Artist artist){
        this.artists.add(artist);
    }

    @Override
    public boolean containsArtist(Artist artist){
        for (Artist Art:this.artists){
            if (Art.equals(artist)){
                return true;
            }
        }
        return false;
    }
}
