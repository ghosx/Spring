package lesson06;

public class DataSource {
    private String user;
    private String password;

    public DataSource() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
