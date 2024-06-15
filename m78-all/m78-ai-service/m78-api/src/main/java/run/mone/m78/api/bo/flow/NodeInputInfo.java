package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;

public class NodeInputInfo implements Serializable {
    private String name;
    private String type;
    private List<String> referenceInfo;
    private int referenceNodeId;

    /* 12 */
    public void setName(String name) {
        this.name = name;
    }

    private String referenceName;
    private String value;
    private boolean required;
    private String valueType;

    public void setType(String type) {
        this.type = type;
    }

    public void setReferenceInfo(List<String> referenceInfo) {
        this.referenceInfo = referenceInfo;
    }

    public void setReferenceNodeId(int referenceNodeId) {
        this.referenceNodeId = referenceNodeId;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof NodeInputInfo)) return false;
        NodeInputInfo other = (NodeInputInfo) o;
        if (!other.canEqual(this)) return false;
        if (getReferenceNodeId() != other.getReferenceNodeId()) return false;
        if (isRequired() != other.isRequired()) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$referenceInfo = (Object) getReferenceInfo(), other$referenceInfo = (Object) other.getReferenceInfo();
        if ((this$referenceInfo == null) ? (other$referenceInfo != null) : !this$referenceInfo.equals(other$referenceInfo))
            return false;
        Object this$referenceName = getReferenceName(), other$referenceName = other.getReferenceName();
        if ((this$referenceName == null) ? (other$referenceName != null) : !this$referenceName.equals(other$referenceName))
            return false;
        Object this$value = getValue(), other$value = other.getValue();
        if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;
        Object this$valueType = getValueType(), other$valueType = other.getValueType();
        if ((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType))
            return false;
        Object this$desc = getDesc(), other$desc = other.getDesc();
        return !((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof NodeInputInfo;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getReferenceNodeId();
        result = result * 59 + (isRequired() ? 79 : 97);
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $referenceInfo = (Object) getReferenceInfo();
        result = result * 59 + (($referenceInfo == null) ? 43 : $referenceInfo.hashCode());
        Object $referenceName = getReferenceName();
        result = result * 59 + (($referenceName == null) ? 43 : $referenceName.hashCode());
        Object $value = getValue();
        result = result * 59 + (($value == null) ? 43 : $value.hashCode());
        Object $valueType = getValueType();
        result = result * 59 + (($valueType == null) ? 43 : $valueType.hashCode());
        Object $desc = getDesc();
        return result * 59 + (($desc == null) ? 43 : $desc.hashCode());
    }

    public String toString() {
        return "NodeInputInfo(name=" + getName() + ", type=" + getType() + ", referenceInfo=" + getReferenceInfo() + ", referenceNodeId=" + getReferenceNodeId() + ", referenceName=" + getReferenceName() + ", value=" + getValue() + ", required=" + isRequired() + ", valueType=" + getValueType() + ", desc=" + getDesc() + ")";
    }

    public String getName() {
        /* 15 */
        return this.name;
    }

    public String getType() {
        /* 18 */
        return this.type;
    }

    public List<String> getReferenceInfo() {
        /* 20 */
        return this.referenceInfo;
    }

    public int getReferenceNodeId() {
        /* 23 */
        return this.referenceNodeId;
    }

    public String getReferenceName() {
        /* 26 */
        return this.referenceName;
    }

    public String getValue() {
        /* 29 */
        return this.value;
    }

    public boolean isRequired() {
        /* 32 */
        return this.required;
    }

    public String getValueType() {
        /* 35 */
        return this.valueType;
    }

    /* 37 */   private String desc = "";

    public String getDesc() {
        return this.desc;
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/NodeInputInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */