package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final Integer burgers;
    private final SauceSelection sauce;
    private final List<IngredientsSelection> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private Integer burgers;
        private SauceSelection sauce;
        private List<IngredientsSelection> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(SauceSelection sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(IngredientsSelection ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    public BigMac(final String bun, final Integer burgers, final SauceSelection sauce, final List<IngredientsSelection> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public SauceSelection getSauce() {
        return sauce;
    }

    public List<IngredientsSelection> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}