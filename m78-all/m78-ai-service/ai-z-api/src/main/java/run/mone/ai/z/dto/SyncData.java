package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.Arrays;

public class SyncData implements Serializable {
    private Long id;
    private String information;
    private Integer type;
    private String name;
    private Integer structure;

    /*  7 */
    public void setId(Long id) {
        this.id = id;
    }

    private String designer;
    private byte[] data;
    private byte[] metadata;
    private String description;
    private String addon;

    public void setInformation(String information) {
        this.information = information;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStructure(Integer structure) {
        this.structure = structure;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setMetadata(byte[] metadata) {
        this.metadata = metadata;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncData)) return false;
        SyncData other = (SyncData) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$structure = getStructure(), other$structure = other.getStructure();
        if ((this$structure == null) ? (other$structure != null) : !this$structure.equals(other$structure))
            return false;
        Object this$information = getInformation(), other$information = other.getInformation();
        if ((this$information == null) ? (other$information != null) : !this$information.equals(other$information))
            return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$designer = getDesigner(), other$designer = other.getDesigner();
        if ((this$designer == null) ? (other$designer != null) : !this$designer.equals(other$designer)) return false;
        if (!Arrays.equals(getData(), other.getData())) return false;
        if (!Arrays.equals(getMetadata(), other.getMetadata())) return false;
        Object this$description = getDescription(), other$description = other.getDescription();
        if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
            return false;
        Object this$addon = getAddon(), other$addon = other.getAddon();
        return !((this$addon == null) ? (other$addon != null) : !this$addon.equals(other$addon));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncData;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $structure = getStructure();
        result = result * 59 + (($structure == null) ? 43 : $structure.hashCode());
        Object $information = getInformation();
        result = result * 59 + (($information == null) ? 43 : $information.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $designer = getDesigner();
        result = result * 59 + (($designer == null) ? 43 : $designer.hashCode());
        result = result * 59 + Arrays.hashCode(getData());
        result = result * 59 + Arrays.hashCode(getMetadata());
        Object $description = getDescription();
        result = result * 59 + (($description == null) ? 43 : $description.hashCode());
        Object $addon = getAddon();
        return result * 59 + (($addon == null) ? 43 : $addon.hashCode());
    }

    public String toString() {
        return "SyncData(id=" + getId() + ", information=" + getInformation() + ", type=" + getType() + ", name=" + getName() + ", structure=" + getStructure() + ", designer=" + getDesigner() + ", data=" + Arrays.toString(getData()) + ", metadata=" + Arrays.toString(getMetadata()) + ", description=" + getDescription() + ", addon=" + getAddon() + ")";
    }

    /*  9 */
    public Long getId() {
        return this.id;
    }

    public String getInformation() {
        /* 10 */
        return this.information;
    }

    public Integer getType() {
        /* 12 */
        return this.type;
    }

    public String getName() {
        /* 14 */
        return this.name;
    }

    public Integer getStructure() {
        /* 16 */
        return this.structure;
    }

    public String getDesigner() {
        /* 18 */
        return this.designer;
    }

    public byte[] getData() {
        /* 22 */
        return this.data;
    }

    public byte[] getMetadata() {
        /* 24 */
        return this.metadata;
    }

    public String getDescription() {
        /* 28 */
        return this.description;
    }

    public String getAddon() {
        /* 30 */
        return this.addon;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/SyncData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */