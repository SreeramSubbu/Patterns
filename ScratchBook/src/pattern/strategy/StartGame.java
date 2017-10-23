package pattern.strategy;

/**
 *
 * @author ramudu
 */
public class StartGame {

    public static void main(String[] args) {
        Soldier soldier1 = new BowMan(new AttackWithArrows(), new DefendWithShield());
        Soldier soldier2 = new SwordsMan(new AttackWithSword(), new DefendWithShield());
        Soldier soldier3 = new BowMan(new AttackWithArrows(), new NoDefend());
        soldier1.attack();
        soldier2.defend();
        soldier3.attack();
        soldier1.defend();
        soldier2.attack();
        soldier3.defend();
    }

}
