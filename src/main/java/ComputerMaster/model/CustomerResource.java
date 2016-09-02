package ComputerMaster.model;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Malu.Mukendi on 2016-08-18.
 */
public class CustomerResource extends ResourceSupport {
    private Long resId;
    private String custNum;
    private String name;
    private String surname;

    public CustomerResource(Builder b) {
        this.resId = b.resId;
        this.name = b.name;
        this.surname = b.surname;
        this.custNum = b.custNum;
    }
    public static class Builder{
        Long resId;
        String name;
        String surname;
        String custNum;
        public Builder () {
        }
        public Builder custNum(String custNum) {
            this.custNum = custNum;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder identification(Long resId){
            this.resId = resId;
            return this;
        }
        public Builder copy(CustomerResource value){
            this.resId = value.resId;
            this.custNum= value.custNum;
            this.name=value.name;
            this.surname=value.surname;
            return  this;
        }
        public CustomerResource build(){
            return new CustomerResource(this);
        }
    }
    public String getCustNum() {
        return custNum;
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
}
