package ru.praktikum.service;

import ru.praktikum.model.Food;

public final class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (Food item : items) {
            totalPrice += item.getPrice() * item.getAmount();
        }
        return totalPrice;
    }

    //Метод был переработан из-за того, что `getDiscount()` теперь работает в классе `Food` по умолчанию
    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food item : items) {
                totalPrice += item.getPrice() * (1 - item.getDiscount()/100) * item.getAmount();
        }
        return totalPrice;
    }

    public double getTotalPriceVegetarian() {
        double totalPrice = 0;
        for (Food item : items) {
            if (item.isVegetarian())
                totalPrice += item.getPrice() * item.getAmount();
        }
        return totalPrice;
    }
}
