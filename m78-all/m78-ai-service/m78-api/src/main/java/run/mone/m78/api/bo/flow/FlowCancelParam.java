  package run.mone.m78.api.bo.flow;
  
  import java.io.Serializable;
  
  public class FlowCancelParam implements Serializable {
    private Integer flowId;
    private Integer flowRecordId;
    private String userName;
    
    public void setFlowId(Integer flowId) {
/* 11 */     this.flowId = flowId; } public void setFlowRecordId(Integer flowRecordId) { this.flowRecordId = flowRecordId; } public void setUserName(String userName) { this.userName = userName; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FlowCancelParam)) return false;  FlowCancelParam other = (FlowCancelParam)o; if (!other.canEqual(this)) return false;  Object this$flowId = getFlowId(), other$flowId = other.getFlowId(); if ((this$flowId == null) ? (other$flowId != null) : !this$flowId.equals(other$flowId)) return false;  Object this$flowRecordId = getFlowRecordId(), other$flowRecordId = other.getFlowRecordId(); if ((this$flowRecordId == null) ? (other$flowRecordId != null) : !this$flowRecordId.equals(other$flowRecordId)) return false;  Object this$userName = getUserName(), other$userName = other.getUserName(); return !((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)); } protected boolean canEqual(Object other) { return other instanceof FlowCancelParam; } public int hashCode() {  int  result = 1; Object $flowId = getFlowId(); result = result * 59 + (($flowId == null) ? 43 : $flowId.hashCode()); Object $flowRecordId = getFlowRecordId(); result = result * 59 + (($flowRecordId == null) ? 43 : $flowRecordId.hashCode()); Object $userName = getUserName(); return result * 59 + (($userName == null) ? 43 : $userName.hashCode()); } public String toString() { return "FlowCancelParam(flowId=" + getFlowId() + ", flowRecordId=" + getFlowRecordId() + ", userName=" + getUserName() + ")"; }
     public Integer getFlowId() {
/* 13 */     return this.flowId;
    } public Integer getFlowRecordId() {
/* 15 */     return this.flowRecordId;
    } public String getUserName() {
/* 17 */     return this.userName;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowCancelParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */