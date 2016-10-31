package ComputerMaster.conf.factory;

import ComputerMaster.domain.Brand;
import ComputerMaster.domain.Section;

import java.util.Map;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public class BrandFactory {
    public static Brand createBrochure(Map<String, String> values, Map<String, Section> section) {
        return new Brand.Builder()
                .name(values.get("name"))
                .code(values.get("code"))
                .section(section.get("section"))
                .build();
    }
}
