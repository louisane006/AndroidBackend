package ComputerMaster.Service.impl;

import ComputerMaster.Service.EmployeeService;
import ComputerMaster.domain.Employee;
import ComputerMaster.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-18.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo repository;
    public List<Employee> getCourses() {
        List<Employee> employees = new ArrayList<Employee>();

        Iterable<Employee> items = repository.findAll();
        for (Employee emp : employees) {
            employees.add(emp);
        }
        return employees;
    }
    @Override
    public Employee findById(Long aLong) {
        return null;
    }
    @Override
    public Employee save(Employee entity) {
        return null;
    }
    @Override
    public Employee update(Employee entity) {
        return null;
    }
    @Override
    public void delete(Employee entity) {}
    @Override
    public List<Employee> findAll() {
        return null;
    }
}
