import java.util.Objects;

public class Artist extends Act {
    private String name;
    private String country;

    public Artist(String name, String country) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(name, artist.name) &&
                Objects.equals(country, artist.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }
}
