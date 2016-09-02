package ComputerMaster.repository;

import ComputerMaster.App;
import ComputerMaster.domain.Employee;
import ComputerMaster.domain.Shop;
import ComputerMaster.conf.factory.ShopFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ShopCrudTest extends AbstractTestNGSpringContextTests {

    private Long id;
    List<Employee> e;
    @Autowired
    ShopRepo repo;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        values.put("name", "Computer Master");
        values.put("address", "Protea 405");
        Shop shop = ShopFactory.createShop(values);
        repo.save(shop);
        id = shop.getId();
        Assert.assertNotNull(shop.getId());
    }
    @Test(dependsOnMethods = "testCreate")
        public void testRead()throws Exception {
            Shop shop = repo.findOne(id);
            Assert.assertEquals("Protea 405", shop.getAddress());
        }
    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Shop shop = repo.findOne(id);
        Shop newShop = new Shop.Builder(shop.getName())
                .copy(shop)
                .address("Rosa Place")
                .build();
        repo.save(newShop);
        Assert.assertEquals("Rosa Place", newShop.getAddress());
    }
    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Shop shop = repo.findOne(id);
        repo.delete(shop);
        Shop s = repo.findOne(id);
        Assert.assertNull(s);
    }
}
