package ComputerMaster.service;
import ComputerMaster.App;
import ComputerMaster.Service.ShopService;
import ComputerMaster.domain.Shop;
import ComputerMaster.conf.factory.ShopFactory;
import ComputerMaster.repository.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by Malu.Mukendi on 2016-08-20.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ShopServiceTest extends AbstractTestNGSpringContextTests {
    private Long id;
    @Autowired
    ShopRepo repo;
    @Autowired
    ShopService service;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        values.put("name", "Computer Master 2");
        values.put("address", "Protea Services 406");
        Shop shop = ShopFactory.createShop(values);
        repo.save(shop);
        id = shop.getId();
        Assert.assertNotNull(shop);
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
        Shop shop = repo.findOne(id);
        repo.delete(shop);
        Shop s = repo.findOne(id);
        Assert.assertNull(s);
    }
}
