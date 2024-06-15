package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;


public class SyncNodeOutput
        implements Serializable {
    private int nodeId;
    private String nodeName;
    private int status;
    private String errorInfo;
    private long durationTime;
    private List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails;

    public void setNodeId(int nodeId) {
        /* 61 */
        this.nodeId = nodeId;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
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

    public void setOutputDetails(List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails) {
        this.outputDetails = outputDetails;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncNodeOutput)) return false;
        SyncNodeOutput other = (SyncNodeOutput) o;
        if (!other.canEqual(this)) return false;
        if (getNodeId() != other.getNodeId()) return false;
        if (getStatus() != other.getStatus()) return false;
        if (getDurationTime() != other.getDurationTime()) return false;
        Object this$nodeName = getNodeName(), other$nodeName = other.getNodeName();
        if ((this$nodeName == null) ? (other$nodeName != null) : !this$nodeName.equals(other$nodeName)) return false;
        Object this$errorInfo = getErrorInfo(), other$errorInfo = other.getErrorInfo();
        if ((this$errorInfo == null) ? (other$errorInfo != null) : !this$errorInfo.equals(other$errorInfo))
            return false;
        Object this$outputDetails = (Object) getOutputDetails(), other$outputDetails = (Object) other.getOutputDetails();
        return !((this$outputDetails == null) ? (other$outputDetails != null) : !this$outputDetails.equals(other$outputDetails));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncNodeOutput;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getNodeId();
        result = result * 59 + getStatus();
        long $durationTime = getDurationTime();
        result = result * 59 + (int) ($durationTime >>> 32L ^ $durationTime);
        Object $nodeName = getNodeName();
        result = result * 59 + (($nodeName == null) ? 43 : $nodeName.hashCode());
        Object $errorInfo = getErrorInfo();
        result = result * 59 + (($errorInfo == null) ? 43 : $errorInfo.hashCode());
        Object $outputDetails = (Object) getOutputDetails();
        return result * 59 + (($outputDetails == null) ? 43 : $outputDetails.hashCode());
    }

    public String toString() {
        return "SyncFlowStatus.SyncNodeOutput(nodeId=" + getNodeId() + ", nodeName=" + getNodeName() + ", status=" + getStatus() + ", errorInfo=" + getErrorInfo() + ", durationTime=" + getDurationTime() + ", outputDetails=" + getOutputDetails() + ")";
    }

    /* 62 */   SyncNodeOutput(int nodeId, String nodeName, int status, String errorInfo, long durationTime, List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails) {
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        this.status = status;
        this.errorInfo = errorInfo;
        this.durationTime = durationTime;
        this.outputDetails = outputDetails;
    }

    public static SyncNodeOutputBuilder builder() {
        return new SyncNodeOutputBuilder();
    }

    public static class SyncNodeOutputBuilder {
        private int nodeId;
        private String nodeName;
        private int status;

        public SyncNodeOutputBuilder nodeId(int nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        private String errorInfo;
        private long durationTime;
        private List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails;

        public SyncNodeOutputBuilder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public SyncNodeOutputBuilder status(int status) {
            this.status = status;
            return this;
        }

        public SyncNodeOutputBuilder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        public SyncNodeOutputBuilder durationTime(long durationTime) {
            this.durationTime = durationTime;
            return this;
        }

        public SyncNodeOutputBuilder outputDetails(List<SyncFlowStatus.SyncNodeOutputDetail> outputDetails) {
            this.outputDetails = outputDetails;
            return this;
        }

        public SyncFlowStatus.SyncNodeOutput build() {
            return new SyncFlowStatus.SyncNodeOutput(this.nodeId, this.nodeName, this.status, this.errorInfo, this.durationTime, this.outputDetails);
        }

        public String toString() {
            return "SyncFlowStatus.SyncNodeOutput.SyncNodeOutputBuilder(nodeId=" + this.nodeId + ", nodeName=" + this.nodeName + ", status=" + this.status + ", errorInfo=" + this.errorInfo + ", durationTime=" + this.durationTime + ", outputDetails=" + this.outputDetails + ")";
        }
    }

    /* 64 */
    public int getNodeId() {
        return this.nodeId;
    }

    public String getNodeName() {
        /* 65 */
        return this.nodeName;
    }

    /* 67 */
    public int getStatus() {
        return this.status;
    }

    /* 68 */
    public String getErrorInfo() {
        return this.errorInfo;
    }

    /* 69 */
    public long getDurationTime() {
        return this.durationTime;
    }

    public List<SyncFlowStatus.SyncNodeOutputDetail> getOutputDetails() {
        /* 70 */
        return this.outputDetails;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncNodeOutput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */