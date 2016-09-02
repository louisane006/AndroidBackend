package ComputerMaster.Service.impl;
import ComputerMaster.Service.ItemsService;
import ComputerMaster.domain.Items;
import ComputerMaster.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@Service
public class ItemsServiceImpl implements ItemsService{
    @Autowired
    ItemRepo repository;
    public List<Items> getCourses() {
        List<Items> allItems = new ArrayList<Items>();

        Iterable<Items> items = repository.findAll();
        for (Items item : items) {
            allItems.add(item);
        }
        return allItems;
    }
    @Override
    public Items findById(Long aLong) {
        return null;
    }
    @Override
    public Items save(Items entity) {
        return null;
    }
    @Override
    public Items update(Items entity) {
        return null;
    }
    @Override
    public void delete(Items entity) {}
    @Override
    public List<Items> findAll() {
        return null;
    }
}
