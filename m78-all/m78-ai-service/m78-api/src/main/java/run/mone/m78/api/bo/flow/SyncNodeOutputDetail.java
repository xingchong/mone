  package run.mone.m78.api.bo.flow;
  
  import java.io.Serializable;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class SyncNodeOutputDetail
    implements Serializable
  {
    private String name;
    private String value;
    private String valueType;
    
    public void setName(String name) {
/* 73 */     this.name = name; } public void setValue(String value) { this.value = value; } public void setValueType(String valueType) { this.valueType = valueType; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof SyncNodeOutputDetail)) return false;  SyncNodeOutputDetail other = (SyncNodeOutputDetail)o; if (!other.canEqual(this)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$value = getValue(), other$value = other.getValue(); if ((this$value == null) ? (other$value != null) : !this$value.equals(other$value)) return false;  Object this$valueType = getValueType(), other$valueType = other.getValueType(); return !((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType)); } protected boolean canEqual(Object other) { return other instanceof SyncNodeOutputDetail; } public int hashCode() {  int  result = 1; Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $value = getValue(); result = result * 59 + (($value == null) ? 43 : $value.hashCode()); Object $valueType = getValueType(); return result * 59 + (($valueType == null) ? 43 : $valueType.hashCode()); } public String toString() { return "SyncFlowStatus.SyncNodeOutputDetail(name=" + getName() + ", value=" + getValue() + ", valueType=" + getValueType() + ")"; }
/* 74 */   SyncNodeOutputDetail(String name, String value, String valueType) { this.name = name; this.value = value; this.valueType = valueType; } public static SyncNodeOutputDetailBuilder builder() { return new SyncNodeOutputDetailBuilder(); } public static class SyncNodeOutputDetailBuilder { private String name; public SyncNodeOutputDetailBuilder name(String name) { this.name = name; return this; } private String value; private String valueType; public SyncNodeOutputDetailBuilder value(String value) { this.value = value; return this; } public SyncNodeOutputDetailBuilder valueType(String valueType) { this.valueType = valueType; return this; } public SyncFlowStatus.SyncNodeOutputDetail build() { return new SyncFlowStatus.SyncNodeOutputDetail(this.name, this.value, this.valueType); } public String toString() { return "SyncFlowStatus.SyncNodeOutputDetail.SyncNodeOutputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ")"; }
       }
/* 76 */   public String getName() { return this.name; } public String getValue() {
/* 77 */     return this.value;
    } public String getValueType() {
/* 79 */     return this.valueType;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncNodeOutputDetail.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */