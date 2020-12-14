package com.course.onseo.notebook;

public class App {
    public static void main(String[] args) {
        Notebook note = new Notebook("PC1", 3);
        User[] users = new User[] {new User("Ivan"), new User("Peter"), new User("Fedor"), new User("Vasiliy")};

        for (int i = 0; i < users.length; i++) {
            if (!note.setUser(users[i])) {
                note.clear();
                i--;
            }

        }


    }
}
