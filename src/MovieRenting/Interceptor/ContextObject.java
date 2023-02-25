package MovieRenting.Interceptor;
import MovieRenting.Customer;
import MovieRenting.Rental;

// if interceptor wants info, it can only get what the contextobject has 
// can have multiple context objects for interception points, will only use one for this project
public class ContextObject {
    private Rental rental;
	private Customer customer;

	public ContextObject(Rental r, Customer c) {
        this.rental = r;
        this.customer = c;
    }
     
	public String getMovieDetails() {
		return rental.getMovie().getTitle();
    }
		
	public String getCustomerName() {
        return customer.getName();
    }
}
