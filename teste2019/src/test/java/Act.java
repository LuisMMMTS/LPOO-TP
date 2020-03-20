abstract class Act {
    private String name;
    private String country;

    public Act(String name, String country) {
        this.name = name;
        this.country=country;
    }

    abstract String getName();

    abstract void setName(String name);

    abstract String getCountry();

    abstract void setCountry(String country);

}
