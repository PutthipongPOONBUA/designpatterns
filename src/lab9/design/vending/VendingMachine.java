package lab9.design.vending;

public class VendingMachine {
    private CoinBooth pay = new MoneyIn(this);
    private CoinBooth ready = new Standby(this);
    private CoinBooth end = new Vending(this);
    private CoinBooth currentCoinStation = ready;

    private int amount = 0;
    private int price = 0;

    public void setCurrentCoinStation(CoinBooth currentCoinStation) {
        this.currentCoinStation = currentCoinStation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CoinBooth getPay() {
        return pay;
    }

    public CoinBooth getReady() {
        return ready;
    }

    public CoinBooth getEnd() {
        return end;
    }
}
