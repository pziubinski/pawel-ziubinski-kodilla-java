package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public String getDough() {
        return pizzaOrder.getDough();
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public List<String> getToppings() {
        return pizzaOrder.getToppings();
    }
}
