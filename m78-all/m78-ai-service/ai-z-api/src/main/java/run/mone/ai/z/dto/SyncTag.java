package run.mone.ai.z.dto;

import java.io.Serializable;


public class SyncTag implements Serializable {
    private Long id;

    /*  7 */
    public void setId(Long id) {
        this.id = id;
    }

    private String name;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncTag)) return false;
        SyncTag other = (SyncTag) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$deleted = getDeleted(), other$deleted = other.getDeleted();
        if ((this$deleted == null) ? (other$deleted != null) : !this$deleted.equals(other$deleted)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$description = getDescription(), other$description = other.getDescription();
        return !((this$description == null) ? (other$description != null) : !this$description.equals(other$description));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncTag;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $deleted = getDeleted();
        result = result * 59 + (($deleted == null) ? 43 : $deleted.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $description = getDescription();
        return result * 59 + (($description == null) ? 43 : $description.hashCode());
    }

    public String toString() {
        return "SyncTag(id=" + getId() + ", name=" + getName() + ", description=" + getDescription() + ", deleted=" + getDeleted() + ")";
    }

    public Long getId() {
        /*  9 */
        return this.id;
    }

    public String getName() {
        /* 11 */
        return this.name;
    }


    public String getDescription() {
        /* 16 */
        return this.description;
    }


    /* 21 */   private Boolean deleted = Boolean.valueOf(false);

    public Boolean getDeleted() {
        return this.deleted;
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/SyncTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */