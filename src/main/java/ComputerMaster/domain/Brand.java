package ComputerMaster.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
@Entity
public class Brand implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(unique = true)
    private String code;
    @Embedded
    Section section;

    public Brand() {
    }

    public Brand(Builder builder) {
        id = builder.id;
        name = builder.name;
        code = builder.code;
        section = builder.section;
    }
    public Long getId() {
        return id;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public Section getSection() {
        return section;
    }

    public static class Builder{

        private String name;
        private String code;
        private Long id;
        private Section section;
        public Builder() {

        }
        //public Builder(String code) {
            //this.code = code;
       // }

        public Builder section(Section value){
            this.section = value;
            return this;
        }
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder code(String code){
            this.code = code;
            return this;
        }
        public Builder copy(Brand i){
            this.name = i.name;
            this.code = i.code;
            this.id = i.id;
            this.section = i.section;
            return this;
        }
        public Brand build(){
            return new Brand(this);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Brand)) return false;
        Brand items = (Brand) o;

        return !(id != null ? !id.equals(items.id) : items.id != null);
    }
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                "code=" + code+
                ", name ='" + name + '\'' +
                '}';
    }
}
