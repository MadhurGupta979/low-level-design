package DecoraterPattern.PizzaBillingSystem;

import DecoraterPattern.PizzaBillingSystem.BasePizzaImpl.Farmhouse;
import DecoraterPattern.PizzaBillingSystem.BasePizzaImpl.Margherita;
import DecoraterPattern.PizzaBillingSystem.ToppingDecoratorImpl.ExtraCheese;
import DecoraterPattern.PizzaBillingSystem.ToppingDecoratorImpl.Mushroom;

public class PizzaStore {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Mushroom(new Farmhouse()));

        System.out.println(pizza.cost());
    }
}
