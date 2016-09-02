package ComputerMaster.conf.factory;

import ComputerMaster.domain.Section;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
public class SectionFactory {
    public static Section createSection(String name){
            return new Section.Builder()
                .sectionName(name)
                .build();
    }
}
