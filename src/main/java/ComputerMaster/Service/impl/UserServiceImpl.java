package ComputerMaster.Service.impl;

import ComputerMaster.Service.UserService;
import ComputerMaster.domain.User;
import ComputerMaster.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo repository;
    @Override
    public User findById(Long id) {
        return repository.findOne(id);
    }
    @Override
    public User save(User entity) {
        return repository.save(entity);
    }
    @Override
    public User update(User entity) {
        return repository.save(entity);
    }
    @Override
    public void delete(User entity) {
        repository.delete(entity);
    }
    @Override
    public List<User> findAll() {
        List<User> allUsers = new ArrayList<>();
        Iterable<User> users = repository.findAll();
        for (User part : users) {
            allUsers.add(part);
        }
        return allUsers;
    }
    @Override
    public boolean isUserExist(User user) {
        return false;
    }
}
