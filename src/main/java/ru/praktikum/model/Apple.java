package ru.praktikum.model;

import static ru.praktikum.model.constants.Colours.RED;
import static ru.praktikum.model.constants.Discount.RED_APPLE_DISCOUNT;
import static ru.praktikum.model.constants.Discount.ZERO_DISCOUNT;

public final class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(RED) ? RED_APPLE_DISCOUNT : ZERO_DISCOUNT;
    }
}