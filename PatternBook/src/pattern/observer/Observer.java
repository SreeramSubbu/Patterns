package pattern.observer;

/**
 *
 * @author ramudu
 */
public interface Observer {

    void update(Double price1, Double price2, Double price3);

    void display();

}
