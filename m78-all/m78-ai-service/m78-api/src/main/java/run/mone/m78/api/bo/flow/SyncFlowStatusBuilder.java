package run.mone.m78.api.bo.flow;

import java.util.Map;

public class SyncFlowStatusBuilder {
    private String flowRecordId;
    private boolean nodeInputsMap$set;
    private Map<Integer, SyncFlowStatus.SyncNodeInput> nodeInputsMap$value;
    private boolean nodeOutputsMap$set;
    private Map<Integer, SyncFlowStatus.SyncNodeOutput> nodeOutputsMap$value;
    private int endFlowStatus;
    private boolean end;
    private SyncFlowStatus.EndFlowOutput endFlowOutput;
    private long timestamp;
    private long durationTime;
    private boolean messageType$set;
    private String messageType$value;
    private boolean meta$set;
    private Map<String, String> meta$value;

    /* 19 */
    public SyncFlowStatusBuilder flowRecordId(String flowRecordId) {
        this.flowRecordId = flowRecordId;
        return this;
    }

    public SyncFlowStatusBuilder nodeInputsMap(Map<Integer, SyncFlowStatus.SyncNodeInput> nodeInputsMap) {
        this.nodeInputsMap$value = nodeInputsMap;
        this.nodeInputsMap$set = true;
        return this;
    }

    public SyncFlowStatusBuilder nodeOutputsMap(Map<Integer, SyncFlowStatus.SyncNodeOutput> nodeOutputsMap) {
        this.nodeOutputsMap$value = nodeOutputsMap;
        this.nodeOutputsMap$set = true;
        return this;
    }

    public SyncFlowStatusBuilder endFlowStatus(int endFlowStatus) {
        this.endFlowStatus = endFlowStatus;
        return this;
    }

    public SyncFlowStatusBuilder end(boolean end) {
        this.end = end;
        return this;
    }

    public SyncFlowStatusBuilder endFlowOutput(SyncFlowStatus.EndFlowOutput endFlowOutput) {
        this.endFlowOutput = endFlowOutput;
        return this;
    }

    public SyncFlowStatusBuilder timestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public SyncFlowStatusBuilder durationTime(long durationTime) {
        this.durationTime = durationTime;
        return this;
    }

    public SyncFlowStatusBuilder messageType(String messageType) {
        this.messageType$value = messageType;
        this.messageType$set = true;
        return this;
    }

    public SyncFlowStatusBuilder meta(Map<String, String> meta) {
        this.meta$value = meta;
        this.meta$set = true;
        return this;
    }

    public SyncFlowStatus build() {
        Map<Integer, SyncFlowStatus.SyncNodeInput> nodeInputsMap$value = this.nodeInputsMap$value;
        if (!this.nodeInputsMap$set) nodeInputsMap$value = SyncFlowStatus.$default$nodeInputsMap();
        Map<Integer, SyncFlowStatus.SyncNodeOutput> nodeOutputsMap$value = this.nodeOutputsMap$value;
        if (!this.nodeOutputsMap$set) nodeOutputsMap$value = SyncFlowStatus.$default$nodeOutputsMap();
        String messageType$value = this.messageType$value;
        if (!this.messageType$set) messageType$value = SyncFlowStatus.$default$messageType();
        Map<String, String> meta$value = this.meta$value;
        if (!this.meta$set) meta$value = SyncFlowStatus.$default$meta();
        return new SyncFlowStatus(this.flowRecordId, nodeInputsMap$value, nodeOutputsMap$value, this.endFlowStatus, this.end, this.endFlowOutput, this.timestamp, this.durationTime, messageType$value, meta$value);
    }

    public String toString() {
        return "SyncFlowStatus.SyncFlowStatusBuilder(flowRecordId=" + this.flowRecordId + ", nodeInputsMap$value=" + this.nodeInputsMap$value + ", nodeOutputsMap$value=" + this.nodeOutputsMap$value + ", endFlowStatus=" + this.endFlowStatus + ", end=" + this.end + ", endFlowOutput=" + this.endFlowOutput + ", timestamp=" + this.timestamp + ", durationTime=" + this.durationTime + ", messageType$value=" + this.messageType$value + ", meta$value=" + this.meta$value + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncFlowStatusBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */