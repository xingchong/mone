package run.mone.ai.z.dto;


import java.io.Serializable;

public class ZDataTypes implements Serializable {
    private String name;

    /*  7 */
    public void setName(String name) {
        this.name = name;
    }

    private long id;
    private String description;

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZDataTypes)) return false;
        ZDataTypes other = (ZDataTypes) o;
        if (!other.canEqual(this)) return false;
        if (getId() != other.getId()) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$description = getDescription(), other$description = other.getDescription();
        return !((this$description == null) ? (other$description != null) : !this$description.equals(other$description));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZDataTypes;
    }

    public int hashCode() {
                 int result = 1;
        long $id = getId();
        result = result * 59 + (int) ($id >>> 32L ^ $id);
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $description = getDescription();
        return result * 59 + (($description == null) ? 43 : $description.hashCode());
    }

    public String toString() {
        return "ZDataTypes(name=" + getName() + ", id=" + getId() + ", description=" + getDescription() + ")";
    }

    /*  9 */
    public String getName() {
        return this.name;
    }

    /* 10 */
    public long getId() {
        return this.id;
    }

    public String getDescription() {
        /* 11 */
        return this.description;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZDataTypes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */