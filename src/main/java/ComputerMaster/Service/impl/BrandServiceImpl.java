package ComputerMaster.Service.impl;
import ComputerMaster.Service.BrandService;
import ComputerMaster.domain.Brand;
import ComputerMaster.repository.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandRepo repository;
    public List<Brand> getCourses() {
        List<Brand> allItems = new ArrayList<Brand>();

        Iterable<Brand> items = repository.findAll();
        for (Brand item : items) {
            allItems.add(item);
        }
        return allItems;
    }
    @Override
    public Brand findById(Long aLong) {
        return null;
    }
    @Override
    public Brand save(Brand entity) {
        return null;
    }
    @Override
    public Brand update(Brand entity) {
        return null;
    }
    @Override
    public void delete(Brand entity) {}
    @Override
    public List<Brand> findAll() {
        return null;
    }
}
