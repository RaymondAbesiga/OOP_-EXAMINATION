
package ray.oopexamination;

public class Company {
    public boolean scheduleVehicle(Passenger passenger) {
        System.out.println("Scheduling vehicle for passenger from " + 
                          passenger.getPickup() + " to " + passenger.getDestination());
        return true; 
    }
}