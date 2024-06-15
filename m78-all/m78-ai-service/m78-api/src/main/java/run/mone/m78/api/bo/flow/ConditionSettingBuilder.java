package run.mone.m78.api.bo.flow;

public class ConditionSettingBuilder {
    private boolean originalInput;
    private int flowId;
    private String referenceName;
    private String name;
    private boolean type$set;
    private String type$value;
    private boolean valueType$set;
    private String valueType$value;

    /* 13 */
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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/ConditionSetting$ConditionSettingBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */