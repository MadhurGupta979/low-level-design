package DecoraterPattern.PizzaBillingSystem.ToppingDecoratorImpl;

import DecoraterPattern.PizzaBillingSystem.BasePizza;
import DecoraterPattern.PizzaBillingSystem.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
