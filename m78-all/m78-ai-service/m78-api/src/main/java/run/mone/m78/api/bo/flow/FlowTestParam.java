package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.Map;

public class FlowTestParam implements Serializable {
    private Integer flowId;
    private Map<String, Object> inputs;
    private String userName;
    private int executeType;
    private NodeInfo nodeInfo;

    /* 12 */
    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setExecuteType(int executeType) {
        this.executeType = executeType;
    }

    public void setNodeInfo(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlowTestParam)) return false;
        FlowTestParam other = (FlowTestParam) o;
        if (!other.canEqual(this)) return false;
        if (getExecuteType() != other.getExecuteType()) return false;
        Object this$flowId = getFlowId(), other$flowId = other.getFlowId();
        if ((this$flowId == null) ? (other$flowId != null) : !this$flowId.equals(other$flowId)) return false;
        Object this$inputs = (Object) getInputs(), other$inputs = (Object) other.getInputs();
        if ((this$inputs == null) ? (other$inputs != null) : !this$inputs.equals(other$inputs)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$nodeInfo = getNodeInfo(), other$nodeInfo = other.getNodeInfo();
        return !((this$nodeInfo == null) ? (other$nodeInfo != null) : !this$nodeInfo.equals(other$nodeInfo));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlowTestParam;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getExecuteType();
        Object $flowId = getFlowId();
        result = result * 59 + (($flowId == null) ? 43 : $flowId.hashCode());
        Object $inputs = (Object) getInputs();
        result = result * 59 + (($inputs == null) ? 43 : $inputs.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $nodeInfo = getNodeInfo();
        return result * 59 + (($nodeInfo == null) ? 43 : $nodeInfo.hashCode());
    }

    public String toString() {
        return "FlowTestParam(flowId=" + getFlowId() + ", inputs=" + getInputs() + ", userName=" + getUserName() + ", executeType=" + getExecuteType() + ", nodeInfo=" + getNodeInfo() + ")";
    }

    public Integer getFlowId() {
        /* 14 */
        return this.flowId;
    }

    public Map<String, Object> getInputs() {
        /* 16 */
        return this.inputs;
    }

    public String getUserName() {
        /* 18 */
        return this.userName;
    }

    public int getExecuteType() {
        /* 20 */
        return this.executeType;
    }

    public NodeInfo getNodeInfo() {
        /* 22 */
        return this.nodeInfo;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowTestParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */