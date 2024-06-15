package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.Map;

public class ZDataBaseAddonItem implements Serializable {
    String value;
    Map<String, String> meta;

    /* 10 */
    public void setValue(String value) {
        this.value = value;
    }

    public void setMeta(Map<String, String> meta) {
        this.meta = meta;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZDataBaseAddonItem)) return false;
        ZDataBaseAddonItem other = (ZDataBaseAddonItem) o;
        if (!other.canEqual(this)) return false;
        Object this$value = getValue(), other$value = other.getValue();
        if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;
        Object this$meta = (Object) getMeta(), other$meta = (Object) other.getMeta();
        return !((this$meta == null) ? (other$meta != null) : !this$meta.equals(other$meta));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZDataBaseAddonItem;
    }

    public int hashCode() {
        int result = 1;
        Object $value = getValue();
        result = result * 59 + (($value == null) ? 43 : $value.hashCode());
        Object $meta = (Object) getMeta();
        return result * 59 + (($meta == null) ? 43 : $meta.hashCode());
    }

    public String toString() {
        return "ZDataBaseAddonItem(value=" + getValue() + ", meta=" + getMeta() + ")";
    }

    /* 12 */
    public String getValue() {
        return this.value;
    }

    public Map<String, String> getMeta() {
        /* 13 */
        return this.meta;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZDataBaseAddonItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */