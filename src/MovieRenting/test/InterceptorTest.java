package MovieRenting.test;

import MovieRenting.*;
import MovieRenting.Interceptor.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InterceptorTest {

    @Test
    public void testInterceptorPoints() {
        // Creating concrete interceptor 
        ConcreteInterceptor concInterceptor = new ConcreteInterceptor();
        // Creating dispatcher
        Dispatcher dispatcher = new Dispatcher();
        // Attaching concrete interceptor to the dispatcher
        dispatcher.attachInterceptor(concInterceptor);

        Customer customer = new Customer("Ben");
        customer.setDispatcher(dispatcher);

        Movie movie1 = new Movie("The Matrix", 1);
        Rental rental1 = new Rental(movie1, 9);
        Movie movie2 = new Movie("Lord of The Rings", 2);
        Rental rental2 = new Rental(movie2, 2);

        // Calling the interception points
        customer.addRental(rental1);
        assertEquals("Rental Record for Ben" + "\n" + "\tThe Matrix: 22.5" + "\n" + "Amount owed is 22.5" + "\n" + "You earned 2.0 frequent renter points", customer.Statement());
        System.out.println(customer.Statement());

        customer.addRental(rental2);
        assertEquals("Rental Record for Ben" + "\n" + "\tThe Matrix: 22.5" + "\n" + "\tLord of The Rings: 1.5" + "\n" + "Amount owed is 24.0" + "\n" + "You earned 3.0 frequent renter points", customer.Statement());
        System.out.println(customer.Statement());
    }
}
