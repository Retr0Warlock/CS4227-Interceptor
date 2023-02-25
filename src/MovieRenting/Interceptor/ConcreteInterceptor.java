package MovieRenting.Interceptor;
public class ConcreteInterceptor implements Interceptor {

    @Override
    public void interceptRentalAdd(ContextObject conObj) {
        String result = conObj.getCustomerName() + " rented " + conObj.getMovieDetails() +" for $" + conObj.getPrice() + " and " + conObj.getDuration() + " days\n";
        System.out.println(result);
    }
    
    @Override
    public void interceptFrequentRenterPoints(ContextObject conObj) {
        String result = "You earned " + String.valueOf(conObj.getTotalFrequentRenterPoints()) + " frequent renter points from renting "+ conObj.getMovieDetails() + "\n";
        System.out.println(result);
    }
    
    
}