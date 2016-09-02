package ComputerMaster.model;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public class SectionResource extends ResourceSupport {

    private String sectionName;

    private SectionResource() {
    }
    public SectionResource(Builder builder) {
        this.sectionName = builder.sectionName;
    }
    public static class Builder{
        private String sectionName;

        public Builder sectionName(String value){
            this.sectionName = value;
            return this;
        }
        public Builder copy(SectionResource p){
            this.sectionName = p.sectionName;
            return this;
        }
        public SectionResource build(){
            return new SectionResource(this);
        }
    }
    public String getName() {
        return sectionName;
    }
}
