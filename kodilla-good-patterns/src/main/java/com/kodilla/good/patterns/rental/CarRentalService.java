package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {

    @Override
    public boolean rent(User user, LocalDateTime from, LocalDateTime to) {
        if(user.getName().equals("John") && from.getDayOfMonth() < to.getDayOfMonth())
            return true;
        else
            return false;
    }
}
