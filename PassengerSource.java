
package ray.oopexamination;


public class PassengerSource {
 public static void main(String[] args) {
        Company company = new Company();
        PassengerS source = new PassengerS(company);
        for (int i = 0; i < 5; i++) {
            boolean success = source.requestPickup();
            System.out.println("Pickup request " + (i+1) + ": " + 
                             (success ? "SUCCESS" : "FAILED"));
        }
    }
}