package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder {
    private final List<String> toppings = new ArrayList<>();

    public BasicPizzaOrder() {
        toppings.add("Classic souce");
        toppings.add("Mozarella");
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDough() {
        return "Classic dough";
    }

    @Override
    public List<String> getToppings() {
        return toppings;
    }
}
