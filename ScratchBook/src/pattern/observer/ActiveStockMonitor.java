package pattern.observer;

/**
 *
 * @author ramudu
 */
public class ActiveStockMonitor {

    public static void main(String[] args) {

        StockObservable newObersable = new StockObservable(51.00, 61.00, 72.00);
        StockObserver stockObserver1 = new StockObserver();
        StockObserver stockObserver2 = new StockObserver();
        newObersable.register(stockObserver1);
        newObersable.register(stockObserver2);
        newObersable.initiateStockMonitoring();
    }
}
