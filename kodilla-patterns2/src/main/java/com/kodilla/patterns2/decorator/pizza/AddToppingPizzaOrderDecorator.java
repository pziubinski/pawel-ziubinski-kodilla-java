package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class AddToppingPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    private String topping;

    protected AddToppingPizzaOrderDecorator(PizzaOrder pizzaOrder, String topping) {
        super(pizzaOrder);
        this.topping = topping;
    }

    @Override
    public String getDough() {
        return super.getDough();
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public List<String> getToppings() {
        List<String> list = super.getToppings();
        list.add(topping);
        //return super.getToppings();
        return list;
    }
}
