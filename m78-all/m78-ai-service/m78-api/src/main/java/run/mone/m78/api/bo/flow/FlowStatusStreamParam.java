  package run.mone.m78.api.bo.flow;

  import java.io.Serializable;

  public class FlowStatusStreamParam
    implements Serializable {
    private String flowRecordId;
    private String token;

    public void setFlowRecordId(String flowRecordId) {
/* 11 */     this.flowRecordId = flowRecordId; } public void setToken(String token) { this.token = token; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FlowStatusStreamParam)) return false;  FlowStatusStreamParam other = (FlowStatusStreamParam)o; if (!other.canEqual(this)) return false;  Object this$flowRecordId = getFlowRecordId(), other$flowRecordId = other.getFlowRecordId(); if ((this$flowRecordId == null) ? (other$flowRecordId != null) : !this$flowRecordId.equals(other$flowRecordId)) return false;  Object this$token = getToken(), other$token = other.getToken(); return !((this$token == null) ? (other$token != null) : !this$token.equals(other$token)); } protected boolean canEqual(Object other) { return other instanceof FlowStatusStreamParam; } public int hashCode() {  int  result = 1; Object $flowRecordId = getFlowRecordId(); result = result * 59 + (($flowRecordId == null) ? 43 : $flowRecordId.hashCode()); Object $token = getToken(); return result * 59 + (($token == null) ? 43 : $token.hashCode()); } public String toString() { return "FlowStatusStreamParam(flowRecordId=" + getFlowRecordId() + ", token=" + getToken() + ")"; }

/* 13 */   public String getFlowRecordId() { return this.flowRecordId; } public String getToken() {
/* 14 */     return this.token;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowStatusStreamParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */