  package run.mone.m78.api.bo.flow;

  import java.util.List;
































  public class SyncNodeInputBuilder
  {
    private int nodeId;
    private List<SyncFlowStatus.SyncNodeInputDetail> inputDetails;

    public SyncNodeInputBuilder nodeId(int nodeId) {
/* 42 */     this.nodeId = nodeId; return this; } public SyncNodeInputBuilder inputDetails(List<SyncFlowStatus.SyncNodeInputDetail> inputDetails) { this.inputDetails = inputDetails; return this; } public SyncFlowStatus.SyncNodeInput build() { return new SyncFlowStatus.SyncNodeInput(this.nodeId, this.inputDetails); } public String toString() { return "SyncFlowStatus.SyncNodeInput.SyncNodeInputBuilder(nodeId=" + this.nodeId + ", inputDetails=" + this.inputDetails + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncNodeInput$SyncNodeInputBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */