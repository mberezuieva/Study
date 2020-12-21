package com.course.onseo.user;

public class App {
    public static void main(String[] args) {
        WorkPlace workPlace = new WorkPlace();
        workPlace.createUsers(6);
        workPlace.initUsers();
        workPlace.showUsers();

    }
}
