package ComputerMaster.Service.impl;
import ComputerMaster.Service.BrochureService;
import ComputerMaster.domain.Brochure;
import ComputerMaster.repository.BrochureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@Service
public class BrochureServiceImpl implements BrochureService {
    @Autowired
    BrochureRepo repository;
    public List<Brochure> getCourses() {
        List<Brochure> allItems = new ArrayList<Brochure>();

        Iterable<Brochure> items = repository.findAll();
        for (Brochure item : items) {
            allItems.add(item);
        }
        return allItems;
    }
    @Override
    public Brochure findById(Long aLong) {
        return null;
    }
    @Override
    public Brochure save(Brochure entity) {
        return null;
    }
    @Override
    public Brochure update(Brochure entity) {
        return null;
    }
    @Override
    public void delete(Brochure entity) {}
    @Override
    public List<Brochure> findAll() {
        return null;
    }
}
