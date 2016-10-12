package ComputerMaster.repository;

import ComputerMaster.domain.Brochure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
@Repository
public interface BrochureRepo extends CrudRepository<Brochure,Long> {
    public Brochure findByCode(String code);
}
