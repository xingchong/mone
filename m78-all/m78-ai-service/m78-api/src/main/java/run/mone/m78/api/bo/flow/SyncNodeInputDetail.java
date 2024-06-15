  package run.mone.m78.api.bo.flow;

  import java.io.Serializable;
































  public class SyncNodeInputDetail
    implements Serializable
  {
    private String name;
    private String value;
    private String valueType;
    private String operator;
    private String name2;
    private String value2;
    private String type2;

    public void setName(String name) {
/* 48 */     this.name = name; } public void setValue(String value) { this.value = value; } public void setValueType(String valueType) { this.valueType = valueType; } public void setOperator(String operator) { this.operator = operator; } public void setName2(String name2) { this.name2 = name2; } public void setValue2(String value2) { this.value2 = value2; } public void setType2(String type2) { this.type2 = type2; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof SyncNodeInputDetail)) return false;  SyncNodeInputDetail other = (SyncNodeInputDetail)o; if (!other.canEqual(this)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$value = getValue(), other$value = other.getValue(); if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;  Object this$valueType = getValueType(), other$valueType = other.getValueType(); if ((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType)) return false;  Object this$operator = getOperator(), other$operator = other.getOperator(); if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)) return false;  Object this$name2 = getName2(), other$name2 = other.getName2(); if ((this$name2 == null) ? (other$name2 != null) : !this$name2.equals(other$name2)) return false;  Object this$value2 = getValue2(), other$value2 = other.getValue2(); if ((this$value2 == null) ? (other$value2 != null) : !this$value2.equals(other$value2)) return false;  Object this$type2 = getType2(), other$type2 = other.getType2(); return !((this$type2 == null) ? (other$type2 != null) : !this$type2.equals(other$type2)); } protected boolean canEqual(Object other) { return other instanceof SyncNodeInputDetail; } public int hashCode() {  int  result = 1; Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $value = getValue(); result = result * 59 + (($value == null) ? 43 : $value.hashCode()); Object $valueType = getValueType(); result = result * 59 + (($valueType == null) ? 43 : $valueType.hashCode()); Object $operator = getOperator(); result = result * 59 + (($operator == null) ? 43 : $operator.hashCode()); Object $name2 = getName2(); result = result * 59 + (($name2 == null) ? 43 : $name2.hashCode()); Object $value2 = getValue2(); result = result * 59 + (($value2 == null) ? 43 : $value2.hashCode()); Object $type2 = getType2(); return result * 59 + (($type2 == null) ? 43 : $type2.hashCode()); } public String toString() { return "SyncFlowStatus.SyncNodeInputDetail(name=" + getName() + ", value=" + getValue() + ", valueType=" + getValueType() + ", operator=" + getOperator() + ", name2=" + getName2() + ", value2=" + getValue2() + ", type2=" + getType2() + ")"; }
/* 49 */   SyncNodeInputDetail(String name, String value, String valueType, String operator, String name2, String value2, String type2) { this.name = name; this.value = value; this.valueType = valueType; this.operator = operator; this.name2 = name2; this.value2 = value2; this.type2 = type2; } public static SyncNodeInputDetailBuilder builder() { return new SyncNodeInputDetailBuilder(); } public static class SyncNodeInputDetailBuilder { private String name; private String value; private String valueType; public SyncNodeInputDetailBuilder name(String name) { this.name = name; return this; } private String operator; private String name2; private String value2; private String type2; public SyncNodeInputDetailBuilder value(String value) { this.value = value; return this; } public SyncNodeInputDetailBuilder valueType(String valueType) { this.valueType = valueType; return this; } public SyncNodeInputDetailBuilder operator(String operator) { this.operator = operator; return this; } public SyncNodeInputDetailBuilder name2(String name2) { this.name2 = name2; return this; } public SyncNodeInputDetailBuilder value2(String value2) { this.value2 = value2; return this; } public SyncNodeInputDetailBuilder type2(String type2) { this.type2 = type2; return this; } public SyncFlowStatus.SyncNodeInputDetail build() { return new SyncFlowStatus.SyncNodeInputDetail(this.name, this.value, this.valueType, this.operator, this.name2, this.value2, this.type2); } public String toString() { return "SyncFlowStatus.SyncNodeInputDetail.SyncNodeInputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ", operator=" + this.operator + ", name2=" + this.name2 + ", value2=" + this.value2 + ", type2=" + this.type2 + ")"; }
       }
/* 51 */   public String getName() { return this.name; } public String getValue() {
/* 52 */     return this.value;
    }
/* 54 */   public String getValueType() { return this.valueType; }
/* 55 */   public String getOperator() { return this.operator; }
/* 56 */   public String getName2() { return this.name2; }
/* 57 */   public String getValue2() { return this.value2; } public String getType2() {
/* 58 */     return this.type2;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncNodeInputDetail.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */