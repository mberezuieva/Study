package com.course.onseo.notebook;

public class App {
    public static void main(String[] args) {
        Notebook note = new Notebook("PC1", 3);
        User[] users = new User[] {
                new User("Ivan"),
                new User("Peter"),
                new User("Fedor"),
                new User("Vasiliy"),
                new User("Sergei"),
                new User("Pavel"),
                new User("Leonid"),
                new User("Yuriy"),
                new User("Valeriy"),
                new User("Vladimir"),
                new User("Ivan"),
                new User("Peter"),
                new User("Fedor"),
                new User("Vasiliy"),
                new User("Sergei"),
                new User("Pavel"),
                new User("Leonid"),
                new User("Yuriy"),
                new User("Valeriy"),
                new User("Vladimir")
        };

        for (int i = 0; i < users.length; i++) {
            if (!note.setUser(users[i])) {
                if (!note.clear()) return;
                note.setUser(users[i]);
            }

        }


    }
}
