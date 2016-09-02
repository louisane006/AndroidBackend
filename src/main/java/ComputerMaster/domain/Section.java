package ComputerMaster.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-14.
 */
@Embeddable
public class Section implements Serializable {
    private String sectionName;

    public Section() {
    }
    public Section(String sectionName) {
    }
    public String getName() {
        return sectionName;
    }
    public Section(Builder builder) {
        this.sectionName = builder.sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public static class Builder{
        private String sectionName;

        public Builder(String sectionName) {
            this.sectionName = sectionName;
        }

        public Builder() {
        }
        public Builder sectionName(String value){
            this.sectionName = value;
            return this;
        }
        public Builder copy(Section value){
            this.sectionName = value.sectionName;
            return this;
        }
        public Section build(){
            return new Section(this);
        }
    }
}