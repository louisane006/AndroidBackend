package ComputerMaster.domain;

import ComputerMaster.conf.factory.SectionFactory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public class SectionFactoryTest extends TestCase {
    String name;
    public SectionFactoryTest() {
    }
    @Test
    public void testCreate() {
        Section section = SectionFactory.createSection("Genuine");
        Assert.assertEquals("Genuine", section.getName());
    }
    @Test
    public void testUpdate() {
        Section section = SectionFactory.createSection("Genuine");
        Section newSection= (new Section.Builder().copy(section).sectionName("Faulty").build());
        Assert.assertEquals("Faulty", newSection.getName());
    }
}
