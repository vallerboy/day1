package game;

public class Player {
    private String name;
    private String lastname;
    private int points;

    public Player(String name, String lastname, int points) {
        this.name = name;
        this.lastname = lastname;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String fullName(){
        return name + " " + lastname;
    }

}
