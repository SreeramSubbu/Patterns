package pattern.observer;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramudu
 */
public class StockObservable implements Observable {

    private ArrayList<Observer> observers;

    private Double ibmPrice;
    private Double googlePrice;
    private Double applePrice;

    public StockObservable(Double ibmPrice, Double googlePrice, Double applePrice) {
        this.ibmPrice = ibmPrice;
        this.googlePrice = googlePrice;
        this.applePrice = applePrice;
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer ob) {
        this.getObservers().add(ob);
    }

    @Override
    public void unregister(Observer ob) {
        this.getObservers().remove(ob);
    }

    @Override
    public void notifyObs() {

        getObservers().forEach((observer) -> {
            observer.update(getIbmPrice(), getGooglePrice(), getApplePrice());
        });
    }

    /**
     * @return the observers
     */
    public ArrayList<Observer> getObservers() {
        return observers;
    }

    /**
     * @param observers the observers to set
     */
    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    /**
     * @return the ibmPrice
     */
    public Double getIbmPrice() {
        return ibmPrice;
    }

    /**
     * @param ibmPrice the ibmPrice to set
     */
    public void setIbmPrice(Double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObs();
    }

    /**
     * @return the googlePrice
     */
    public Double getGooglePrice() {
        return googlePrice;
    }

    /**
     * @param googlePrice the googlePrice to set
     */
    public void setGooglePrice(Double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObs();
    }

    /**
     * @return the applePrice
     */
    public Double getApplePrice() {
        return applePrice;
    }

    /**
     * @param applePrice the applePrice to set
     */
    public void setApplePrice(Double applePrice) {
        this.applePrice = applePrice;
        notifyObs();
    }

    public void initiateStockMonitoring() {
        Random random = new Random();

        Runnable ibmMonitor = () -> {
            while (true) {
                try {
                    this.setIbmPrice(random.nextDouble());
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ActiveStockMonitor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        Runnable googleMonitor = () -> {
            while (true) {
                try {
                    this.setGooglePrice(random.nextDouble());
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ActiveStockMonitor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        Runnable appleMonitor = () -> {
            while (true) {
                try {
                    this.setApplePrice(random.nextDouble());
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ActiveStockMonitor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        new Thread(ibmMonitor)
                .start();
        new Thread(googleMonitor)
                .start();
        new Thread(appleMonitor)
                .start();

    }

}
