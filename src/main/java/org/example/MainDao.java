package org.example;

public class MainDao {

    public static void main(String[] args) {


//        User marek = new User();
//        marek.setUserName("Marek");
//        marek.setEmail("Marek.Kowalski@gmail.com");
//        marek.setPassword("Marek1");
//
//        User jarek = new User();
//        jarek.setUserName("Jarek");
//        jarek.setEmail("Jarek.Kowalski@gmail.com");
//        jarek.setPassword("Jarek1");
//
//        User czarek = new User();
//        czarek.setUserName("Czarek");
//        czarek.setEmail("Czarek.Kowalski@gmail.com");
//        czarek.setPassword("Czarek1");
//
//        User arek = new User();
//        arek.setUserName("Arek");
//        arek.setEmail("Arek.Kowalski@gmail.com");
//        arek.setPassword("Arek1");
////
        UserDAO user1 = new UserDAO();
////        user1.create(marek);
////
//        UserDAO user2 = new UserDAO();
////        user2.create(jarek);
//
//        UserDAO user3 = new UserDAO();
////        user3.create(czarek);
//
        UserDAO user4 = new UserDAO();
////        user4.create(arek);
//
//        UserDAO user5 = new UserDAO();
//
//        User userToUpdate = user1.read(17);
//
//        userToUpdate.setPassword("Kacper1");
//
//        user5.update(userToUpdate);
//
//
//


        user1.delete(18);

        User[] users = user4.findAll();

        for (User user : users) {
            System.out.println(user);
        }


    }
}