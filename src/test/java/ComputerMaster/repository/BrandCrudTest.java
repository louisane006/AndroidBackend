package ComputerMaster.repository;

import ComputerMaster.App;
import ComputerMaster.conf.factory.BrandFactory;
import ComputerMaster.domain.Brand;
import ComputerMaster.domain.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class BrandCrudTest extends AbstractTestNGSpringContextTests {
    private Long id;
    Section section = new Section();
    @Autowired
    BrandRepo repo;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        HashMap<String, Section> section = new HashMap<>();
        values.put("name", "Lenovo");
        values.put("code", "BT5000");
        section.put("section", new Section("PCS"));
        Brand item = BrandFactory.createBrochure(values, section);
        repo.save(item);
        id = item.getId();
        Assert.assertNotNull(item.getId());
    }
    @Test(dependsOnMethods = "testCreate")
    public void testRead()throws Exception {
        Brand item = repo.findOne(id);
        Assert.assertEquals("Lenovo", item.getName());
    }
    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Brand item = repo.findOne(id);
        Brand i  = new Brand.Builder()
                .copy(item)
                .name("HP")
                .build();
        repo.save(i);
        Assert.assertEquals("HP",i.getName());
    }
    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Brand item = repo.findOne(id);
        repo.delete(item);
        Brand i = repo.findOne(id);
        Assert.assertNull(i);
    }
}
