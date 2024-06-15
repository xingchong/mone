package run.mone.m78.api.bo.flow;


import java.util.List;

public class SyncFlowNodeStatusBuilder {
    private long timestamp;
    private String flowRecordId;
    private int nodeId;
    private List<SyncFlowStatus.SyncNodeInputDetail> nodeInput;
    private List<SyncFlowStatus.SyncNodeOutputDetail> nodeOutput;
    private int status;
    private String errorInfo;
    private long durationTime;

    /* 14 */
    public SyncFlowNodeStatusBuilder timestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowNodeStatus$SyncFlowNodeStatusBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */