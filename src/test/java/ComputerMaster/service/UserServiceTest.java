package ComputerMaster.service;
import ComputerMaster.App;
import ComputerMaster.Service.UserService;
import ComputerMaster.domain.User;
import ComputerMaster.conf.factory.UserFactory;
import ComputerMaster.repository.UserRepo;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by Malu.Mukendi on 2016-08-20.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class UserServiceTest extends AbstractTestNGSpringContextTests {
    private Long id;
    String email;
    @Autowired
    UserRepo repo;
    @Autowired
    UserService service;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        values.put("username", "louisane002");
        values.put("password", "password2");
        values.put("email", "louisane@gmail.com");
        User user = UserFactory.createUser(values);
        service.save(user);
        id = user.getIdentification();
        Assert.assertNotNull(user.getIdentification());
    }
    /*@Test(dependsOnMethods = "testCreate")
     public void testRead()throws Exception {
         Customer customer = service.findById(id);
         Assert.assertEquals("Erin", customer.getName());
     }
     @Test(dependsOnMethods = "testRead")
     public void testUpdate() throws Exception {
         Customer customer = service.findById(id);
         Customer newCustomer = new Customer.Builder()
                 .copy(customer)
                 .name("Rosy")
                 .build();
         service.save(customer);
         Assert.assertEquals("Rosy", newCustomer.getName());
     }*/
    @Test(dependsOnMethods = "testCreate")
    public void testDelete() throws Exception {
        User user = repo.findOne(id);
        repo.delete(user);
        User u = repo.findOne(id);
        Assert.assertNull(u);
    }
}
