package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class DoughPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public DoughPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getDough() {
        return "Extra dough";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public List<String> getToppings() {
        return super.getToppings();
    }
}
