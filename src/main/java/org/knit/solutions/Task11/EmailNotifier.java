package org.knit.solutions.Task11;

public class EmailNotifier implements StockObserver {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Email (" + email + "): " + stockName + " изменилась цена: " + price);
    }
}
