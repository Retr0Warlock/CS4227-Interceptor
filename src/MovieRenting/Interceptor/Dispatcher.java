package MovieRenting.Interceptor;
import java.util.Vector;

public class Dispatcher { 
    Vector<Interceptor> interceptors;
    
    public Dispatcher() {
        interceptors = new Vector<>();
    }

    // register a concrete interceptor
    public void attachInterceptor(Interceptor i){
        interceptors.addElement(i);
    }

    // unregister a concrete interceptor
    public void detachInterceptor(Interceptor i){
        interceptors.removeElement(i);
    }

    public void dispatchRentalAdd(ContextObject conObj){
        //interate through all interceptors and call
        for(Interceptor i: interceptors){
            i.interceptRentalAdd(conObj);
        }
    }

    public void dispatchFrequentRenterPoints(ContextObject conObj){
        //interate through all interceptors and call
        for(Interceptor i: interceptors){
            i.interceptFrequentRenterPoints(conObj);
        }
    }
    
}
