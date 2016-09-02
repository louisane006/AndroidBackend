package ComputerMaster.model;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public class UserResource extends ResourceSupport {
    private Long resId;
    private String username;
    private String email;
    private  String password;

    private UserResource(Builder b){
        resId = b.resId;
        username = b.username;
        password = b.password;
        email = b.email;
    }
    public static class Builder{
        private Long resId;
        private String username;
        private String password;
        private String email;

        public Builder resId(Long resId) {
            this.resId = resId;
            return this;
        }
        public Builder(String username){
            this.username = username;
        }
        public Builder password(String password){
            this.password= password;
            return this;
        }
        public Builder email(String email){
            this.email= email;
            return this;
        }
        public Builder() {
        }
        public Builder copy(UserResource user) {
            resId = user.getIdentification();
            password= user.getPassword();
            email = user.getEmail();
            return this;
        }

        public UserResource build(){
            return new UserResource(this);
        }
    }
    public Long getIdentification() {return resId;}
    public String getUsername(){ return username;}
    public String getPassword(){ return password; }
    public String getEmail() {return email;}
}
