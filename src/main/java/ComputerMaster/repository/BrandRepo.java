package ComputerMaster.repository;

import ComputerMaster.domain.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
@Repository
public interface BrandRepo extends CrudRepository<Brand,Long> {
    public Brand findByCode(String code);
}
