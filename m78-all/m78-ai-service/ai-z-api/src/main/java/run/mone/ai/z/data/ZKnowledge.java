package run.mone.ai.z.data;

import java.io.Serializable;
import java.util.Arrays;

public class ZKnowledge implements Serializable {
    private String dataStr;
    private int type;
    private byte[] embedding;
    private String information;

    /*  7 */
    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    private byte[] dataBytes;
    private byte[] metadata;
    private String name;
    private int mode;

    public void setType(int type) {
        this.type = type;
    }

    public void setEmbedding(byte[] embedding) {
        this.embedding = embedding;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setDataBytes(byte[] dataBytes) {
        this.dataBytes = dataBytes;
    }

    public void setMetadata(byte[] metadata) {
        this.metadata = metadata;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZKnowledge)) return false;
        ZKnowledge other = (ZKnowledge) o;
        if (!other.canEqual(this)) return false;
        if (getType() != other.getType()) return false;
        if (getMode() != other.getMode()) return false;
        Object this$dataStr = getDataStr(), other$dataStr = other.getDataStr();
        if ((this$dataStr == null) ? (other$dataStr != null) : !this$dataStr.equals(other$dataStr)) return false;
        if (!Arrays.equals(getEmbedding(), other.getEmbedding())) return false;
        Object this$information = getInformation(), other$information = other.getInformation();
        if ((this$information == null) ? (other$information != null) : !this$information.equals(other$information))
            return false;
        if (!Arrays.equals(getDataBytes(), other.getDataBytes())) return false;
        if (!Arrays.equals(getMetadata(), other.getMetadata())) return false;
        Object this$name = getName(), other$name = other.getName();
        return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZKnowledge;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getType();
        result = result * 59 + getMode();
        Object $dataStr = getDataStr();
        result = result * 59 + (($dataStr == null) ? 43 : $dataStr.hashCode());
        result = result * 59 + Arrays.hashCode(getEmbedding());
        Object $information = getInformation();
        result = result * 59 + (($information == null) ? 43 : $information.hashCode());
        result = result * 59 + Arrays.hashCode(getDataBytes());
        result = result * 59 + Arrays.hashCode(getMetadata());
        Object $name = getName();
        return result * 59 + (($name == null) ? 43 : $name.hashCode());
    }

    public String toString() {
        return "ZKnowledge(dataStr=" + getDataStr() + ", type=" + getType() + ", embedding=" + Arrays.toString(getEmbedding()) + ", information=" + getInformation() + ", dataBytes=" + Arrays.toString(getDataBytes()) + ", metadata=" + Arrays.toString(getMetadata()) + ", name=" + getName() + ", mode=" + getMode() + ")";
    }

    public String getDataStr() {
        /*  9 */
        return this.dataStr;
    }

    public int getType() {
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

    public byte[] getDataBytes() {
        /* 17 */
        return this.dataBytes;
    }

    public byte[] getMetadata() {
        /* 19 */
        return this.metadata;
    }

    public String getName() {
        /* 21 */
        return this.name;
    }

    public int getMode() {
        /* 23 */
        return this.mode;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/data/ZKnowledge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */