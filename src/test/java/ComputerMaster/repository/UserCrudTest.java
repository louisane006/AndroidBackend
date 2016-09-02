package ComputerMaster.repository;

import ComputerMaster.App;
import ComputerMaster.domain.User;
import ComputerMaster.conf.factory.UserFactory;
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
public class UserCrudTest extends AbstractTestNGSpringContextTests {
    private Long id;
    String email;
    @Autowired
    UserRepo repo;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        values.put("username", "louisane005");
        values.put("password", "password1");
        values.put("email", "louisane006@gmail.com");
        User user = UserFactory.createUser(values);
        repo.save(user);
        id = user.getIdentification();
        Assert.assertNotNull(user.getIdentification());
    }
    @Test(dependsOnMethods = "testCreate")
    public void testRead()throws Exception {
        User user = repo.findOne(id);
        Assert.assertEquals("louisane005", user.getUsername());
    }
    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        User user = repo.findOne(id);
        User u  = new User.Builder()
                .copy(user)
                .username("erin500")
                .build();
        repo.save(u);
        Assert.assertEquals("erin500",u.getUsername());
    }
   @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        User user = repo.findOne(id);
        repo.delete(user);
        User u = repo.findOne(id);
        Assert.assertNull(u);
    }
}
