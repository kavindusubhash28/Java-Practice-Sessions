package OverloadedConstructors;

public class user {
    String username;
    String email;
    int age;

    user(){
        this.username = "guest";
        this.email = "not provided";
        this.age = 0;
    }

    user(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    user(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    user(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
}
