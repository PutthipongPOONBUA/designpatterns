package lab9;

public class MainProgram {
    public static void main(String[] args) {
        Tour tour = new PackageTour(
                "BossTour1"
                , new SingleTour("Chaing Mai",1000,50)
                , new SingleTour("Chon Buri",2000,50)
                , new SingleTour("Phuket",3000,100));

        System.out.println("PackageName: " + tour.getName()+ " "+ "AvailableSeats: " + tour.getAvailableSeats()
                + " " +"Price: " + tour.getPrice());

        Tour tour2 = new PackageTour("BossTour2", new SingleTour("Wat Pra Kaew",500,10));

        System.out.println("PackageName: " + tour2.getName()+ " "+ "AvailableSeats: " + tour2.getAvailableSeats()
                + " " +"Price: " + tour2.getPrice());


    }
}
