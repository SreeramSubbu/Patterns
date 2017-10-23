package pattern.observer;

/**
 *
 * @author ramudu
 */
public interface Observable {
    
    void register(Observers ob);
    void unregister(Observers ob);
    void notifyObs();
    
    
}
