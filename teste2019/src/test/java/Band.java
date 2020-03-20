import java.util.ArrayList;
import java.util.List;

public class Band extends Act{
    private String name;
    private String country;
    private List<Artist> artists= new ArrayList<Artist>();

    public Band(String name, String country) {
        super(name, country);
        this.name=name;
        this.country=country;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    void setName(String name) {
        this.name=name;
    }

    @Override
    String getCountry() {
        return this.country;
    }

    @Override
    void setCountry(String country) {
        this.country=country;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artist) {
        this.artists= artist;
    }

    public void addArtist(Artist artist){
        this.artists.add(artist);
    }

    public boolean containsArtist(Artist artist){
        for (Artist artist1:this.artists){
            if (artist1.equals(artist)){
                return true;
            }
        }
        return false;
    }
}