package ComputerMaster.api;

//import ComputerMaster.Service.ItemsService;
//import ComputerMaster.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.List;
/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
//@RestController
//@RequestMapping("/api/**")
/*public class ItemPage {
    @Autowired
    private ItemsService service;

    //-------------------Retrieving Items --------------------------------------------------------

    @RequestMapping(value = "/items/", method = RequestMethod.GET)
    public ResponseEntity<List<Items>> allItems() {
        List<Items> Items = service.findAll();
        if (Items.isEmpty()) {
            return new ResponseEntity<List<Items>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Items>>(Items, HttpStatus.OK);
    }

    //-------------------Retrieving an Item--------------------------------------------------------

    @RequestMapping(value = "/Items/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Items> getItem(@PathVariable("id") long id) {
        System.out.println("Fetching Item with id " + id);
        Items Item = service.findById(id);
        if (Item == null) {
            System.out.println("Item with id " + id + " is not found");
            return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Items>(Item, HttpStatus.OK);
    }
    //-------------------Creating an  Item--------------------------------------------------------

    @RequestMapping(value = "/item/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createItem(@RequestBody Items item, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating item " + item.getName());

//     USE THIS IF YOU WANT TO CHECK UNIQUE OBJECT
//      if (SubjectService.isSubjectExist(Subject)) {
//            System.out.println("A Subject with name " + Subject.getName() + " already exist");
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }
        service.save(item);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/item/{id}").buildAndExpand(item.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //------------------- Updating an Item --------------------------------------------------------

   /* @RequestMapping(value = "/item/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Items> updateItem(@PathVariable("id") long id, @RequestBody Items Item) {
        System.out.println("Updating Item " + id);
        Items oldItem = service.findById(id);
        if (oldItem == null) {
            System.out.println("Item with id " + id + " is not found");
            return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
        }
        Items newItem = new Items
                .Builder(oldItem.getCode())
                .copy(oldItem)
                .build();
        service.update(newItem);
        return new ResponseEntity<Items>(newItem, HttpStatus.OK);
    }*/

    //------------------- Deleting an Item  --------------------------------------------------------
    //
    /*@RequestMapping(value = "/item/delete/{id}", method = RequestMethod.DELETE)
   public ResponseEntity<Items> deleteItem(@PathVariable("id") long id) {
        System.out.println("Deleting Item with id  number " + id);

        Items item = service.findById(id);
        if (item == null) {
            System.out.println("Unable to delete. Subject with id " + id + " not found");
            return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
        }
        service.delete(item);
        return new ResponseEntity<Items>(HttpStatus.NO_CONTENT);
    }
}*/