package ComputerMaster.Service;

import ComputerMaster.domain.User;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public interface UserService extends Services<User,Long> {
    boolean isUserExist(User user);
}
