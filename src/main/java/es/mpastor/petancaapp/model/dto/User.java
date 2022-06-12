package es.mpastor.petancaapp.model.dto;

public class User implements Comparable<User> {

    private String username;

    private String name;

    private String lastName;

    private String password;

    private boolean isAdministrator;

    public User(String username, String name, String lastName, String password, boolean isAdministrator) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.isAdministrator = isAdministrator;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdministrator() {
        return isAdministrator;
    }

    @Override
    public int compareTo(User user) {
        return this.username.compareTo(user.username);
    }
}
