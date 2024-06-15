package run.mone.m78.api.bo.flow;

import java.util.Map;


public class FlowTestResBuilder {
    private String flowRecordId;
    private Map<String, Object> outputs;

    public FlowTestResBuilder flowRecordId(String flowRecordId) {
        /* 16 */
        this.flowRecordId = flowRecordId;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/FlowTestRes$FlowTestResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */