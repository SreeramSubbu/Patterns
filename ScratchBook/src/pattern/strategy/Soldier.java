package pattern.strategy;

/**
 *
 * @author ramudu
 */
public abstract class Soldier {

    private AttackStrategy attack;
    private DefendStrategy defend;

    public Soldier(AttackStrategy attack, DefendStrategy defend) {
        this.attack = attack;
        this.defend = defend;
    }

    public void attack() {
        this.attack.attack();
    }

    public void defend() {
        this.defend.defend();
    }

}
