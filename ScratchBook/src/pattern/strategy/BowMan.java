package pattern.strategy;

/**
 *
 * @author ramudu
 */
public class BowMan extends Soldier {

    public BowMan(AttackStrategy attack, DefendStrategy defend) {
        super(attack, defend);
    }

}
