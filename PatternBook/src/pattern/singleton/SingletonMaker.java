package pattern.singleton;

/**
 *
 * @author ramudu
 */
public class SingletonMaker {

    public static void main(String[] args) {
        LazySingleton.getInstance();
        EagerSingleton.getInstance();
        DoubleCheckSingleton.getInstance();
    }
}
