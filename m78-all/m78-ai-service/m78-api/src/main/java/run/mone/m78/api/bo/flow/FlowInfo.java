  package run.mone.m78.api.bo.flow;

  import java.io.Serializable;

  public class FlowInfo
    implements Serializable {
    private FlowBaseInfo flowBaseInfo;
    private FlowSettingInfo flowSettingInfo;

    public void setFlowBaseInfo(FlowBaseInfo flowBaseInfo) {
/* 11 */     this.flowBaseInfo = flowBaseInfo; } public void setFlowSettingInfo(FlowSettingInfo flowSettingInfo) { this.flowSettingInfo = flowSettingInfo; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FlowInfo)) return false;  FlowInfo other = (FlowInfo)o; if (!other.canEqual(this)) return false;  Object this$flowBaseInfo = getFlowBaseInfo(), other$flowBaseInfo = other.getFlowBaseInfo(); if ((this$flowBaseInfo == null) ? (other$flowBaseInfo != null) : !this$flowBaseInfo.equals(other$flowBaseInfo)) return false;  Object this$flowSettingInfo = getFlowSettingInfo(), other$flowSettingInfo = other.getFlowSettingInfo(); return !((this$flowSettingInfo == null) ? (other$flowSettingInfo != null) : !this$flowSettingInfo.equals(other$flowSettingInfo)); } protected boolean canEqual(Object other) { return other instanceof FlowInfo; } public int hashCode() {  int  result = 1; Object $flowBaseInfo = getFlowBaseInfo(); result = result * 59 + (($flowBaseInfo == null) ? 43 : $flowBaseInfo.hashCode()); Object $flowSettingInfo = getFlowSettingInfo(); return result * 59 + (($flowSettingInfo == null) ? 43 : $flowSettingInfo.hashCode()); } public String toString() { return "FlowInfo(flowBaseInfo=" + getFlowBaseInfo() + ", flowSettingInfo=" + getFlowSettingInfo() + ")"; }

/* 13 */   public FlowBaseInfo getFlowBaseInfo() { return this.flowBaseInfo; } public FlowSettingInfo getFlowSettingInfo() {
/* 14 */     return this.flowSettingInfo;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */