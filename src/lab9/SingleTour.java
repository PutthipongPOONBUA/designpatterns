package lab9;

public class SingleTour implements Tour{
    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
        this.reservedSeats = 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getAvailableSeats() {
        return allSeats - reservedSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAllSeats(int allSeats) {
        this.allSeats = allSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    // constructor and get/set methods ...
}
