package cabinvoicegenerator;

public class InvoiceGenerator {

    // UC1
    /*
         Given : MINIMUM COST PER_KM = 10.0
         COST PER TIME = 1
         MINIMUM FARE = 5

     */

    private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    /*
        Given distance and time,
        Return total fare for the journey
        If minimum total fare is less than the MINIMUM_FARE, return MINIMUM_FARE
     */

    public double calculateFare(double distance , double time) {
        double totalFare = (distance * MINIMUM_COST_PER_KM) + (time * COST_PER_TIME);

        return Math.max(totalFare , MINIMUM_FARE);

    }

    //UC-2
        /*
         method calculate total fare of all rides
         method stores multiple rides in an array form
         and returns total fare
         */

    public double calculateMultipleFare( Ride [] rides){
        double totalFare = 0;
        for(Ride ride : rides){
            totalFare += this.calculateFare(ride.distance,ride.time);
        }
        return totalFare;
    }
}
