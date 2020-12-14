package com.course.onseo.notebook;

public class Notebook {
    private Processor cpu;
    private Screen screen;
    private User user;
    private String model;
    private String[] users;
    private int userCount = 0;


    Notebook(String modelName, int capacity) {
        this.model = modelName;
        this.cpu = new Processor();
        this.screen = new Screen();
        this.users = new String[capacity];
    }

    public User getUser() {
        return user;
    }

    public boolean setUser(User user) {
        if (this.userCount < users.length) {
            this.user = user;
            users[this.userCount] = user.getName();
            this.userCount++;
            System.out.println("user "+user.getName());
            return true;
        }
        else
        {
            System.out.println("need cleaning");
            return false;}
    }

    public void clear() {
        this.userCount = 0;
    }
}
