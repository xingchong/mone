package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;

public class SyncFlowNodeStatus implements Serializable {
    private long timestamp;
    private String flowRecordId;
    private int nodeId;
    private List<SyncFlowStatus.SyncNodeInputDetail> nodeInput;
    private List<SyncFlowStatus.SyncNodeOutputDetail> nodeOutput;
    private int status;
    private String errorInfo;
    private long durationTime;

    /* 13 */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setFlowRecordId(String flowRecordId) {
        this.flowRecordId = flowRecordId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public void setNodeInput(List<SyncFlowStatus.SyncNodeInputDetail> nodeInput) {
        this.nodeInput = nodeInput;
    }

    public void setNodeOutput(List<SyncFlowStatus.SyncNodeOutputDetail> nodeOutput) {
        this.nodeOutput = nodeOutput;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public void setDurationTime(long durationTime) {
        this.durationTime = durationTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncFlowNodeStatus)) return false;
        SyncFlowNodeStatus other = (SyncFlowNodeStatus) o;
        if (!other.canEqual(this)) return false;
        if (getTimestamp() != other.getTimestamp()) return false;
        if (getNodeId() != other.getNodeId()) return false;
        if (getStatus() != other.getStatus()) return false;
        if (getDurationTime() != other.getDurationTime()) return false;
        Object this$flowRecordId = getFlowRecordId(), other$flowRecordId = other.getFlowRecordId();
        if ((this$flowRecordId == null) ? (other$flowRecordId != null) : !this$flowRecordId.equals(other$flowRecordId))
            return false;
        Object this$nodeInput = (Object) getNodeInput(), other$nodeInput = (Object) other.getNodeInput();
        if ((this$nodeInput == null) ? (other$nodeInput != null) : !this$nodeInput.equals(other$nodeInput))
            return false;
        Object this$nodeOutput = (Object) getNodeOutput(), other$nodeOutput = (Object) other.getNodeOutput();
        if ((this$nodeOutput == null) ? (other$nodeOutput != null) : !this$nodeOutput.equals(other$nodeOutput))
            return false;
        Object this$errorInfo = getErrorInfo(), other$errorInfo = other.getErrorInfo();
        return !((this$errorInfo == null) ? (other$errorInfo != null) : !this$errorInfo.equals(other$errorInfo));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncFlowNodeStatus;
    }

    public int hashCode() {
        int result = 1;
        long $timestamp = getTimestamp();
        result = result * 59 + (int) ($timestamp >>> 32L ^ $timestamp);
        result = result * 59 + getNodeId();
        result = result * 59 + getStatus();
        long $durationTime = getDurationTime();
        result = result * 59 + (int) ($durationTime >>> 32L ^ $durationTime);
        Object $flowRecordId = getFlowRecordId();
        result = result * 59 + (($flowRecordId == null) ? 43 : $flowRecordId.hashCode());
        Object $nodeInput = (Object) getNodeInput();
        result = result * 59 + (($nodeInput == null) ? 43 : $nodeInput.hashCode());
        Object $nodeOutput = (Object) getNodeOutput();
        result = result * 59 + (($nodeOutput == null) ? 43 : $nodeOutput.hashCode());
        Object $errorInfo = getErrorInfo();
        return result * 59 + (($errorInfo == null) ? 43 : $errorInfo.hashCode());
    }

    public String toString() {
        return "SyncFlowNodeStatus(timestamp=" + getTimestamp() + ", flowRecordId=" + getFlowRecordId() + ", nodeId=" + getNodeId() + ", nodeInput=" + getNodeInput() + ", nodeOutput=" + getNodeOutput() + ", status=" + getStatus() + ", errorInfo=" + getErrorInfo() + ", durationTime=" + getDurationTime() + ")";
    }

    /* 14 */   SyncFlowNodeStatus(long timestamp, String flowRecordId, int nodeId, List<SyncFlowStatus.SyncNodeInputDetail> nodeInput, List<SyncFlowStatus.SyncNodeOutputDetail> nodeOutput, int status, String errorInfo, long durationTime) {
        this.timestamp = timestamp;
        this.flowRecordId = flowRecordId;
        this.nodeId = nodeId;
        this.nodeInput = nodeInput;
        this.nodeOutput = nodeOutput;
        this.status = status;
        this.errorInfo = errorInfo;
        this.durationTime = durationTime;
    }

    public static SyncFlowNodeStatusBuilder builder() {
        return new SyncFlowNodeStatusBuilder();
    }

    public static class SyncFlowNodeStatusBuilder {
        private long timestamp;
        private String flowRecordId;
        private int nodeId;
        private List<SyncFlowStatus.SyncNodeInputDetail> nodeInput;

        public SyncFlowNodeStatusBuilder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        private List<SyncFlowStatus.SyncNodeOutputDetail> nodeOutput;
        private int status;
        private String errorInfo;
        private long durationTime;

        public SyncFlowNodeStatusBuilder flowRecordId(String flowRecordId) {
            this.flowRecordId = flowRecordId;
            return this;
        }

        public SyncFlowNodeStatusBuilder nodeId(int nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        public SyncFlowNodeStatusBuilder nodeInput(List<SyncFlowStatus.SyncNodeInputDetail> nodeInput) {
            this.nodeInput = nodeInput;
            return this;
        }

        public SyncFlowNodeStatusBuilder nodeOutput(List<SyncFlowStatus.SyncNodeOutputDetail> nodeOutput) {
            this.nodeOutput = nodeOutput;
            return this;
        }

        public SyncFlowNodeStatusBuilder status(int status) {
            this.status = status;
            return this;
        }

        public SyncFlowNodeStatusBuilder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        public SyncFlowNodeStatusBuilder durationTime(long durationTime) {
            this.durationTime = durationTime;
            return this;
        }

        public SyncFlowNodeStatus build() {
            return new SyncFlowNodeStatus(this.timestamp, this.flowRecordId, this.nodeId, this.nodeInput, this.nodeOutput, this.status, this.errorInfo, this.durationTime);
        }

        public String toString() {
            return "SyncFlowNodeStatus.SyncFlowNodeStatusBuilder(timestamp=" + this.timestamp + ", flowRecordId=" + this.flowRecordId + ", nodeId=" + this.nodeId + ", nodeInput=" + this.nodeInput + ", nodeOutput=" + this.nodeOutput + ", status=" + this.status + ", errorInfo=" + this.errorInfo + ", durationTime=" + this.durationTime + ")";
        }
    }

    public long getTimestamp() {
        /* 17 */
        return this.timestamp;
    }

    public String getFlowRecordId() {
        /* 19 */
        return this.flowRecordId;
    }

    public int getNodeId() {
        /* 21 */
        return this.nodeId;
    }

    public List<SyncFlowStatus.SyncNodeInputDetail> getNodeInput() {
        /* 23 */
        return this.nodeInput;
    }

    public List<SyncFlowStatus.SyncNodeOutputDetail> getNodeOutput() {
        /* 25 */
        return this.nodeOutput;
    }

    public int getStatus() {
        /* 27 */
        return this.status;
    }

    public String getErrorInfo() {
        /* 29 */
        return this.errorInfo;
    }

    public long getDurationTime() {
        /* 31 */
        return this.durationTime;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowNodeStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */