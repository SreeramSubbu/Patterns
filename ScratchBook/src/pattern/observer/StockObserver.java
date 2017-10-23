package pattern.observer;

/**
 *
 * @author ramudu
 */
public class StockObserver implements Observers {

    private Double ibmPrice;
    private Double googlePrice;
    private Double applePrice;
    private static int tracker = 1;
    private int id =0;

    public StockObserver() {
        
        this.id = tracker++;
    }

    @Override
    public void update(Double ibmPrice, Double googlePrice, Double applePrice) {
        this.ibmPrice = ibmPrice;
        this.googlePrice = googlePrice;
        this.applePrice = applePrice;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Message from Observer" + id + " IBM Price: " + ibmPrice + " Google Price: " + googlePrice + " Apple Price: " + applePrice);
    }

}
