package cabinvoicegenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    void given_DistanceAndTime_ShouldReturn_TotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance =2.0;
        int time = 20;
        double  fare = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(40.0 , fare);
    }

    @Test
    void given_DistanceAndTime_ShouldReturn_MinimumFare() {
        InvoiceGenerator invoice = new InvoiceGenerator();
        double distance =0.2;
        int time = 2;
        double  fare = invoice.calculateFare(distance,time);
        Assertions.assertEquals(0.4 , fare);
    }
}
