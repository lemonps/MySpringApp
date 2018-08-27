package th.ac.kmutt.sit.MySpringApp.controller;

public class User{
    int id;
    String name;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int setId(int id){
        return this.id = id;
    }

    public String setName(String name){
        return this.name = name;
    }

}