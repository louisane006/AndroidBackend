package ComputerMaster.Service;

import ComputerMaster.domain.Employee;
import ComputerMaster.domain.Shop;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public interface ShopService extends Services<Shop,Long>{

    List<Shop> getAllShops();
    //List<Employee> getEmployees(Long id);
}
