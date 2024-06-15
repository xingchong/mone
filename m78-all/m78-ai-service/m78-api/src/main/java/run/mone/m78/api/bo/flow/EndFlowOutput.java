package run.mone.m78.api.bo.flow;

import java.io.Serializable;
import java.util.List;


public class EndFlowOutput
        implements Serializable {
    private String answerContent;
    private List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails;

    public void setAnswerContent(String answerContent) {
        /* 82 */
        this.answerContent = answerContent;
    }

    public void setEndFlowOutputDetails(List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails) {
        this.endFlowOutputDetails = endFlowOutputDetails;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof EndFlowOutput)) return false;
        EndFlowOutput other = (EndFlowOutput) o;
        if (!other.canEqual(this)) return false;
        Object this$answerContent = getAnswerContent(), other$answerContent = other.getAnswerContent();
        if ((this$answerContent == null) ? (other$answerContent != null) : !this$answerContent.equals(other$answerContent))
            return false;
        Object this$endFlowOutputDetails = (Object) getEndFlowOutputDetails(), other$endFlowOutputDetails = (Object) other.getEndFlowOutputDetails();
        return !((this$endFlowOutputDetails == null) ? (other$endFlowOutputDetails != null) : !this$endFlowOutputDetails.equals(other$endFlowOutputDetails));
    }

    protected boolean canEqual(Object other) {
        return other instanceof EndFlowOutput;
    }

    public int hashCode() {
        int result = 1;
        Object $answerContent = getAnswerContent();
        result = result * 59 + (($answerContent == null) ? 43 : $answerContent.hashCode());
        Object $endFlowOutputDetails = (Object) getEndFlowOutputDetails();
        return result * 59 + (($endFlowOutputDetails == null) ? 43 : $endFlowOutputDetails.hashCode());
    }

    public String toString() {
        return "SyncFlowStatus.EndFlowOutput(answerContent=" + getAnswerContent() + ", endFlowOutputDetails=" + getEndFlowOutputDetails() + ")";
    }

    /* 83 */   EndFlowOutput(String answerContent, List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails) {
        this.answerContent = answerContent;
        this.endFlowOutputDetails = endFlowOutputDetails;
    }

    public static EndFlowOutputBuilder builder() {
        return new EndFlowOutputBuilder();
    }

    public static class EndFlowOutputBuilder {
        private String answerContent;

        public EndFlowOutputBuilder answerContent(String answerContent) {
            this.answerContent = answerContent;
            return this;
        }

        private List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails;

        public EndFlowOutputBuilder endFlowOutputDetails(List<SyncFlowStatus.EndFlowOutputDetail> endFlowOutputDetails) {
            this.endFlowOutputDetails = endFlowOutputDetails;
            return this;
        }

        public SyncFlowStatus.EndFlowOutput build() {
            return new SyncFlowStatus.EndFlowOutput(this.answerContent, this.endFlowOutputDetails);
        }

        public String toString() {
            return "SyncFlowStatus.EndFlowOutput.EndFlowOutputBuilder(answerContent=" + this.answerContent + ", endFlowOutputDetails=" + this.endFlowOutputDetails + ")";
        }
    }

    /* 85 */
    public String getAnswerContent() {
        return this.answerContent;
    }

    public List<SyncFlowStatus.EndFlowOutputDetail> getEndFlowOutputDetails() {
        /* 86 */
        return this.endFlowOutputDetails;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/SyncFlowStatus$EndFlowOutput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */