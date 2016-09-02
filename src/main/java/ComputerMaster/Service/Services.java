package ComputerMaster.Service;

import ComputerMaster.domain.User;

import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public interface Services<S, ID> {

    public S findById(ID id);

    public S save(S entity);

    public S update(S entity);

    public void delete(S entity);

    public List<S> findAll();

}