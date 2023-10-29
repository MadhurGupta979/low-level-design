package DecoraterPattern.PizzaBillingSystem.BasePizzaImpl;

import DecoraterPattern.PizzaBillingSystem.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 150;
    }
}
