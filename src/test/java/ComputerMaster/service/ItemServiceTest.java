package ComputerMaster.service;

import ComputerMaster.App;
import ComputerMaster.Service.ItemsService;
import ComputerMaster.domain.Items;
import ComputerMaster.domain.Section;
import ComputerMaster.conf.factory.ItemFactory;
import ComputerMaster.repository.ItemRepo;
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
public class ItemServiceTest extends AbstractTestNGSpringContextTests {
    private Long id;
    Section section;
    @Autowired
    ItemRepo repo;
    @Autowired
    ItemsService service;

    @Test
    public void testCreate() throws Exception {
       HashMap<String, String> values = new HashMap<>();
        HashMap<String, Section> section = new HashMap<>();
        values.put("name", "Hp");
        values.put("code", "BC500");
        section.put("section", new Section("PCS"));
        Items item = ItemFactory.createItem(values, section);
        repo.save(item);
        id = item.getId();
        Assert.assertNotNull(item.getId());
    }
    @Test(dependsOnMethods = "testCreate")
    public void testDelete() throws Exception {
        Items item = repo.findOne(id);
        repo.delete(item);
        Items i = repo.findOne(id);
        Assert.assertNull(i);
    }
}
