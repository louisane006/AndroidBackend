package ComputerMaster.service;

import ComputerMaster.App;
import ComputerMaster.Service.CustomerService;
import ComputerMaster.domain.Customer;
import ComputerMaster.conf.factory.CustomerFactory;
import ComputerMaster.repository.CustomerRepo;
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
public class CustomerServiceTest extends AbstractTestNGSpringContextTests{

        private Long id;
        @Autowired
       CustomerRepo repo;
        @Autowired
        CustomerService service;

    @Test
    public void testCreate() throws Exception {
        Map<String, String> values = new HashMap<>();
        values.put("name", "Erin");
        values.put("surname", "Smith");
        values.put("custNum", "213015889");
        Customer c = CustomerFactory.createCustomer( values);
        repo.save(c);
        id = c.getId();
        Assert.assertNotNull(c);
    }
    @Test(dependsOnMethods = "testCreate")
    public void testDelete() throws Exception {
        Customer customer = repo.findOne(id);
        repo.delete(customer);
        Customer c = repo.findOne(id);
        Assert.assertNull(c);
    }
}

