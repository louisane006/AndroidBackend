package ComputerMaster.Service.impl;

import ComputerMaster.Service.CustomerService;
import ComputerMaster.domain.Customer;
import ComputerMaster.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-18.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repository;
    @Override
    public Customer findById(Long aLong) {
        return null;
    }
    @Override
    public Customer save(Customer entity) {
        return null;
    }
    @Override
    public Customer update(Customer entity) {
        return null;
    }
    @Override
    public void delete(Customer entity) {
    }
    @Override
    public List<Customer> findAll() {
        List<Customer> allCust = new ArrayList<>();
        Iterable<Customer> customers = repository.findAll();
        for (Customer customer : customers) {
            allCust.add(customer);
        }
        return allCust;
    }
}
