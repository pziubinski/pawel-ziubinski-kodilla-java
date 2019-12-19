package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new  ForumUser(1, "Michał", 'M', LocalDate.of(2001, 1, 1), 20));
        usersList.add(new  ForumUser(2, "Janusz", 'M', LocalDate.of(1980, 2, 11), 120));
        usersList.add(new  ForumUser(3, "Grażyna", 'F', LocalDate.of(1975, 3, 27), 0));
        usersList.add(new  ForumUser(4, "Jarosław", 'M', LocalDate.of(1964, 4, 12), 2350));
        usersList.add(new  ForumUser(5, "Hanna", 'F', LocalDate.of(2012, 5, 8), 0));
        usersList.add(new  ForumUser(6, "Genowefa", 'F', LocalDate.of(1950, 6, 24), 55));
        usersList.add(new  ForumUser(7, "Piotr", 'M', LocalDate.of(1995, 7, 15), 870));
        usersList.add(new  ForumUser(8, "Amadeusz", 'M', LocalDate.of(1987, 8, 20), 0));
        usersList.add(new  ForumUser(9, "Anna", 'F', LocalDate.of(1999, 9, 30), 5));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(usersList);
    }
}
