package ComputerMaster.repository;

import ComputerMaster.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Long> {
}
