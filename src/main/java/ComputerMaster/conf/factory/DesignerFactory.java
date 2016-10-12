package ComputerMaster.conf.factory;

import ComputerMaster.domain.Designer;

import java.util.Map;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
public class DesignerFactory {
    public static Designer createEmployee(Map<String,String> values){
        return new Designer.Builder()
                .name(values.get("name"))
                .surname(values.get("surname"))
                .address(values.get("address"))
                .build();
    }
}
