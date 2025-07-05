package ray.oopexamination;

import java.util.Random;

public class PassengerS {
    private Company company;
    private Random random;

    public PassengerS(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public boolean requestPickup() {
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        Passenger passenger = new Passenger(pickup, destination);
        
        return company.scheduleVehicle(passenger);
    }
}