package pattern.factory;

import java.util.Random;

/**
 *
 * @author ramudu
 */
public class RandomCreator implements Creator {

    Random random = new Random();

    public Product createProduct() {
        int mod = random.nextInt() % 3;
        switch (Math.abs(mod)) {
            case 0:
                return new ProductA();
            case 1:
                return new ProductB();
            case 2:
                return new ProductC();
        };

        return null;
    }
}
