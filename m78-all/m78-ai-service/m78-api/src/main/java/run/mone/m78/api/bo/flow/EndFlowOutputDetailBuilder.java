  package run.mone.m78.api.bo.flow;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class EndFlowOutputDetailBuilder
  {
    private String name;
    private String value;
    private String valueType;
    
    public EndFlowOutputDetailBuilder name(String name) {
/* 90 */     this.name = name; return this; } public EndFlowOutputDetailBuilder value(String value) { this.value = value; return this; } public EndFlowOutputDetailBuilder valueType(String valueType) { this.valueType = valueType; return this; } public SyncFlowStatus.EndFlowOutputDetail build() { return new SyncFlowStatus.EndFlowOutputDetail(this.name, this.value, this.valueType); } public String toString() { return "SyncFlowStatus.EndFlowOutputDetail.EndFlowOutputDetailBuilder(name=" + this.name + ", value=" + this.value + ", valueType=" + this.valueType + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$EndFlowOutputDetail$EndFlowOutputDetailBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */