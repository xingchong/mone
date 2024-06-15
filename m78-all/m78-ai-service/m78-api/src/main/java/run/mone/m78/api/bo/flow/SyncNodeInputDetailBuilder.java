  package run.mone.m78.api.bo.flow;




































  public class SyncNodeInputDetailBuilder
  {
    private String name;
    private String value;
    private String valueType;
    private String operator;
    private String name2;
    private String value2;
    private String type2;

    public SyncNodeInputDetailBuilder name(String name) {
/* 49 */     this.name = name; return this; } public SyncNodeInputDetailBuilder value(String value) { this.value = value; return this; } public SyncNodeInputDetailBuilder valueType(String valueType) { this.valueType = valueType; return this; } public SyncNodeInputDetailBuilder operator(String operator) { this.operator = operator; return this; } public SyncNodeInputDetailBuilder name2(String name2) { this.name2 = name2; return this; } public SyncNodeInputDetailBuilder value2(String value2) { this.value2 = value2; return this; } public SyncNodeInputDetailBuilder type2(String type2) { this.type2 = type2; return this; } public SyncFlowStatus.SyncNodeInputDetail build() { return new SyncFlowStatus.SyncNodeInputDetail(this.name, this.value, this.valueType, this.operator, this.name2, this.value2, this.type2); } public String toString() { return "SyncFlowStatus.SyncNodeInputDetail.SyncNodeInputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ", operator=" + this.operator + ", name2=" + this.name2 + ", value2=" + this.value2 + ", type2=" + this.type2 + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncNodeInputDetail$SyncNodeInputDetailBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */