package pattern.strategy;

/**
 *
 * @author ramudu
 */
public class SwordsMan extends Soldier {

    public SwordsMan(AttackStrategy attack, DefendStrategy defend) {
        super(attack, defend);
    }

}
