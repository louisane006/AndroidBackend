package ComputerMaster.model;
import ComputerMaster.domain.Designer;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
public class ShopResource extends ResourceSupport {
    private Long res_id;
    private String name;
    private String address;
    //private List<Employee> employee;

    private ShopResource() {
    }
    public Long getResid() {
        return res_id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
   // public List<Employee> getEmployee() {
       // return employee;
   // }

    public ShopResource(Builder builder) {
        this.address = builder.address;
        //this.employee = builder.employee;
        this.res_id = builder.resid;
        this.name = builder.name;
    }
    public static class Builder{
        private Long resid;
        private String name;
        private String address;
        private List<Designer> designer;

        public Builder(String name) {
            this.name = name;
        }

        public Builder() {

        }
        public Builder resid(Long value){
            this.resid = value;
            return this;
        }
        public Builder address(String value){
            this.address=value;
            return this;
        }
       /* public Builder employee(List<Employee> value){
            this.employee = value;
            return this;
        }*/
        public Builder copy(ShopResource value){
            this.address = value.address;
           // this.employee = value.employee;
            this.resid = value.res_id;
            this.name = value.name;
            return this;
        }
        public ShopResource build(){
            return new ShopResource(this);
        }
    }
}
