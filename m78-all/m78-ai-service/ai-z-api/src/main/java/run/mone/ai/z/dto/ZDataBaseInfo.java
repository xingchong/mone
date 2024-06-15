package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.Arrays;

public class ZDataBaseInfo implements Serializable {
    private Long id;
    private Integer type;
    private byte[] embedding;
    private String information;

    /*  7 */
    public void setId(Long id) {
        this.id = id;
    }

    private byte[] data;
    private byte[] metadata;
    private String name;
    private Integer mode;

    public void setType(Integer type) {
        this.type = type;
    }

    public void setEmbedding(byte[] embedding) {
        this.embedding = embedding;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setMetadata(byte[] metadata) {
        this.metadata = metadata;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZDataBaseInfo)) return false;
        ZDataBaseInfo other = (ZDataBaseInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$mode = getMode(), other$mode = other.getMode();
        if ((this$mode == null) ? (other$mode != null) : !this$mode.equals(other$mode)) return false;
        if (!Arrays.equals(getEmbedding(), other.getEmbedding())) return false;
        Object this$information = getInformation(), other$information = other.getInformation();
        if ((this$information == null) ? (other$information != null) : !this$information.equals(other$information))
            return false;
        if (!Arrays.equals(getData(), other.getData())) return false;
        if (!Arrays.equals(getMetadata(), other.getMetadata())) return false;
        Object this$name = getName(), other$name = other.getName();
        return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZDataBaseInfo;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $mode = getMode();
        result = result * 59 + (($mode == null) ? 43 : $mode.hashCode());
        result = result * 59 + Arrays.hashCode(getEmbedding());
        Object $information = getInformation();
        result = result * 59 + (($information == null) ? 43 : $information.hashCode());
        result = result * 59 + Arrays.hashCode(getData());
        result = result * 59 + Arrays.hashCode(getMetadata());
        Object $name = getName();
        return result * 59 + (($name == null) ? 43 : $name.hashCode());
    }

    public String toString() {
        return "ZDataBaseInfo(id=" + getId() + ", type=" + getType() + ", embedding=" + Arrays.toString(getEmbedding()) + ", information=" + getInformation() + ", data=" + Arrays.toString(getData()) + ", metadata=" + Arrays.toString(getMetadata()) + ", name=" + getName() + ", mode=" + getMode() + ")";
    }

    public Long getId() {
        /*  9 */
        return this.id;
    }

    public Integer getType() {
        /* 11 */
        return this.type;
    }

    public byte[] getEmbedding() {
        /* 13 */
        return this.embedding;
    }

    public String getInformation() {
        /* 15 */
        return this.information;
    }

    public byte[] getData() {
        /* 17 */
        return this.data;
    }

    public byte[] getMetadata() {
        /* 19 */
        return this.metadata;
    }

    public String getName() {
        /* 21 */
        return this.name;
    }

    public Integer getMode() {
        /* 23 */
        return this.mode;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZDataBaseInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */