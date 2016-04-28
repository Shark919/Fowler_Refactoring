import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by D062427 on 28.04.2016.
 */
public class CustomerTest {
    Customer customer = new Customer("TestCustomer");
    Movie movie = new Movie("TestMovie", 1234);
    Rental rental = new Rental(movie, 42);

    @Test
    public void addRental() throws Exception {
        customer.addRental(rental);
        assertEquals(customer.statement(), "Rental Record for TestCustomer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTestMovie\t\t42\t0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void getName() throws Exception {
        assertEquals(customer.getName(), "TestCustomer");
    }

    @Test
    public void statement() throws Exception {
        customer.addRental(rental);
        assertEquals(customer.statement(), "Rental Record for TestCustomer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTestMovie\t\t42\t0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 1 frequent renter points");
    }

}