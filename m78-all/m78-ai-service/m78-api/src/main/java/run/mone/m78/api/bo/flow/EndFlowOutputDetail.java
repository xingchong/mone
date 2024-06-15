  package run.mone.m78.api.bo.flow;
















































































  public class EndFlowOutputDetail
  {
    private String name;
    private String value;
    private String valueType;

    public void setName(String name) {
/* 89 */     this.name = name; } public void setValue(String value) { this.value = value; } public void setValueType(String valueType) { this.valueType = valueType; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof EndFlowOutputDetail)) return false;  EndFlowOutputDetail other = (EndFlowOutputDetail)o; if (!other.canEqual(this)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$value = getValue(), other$value = other.getValue(); if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;  Object this$valueType = getValueType(), other$valueType = other.getValueType(); return !((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType)); } protected boolean canEqual(Object other) { return other instanceof EndFlowOutputDetail; } public int hashCode() {  int  result = 1; Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $value = getValue(); result = result * 59 + (($value == null) ? 43 : $value.hashCode()); Object $valueType = getValueType(); return result * 59 + (($valueType == null) ? 43 : $valueType.hashCode()); } public String toString() { return "SyncFlowStatus.EndFlowOutputDetail(name=" + getName() + ", value=" + getValue() + ", valueType=" + getValueType() + ")"; }
/* 90 */   public static EndFlowOutputDetailBuilder builder() { return new EndFlowOutputDetailBuilder(); } public static class EndFlowOutputDetailBuilder { private String name; public EndFlowOutputDetailBuilder name(String name) { this.name = name; return this; } private String value; private String valueType; public EndFlowOutputDetailBuilder value(String value) { this.value = value; return this; } public EndFlowOutputDetailBuilder valueType(String valueType) { this.valueType = valueType; return this; } public SyncFlowStatus.EndFlowOutputDetail build() { return new SyncFlowStatus.EndFlowOutputDetail(this.name, this.value, this.valueType); } public String toString() { return "SyncFlowStatus.EndFlowOutputDetail.EndFlowOutputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ")"; }
       } public EndFlowOutputDetail() {} public EndFlowOutputDetail(String name, String value, String valueType) {
/* 92 */     this.name = name; this.value = value; this.valueType = valueType;
    }
/* 94 */   public String getName() { return this.name; } public String getValue() {
/* 95 */     return this.value;
    } public String getValueType() {
/* 97 */     return this.valueType;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$EndFlowOutputDetail.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */