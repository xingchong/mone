package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;

public class NodeOutputInfo implements Serializable {
    private String name;
    private String subName;
    private String valueType;
    private String value;
    private String desc;

    /* 12 */
    public void setName(String name) {
        this.name = name;
    }

    private String type;
    private int referenceNodeId;
    private String referenceName;
    private String referenceSubName;
    private List<String> referenceInfo;
    private String schema;

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setReferenceNodeId(int referenceNodeId) {
        this.referenceNodeId = referenceNodeId;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public void setReferenceSubName(String referenceSubName) {
        this.referenceSubName = referenceSubName;
    }

    public void setReferenceInfo(List<String> referenceInfo) {
        this.referenceInfo = referenceInfo;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof NodeOutputInfo)) return false;
        NodeOutputInfo other = (NodeOutputInfo) o;
        if (!other.canEqual(this)) return false;
        if (getReferenceNodeId() != other.getReferenceNodeId()) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$subName = getSubName(), other$subName = other.getSubName();
        if ((this$subName == null) ? (other$subName != null) : !this$subName.equals(other$subName)) return false;
        Object this$valueType = getValueType(), other$valueType = other.getValueType();
        if ((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType))
            return false;
        Object this$value = getValue(), other$value = other.getValue();
        if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;
        Object this$desc = getDesc(), other$desc = other.getDesc();
        if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$referenceName = getReferenceName(), other$referenceName = other.getReferenceName();
        if ((this$referenceName == null) ? (other$referenceName != null) : !this$referenceName.equals(other$referenceName))
            return false;
        Object this$referenceSubName = getReferenceSubName(), other$referenceSubName = other.getReferenceSubName();
        if ((this$referenceSubName == null) ? (other$referenceSubName != null) : !this$referenceSubName.equals(other$referenceSubName))
            return false;
        Object this$referenceInfo = (Object) getReferenceInfo(), other$referenceInfo = (Object) other.getReferenceInfo();
        if ((this$referenceInfo == null) ? (other$referenceInfo != null) : !this$referenceInfo.equals(other$referenceInfo))
            return false;
        Object this$schema = getSchema(), other$schema = other.getSchema();
        return !((this$schema == null) ? (other$schema != null) : !this$schema.equals(other$schema));
    }

    protected boolean canEqual(Object other) {
        return other instanceof NodeOutputInfo;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getReferenceNodeId();
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $subName = getSubName();
        result = result * 59 + (($subName == null) ? 43 : $subName.hashCode());
        Object $valueType = getValueType();
        result = result * 59 + (($valueType == null) ? 43 : $valueType.hashCode());
        Object $value = getValue();
        result = result * 59 + (($value == null) ? 43 : $value.hashCode());
        Object $desc = getDesc();
        result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $referenceName = getReferenceName();
        result = result * 59 + (($referenceName == null) ? 43 : $referenceName.hashCode());
        Object $referenceSubName = getReferenceSubName();
        result = result * 59 + (($referenceSubName == null) ? 43 : $referenceSubName.hashCode());
        Object $referenceInfo = (Object) getReferenceInfo();
        result = result * 59 + (($referenceInfo == null) ? 43 : $referenceInfo.hashCode());
        Object $schema = getSchema();
        return result * 59 + (($schema == null) ? 43 : $schema.hashCode());
    }

    public String toString() {
        return "NodeOutputInfo(name=" + getName() + ", subName=" + getSubName() + ", valueType=" + getValueType() + ", value=" + getValue() + ", desc=" + getDesc() + ", type=" + getType() + ", referenceNodeId=" + getReferenceNodeId() + ", referenceName=" + getReferenceName() + ", referenceSubName=" + getReferenceSubName() + ", referenceInfo=" + getReferenceInfo() + ", schema=" + getSchema() + ")";
    }

    public String getName() {
        /* 15 */
        return this.name;
    }

    public String getSubName() {
        /* 17 */
        return this.subName;
    }

    public String getValueType() {
        /* 20 */
        return this.valueType;
    }

    public String getValue() {
        /* 22 */
        return this.value;
    }

    public String getDesc() {
        /* 24 */
        return this.desc;
    }

    public String getType() {
        /* 27 */
        return this.type;
    }

    public int getReferenceNodeId() {
        /* 30 */
        return this.referenceNodeId;
    }

    public String getReferenceName() {
        /* 33 */
        return this.referenceName;
    }

    public String getReferenceSubName() {
        /* 35 */
        return this.referenceSubName;
    }

    public List<String> getReferenceInfo() {
        /* 37 */
        return this.referenceInfo;
    }

    public String getSchema() {
        /* 39 */
        return this.schema;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/NodeOutputInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */