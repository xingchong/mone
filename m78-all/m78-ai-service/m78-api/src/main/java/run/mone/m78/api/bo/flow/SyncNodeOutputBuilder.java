  package run.mone.m78.api.bo.flow;
  
  import java.util.List;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class SyncNodeOutputBuilder
  {
    private int nodeId;
    private String nodeName;
    private int status;
    private String errorInfo;
    private long durationTime;
    private List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails;
    
    public SyncNodeOutputBuilder nodeId(int nodeId) {
/* 62 */     this.nodeId = nodeId; return this; } public SyncNodeOutputBuilder nodeName(String nodeName) { this.nodeName = nodeName; return this; } public SyncNodeOutputBuilder status(int status) { this.status = status; return this; } public SyncNodeOutputBuilder errorInfo(String errorInfo) { this.errorInfo = errorInfo; return this; } public SyncNodeOutputBuilder durationTime(long durationTime) { this.durationTime = durationTime; return this; } public SyncNodeOutputBuilder outputDetails(List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails) { this.outputDetails = outputDetails; return this; } public SyncFlowStatus.SyncNodeOutput build() { return new SyncFlowStatus.SyncNodeOutput(this.nodeId, this.nodeName, this.status, this.errorInfo, this.durationTime, this.outputDetails); } public String toString() { return "SyncFlowStatus.SyncNodeOutput.SyncNodeOutputBuilder(nodeId=" + this.nodeId + ", nodeName=" + this.nodeName + ", status=" + this.status + ", errorInfo=" + this.errorInfo + ", durationTime=" + this.durationTime + ", outputDetails=" + this.outputDetails + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncNodeOutput$SyncNodeOutputBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */