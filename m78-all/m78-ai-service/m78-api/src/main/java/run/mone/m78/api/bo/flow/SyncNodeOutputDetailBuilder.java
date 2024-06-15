  package run.mone.m78.api.bo.flow;

































































  public class SyncNodeOutputDetailBuilder
  {
    private String name;
    private String value;
    private String valueType;

    public SyncNodeOutputDetailBuilder name(String name) {
/* 74 */     this.name = name; return this; } public SyncNodeOutputDetailBuilder value(String value) { this.value = value; return this; } public SyncNodeOutputDetailBuilder valueType(String valueType) { this.valueType = valueType; return this; } public SyncFlowStatus.SyncNodeOutputDetail build() { return new SyncFlowStatus.SyncNodeOutputDetail(this.name, this.value, this.valueType); } public String toString() { return "SyncFlowStatus.SyncNodeOutputDetail.SyncNodeOutputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncNodeOutputDetail$SyncNodeOutputDetailBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */