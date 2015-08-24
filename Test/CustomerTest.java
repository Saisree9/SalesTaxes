import org.junit.Test;

/**
 * Created by saisree on 8/24/15.
 */
public class CustomerTest {
    @Test
    public void testShouldTotalCostOfItemsIsCostOfItemIfIPurchaseBook(){
        Customer customer =new Customer();
        double totalAmount=customer.getreceipt();
    }

}
