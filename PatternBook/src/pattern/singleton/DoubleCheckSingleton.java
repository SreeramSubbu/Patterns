package pattern.singleton;

/**
 *
 * @author ramudu
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton uniqueInstance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                uniqueInstance = new DoubleCheckSingleton();
                System.out.println("Created new Singleton");
            }

        }

        return uniqueInstance;

    }

}
