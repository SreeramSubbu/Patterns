package pattern.strategy;

/**
 *
 * @author ramudu
 */
public class DefendWithShield implements DefendStrategy {

    @Override
    public void defend() {
        System.out.println("Protect with Shield");
    }

}
