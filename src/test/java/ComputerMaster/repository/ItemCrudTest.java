package ComputerMaster.repository;

import ComputerMaster.App;
import ComputerMaster.domain.Items;
import ComputerMaster.domain.Section;
import ComputerMaster.conf.factory.ItemFactory;
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
public class ItemCrudTest extends AbstractTestNGSpringContextTests {
    private Long id;
    Section section = new Section();
    @Autowired
    ItemRepo repo;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        HashMap<String, Section> section = new HashMap<>();
        values.put("name", "Lenovo");
        values.put("code", "BT500");
        section.put("section", new Section("PCS"));
        Items item = ItemFactory.createItem(values, section);
        repo.save(item);
        id = item.getId();
        Assert.assertNotNull(item.getId());
    }
    @Test(dependsOnMethods = "testCreate")
    public void testRead()throws Exception {
        Items item = repo.findOne(id);
        Assert.assertEquals("Lenovo", item.getName());
    }
    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Items item = repo.findOne(id);
        Items i  = new Items.Builder()
                .copy(item)
                .name("HP")
                .build();
        repo.save(i);
        Assert.assertEquals("HP",i.getName());
    }
    /*@Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Items item = repo.findOne(id);
        repo.delete(item);
        Items i = repo.findOne(id);
        Assert.assertNull(i);
    }*/
}
