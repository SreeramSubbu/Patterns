package pattern.strategy;

/**
 *
 * @author ramudu
 */
public class AttackWithSword implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Swing Sword");
    }

}
