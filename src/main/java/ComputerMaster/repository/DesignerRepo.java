package ComputerMaster.repository;

import ComputerMaster.domain.Designer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
@Repository
public interface DesignerRepo extends CrudRepository<Designer,Long> {
}
