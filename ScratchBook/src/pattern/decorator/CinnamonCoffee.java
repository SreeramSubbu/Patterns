package pattern.decorator;

/**
 *
 * @author ramudu
 */
public class CinnamonCoffee  extends FlavouredCoffee{

    public CinnamonCoffee(Coffee coffee) {
        super(coffee);
    }

  @Override
    public String getDescription() {
        return "Cinnamon " + this.coffee.getDescription(); 
    }

    @Override
    public Double getCost() {
       
       return this.coffee.getCost() + 1.00;
    }
    
}
