package ComputerMaster.repository;

import ComputerMaster.App;
import ComputerMaster.domain.Designer;
import ComputerMaster.conf.factory.DesignerFactory;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.HashMap;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class DesignerCrudTest extends AbstractTestNGSpringContextTests {
    private Long id;
    @Autowired
    DesignerRepo repo;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        values.put("name", "Louise");
        values.put("surname", "Malu");
        values.put("address", "Wynberg");
        Designer emp = DesignerFactory.createEmployee(values);
        repo.save(emp);
        id = emp.getIdentification();
        Assert.assertNotNull(emp.getIdentification());
    }
    @Test(dependsOnMethods = "testCreate")
    public void testRead()throws Exception {
        Designer emp = repo.findOne(id);
        Assert.assertEquals("Louise", emp.getName());
    }
    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Designer emp = repo.findOne(id);
        Designer newEmp = new Designer.Builder()
                .copy(emp)
                .name("Rosa")
                .build();
        repo.save(newEmp);
        Assert.assertEquals("Rosa", newEmp.getName());
    }
    /*@Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Employee emp = repo.findOne(id);
        repo.delete(emp);
        Employee e = repo.findOne(id);
        Assert.assertNull(e);
    }*/
}
