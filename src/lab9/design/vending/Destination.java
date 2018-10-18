package lab9.design.vending;

import java.util.Map;
import java.util.TreeMap;

public class Destination implements CoinBooth {
    VendingMachine vendingMachine;
    Map<String, Integer> destinationPrice = new TreeMap<>();

    public Destination(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationPrice.put("Chaing Mai", 50);
        destinationPrice.put("Chaing Rai", 50);
        destinationPrice.put("Chon Buri", 70);
        destinationPrice.put("Phuket", 70);
        destinationPrice.put("Rayong", 70);
    }


    @Override
    public void getTicket() {
        System.err.println("ERROR");
    }

    @Override
    public void insertCoin(int amount) {
        System.err.println("ERROR");
    }


    @Override
    public void chooseDestination(String station) {
        if (destinationPrice.containsKey(station)) {
            System.err.println("Invalid station or destination");
            return;
        }
        int price = destinationPrice.get(station);
        System.out.println("Select " + station + "- " + price + " Bath");
        vendingMachine.setCurrentCoinStation(vendingMachine.getPay());
    }
}

