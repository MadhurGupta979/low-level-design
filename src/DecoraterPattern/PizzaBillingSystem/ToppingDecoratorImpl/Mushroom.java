package DecoraterPattern.PizzaBillingSystem.ToppingDecoratorImpl;

import DecoraterPattern.PizzaBillingSystem.BasePizza;
import DecoraterPattern.PizzaBillingSystem.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    private BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost(){
        return basePizza.cost() + 20;
    }
}
