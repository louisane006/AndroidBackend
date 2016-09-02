package ComputerMaster.repository;

import ComputerMaster.domain.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
@Repository
public interface ItemRepo extends CrudRepository<Items,Long> {
    public Items findByCode(String code);
}
