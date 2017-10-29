package pattern.factory;

import java.util.Random;

/**
 *
 * @author ramudu
 */
public class SequentialCreator implements Creator {

    static Integer count = 1;

    @Override
    public Product createProduct() {

        switch (count) {
            case 1:
                count++;
                return new ProductA();
            case 2:
                count++;
                return new ProductB();
            case 3:
                count = 1;
                return new ProductC();
        };

        return null;
    }
}
