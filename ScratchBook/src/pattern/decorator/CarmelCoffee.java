package pattern.decorator;

/**
 *
 * @author ramudu
 */
public class CarmelCoffee extends FlavouredCoffee{

    public CarmelCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Caramel " + this.coffee.getDescription(); 
    }

    @Override
    public Double getCost() {
       
       return this.coffee.getCost() + 1.00;
    }

    
}
