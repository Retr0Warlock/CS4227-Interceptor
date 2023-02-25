package MovieRenting.test;

import MovieRenting.*;
import MovieRenting.Interceptor.*;
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
        customer.Statement();

        customer.addRental(rental2);
        customer.Statement();

    }
}
