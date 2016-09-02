package ComputerMaster.repository;

import ComputerMaster.App;
import ComputerMaster.domain.Customer;
import ComputerMaster.conf.factory.CustomerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CustomerCrudTest extends AbstractTestNGSpringContextTests {

        private Long id;
        @Autowired
        CustomerRepo repo;

        @Test
        public void testCreate() throws Exception {
            Map<String, String> values = new HashMap<>();
            values.put("name", "Louise");
            values.put("surname", "Malu");
            values.put("custNum", "213015889");
            Customer cust = new Customer();
            Customer c = CustomerFactory.createCustomer(values);
            repo.save(c);
            id = c.getId();
            Assert.assertNotNull(c.getId());
        }
        @Test(dependsOnMethods = "testCreate")
        public void testRead()throws Exception {
            Customer customer = repo.findOne(id);
            Assert.assertEquals("Louise", customer.getName());
        }
        @Test(dependsOnMethods = "testRead")
        public void testUpdate() throws Exception {
            Customer customer = repo.findOne(id);
            Customer newCustomer = new Customer.Builder()
                    .copy(customer)
                    .name("Rosa")
                    .build();
            repo.save(newCustomer);
            Assert.assertEquals("Rosa", newCustomer.getName());
        }
        /*@Test(dependsOnMethods = "testUpdate")
        public void testDelete() throws Exception {
            Customer customer = repo.findOne(id);
            repo.delete(customer);
            Customer c = repo.findOne(id);
            Assert.assertNull(c);
        }*/
    }


