package ComputerMaster.conf.factory;

import ComputerMaster.domain.Brochure;
import ComputerMaster.domain.Section;

import java.util.Map;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public class BrochureFactory {
    public static Brochure createBrochure(Map<String, String> values, Map<String, Section> section) {
        return new Brochure.Builder()
                .name(values.get("name"))
                .code(values.get("code"))
                .section(section.get("section"))
                .build();
    }
}
