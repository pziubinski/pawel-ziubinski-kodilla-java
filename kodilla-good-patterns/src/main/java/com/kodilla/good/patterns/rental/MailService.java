package com.kodilla.good.patterns.rental;

public class MailService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("Send message to user: " + user.getName() + " " + user.getSurname());
    }
}
