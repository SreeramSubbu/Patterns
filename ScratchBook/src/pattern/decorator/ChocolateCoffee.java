package pattern.decorator;

/**
 *
 * @author ramudu
 */
public class ChocolateCoffee extends FlavouredCoffee {

    public ChocolateCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Chocolate " + this.coffee.getDescription();
    }

    @Override
    public Double getCost() {

        return this.coffee.getCost() + 0.50;
    }

}
