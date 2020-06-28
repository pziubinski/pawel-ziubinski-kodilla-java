package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(15.0), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetToppings() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();

        //When
        List<String> toppings = pizza.getToppings();

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Classic souce");
        expectedList.add("Mozarella");

        //Then
        assertEquals(expectedList, toppings);
    }

    @Test
    public void testBasicPizzaOrderGetDough() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();

        //When
        String dough = pizza.getDough();

        //Then
        assertEquals("Classic dough", dough);
    }

    @Test
    public void testAdditionalToppingsGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new AddToppingPizzaOrderDecorator(pizza, "Salami");
        pizza = new AddToppingPizzaOrderDecorator(pizza, "Jalapeno");

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testAdditionalToppingsGetToppings() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new AddToppingPizzaOrderDecorator(pizza, "Salami");
        pizza = new AddToppingPizzaOrderDecorator(pizza, "Jalapeno");

        //When
        List<String> toppings = pizza.getToppings();

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Classic souce");
        expectedList.add("Mozarella");
        expectedList.add("Salami");
        expectedList.add("Jalapeno");
        //Then
        assertEquals(expectedList, toppings);
    }

    @Test
    public void testAdditionalDoughGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new DoughPizzaOrderDecorator(pizza);

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testAdditionalDoughGetDough() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new DoughPizzaOrderDecorator(pizza);

        //When
        String dough = pizza.getDough();

        //Then
        assertEquals("Extra dough", dough);
    }
}
