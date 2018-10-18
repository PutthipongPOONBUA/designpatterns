package lab9.design.vending;

public class Vending implements CoinBooth {

        VendingMachine vendingMachine;

        public Vending(VendingMachine vendingMachine) {
            this.vendingMachine = vendingMachine;
        }

        @Override
        public void insertCoin(int amount) {
            System.err.println("ERROR");
        }

        @Override
        public void chooseDestination(String station) {
            System.err.println("ERROR");
        }

        @Override
        public void getTicket() {
            System.out.println("You Got Ticket");
            vendingMachine.setCurrentCoinStation(vendingMachine.getReady());
        }
    }

}
