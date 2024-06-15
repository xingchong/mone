package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.Map;


public class FlowTestRes
        implements Serializable {
    private String flowRecordId;
    private Map<String, Object> outputs;

    public void setFlowRecordId(String flowRecordId) {
        /* 15 */
        this.flowRecordId = flowRecordId;
    }

    public void setOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlowTestRes)) return false;
        FlowTestRes other = (FlowTestRes) o;
        if (!other.canEqual(this)) return false;
        Object this$flowRecordId = getFlowRecordId(), other$flowRecordId = other.getFlowRecordId();
        if ((this$flowRecordId == null) ? (other$flowRecordId != null) : !this$flowRecordId.equals(other$flowRecordId))
            return false;
        Object this$outputs = (Object) getOutputs(), other$outputs = (Object) other.getOutputs();
        return !((this$outputs == null) ? (other$outputs != null) : !this$outputs.equals(other$outputs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlowTestRes;
    }

    public int hashCode() {
        int result = 1;
        Object $flowRecordId = getFlowRecordId();
        result = result * 59 + (($flowRecordId == null) ? 43 : $flowRecordId.hashCode());
        Object $outputs = (Object) getOutputs();
        return result * 59 + (($outputs == null) ? 43 : $outputs.hashCode());
    }

    public String toString() {
        return "FlowTestRes(flowRecordId=" + getFlowRecordId() + ", outputs=" + getOutputs() + ")";
    }

    /* 16 */
    public static FlowTestResBuilder builder() {
        return new FlowTestResBuilder();
    }

    public static class FlowTestResBuilder {
        private String flowRecordId;

        public FlowTestResBuilder flowRecordId(String flowRecordId) {
            this.flowRecordId = flowRecordId;
            return this;
        }

        private Map<String, Object> outputs;

        public FlowTestResBuilder outputs(Map<String, Object> outputs) {
            this.outputs = outputs;
            return this;
        }

        public FlowTestRes build() {
            return new FlowTestRes(this.flowRecordId, this.outputs);
        }

        public String toString() {
            return "FlowTestRes.FlowTestResBuilder(flowRecordId=" + this.flowRecordId + ", outputs=" + this.outputs + ")";
        }
    }

    public FlowTestRes(String flowRecordId, Map<String, Object> outputs) {
        /* 17 */
        this.flowRecordId = flowRecordId;
        this.outputs = outputs;
    }

    public FlowTestRes() {
    }

    /* 20 */
    public String getFlowRecordId() {
        return this.flowRecordId;
    }

    public Map<String, Object> getOutputs() {
        /* 21 */
        return this.outputs;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowTestRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */