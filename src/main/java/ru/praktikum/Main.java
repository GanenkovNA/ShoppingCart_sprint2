package ru.praktikum;

import ru.praktikum.model.Apple;
import ru.praktikum.model.Food;
import ru.praktikum.model.Meat;
import ru.praktikum.service.ShoppingCart;

import static ru.praktikum.model.constants.Colours.GREEN;
import static ru.praktikum.model.constants.Colours.RED;

public final class Main {
    public static void main(String[] args) {
        //Создаём объекты для корзины
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, RED);
        Food greenApple = new Apple(8, 60, GREEN);

        //Создаём массив с продуктами и передаём его в корзину
        Food[] products = {meat, redApple, greenApple};
        ShoppingCart shopCart = new ShoppingCart(products);

        //Выводим информацию о корзине
        //По рекомендации ревьюера заменил `System.out.println()` на `System.out.printf()`
        System.out.printf("Общая стоимость продуктов в корзине без скидок: %.2f руб. \n", shopCart.getTotalPriceWithoutDiscount());
        System.out.printf("Общая стоимость продуктов в корзине со скидками: %.2f руб. \n", shopCart.getTotalPriceWithDiscount());
        System.out.printf("Общая стоимость вегетарианских продуктов в корзине без скидок: %.2f руб. \n", shopCart.getTotalPriceVegetarian());
    }
}
