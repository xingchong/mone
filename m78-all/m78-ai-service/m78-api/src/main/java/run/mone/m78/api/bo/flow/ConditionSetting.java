package run.mone.m78.api.bo.flow;

import java.io.Serializable;

public class ConditionSetting implements Serializable {
    private boolean originalInput;
    private int flowId;
    private String referenceName;
    private String name;
    private String type;
    private String valueType;
    private String operator;
    private String value;
    private int flowId2;
    private String type2;
    private String referenceName2;
    private String value2;
    private String relationship;

    /* 12 */
    public void setOriginalInput(boolean originalInput) {
        this.originalInput = originalInput;
    }

    public void setFlowId(int flowId) {
        this.flowId = flowId;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setFlowId2(int flowId2) {
        this.flowId2 = flowId2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public void setReferenceName2(String referenceName2) {
        this.referenceName2 = referenceName2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ConditionSetting)) return false;
        ConditionSetting other = (ConditionSetting) o;
        if (!other.canEqual(this)) return false;
        if (isOriginalInput() != other.isOriginalInput()) return false;
        if (getFlowId() != other.getFlowId()) return false;
        if (getFlowId2() != other.getFlowId2()) return false;
        Object this$referenceName = getReferenceName(), other$referenceName = other.getReferenceName();
        if ((this$referenceName == null) ? (other$referenceName != null) : !this$referenceName.equals(other$referenceName))
            return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$valueType = getValueType(), other$valueType = other.getValueType();
        if ((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType))
            return false;
        Object this$operator = getOperator(), other$operator = other.getOperator();
        if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)) return false;
        Object this$value = getValue(), other$value = other.getValue();
        if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;
        Object this$type2 = getType2(), other$type2 = other.getType2();
        if ((this$type2 == null) ? (other$type2 != null) : !this$type2.equals(other$type2)) return false;
        Object this$referenceName2 = getReferenceName2(), other$referenceName2 = other.getReferenceName2();
        if ((this$referenceName2 == null) ? (other$referenceName2 != null) : !this$referenceName2.equals(other$referenceName2))
            return false;
        Object this$value2 = getValue2(), other$value2 = other.getValue2();
        if ((this$value2 == null) ? (other$value2 != null) : !this$value2.equals(other$value2)) return false;
        Object this$relationship = getRelationship(), other$relationship = other.getRelationship();
        return !((this$relationship == null) ? (other$relationship != null) : !this$relationship.equals(other$relationship));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConditionSetting;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + (isOriginalInput() ? 79 : 97);
        result = result * 59 + getFlowId();
        result = result * 59 + getFlowId2();
        Object $referenceName = getReferenceName();
        result = result * 59 + (($referenceName == null) ? 43 : $referenceName.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $valueType = getValueType();
        result = result * 59 + (($valueType == null) ? 43 : $valueType.hashCode());
        Object $operator = getOperator();
        result = result * 59 + (($operator == null) ? 43 : $operator.hashCode());
        Object $value = getValue();
        result = result * 59 + (($value == null) ? 43 : $value.hashCode());
        Object $type2 = getType2();
        result = result * 59 + (($type2 == null) ? 43 : $type2.hashCode());
        Object $referenceName2 = getReferenceName2();
        result = result * 59 + (($referenceName2 == null) ? 43 : $referenceName2.hashCode());
        Object $value2 = getValue2();
        result = result * 59 + (($value2 == null) ? 43 : $value2.hashCode());
        Object $relationship = getRelationship();
        return result * 59 + (($relationship == null) ? 43 : $relationship.hashCode());
    }

    public String toString() {
        return "ConditionSetting(originalInput=" + isOriginalInput() + ", flowId=" + getFlowId() + ", referenceName=" + getReferenceName() + ", name=" + getName() + ", type=" + getType() + ", valueType=" + getValueType() + ", operator=" + getOperator() + ", value=" + getValue() + ", flowId2=" + getFlowId2() + ", type2=" + getType2() + ", referenceName2=" + getReferenceName2() + ", value2=" + getValue2() + ", relationship=" + getRelationship() + ")";
    }

    /* 13 */
    public static String $default$type() {
        return "reference";
    }

    public static String $default$valueType() {
        return "string";
    }

    public static String $default$type2() {
        return "value";
    }

    ConditionSetting(boolean originalInput, int flowId, String referenceName, String name, String type, String valueType, String operator, String value, int flowId2, String type2, String referenceName2, String value2, String relationship) {
        this.originalInput = originalInput;
        this.flowId = flowId;
        this.referenceName = referenceName;
        this.name = name;
        this.type = type;
        this.valueType = valueType;
        this.operator = operator;
        this.value = value;
        this.flowId2 = flowId2;
        this.type2 = type2;
        this.referenceName2 = referenceName2;
        this.value2 = value2;
        this.relationship = relationship;
    }

    public static ConditionSettingBuilder builder() {
        return new ConditionSettingBuilder();
    }

    public static class ConditionSettingBuilder {
        private boolean originalInput;
        private int flowId;
        private String referenceName;
        private String name;
        private boolean type$set;
        private String type$value;
        private boolean valueType$set;
        private String valueType$value;

        public ConditionSettingBuilder originalInput(boolean originalInput) {
            this.originalInput = originalInput;
            return this;
        }

        private String operator;
        private String value;
        private int flowId2;
        private boolean type2$set;
        private String type2$value;
        private String referenceName2;
        private String value2;
        private String relationship;

        public ConditionSettingBuilder flowId(int flowId) {
            this.flowId = flowId;
            return this;
        }

        public ConditionSettingBuilder referenceName(String referenceName) {
            this.referenceName = referenceName;
            return this;
        }

        public ConditionSettingBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ConditionSettingBuilder type(String type) {
            this.type$value = type;
            this.type$set = true;
            return this;
        }

        public ConditionSettingBuilder valueType(String valueType) {
            this.valueType$value = valueType;
            this.valueType$set = true;
            return this;
        }

        public ConditionSettingBuilder operator(String operator) {
            this.operator = operator;
            return this;
        }

        public ConditionSettingBuilder value(String value) {
            this.value = value;
            return this;
        }

        public ConditionSettingBuilder flowId2(int flowId2) {
            this.flowId2 = flowId2;
            return this;
        }

        public ConditionSettingBuilder type2(String type2) {
            this.type2$value = type2;
            this.type2$set = true;
            return this;
        }

        public ConditionSettingBuilder referenceName2(String referenceName2) {
            this.referenceName2 = referenceName2;
            return this;
        }

        public ConditionSettingBuilder value2(String value2) {
            this.value2 = value2;
            return this;
        }

        public ConditionSettingBuilder relationship(String relationship) {
            this.relationship = relationship;
            return this;
        }

        public ConditionSetting build() {
            String type$value = this.type$value;
            if (!this.type$set) type$value = ConditionSetting.$default$type();
            String valueType$value = this.valueType$value;
            if (!this.valueType$set) valueType$value = ConditionSetting.$default$valueType();
            String type2$value = this.type2$value;
            if (!this.type2$set) type2$value = ConditionSetting.$default$type2();
            return new ConditionSetting(this.originalInput, this.flowId, this.referenceName, this.name, type$value, valueType$value, this.operator, this.value, this.flowId2, type2$value, this.referenceName2, this.value2, this.relationship);
        }

        public String toString() {
            return "ConditionSetting.ConditionSettingBuilder(originalInput=" + this.originalInput + ", flowId=" + this.flowId + ", referenceName=" + this.referenceName + ", name=" + this.name + ", type$value=" + this.type$value + ", valueType$value=" + this.valueType$value + ", operator=" + this.operator + ", value=" + this.value + ", flowId2=" + this.flowId2 + ", type2$value=" + this.type2$value + ", referenceName2=" + this.referenceName2 + ", value2=" + this.value2 + ", relationship=" + this.relationship + ")";
        }
    }

    public boolean isOriginalInput() {
        /* 16 */
        return this.originalInput;
    }

    public int getFlowId() {
        /* 18 */
        return this.flowId;
    }

    public String getReferenceName() {
        /* 20 */
        return this.referenceName;
    }

    public String getName() {
        /* 22 */
        return this.name;
    }

    public String getType() {
        /* 26 */
        return this.type;
    }

    public String getValueType() {
        /* 29 */
        return this.valueType;
    }

    public String getOperator() {
        /* 32 */
        return this.operator;
    }

    public String getValue() {
        /* 34 */
        return this.value;
    }

    public int getFlowId2() {
        /* 36 */
        return this.flowId2;
    }

    public String getType2() {
        /* 39 */
        return this.type2;
    }

    public String getReferenceName2() {
        /* 41 */
        return this.referenceName2;
    }

    public String getValue2() {
        /* 43 */
        return this.value2;
    }

    public String getRelationship() {
        /* 46 */
        return this.relationship;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/ConditionSetting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */