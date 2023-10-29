package DecoraterPattern.PizzaBillingSystem.BasePizzaImpl;

import DecoraterPattern.PizzaBillingSystem.BasePizza;

public class Farmhouse extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
