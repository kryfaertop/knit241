package org.knit.solutions.Task11;

public class MobileApp implements StockObserver {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("MobileApp (" + user + "): " + stockName + " изменилась цена: " + price);
    }
}
