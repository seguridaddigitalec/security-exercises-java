package ec.seguridaddigital.javacourse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    void getRealShippingAddressCountry_returnsShippingAddressCountry_whenShippingAddressDefined() {
        final Customer c = new Customer();
        
        c.setHasShippingAddress(true);
        c.setShippingAddressCountry("Colombia");

        c.setHasHomeAddress(true);
        c.setHomeAddressCountry("Ecuador");
                
        c.setHasBillingAddress(true);
        c.setBillingAddressCountry("Brazil");
        
        assertEquals("Colombia", c.getRealShippingAddressCountry());
    }
    
    @Test
    void getRealShippingAddressCountry_returnsHomeAddressCountry_whenShippingAddressSetToBeHomeAddress() {
        final Customer c = new Customer();
        
        c.setHasShippingAddress(true);
        c.setShippingAddressCountry("Colombia");

        c.setHasHomeAddress(true);
        c.setHomeAddressCountry("Ecuador");
                
        c.setHasBillingAddress(true);
        c.setBillingAddressCountry("Brazil");
        
        c.setShippingSameAsHomeAddress(true);
        
        assertEquals("Ecuador", c.getRealShippingAddressCountry());
    }

    @Test
    void getRealShippingAddressCountry_returnsBillingAddressCountry_whenShippingAddressSetToBeBillingAddress() {
        final Customer c = new Customer();
        
        c.setHasShippingAddress(true);
        c.setShippingAddressCountry("Colombia");

        c.setHasHomeAddress(true);
        c.setHomeAddressCountry("Ecuador");
                
        c.setHasBillingAddress(true);
        c.setBillingAddressCountry("Brazil");
        
        c.setShippingSameAsBillingAddress(true);
        
        assertEquals("Brazil", c.getRealShippingAddressCountry());
    }

    @Test
    void getRealShippingAddressStreet_returnsShippingAddressStreet_whenShippingAddressDefined() {
        final Customer c = new Customer();
        
        c.setHasShippingAddress(true);
        c.setShippingAddressStreet("Republica del Salvador");

        c.setHasHomeAddress(true);
        c.setHomeAddressStreet("Moscu");
                
        c.setHasBillingAddress(true);
        c.setBillingAddressStreet("Portugal");
        
        assertEquals("Republica del Salvador", c.getRealShippingAddressStreet());
    }
    
    @Test
    void getRealShippingAddressStreet_returnsHomeAddressStreet_whenShippingAddressSetToBeHomeAddress() {
        final Customer c = new Customer();
        
        c.setHasShippingAddress(true);
        c.setShippingAddressStreet("Republica del Salvador");

        c.setHasHomeAddress(true);
        c.setHomeAddressStreet("Moscu");
                
        c.setHasBillingAddress(true);
        c.setBillingAddressStreet("Portugal");
        
        c.setShippingSameAsHomeAddress(true);
        
        assertEquals("Moscu", c.getRealShippingAddressStreet());
    }

    @Test
    void getRealShippingAddressStreet_returnsBillingAddressStreet_whenShippingAddressSetToBeBillingAddress() {
        final Customer c = new Customer();
        
        c.setHasShippingAddress(true);
        c.setShippingAddressStreet("Republica del Salvador");

        c.setHasHomeAddress(true);
        c.setHomeAddressStreet("Moscu");
                
        c.setHasBillingAddress(true);
        c.setBillingAddressStreet("Portugal");
        
        c.setShippingSameAsBillingAddress(true);
        
        assertEquals("Portugal", c.getRealShippingAddressStreet());
    }
}
