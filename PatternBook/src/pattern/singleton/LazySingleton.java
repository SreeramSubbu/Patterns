package pattern.singleton;

/**
 *
 * @author ramudu
 */
public class LazySingleton {

    private static LazySingleton uniqueInstance;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
            System.out.println("Created new Singleton");
        }

        return uniqueInstance;

    }

}
