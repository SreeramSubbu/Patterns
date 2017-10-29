package pattern.observer;

/**
 *
 * @author ramudu
 */
public interface Observable {

    void register(Observer ob);

    void unregister(Observer ob);

    void notifyObs();

}
