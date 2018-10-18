package lab9.design.vending;

public interface CoinBooth {
    void insertCoin(int amount);
    void chooseDestination(String des);
    void getTicket();
}
