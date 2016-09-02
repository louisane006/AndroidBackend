package ComputerMaster.domain;

import ComputerMaster.conf.factory.ItemFactory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public class ItemFactoryTest extends TestCase {

    public ItemFactoryTest() {
    }
    @Test
    public void testCreate() {
        HashMap<String, String> values = new HashMap<>();
        HashMap<String, Section> section = new HashMap<>();
        Section sec = new Section();
        sec.setSectionName("PCS");
        values.put("name", "Laptop");
        values.put("code", "LP500");
        section.put("section", section.get(sec.getName()));
        Items i = ItemFactory.createItem(values, section);
        Assert.assertEquals("Laptop", i.getName());
        Assert.assertEquals("LP500", i.getCode());
        Assert.assertEquals(section.get(sec.getName()), i.getSection());
    }
    @Test
    public void testUpdate() {
        Map<String, String> values = new HashMap<String, String>();
        HashMap<String, Section> section = new HashMap<>();
        Section sec = new Section();
        sec.setSectionName("PCS");
        values.put("name", "Laptop");
        values.put("code", "LP500");
        Items item = ItemFactory.createItem(values, section);
        Items newItem = (new Items.Builder().copy(item).code("LP700").build());
        Assert.assertEquals("Laptop", newItem.getName());
        Assert.assertEquals("LP700", newItem.getCode());
        Assert.assertEquals(section.get(sec.getName()), newItem.getSection());
    }
}
