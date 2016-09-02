package ComputerMaster.repository;

import ComputerMaster.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
@Repository
public interface UserRepo extends CrudRepository<User,Long> {
}
