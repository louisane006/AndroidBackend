package ComputerMaster.model;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Malu.Mukendi on 2016-08-18.
 */
public class DesignerResource extends ResourceSupport {
    private Long resId;
    private String name;
    private String surname;
    private String address;

    public DesignerResource(Builder b){
        this.resId = b.resId;
        this.name = b.name;
        this.surname = b.surname;
        this.address = b.address;
    }
    public static class Builder{
         Long resId;
         String name;
         String surname;
         String address;
        public Builder() {
        }
        public Builder name(String name){
            this.name = name;
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
        public Builder identification(Long resId){
            this.resId = resId;
            return this;

        }
        public Builder copy(DesignerResource value) {
            this.resId = value.resId;
            this.name = value.name;
            this.surname = value.surname;
            this.address = value.address;
            return  this;
        }
        public DesignerResource build(){
            return new DesignerResource(this);
        }
    }
    public Long getIdentification() {
        return resId;
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
}
