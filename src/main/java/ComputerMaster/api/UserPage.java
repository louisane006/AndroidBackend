package ComputerMaster.api;

//import ComputerMaster.Service.UserService;
//import ComputerMaster.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
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
/*public class UserPage {
    @Autowired
    private UserService service;

    //-------------------Retrieving Items --------------------------------------------------------

    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> allItems() {
        List<User> Users = service.findAll();
        if (Users.isEmpty()) {
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(Users, HttpStatus.OK);
    }*/

    //-------------------Retrieving a User--------------------------------------------------------

 /*   @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        User User = service.findById(id);
        ////////
        if (User == null) {
            System.out.println("User with id " + id + " is not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(User, HttpStatus.OK);
        /////////
    }*/
    //-------------------Creating a User--------------------------------------------------------

 /*   @RequestMapping(value = "/User/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating user " + user.getUsername());
     if (service.isUserExist(user)) {
           System.out.println("A User with username " + user.getUsername()+ " already exist");
           return new ResponseEntity<Void>(HttpStatus.CONFLICT);
     }
        service.save(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/User/{id}").buildAndExpand(user.getIdentification()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //------------------- Updating a User--------------------------------------------------------

    @RequestMapping(value = "/User/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User User) {
        System.out.println("Updating User " + id);
        User oldUser = service.findById(id);
        if (oldUser == null) {
            System.out.println("User with id " + id + " is not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        User newUser = new User
                .Builder(oldUser.getUsername())
                .copy(oldUser)
                .build();
        service.update(newUser);
        return new ResponseEntity<User>(newUser, HttpStatus.OK);
    }*/

    //------------------- Deleting an Item  --------------------------------------------------------

 /*   @RequestMapping(value = "/User/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
        System.out.println("Deleting User with id  number " + id);

        User user = service.findById(id);
        if (user == null) {
            System.out.println("Unable to delete. Subject with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        service.delete(user);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
}*/