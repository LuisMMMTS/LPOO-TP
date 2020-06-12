public class User {
    private String username;

    User (String name, int age){
        this.username=name+Integer.toString(age);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
