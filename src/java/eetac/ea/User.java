package eetac.ea;

public class User {
    String num;
    String name;
    public User() {
        this.num = num;
        this.name=name;
    }
    public User(String num, String name) {
        this.num = num;
        this.name=name;
    }


    public String getNom() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return num;
    }
    public void setID(String title) {
        this.num = num;
    }
}
