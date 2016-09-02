package ComputerMaster.conf.factory;

import ComputerMaster.domain.Items;
import ComputerMaster.domain.Section;

import java.util.Map;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public class ItemFactory {
    public static Items createItem(Map<String, String> values,Map<String, Section> section) {
        return new Items.Builder()
                .name(values.get("name"))
                .code(values.get("code"))
                .section(section.get("section"))
                .build();
    }
}
