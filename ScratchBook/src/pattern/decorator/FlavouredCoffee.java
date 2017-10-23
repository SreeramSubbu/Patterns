package pattern.decorator;

/**
 *
 * @author ramudu
 */
public abstract class FlavouredCoffee extends Coffee{
    protected Coffee coffee;
    
    public FlavouredCoffee(Coffee coffee){
        this.coffee = coffee;
    }
    
}
