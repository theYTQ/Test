package com.learn.effectivejava;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;

    public static class Builder {
        private final int servingSize;
        private int servings;

        public Builder(int servingSize) {
            this.servingSize = servingSize;
        }

        public Builder servings(int servings) {
            this.servings = servings;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new Builder(1).servings(2).build();
    }
}
