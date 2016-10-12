package ComputerMaster.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
@Entity
public class Designer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String address;
    public Designer(){}

    public Designer(Builder b){
        name = b.name;
        surname = b.surname;
        address = b.address;
        id = b.id;
        //shop = b.shop;
    }
    public static class Builder{
         Long id;
         String name;
         String surname;
         String address;
         //List<Shop> shop;
        public Builder() {
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder identification(Long id){
            this.id = id;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        /*public Builder shop(List<Shop> shop) {
            this.shop = shop;
            return this;
        }*/
        public Builder copy(Designer value) {
            this.id = value.id;
            this.name = value.name;
            this.surname = value.surname;
            this.address = value.address;
            //this.shop = value.shop;
            return  this;
        }
        public Designer build(){
            return new Designer(this);
        }
    }
    public Long getIdentification() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    //public List<Shop> getShop() {
        //return shop;
   // }
}
