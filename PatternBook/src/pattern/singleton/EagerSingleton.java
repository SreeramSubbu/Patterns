package pattern.singleton;

/**
 *
 * @author ramudu
 */
public class EagerSingleton {

    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        System.out.println("Send Singleton");
        return uniqueInstance;

    }

}
