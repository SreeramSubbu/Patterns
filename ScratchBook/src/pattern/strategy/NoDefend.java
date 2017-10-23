package pattern.strategy;

/**
 *
 * @author ramudu
 */
public class NoDefend implements DefendStrategy {

    @Override
    public void defend() {
        System.out.println("No Defence. Run away.");
    }

}
