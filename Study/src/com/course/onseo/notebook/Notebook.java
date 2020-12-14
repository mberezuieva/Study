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
        this.cpu = new Processor (3);
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
            System.out.println("User "+user.getName());
            return true;
        }
        else
        {
            System.out.println("Need cleaning");
            return false;
        }
    }

    public boolean clear() {
        if (cpu.getHitPoints() > 0) {
            this.userCount = 0;
            cpu.setHitPoints(cpu.getHitPoints() - 1);
            System.out.println("Cleaning is done");
            return true;
        }
        else {
            System.out.println("Note is dead");
            return false;
        }
    }


}
