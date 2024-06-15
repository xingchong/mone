package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;


public class SyncNodeInput
        implements Serializable {
    private int nodeId;
    private List<SyncFlowStatus.SyncNodeInputDetail> inputDetails;

    public void setNodeId(int nodeId) {
        /* 41 */
        this.nodeId = nodeId;
    }

    public void setInputDetails(List<SyncFlowStatus.SyncNodeInputDetail> inputDetails) {
        this.inputDetails = inputDetails;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncNodeInput)) return false;
        SyncNodeInput other = (SyncNodeInput) o;
        if (!other.canEqual(this)) return false;
        if (getNodeId() != other.getNodeId()) return false;
        Object this$inputDetails = (Object) getInputDetails(), other$inputDetails = (Object) other.getInputDetails();
        return !((this$inputDetails == null) ? (other$inputDetails != null) : !this$inputDetails.equals(other$inputDetails));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncNodeInput;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getNodeId();
        Object $inputDetails = (Object) getInputDetails();
        return result * 59 + (($inputDetails == null) ? 43 : $inputDetails.hashCode());
    }

    public String toString() {
        return "SyncFlowStatus.SyncNodeInput(nodeId=" + getNodeId() + ", inputDetails=" + getInputDetails() + ")";
    }

    /* 42 */   SyncNodeInput(int nodeId, List<SyncFlowStatus.SyncNodeInputDetail> inputDetails) {
        this.nodeId = nodeId;
        this.inputDetails = inputDetails;
    }

    public static SyncNodeInputBuilder builder() {
        return new SyncNodeInputBuilder();
    }

    public static class SyncNodeInputBuilder {
        private int nodeId;

        public SyncNodeInputBuilder nodeId(int nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        private List<SyncFlowStatus.SyncNodeInputDetail> inputDetails;

        public SyncNodeInputBuilder inputDetails(List<SyncFlowStatus.SyncNodeInputDetail> inputDetails) {
            this.inputDetails = inputDetails;
            return this;
        }

        public SyncFlowStatus.SyncNodeInput build() {
            return new SyncFlowStatus.SyncNodeInput(this.nodeId, this.inputDetails);
        }

        public String toString() {
            return "SyncFlowStatus.SyncNodeInput.SyncNodeInputBuilder(nodeId=" + this.nodeId + ", inputDetails=" + this.inputDetails + ")";
        }
    }

    /* 44 */
    public int getNodeId() {
        return this.nodeId;
    }

    public List<SyncFlowStatus.SyncNodeInputDetail> getInputDetails() {
        /* 45 */
        return this.inputDetails;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$SyncNodeInput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */