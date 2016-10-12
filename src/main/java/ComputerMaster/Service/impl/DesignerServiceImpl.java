package ComputerMaster.Service.impl;

import ComputerMaster.Service.DesignerService;
import ComputerMaster.domain.Designer;
import ComputerMaster.repository.DesignerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-18.
 */
@Service
public class DesignerServiceImpl implements DesignerService {
    @Autowired
    DesignerRepo repository;
    public List<Designer> getCourses() {
        List<Designer> employees = new ArrayList<Designer>();

        Iterable<Designer> items = repository.findAll();
        for (Designer emp : employees) {
            employees.add(emp);
        }
        return employees;
    }
    @Override
    public Designer findById(Long aLong) {
        return null;
    }
    @Override
    public Designer save(Designer entity) {
        return null;
    }
    @Override
    public Designer update(Designer entity) {
        return null;
    }
    @Override
    public void delete(Designer entity) {}
    @Override
    public List<Designer> findAll() {
        return null;
    }
}
