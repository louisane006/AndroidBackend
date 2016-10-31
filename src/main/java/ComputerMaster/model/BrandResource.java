package ComputerMaster.model;

import ComputerMaster.domain.Section;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-08-15.
 */
public class BrandResource extends ResourceSupport {

    private Long resId;
    private String name;
    private String code;
    private List<Section> section;

    private BrandResource() {
    }
    public BrandResource(Builder builder) {
        resId = builder.resId;
        name = builder.name;
        code = builder.code;
        section = builder.section;
    }
    public Long getResId() {
        return resId;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public List<Section> getSection() {
        return section;
    }
    public static class Builder {

        private String name;
        private String code;
        private Long resId;
        private List<Section> section;

        public Builder(String code) {
            this.code = code;
        }

        public Builder section(List<Section> value) {
            this.section = value;
            return this;
        }
        public Builder resId(Long value) {
            this.resId = value;
            return this;
        }
        public Builder name(String value) {
            this.name = value;
            return this;
        }
        public Builder copy(BrandResource i) {
            this.name = i.name;
            this.code = i.code;
            this.resId = i.resId;
            this.section= i.section;
            return this;
        }
        public BrandResource build() {
            return new BrandResource(this);
        }
    }
}
