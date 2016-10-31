package ComputerMaster.service;

import ComputerMaster.App;
import ComputerMaster.Service.BrandService;
import ComputerMaster.conf.factory.BrandFactory;
import ComputerMaster.domain.Brand;
import ComputerMaster.domain.Section;
import ComputerMaster.repository.BrandRepo;
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
public class BrandServiceTest extends AbstractTestNGSpringContextTests {
    private Long id;
    Section section;
    @Autowired
    BrandRepo repo;
    @Autowired
    BrandService service;

    @Test
    public void testCreate() throws Exception {
       HashMap<String, String> values = new HashMap<>();
        HashMap<String, Section> section = new HashMap<>();
        values.put("name", "Hp");
        values.put("code", "BC500");
        section.put("section", new Section("PCS"));
        Brand item = BrandFactory.createBrochure(values, section);
        repo.save(item);
        id = item.getId();
        Assert.assertNotNull(item.getId());
    }
    @Test(dependsOnMethods = "testCreate")
    public void testDelete() throws Exception {
        Brand item = repo.findOne(id);
        repo.delete(item);
        Brand i = repo.findOne(id);
        Assert.assertNull(i);
    }
}
