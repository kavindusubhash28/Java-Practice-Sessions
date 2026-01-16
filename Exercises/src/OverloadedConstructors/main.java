package OverloadedConstructors;

public class main {
    public static void main(String[] args) {

        user user1 = new user("Spongebob");
        user user2 = new user("Patrick", "pstar@gmail.com");
        user user3 = new user("sandy", "sch@gmail.com",27);
        user user4 = new user();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
    }
}
