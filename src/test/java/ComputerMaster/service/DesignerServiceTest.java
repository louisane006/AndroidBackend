package ComputerMaster.service;

import ComputerMaster.App;
import ComputerMaster.Service.DesignerService;
import ComputerMaster.conf.factory.DesignerFactory;
import ComputerMaster.domain.Designer;
import ComputerMaster.repository.DesignerRepo;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Malu.Mukendi on 2016-08-20.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class DesignerServiceTest extends AbstractTestNGSpringContextTests {
    private Long id;
    @Autowired
    DesignerRepo repo;
    @Autowired
    DesignerService service;

    @Test
    public void testCreate() throws Exception {
        Map<String, String> values = new HashMap<>();
        values.put("name", "Caren");
        values.put("surname", "Madden");
        values.put("address", "Wynberg , Cape Town");
        Designer emp = DesignerFactory.createEmployee(values);
        repo.save(emp);
        id = emp.getIdentification();
        Assert.assertNotNull(emp);
    }
    @Test(dependsOnMethods = "testCreate")
    public void testDelete() throws Exception {
        Designer emp = repo.findOne(id);
        repo.delete(emp);
        Designer e = repo.findOne(id);
        Assert.assertNull(e);
    }
}
