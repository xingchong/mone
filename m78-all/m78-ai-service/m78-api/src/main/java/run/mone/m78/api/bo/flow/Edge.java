  package run.mone.m78.api.bo.flow;

  import java.io.Serializable;

  public class Edge implements Serializable {
    private int sourceNodeId;
    private int targetNodeId;
    private String extraInfo;
    private String conditionFlag;

/* 11 */   public void setSourceNodeId(int sourceNodeId) { this.sourceNodeId = sourceNodeId; } public void setTargetNodeId(int targetNodeId) { this.targetNodeId = targetNodeId; } public void setExtraInfo(String extraInfo) { this.extraInfo = extraInfo; } public void setConditionFlag(String conditionFlag) { this.conditionFlag = conditionFlag; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof Edge)) return false;  Edge other = (Edge)o; if (!other.canEqual(this)) return false;  if (getSourceNodeId() != other.getSourceNodeId()) return false;  if (getTargetNodeId() != other.getTargetNodeId()) return false;  Object this$extraInfo = getExtraInfo(), other$extraInfo = other.getExtraInfo(); if ((this$extraInfo == null) ? (other$extraInfo != null) : !this$extraInfo.equals(other$extraInfo)) return false;  Object this$conditionFlag = getConditionFlag(), other$conditionFlag = other.getConditionFlag(); return !((this$conditionFlag == null) ? (other$conditionFlag != null) : !this$conditionFlag.equals(other$conditionFlag)); } protected boolean canEqual(Object other) { return other instanceof Edge; } public int hashCode() {  int  result = 1; result = result * 59 + getSourceNodeId(); result = result * 59 + getTargetNodeId(); Object $extraInfo = getExtraInfo(); result = result * 59 + (($extraInfo == null) ? 43 : $extraInfo.hashCode()); Object $conditionFlag = getConditionFlag(); return result * 59 + (($conditionFlag == null) ? 43 : $conditionFlag.hashCode()); } public String toString() { return "Edge(sourceNodeId=" + getSourceNodeId() + ", targetNodeId=" + getTargetNodeId() + ", extraInfo=" + getExtraInfo() + ", conditionFlag=" + getConditionFlag() + ")"; }
     public int getSourceNodeId() {
/* 13 */     return this.sourceNodeId;
    } public int getTargetNodeId() {
/* 15 */     return this.targetNodeId;
    }
    public String getExtraInfo() {
/* 18 */     return this.extraInfo;
    }
    public String getConditionFlag() {
/* 21 */     return this.conditionFlag;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/Edge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */