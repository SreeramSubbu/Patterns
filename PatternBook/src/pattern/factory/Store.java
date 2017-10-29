package pattern.factory;

/**
 *
 * @author ramudu
 */
public class Store {
    
    public static void main(String[] args) {
        RandomCreator rc = new RandomCreator();
        rc.createProduct().display();
        rc.createProduct().display();
        rc.createProduct().display();
        SequentialCreator sc = new SequentialCreator();
        sc.createProduct().display();
        sc.createProduct().display();
        sc.createProduct().display();
              
    }

}
