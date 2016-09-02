package ComputerMaster.Service.impl;

import ComputerMaster.Service.ShopService;
import ComputerMaster.domain.Employee;
import ComputerMaster.domain.Shop;
import ComputerMaster.repository.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopRepo repository;
    @Override
    public Shop findById(Long aLong) {
        return null;
    }
    @Override
    public Shop save(Shop entity) {
        return null;
    }
    @Override
    public Shop update(Shop entity) {
        return null;
    }
    @Override
    public void delete(Shop entity) {
    }
    @Override
    public List<Shop> findAll() {
        return null;
    }
    @Override
    public List<Shop> getAllShops() {
        List<Shop> shop = new ArrayList<>();
        Iterable<Shop> values = repository.findAll();
        for (Shop value : values) {
            shop.add(value);
        }
        return shop;
    }
   // @Override
    //public List<Employee> getEmployees(Long id) {
        //return repository.findOne(id).getEmployees();
   // }
}
