package lab9.design.vending;

public class Spend implements CoinBooth {
        VendingMachine vendingMachine;

        public Spend(VendingMachine vendingMachine) {
            this.vendingMachine = vendingMachine;
        }

        @Override
        public void insertCoin(int amount) {
            int curAmount = vendingMachine.getAmount() + amount;
            if (curAmount >= vendingMachine.getPrice()) {
                if (curAmount > vendingMachine.getPrice())
                    System.out.println("Edit " + (curAmount - vendingMachine.getPrice()));
                System.out.println("Succesful!");
                vendingMachine.setAmount(0);
                vendingMachine.setPrice(0);
                vendingMachine.setCurrentCoinStation(vendingMachine.getEnd());
            } else if (curAmount < vendingMachine.getPrice())
                System.out.println("Please input money " + (vendingMachine.getPrice() - curAmount));
        }

        @Override
        public void chooseDestination(String station) {
            System.err.println("ERROR");
        }

        @Override
        public void getTicket() {
            System.err.println("ERROR");
        }
    }

}
